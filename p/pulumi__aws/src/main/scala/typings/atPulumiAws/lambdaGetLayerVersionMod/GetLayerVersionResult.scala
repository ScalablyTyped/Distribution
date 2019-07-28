package typings.atPulumiAws.lambdaGetLayerVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLayerVersionResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer with version.
    */
  val arn: String
  val compatibleRuntime: js.UndefOr[String] = js.undefined
  /**
    * A list of [Runtimes][1] the specific Lambda Layer version is compatible with.
    */
  val compatibleRuntimes: js.Array[String]
  /**
    * The date this resource was created.
    */
  val createdDate: String
  /**
    * Description of the specific Lambda Layer version.
    */
  val description: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer without version.
    */
  val layerArn: String
  val layerName: String
  /**
    * License info associated with the specific Lambda Layer version.
    */
  val licenseInfo: String
  /**
    * Base64-encoded representation of raw SHA-256 sum of the zip file.
    */
  val sourceCodeHash: String
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: Double
  /**
    * This Lamba Layer version.
    */
  val version: Double
}

object GetLayerVersionResult {
  @scala.inline
  def apply(
    arn: String,
    compatibleRuntimes: js.Array[String],
    createdDate: String,
    description: String,
    id: String,
    layerArn: String,
    layerName: String,
    licenseInfo: String,
    sourceCodeHash: String,
    sourceCodeSize: Double,
    version: Double,
    compatibleRuntime: String = null
  ): GetLayerVersionResult = {
    val __obj = js.Dynamic.literal(arn = arn, compatibleRuntimes = compatibleRuntimes, createdDate = createdDate, description = description, id = id, layerArn = layerArn, layerName = layerName, licenseInfo = licenseInfo, sourceCodeHash = sourceCodeHash, sourceCodeSize = sourceCodeSize, version = version)
    if (compatibleRuntime != null) __obj.updateDynamic("compatibleRuntime")(compatibleRuntime)
    __obj.asInstanceOf[GetLayerVersionResult]
  }
}

