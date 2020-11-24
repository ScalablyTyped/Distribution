package typings.relayRuntime.connectionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageInfo extends js.Object {
  
  var endCursor: js.UndefOr[String | Null] = js.native
  
  var hasNextPage: Boolean = js.native
  
  var hasPreviousPage: Boolean = js.native
  
  var startCursor: js.UndefOr[String | Null] = js.native
}
object PageInfo {
  
  @scala.inline
  def apply(hasNextPage: Boolean, hasPreviousPage: Boolean): PageInfo = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPreviousPage = hasPreviousPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
  
  @scala.inline
  implicit class PageInfoOps[Self <: PageInfo] (val x: Self) extends AnyVal {
    
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
    def setHasNextPage(value: Boolean): Self = this.set("hasNextPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPreviousPage(value: Boolean): Self = this.set("hasPreviousPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndCursor(value: String): Self = this.set("endCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndCursor: Self = this.set("endCursor", js.undefined)
    
    @scala.inline
    def setEndCursorNull: Self = this.set("endCursor", null)
    
    @scala.inline
    def setStartCursor(value: String): Self = this.set("startCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartCursor: Self = this.set("startCursor", js.undefined)
    
    @scala.inline
    def setStartCursorNull: Self = this.set("startCursor", null)
  }
}
