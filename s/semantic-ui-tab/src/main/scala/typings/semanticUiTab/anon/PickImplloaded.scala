package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl, 'loaded'> */
trait PickImplloaded extends StObject {
  
  var loaded: String
}
object PickImplloaded {
  
  inline def apply(loaded: String): PickImplloaded = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplloaded]
  }
  
  extension [Self <: PickImplloaded](x: Self) {
    
    inline def setLoaded(value: String): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
  }
}
