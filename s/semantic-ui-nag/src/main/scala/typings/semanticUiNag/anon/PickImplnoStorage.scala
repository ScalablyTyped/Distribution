package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl, 'noStorage'> */
trait PickImplnoStorage extends StObject {
  
  var noStorage: String
}
object PickImplnoStorage {
  
  inline def apply(noStorage: String): PickImplnoStorage = {
    val __obj = js.Dynamic.literal(noStorage = noStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoStorage]
  }
  
  extension [Self <: PickImplnoStorage](x: Self) {
    
    inline def setNoStorage(value: String): Self = StObject.set(x, "noStorage", value.asInstanceOf[js.Any])
  }
}
