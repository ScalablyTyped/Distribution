package typings.semanticUiNag.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.ErrorSettings._Impl>> */
trait PartialPickImplkeyofImplMethod extends StObject {
  
  var method: js.UndefOr[String] = js.undefined
  
  var noCookieStorage: js.UndefOr[String] = js.undefined
  
  var noStorage: js.UndefOr[String] = js.undefined
}
object PartialPickImplkeyofImplMethod {
  
  inline def apply(): PartialPickImplkeyofImplMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplMethod]
  }
  
  extension [Self <: PartialPickImplkeyofImplMethod](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNoCookieStorage(value: String): Self = StObject.set(x, "noCookieStorage", value.asInstanceOf[js.Any])
    
    inline def setNoCookieStorageUndefined: Self = StObject.set(x, "noCookieStorage", js.undefined)
    
    inline def setNoStorage(value: String): Self = StObject.set(x, "noStorage", value.asInstanceOf[js.Any])
    
    inline def setNoStorageUndefined: Self = StObject.set(x, "noStorage", js.undefined)
  }
}
