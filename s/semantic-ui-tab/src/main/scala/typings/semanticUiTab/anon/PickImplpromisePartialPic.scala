package typings.semanticUiTab.anon

import typings.semanticUiTab.SemanticUI.Tab.MetadataSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl, 'promise'> & std.Partial<std.Pick<semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl, keyof semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl>> */
trait PickImplpromisePartialPic
  extends StObject
     with Param {
  
  var loaded: js.UndefOr[String] = js.undefined
  
  var promise: String
  
  var tab: js.UndefOr[String] = js.undefined
}
object PickImplpromisePartialPic {
  
  inline def apply(promise: String): PickImplpromisePartialPic = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpromisePartialPic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplpromisePartialPic] (val x: Self) extends AnyVal {
    
    inline def setLoaded(value: String): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    inline def setPromise(value: String): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
  }
}
