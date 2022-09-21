package typings.reactNavigationCore.anon

import typings.reactNavigationCore.navigationBuilderContextMod.ChildActionListener
import typings.reactNavigationCore.navigationBuilderContextMod.FocusedNavigationListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focus extends StObject {
  
  var action: js.Array[ChildActionListener]
  
  var focus: js.Array[FocusedNavigationListener]
}
object Focus {
  
  inline def apply(action: js.Array[ChildActionListener], focus: js.Array[FocusedNavigationListener]): Focus = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focus]
  }
  
  extension [Self <: Focus](x: Self) {
    
    inline def setAction(value: js.Array[ChildActionListener]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionVarargs(value: ChildActionListener*): Self = StObject.set(x, "action", js.Array(value*))
    
    inline def setFocus(value: js.Array[FocusedNavigationListener]): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusVarargs(value: FocusedNavigationListener*): Self = StObject.set(x, "focus", js.Array(value*))
  }
}
