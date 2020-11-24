package typings.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationAction extends js.Object {
  
  var action: js.UndefOr[NavigationAction] = js.native
  
  var actions: js.UndefOr[js.Array[NavigationAction]] = js.native
  
  var key: js.UndefOr[Nullable[String]] = js.native
  
  var meta: js.UndefOr[js.Object] = js.native
  
  var navKey: js.UndefOr[Nullable[String]] = js.native
  
  var params: js.UndefOr[Params] = js.native
  
  var routeName: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
}
object NavigationAction {
  
  @scala.inline
  def apply(`type`: String): NavigationAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationAction]
  }
  
  @scala.inline
  implicit class NavigationActionOps[Self <: NavigationAction] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: NavigationAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: NavigationAction*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[NavigationAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setKey(value: Nullable[String]): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setMeta(value: js.Object): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setNavKey(value: Nullable[String]): Self = this.set("navKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavKey: Self = this.set("navKey", js.undefined)
    
    @scala.inline
    def setNavKeyNull: Self = this.set("navKey", null)
    
    @scala.inline
    def setParams(value: Params): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setRouteName(value: String): Self = this.set("routeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteName: Self = this.set("routeName", js.undefined)
  }
}
