package typings.semanticUiTab.anon

import typings.semanticUiTab.SemanticUI.Tab.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'state'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl>> */
trait PickImplstatePartialPickI
  extends StObject
     with Param {
  
  var api: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var missingTab: js.UndefOr[String] = js.undefined
  
  var noContent: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var recursion: js.UndefOr[String] = js.undefined
  
  var state: String & js.UndefOr[String]
}
object PickImplstatePartialPickI {
  
  inline def apply(state: String & js.UndefOr[String]): PickImplstatePartialPickI = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstatePartialPickI]
  }
  
  extension [Self <: PickImplstatePartialPickI](x: Self) {
    
    inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMissingTab(value: String): Self = StObject.set(x, "missingTab", value.asInstanceOf[js.Any])
    
    inline def setMissingTabUndefined: Self = StObject.set(x, "missingTab", js.undefined)
    
    inline def setNoContent(value: String): Self = StObject.set(x, "noContent", value.asInstanceOf[js.Any])
    
    inline def setNoContentUndefined: Self = StObject.set(x, "noContent", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRecursion(value: String): Self = StObject.set(x, "recursion", value.asInstanceOf[js.Any])
    
    inline def setRecursionUndefined: Self = StObject.set(x, "recursion", js.undefined)
    
    inline def setState(value: String & js.UndefOr[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
