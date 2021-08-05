package typings.semanticUiNag.anon

import typings.semanticUiNag.semanticUiNagStrings.cookie
import typings.semanticUiNag.semanticUiNagStrings.localstorage
import typings.semanticUiNag.semanticUiNagStrings.sessionstorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.NagSettings._Impl, 'storageMethod'> */
trait PickImplstorageMethod extends StObject {
  
  var storageMethod: cookie | localstorage | sessionstorage
}
object PickImplstorageMethod {
  
  inline def apply(storageMethod: cookie | localstorage | sessionstorage): PickImplstorageMethod = {
    val __obj = js.Dynamic.literal(storageMethod = storageMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplstorageMethod]
  }
  
  extension [Self <: PickImplstorageMethod](x: Self) {
    
    inline def setStorageMethod(value: cookie | localstorage | sessionstorage): Self = StObject.set(x, "storageMethod", value.asInstanceOf[js.Any])
  }
}
