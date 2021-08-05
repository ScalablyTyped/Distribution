package typings.semanticUiTab.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-tab.SemanticUI.Tab.MetadataSettings._Impl, 'promise'> */
trait PickImplpromise extends StObject {
  
  var promise: String
}
object PickImplpromise {
  
  inline def apply(promise: String): PickImplpromise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpromise]
  }
  
  extension [Self <: PickImplpromise](x: Self) {
    
    inline def setPromise(value: String): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
