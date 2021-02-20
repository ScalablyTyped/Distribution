package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationAction
import typings.reactNavigation.mod.NavigationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key[T /* <: NavigationParams */] extends StObject {
  
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
  implicit class KeyMutableBuilder[Self <: Key[_], T /* <: NavigationParams */] (val x: Self with Key[T]) extends AnyVal {
    
    @scala.inline
    def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setRouteName(value: String | Action[T]): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
  }
}
