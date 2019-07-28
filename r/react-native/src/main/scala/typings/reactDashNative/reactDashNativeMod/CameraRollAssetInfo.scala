package typings.reactDashNative.reactDashNativeMod

import typings.reactDashNative.Anon_Endcursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraRollAssetInfo extends js.Object {
  var edges: js.Array[CameraRollEdgeInfo]
  var page_info: Anon_Endcursor
}

object CameraRollAssetInfo {
  @scala.inline
  def apply(edges: js.Array[CameraRollEdgeInfo], page_info: Anon_Endcursor): CameraRollAssetInfo = {
    val __obj = js.Dynamic.literal(edges = edges, page_info = page_info)
  
    __obj.asInstanceOf[CameraRollAssetInfo]
  }
}

