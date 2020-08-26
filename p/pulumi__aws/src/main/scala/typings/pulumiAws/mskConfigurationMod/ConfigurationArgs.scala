package typings.pulumiAws.mskConfigurationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationArgs extends js.Object {
  /**
    * Description of the configuration.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * List of Apache Kafka versions which can use this configuration.
    */
  val kafkaVersions: Input[js.Array[Input[String]]] = js.native
  /**
    * Name of the configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Contents of the server.properties file. Supported properties are documented in the [MSK Developer Guide](https://docs.aws.amazon.com/msk/latest/developerguide/msk-configuration-properties.html).
    */
  val serverProperties: Input[String] = js.native
}

object ConfigurationArgs {
  @scala.inline
  def apply(kafkaVersions: Input[js.Array[Input[String]]], serverProperties: Input[String]): ConfigurationArgs = {
    val __obj = js.Dynamic.literal(kafkaVersions = kafkaVersions.asInstanceOf[js.Any], serverProperties = serverProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationArgs]
  }
  @scala.inline
  implicit class ConfigurationArgsOps[Self <: ConfigurationArgs] (val x: Self) extends AnyVal {
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
    def setKafkaVersionsVarargs(value: Input[String]*): Self = this.set("kafkaVersions", js.Array(value :_*))
    @scala.inline
    def setKafkaVersions(value: Input[js.Array[Input[String]]]): Self = this.set("kafkaVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerProperties(value: Input[String]): Self = this.set("serverProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

