package typings.reactRelay.mod

import typings.reactRelay.anon.PartialPageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionData extends js.Object {
  
  var edges: js.UndefOr[js.Array[_] | Null] = js.native
  
  var pageInfo: js.UndefOr[PartialPageInfo | Null] = js.native
}
object ConnectionData {
  
  @scala.inline
  def apply(): ConnectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionData]
  }
  
  @scala.inline
  implicit class ConnectionDataOps[Self <: ConnectionData] (val x: Self) extends AnyVal {
    
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
    def setEdgesVarargs(value: js.Any*): Self = this.set("edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: js.Array[_]): Self = this.set("edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdges: Self = this.set("edges", js.undefined)
    
    @scala.inline
    def setEdgesNull: Self = this.set("edges", null)
    
    @scala.inline
    def setPageInfo(value: PartialPageInfo): Self = this.set("pageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageInfo: Self = this.set("pageInfo", js.undefined)
    
    @scala.inline
    def setPageInfoNull: Self = this.set("pageInfo", null)
  }
}
