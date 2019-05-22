package typings
package atPulumiAwsLib.lambdaGetLayerVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLayerVersionArgs extends js.Object {
  /**
    * Specific runtime the layer version must support. Conflicts with `version`. If specified, the latest available layer version supporting the provided runtime will be used.
    */
  val compatibleRuntime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the lambda layer.
    */
  val layerName: java.lang.String
  /**
    * Specific layer version. Conflicts with `compatible_runtime`. If omitted, the latest available layer version will be used.
    */
  val version: js.UndefOr[scala.Double] = js.undefined
}

object GetLayerVersionArgs {
  @scala.inline
  def apply(
    layerName: java.lang.String,
    compatibleRuntime: java.lang.String = null,
    version: scala.Int | scala.Double = null
  ): GetLayerVersionArgs = {
    val __obj = js.Dynamic.literal(layerName = layerName)
    if (compatibleRuntime != null) __obj.updateDynamic("compatibleRuntime")(compatibleRuntime)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerVersionArgs]
  }
}

