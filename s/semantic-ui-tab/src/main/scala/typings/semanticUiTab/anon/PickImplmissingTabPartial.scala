package typings.semanticUiTab.anon

import typings.semanticUiTab.SemanticUI.Tab.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, 'missingTab'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.ErrorSettings._Impl>> */
trait PickImplmissingTabPartial
  extends StObject
     with Param {
  
  var api: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var missingTab: String
  
  var noContent: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var recursion: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object PickImplmissingTabPartial {
  
  inline def apply(missingTab: String): PickImplmissingTabPartial = {
    val __obj = js.Dynamic.literal(missingTab = missingTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplmissingTabPartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplmissingTabPartial] (val x: Self) extends AnyVal {
    
    inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMissingTab(value: String): Self = StObject.set(x, "missingTab", value.asInstanceOf[js.Any])
    
    inline def setNoContent(value: String): Self = StObject.set(x, "noContent", value.asInstanceOf[js.Any])
    
    inline def setNoContentUndefined: Self = StObject.set(x, "noContent", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRecursion(value: String): Self = StObject.set(x, "recursion", value.asInstanceOf[js.Any])
    
    inline def setRecursionUndefined: Self = StObject.set(x, "recursion", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
