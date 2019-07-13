package typings
package atPulumiAwsLib.mskGetConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConfigurationResult extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the configuration.
    */
  val arn: java.lang.String
  /**
    * Description of the configuration.
    */
  val description: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * List of Apache Kafka versions which can use this configuration.
    */
  val kafkaVersions: js.Array[java.lang.String]
  /**
    * Latest revision of the configuration.
    */
  val latestRevision: scala.Double
  val name: java.lang.String
  /**
    * Contents of the server.properties file.
    */
  val serverProperties: java.lang.String
}

object GetConfigurationResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    description: java.lang.String,
    id: java.lang.String,
    kafkaVersions: js.Array[java.lang.String],
    latestRevision: scala.Double,
    name: java.lang.String,
    serverProperties: java.lang.String
  ): GetConfigurationResult = {
    val __obj = js.Dynamic.literal(arn = arn, description = description, id = id, kafkaVersions = kafkaVersions, latestRevision = latestRevision, name = name, serverProperties = serverProperties)
  
    __obj.asInstanceOf[GetConfigurationResult]
  }
}

