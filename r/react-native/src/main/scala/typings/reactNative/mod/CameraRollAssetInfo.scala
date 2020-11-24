package typings.reactNative.mod

import typings.reactNative.anon.Endcursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraRollAssetInfo extends js.Object {
  
  var edges: js.Array[CameraRollEdgeInfo] = js.native
  
  var page_info: Endcursor = js.native
}
object CameraRollAssetInfo {
  
  @scala.inline
  def apply(edges: js.Array[CameraRollEdgeInfo], page_info: Endcursor): CameraRollAssetInfo = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollAssetInfo]
  }
  
  @scala.inline
  implicit class CameraRollAssetInfoOps[Self <: CameraRollAssetInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEdgesVarargs(value: CameraRollEdgeInfo*): Self = this.set("edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: js.Array[CameraRollEdgeInfo]): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_info(value: Endcursor): Self = this.set("page_info", value.asInstanceOf[js.Any])
  }
}
