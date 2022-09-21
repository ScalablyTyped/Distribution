package typings.reachMenuButton

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @reach/menu-button.@reach/menu-button/dist/declarations/src.MenuContextValue & {  isOpen :boolean} */
  trait MenuContextValueisOpenboo extends StObject {
    
    var isExpanded: Boolean
    
    var isOpen: Boolean
  }
  object MenuContextValueisOpenboo {
    
    inline def apply(isExpanded: Boolean, isOpen: Boolean): MenuContextValueisOpenboo = {
      val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuContextValueisOpenboo]
    }
    
    extension [Self <: MenuContextValueisOpenboo](x: Self) {
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
}
