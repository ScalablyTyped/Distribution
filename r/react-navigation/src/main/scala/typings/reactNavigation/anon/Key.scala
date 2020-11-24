package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationAction
import typings.reactNavigation.mod.NavigationParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key[T /* <: NavigationParams */] extends js.Object {
  
  var action: js.UndefOr[NavigationAction] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var params: js.UndefOr[T] = js.native
  
  var routeName: String | Action[T] = js.native
}
object Key {
  
  @scala.inline
  def apply[T /* <: NavigationParams */](routeName: String | Action[T]): Key[T] = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[T]]
  }
  
  @scala.inline
  implicit class KeyOps[Self <: Key[_], T /* <: NavigationParams */] (val x: Self with Key[T]) extends AnyVal {
    
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
    def setRouteName(value: String | Action[T]): Self = this.set("routeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: NavigationAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}
