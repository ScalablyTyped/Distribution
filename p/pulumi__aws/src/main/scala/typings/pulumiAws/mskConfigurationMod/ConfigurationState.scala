package typings.pulumiAws.mskConfigurationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationState extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the configuration.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Description of the configuration.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * List of Apache Kafka versions which can use this configuration.
    */
  val kafkaVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * Latest revision of the configuration.
    */
  val latestRevision: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Name of the configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
    */
  val serverProperties: js.UndefOr[Input[String]] = js.native
}
object ConfigurationState {
  
  @scala.inline
  def apply(): ConfigurationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationState]
  }
  
  @scala.inline
  implicit class ConfigurationStateOps[Self <: ConfigurationState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setKafkaVersionsVarargs(value: Input[String]*): Self = this.set("kafkaVersions", js.Array(value :_*))
    
    @scala.inline
    def setKafkaVersions(value: Input[js.Array[Input[String]]]): Self = this.set("kafkaVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKafkaVersions: Self = this.set("kafkaVersions", js.undefined)
    
    @scala.inline
    def setLatestRevision(value: Input[Double]): Self = this.set("latestRevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestRevision: Self = this.set("latestRevision", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setServerProperties(value: Input[String]): Self = this.set("serverProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerProperties: Self = this.set("serverProperties", js.undefined)
  }
}
