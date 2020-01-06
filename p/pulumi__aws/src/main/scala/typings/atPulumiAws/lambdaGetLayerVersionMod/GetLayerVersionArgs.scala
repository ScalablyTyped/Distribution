package typings.atPulumiAws.lambdaGetLayerVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLayerVersionArgs extends js.Object {
  /**
    * Specific runtime the layer version must support. Conflicts with `version`. If specified, the latest available layer version supporting the provided runtime will be used.
    */
  val compatibleRuntime: js.UndefOr[String] = js.native
  /**
    * Name of the lambda layer.
    */
  val layerName: String = js.native
  /**
    * Specific layer version. Conflicts with `compatibleRuntime`. If omitted, the latest available layer version will be used.
    */
  val version: js.UndefOr[Double] = js.native
}

object GetLayerVersionArgs {
  @scala.inline
  def apply(layerName: String, compatibleRuntime: String = null, version: Int | Double = null): GetLayerVersionArgs = {
    val __obj = js.Dynamic.literal(layerName = layerName.asInstanceOf[js.Any])
    if (compatibleRuntime != null) __obj.updateDynamic("compatibleRuntime")(compatibleRuntime.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerVersionArgs]
  }
}

