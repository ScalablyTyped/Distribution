package typings.reactNativeCommunityCameraroll.mod

import typings.reactNativeCommunityCameraroll.anon.Endcursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhotoIdentifiersPage extends js.Object {
  
  var edges: js.Array[PhotoIdentifier] = js.native
  
  var page_info: Endcursor = js.native
}
object PhotoIdentifiersPage {
  
  @scala.inline
  def apply(edges: js.Array[PhotoIdentifier], page_info: Endcursor): PhotoIdentifiersPage = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], page_info = page_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoIdentifiersPage]
  }
  
  @scala.inline
  implicit class PhotoIdentifiersPageOps[Self <: PhotoIdentifiersPage] (val x: Self) extends AnyVal {
    
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
    def setEdgesVarargs(value: PhotoIdentifier*): Self = this.set("edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: js.Array[PhotoIdentifier]): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage_info(value: Endcursor): Self = this.set("page_info", value.asInstanceOf[js.Any])
  }
}
