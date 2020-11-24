package typings.rcMenu.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var defaultActiveFirst: js.UndefOr[Boolean] = js.native
  
  var eventKey: js.UndefOr[typings.react.mod.Key] = js.native
}
object Children {
  
  @scala.inline
  def apply(): Children = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDefaultActiveFirst(value: Boolean): Self = this.set("defaultActiveFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveFirst: Self = this.set("defaultActiveFirst", js.undefined)
    
    @scala.inline
    def setEventKey(value: typings.react.mod.Key): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
  }
}
