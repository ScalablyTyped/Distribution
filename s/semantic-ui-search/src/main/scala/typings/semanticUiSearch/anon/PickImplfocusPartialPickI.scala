package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl, 'focus'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl>> */
trait PickImplfocusPartialPickI
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var empty: js.UndefOr[String] = js.undefined
  
  var focus: String
  
  var loading: js.UndefOr[String] = js.undefined
  
  var pressed: js.UndefOr[String] = js.undefined
}
object PickImplfocusPartialPickI {
  
  inline def apply(focus: String): PickImplfocusPartialPickI = {
    val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplfocusPartialPickI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplfocusPartialPickI] (val x: Self) extends AnyVal {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setPressed(value: String): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
  }
}
