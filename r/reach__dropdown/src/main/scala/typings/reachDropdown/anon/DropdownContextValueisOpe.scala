package typings.reachDropdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @reach/dropdown.@reach/dropdown.DropdownContextValue & {  isOpen :boolean} */
trait DropdownContextValueisOpe extends StObject {
  
  var isExpanded: Boolean
  
  var isOpen: Boolean
}
object DropdownContextValueisOpe {
  
  inline def apply(isExpanded: Boolean, isOpen: Boolean): DropdownContextValueisOpe = {
    val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownContextValueisOpe]
  }
  
  extension [Self <: DropdownContextValueisOpe](x: Self) {
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
  }
}
