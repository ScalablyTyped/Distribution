package typings.semanticUiTab.anon

import typings.semanticUiTab.SemanticUI.Tab.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl, 'tab'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl>> */
trait PickImpltabPartialPickImp
  extends StObject
     with Param {
  
  var loaded: js.UndefOr[String] = js.undefined
  
  var promise: js.UndefOr[String] = js.undefined
  
  var tab: String
}
object PickImpltabPartialPickImp {
  
  inline def apply(tab: String): PickImpltabPartialPickImp = {
    val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpltabPartialPickImp]
  }
  
  extension [Self <: PickImpltabPartialPickImp](x: Self) {
    
    inline def setLoaded(value: String): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    inline def setPromise(value: String): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    
    inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
  }
}
