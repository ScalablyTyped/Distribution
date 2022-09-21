package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.DelaySettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl, 'touch'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl>> */
trait PickImpltouchPartialPickI
  extends StObject
     with Param {
  
  var hide: js.UndefOr[Double] = js.undefined
  
  var search: js.UndefOr[Double] = js.undefined
  
  var show: js.UndefOr[Double] = js.undefined
  
  var touch: Double & js.UndefOr[Double]
}
object PickImpltouchPartialPickI {
  
  inline def apply(touch: Double & js.UndefOr[Double]): PickImpltouchPartialPickI = {
    val __obj = js.Dynamic.literal(touch = touch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltouchPartialPickI]
  }
  
  extension [Self <: PickImpltouchPartialPickI](x: Self) {
    
    inline def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setSearch(value: Double): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTouch(value: Double & js.UndefOr[Double]): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
  }
}
