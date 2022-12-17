package typings.semanticUiNag.anon

import typings.semanticUiNag.SemanticUI.Nag.ErrorSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl, 'noCookieStorage'> & std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl>> */
trait PickImplnoCookieStoragePa
  extends StObject
     with Param {
  
  var method: js.UndefOr[String] = js.undefined
  
  var noCookieStorage: String
  
  var noStorage: js.UndefOr[String] = js.undefined
}
object PickImplnoCookieStoragePa {
  
  inline def apply(noCookieStorage: String): PickImplnoCookieStoragePa = {
    val __obj = js.Dynamic.literal(noCookieStorage = noCookieStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplnoCookieStoragePa]
  }
  
  extension [Self <: PickImplnoCookieStoragePa](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoCookieStorage(value: String): Self = StObject.set(x, "noCookieStorage", value.asInstanceOf[js.Any])
    
    inline def setNoStorage(value: String): Self = StObject.set(x, "noStorage", value.asInstanceOf[js.Any])
    
    inline def setNoStorageUndefined: Self = StObject.set(x, "noStorage", js.undefined)
  }
}
