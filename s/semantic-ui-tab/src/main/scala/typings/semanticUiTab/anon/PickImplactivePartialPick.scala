package typings.semanticUiTab.anon

import typings.semanticUiTab.SemanticUI.Tab.ClassNameSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.ClassNameSettings._Impl, 'active'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.ClassNameSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.ClassNameSettings._Impl>> */
trait PickImplactivePartialPick
  extends StObject
     with Param {
  
  var active: String
  
  var loading: js.UndefOr[String] = js.undefined
}
object PickImplactivePartialPick {
  
  inline def apply(active: String): PickImplactivePartialPick = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplactivePartialPick]
  }
  
  extension [Self <: PickImplactivePartialPick](x: Self) {
    
    inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: String): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
  }
}
