package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl, 'loading'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.ClassNameSettings._Impl>> */
trait PickImplloadingPartialPic
  extends StObject
     with Param {
  
  var active: js.UndefOr[String] = js.undefined
  
  var empty: js.UndefOr[String] = js.undefined
  
  var focus: js.UndefOr[String] = js.undefined
  
  var loading: String
  
  var pressed: js.UndefOr[String] = js.undefined
}
object PickImplloadingPartialPic {
  
  inline def apply(loading: String): PickImplloadingPartialPic = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplloadingPartialPic]
  }
  
  extension [Self <: PickImplloadingPartialPic](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setPressed(value: String): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
  }
}
