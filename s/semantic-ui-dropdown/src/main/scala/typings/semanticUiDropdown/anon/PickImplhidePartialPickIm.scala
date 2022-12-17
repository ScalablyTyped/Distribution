package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.DelaySettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl, 'hide'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl>> */
trait PickImplhidePartialPickIm
  extends StObject
     with Param {
  
  var hide: Double
  
  var search: js.UndefOr[Double] = js.undefined
  
  var show: js.UndefOr[Double] = js.undefined
  
  var touch: js.UndefOr[Double] = js.undefined
}
object PickImplhidePartialPickIm {
  
  inline def apply(hide: Double): PickImplhidePartialPickIm = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplhidePartialPickIm]
  }
  
  extension [Self <: PickImplhidePartialPickIm](x: Self) {
    
    inline def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: Double): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTouch(value: Double): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
  }
}
