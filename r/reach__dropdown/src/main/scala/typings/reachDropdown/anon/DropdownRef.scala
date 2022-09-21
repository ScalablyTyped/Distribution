package typings.reachDropdown.anon

import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropdownRef extends StObject {
  
  var dropdownRef: js.UndefOr[RefObject[HTMLElement | Null]] = js.undefined
  
  var index: Double
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
}
object DropdownRef {
  
  inline def apply(index: Double): DropdownRef = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownRef]
  }
  
  extension [Self <: DropdownRef](x: Self) {
    
    inline def setDropdownRef(value: RefObject[HTMLElement | Null]): Self = StObject.set(x, "dropdownRef", value.asInstanceOf[js.Any])
    
    inline def setDropdownRefUndefined: Self = StObject.set(x, "dropdownRef", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
