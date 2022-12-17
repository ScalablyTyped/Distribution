package typings.semanticUiTab.anon

import typings.semanticUiTab.SemanticUI.Tab.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl, 'loaded'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl>> */
trait PickImplloadedPartialPick
  extends StObject
     with Param {
  
  var loaded: String
  
  var promise: js.UndefOr[String] = js.undefined
  
  var tab: js.UndefOr[String] = js.undefined
}
object PickImplloadedPartialPick {
  
  inline def apply(loaded: String): PickImplloadedPartialPick = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplloadedPartialPick]
  }
  
  extension [Self <: PickImplloadedPartialPick](x: Self) {
    
    inline def setLoaded(value: String): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setPromise(value: String): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    
    inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
  }
}
