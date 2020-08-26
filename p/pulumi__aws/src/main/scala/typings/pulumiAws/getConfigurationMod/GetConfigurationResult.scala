package typings.pulumiAws.getConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConfigurationResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the configuration.
    */
  val arn: String = js.native
  /**
    * Description of the configuration.
    */
  val description: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * List of Apache Kafka versions which can use this configuration.
    */
  val kafkaVersions: js.Array[String] = js.native
  /**
    * Latest revision of the configuration.
    */
  val latestRevision: Double = js.native
  val name: String = js.native
  /**
    * Contents of the server.properties file.
    */
  val serverProperties: String = js.native
}

object GetConfigurationResult {
  @scala.inline
  def apply(
    arn: String,
    description: String,
    id: String,
    kafkaVersions: js.Array[String],
    latestRevision: Double,
    name: String,
    serverProperties: String
  ): GetConfigurationResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kafkaVersions = kafkaVersions.asInstanceOf[js.Any], latestRevision = latestRevision.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serverProperties = serverProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfigurationResult]
  }
  @scala.inline
  implicit class GetConfigurationResultOps[Self <: GetConfigurationResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKafkaVersionsVarargs(value: String*): Self = this.set("kafkaVersions", js.Array(value :_*))
    @scala.inline
    def setKafkaVersions(value: js.Array[String]): Self = this.set("kafkaVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatestRevision(value: Double): Self = this.set("latestRevision", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerProperties(value: String): Self = this.set("serverProperties", value.asInstanceOf[js.Any])
  }
  
}

