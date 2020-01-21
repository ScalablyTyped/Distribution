package typings.pulumiAws.getLayerVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLayerVersionResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer with version.
    */
  val arn: String = js.native
  val compatibleRuntime: js.UndefOr[String] = js.native
  /**
    * A list of [Runtimes][1] the specific Lambda Layer version is compatible with.
    */
  val compatibleRuntimes: js.Array[String] = js.native
  /**
    * The date this resource was created.
    */
  val createdDate: String = js.native
  /**
    * Description of the specific Lambda Layer version.
    */
  val description: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The Amazon Resource Name (ARN) of the Lambda Layer without version.
    */
  val layerArn: String = js.native
  val layerName: String = js.native
  /**
    * License info associated with the specific Lambda Layer version.
    */
  val licenseInfo: String = js.native
  /**
    * Base64-encoded representation of raw SHA-256 sum of the zip file.
    */
  val sourceCodeHash: String = js.native
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: Double = js.native
  /**
    * This Lamba Layer version.
    */
  val version: Double = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], compatibleRuntimes = compatibleRuntimes.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layerArn = layerArn.asInstanceOf[js.Any], layerName = layerName.asInstanceOf[js.Any], licenseInfo = licenseInfo.asInstanceOf[js.Any], sourceCodeHash = sourceCodeHash.asInstanceOf[js.Any], sourceCodeSize = sourceCodeSize.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (compatibleRuntime != null) __obj.updateDynamic("compatibleRuntime")(compatibleRuntime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerVersionResult]
  }
}

