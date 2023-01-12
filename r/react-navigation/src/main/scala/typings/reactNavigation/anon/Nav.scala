package typings.reactNavigation.anon

import typings.reactNavigation.mod.NavigationState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nav extends StObject {
  
  var nav: NavigationState | Null
}
object Nav {
  
  inline def apply(): Nav = {
    val __obj = js.Dynamic.literal(nav = null)
    __obj.asInstanceOf[Nav]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nav] (val x: Self) extends AnyVal {
    
    inline def setNav(value: NavigationState): Self = StObject.set(x, "nav", value.asInstanceOf[js.Any])
    
    inline def setNavNull: Self = StObject.set(x, "nav", null)
  }
}
