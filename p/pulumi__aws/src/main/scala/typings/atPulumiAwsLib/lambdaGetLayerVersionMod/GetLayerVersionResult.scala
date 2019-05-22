package typings
package atPulumiAwsLib.lambdaGetLayerVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLayerVersionResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer with version.
    */
  val arn: java.lang.String
  val compatibleRuntime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of [Runtimes][1] the specific Lambda Layer version is compatible with.
    */
  val compatibleRuntimes: js.Array[java.lang.String]
  /**
    * The date this resource was created.
    */
  val createdDate: java.lang.String
  /**
    * Description of the specific Lambda Layer version.
    */
  val description: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer without version.
    */
  val layerArn: java.lang.String
  val layerName: java.lang.String
  /**
    * License info associated with the specific Lambda Layer version.
    */
  val licenseInfo: java.lang.String
  /**
    * Base64-encoded representation of raw SHA-256 sum of the zip file.
    */
  val sourceCodeHash: java.lang.String
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: scala.Double
  /**
    * This Lamba Layer version.
    */
  val version: scala.Double
}

object GetLayerVersionResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    compatibleRuntimes: js.Array[java.lang.String],
    createdDate: java.lang.String,
    description: java.lang.String,
    id: java.lang.String,
    layerArn: java.lang.String,
    layerName: java.lang.String,
    licenseInfo: java.lang.String,
    sourceCodeHash: java.lang.String,
    sourceCodeSize: scala.Double,
    version: scala.Double,
    compatibleRuntime: java.lang.String = null
  ): GetLayerVersionResult = {
    val __obj = js.Dynamic.literal(arn = arn, compatibleRuntimes = compatibleRuntimes, createdDate = createdDate, description = description, id = id, layerArn = layerArn, layerName = layerName, licenseInfo = licenseInfo, sourceCodeHash = sourceCodeHash, sourceCodeSize = sourceCodeSize, version = version)
    if (compatibleRuntime != null) __obj.updateDynamic("compatibleRuntime")(compatibleRuntime)
    __obj.asInstanceOf[GetLayerVersionResult]
  }
}

