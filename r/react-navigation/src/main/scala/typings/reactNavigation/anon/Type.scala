package typings.reactNavigation.anon

import typings.reactNavigation.mod._NavigationAction
import typings.reactNavigation.reactNavigationStrings.CHILD_ACTION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends _NavigationAction {
  
  var key: js.UndefOr[String] = js.native
  
  var `type`: CHILD_ACTION = js.native
}
object Type {
  
  @scala.inline
  def apply(`type`: CHILD_ACTION): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setType(value: CHILD_ACTION): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
