package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraRollAssetInfo extends js.Object {
  var edges: js.Array[CameraRollEdgeInfo]
  var page_info: reactDashNativeLib.Anon_Endcursor
}

object CameraRollAssetInfo {
  @scala.inline
  def apply(edges: js.Array[CameraRollEdgeInfo], page_info: reactDashNativeLib.Anon_Endcursor): CameraRollAssetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("edges")(edges)
    __obj.updateDynamic("page_info")(page_info)
    __obj.asInstanceOf[CameraRollAssetInfo]
  }
}

