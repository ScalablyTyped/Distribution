package typings.storybookUi.sidebarTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemRef extends js.Object {
  
  var itemId: String = js.native
  
  var refId: String = js.native
}
object ItemRef {
  
  @scala.inline
  def apply(itemId: String, refId: String): ItemRef = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemRef]
  }
  
  @scala.inline
  implicit class ItemRefOps[Self <: ItemRef] (val x: Self) extends AnyVal {
    
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
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefId(value: String): Self = this.set("refId", value.asInstanceOf[js.Any])
  }
}
