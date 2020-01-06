package typings.atPulumiAws.mskGetConfigurationMod

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
    * id is the provider-assigned unique ID for this managed resource.
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
}

