package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DhKeyDeriveParams
  extends StObject
     with Algorithm {
  
  var public: CryptoKey
}
object DhKeyDeriveParams {
  
  inline def apply(name: java.lang.String, public: CryptoKey): DhKeyDeriveParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[DhKeyDeriveParams]
  }
  
  extension [Self <: DhKeyDeriveParams](x: Self) {
    
    inline def setPublic(value: CryptoKey): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
  }
}
