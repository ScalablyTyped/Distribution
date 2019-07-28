package typings.atPulumiAws.mskGetConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConfigurationResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the configuration.
    */
  val arn: String
  /**
    * Description of the configuration.
    */
  val description: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * List of Apache Kafka versions which can use this configuration.
    */
  val kafkaVersions: js.Array[String]
  /**
    * Latest revision of the configuration.
    */
  val latestRevision: Double
  val name: String
  /**
    * Contents of the server.properties file.
    */
  val serverProperties: String
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
    val __obj = js.Dynamic.literal(arn = arn, description = description, id = id, kafkaVersions = kafkaVersions, latestRevision = latestRevision, name = name, serverProperties = serverProperties)
  
    __obj.asInstanceOf[GetConfigurationResult]
  }
}

