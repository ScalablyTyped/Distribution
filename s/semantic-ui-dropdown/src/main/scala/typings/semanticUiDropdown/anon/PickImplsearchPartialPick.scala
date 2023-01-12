package typings.semanticUiDropdown.anon

import typings.semanticUiDropdown.SemanticUI.Dropdown.DelaySettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl, 'search'> & std.Partial<std.Pick<semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl, keyof semantic-ui-dropdown.SemanticUI.Dropdown.DelaySettings._Impl>> */
trait PickImplsearchPartialPick
  extends StObject
     with Param {
  
  var hide: js.UndefOr[Double] = js.undefined
  
  var search: Double
  
  var show: js.UndefOr[Double] = js.undefined
  
  var touch: js.UndefOr[Double] = js.undefined
}
object PickImplsearchPartialPick {
  
  inline def apply(search: Double): PickImplsearchPartialPick = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplsearchPartialPick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplsearchPartialPick] (val x: Self) extends AnyVal {
    
    inline def setHide(value: Double): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setSearch(value: Double): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setTouch(value: Double): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
  }
}
