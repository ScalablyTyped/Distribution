package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcdhKeyDeriveParams
  extends StObject
     with Algorithm {
  
  /* standard dom */
  var public: CryptoKey
}
object EcdhKeyDeriveParams {
  
  inline def apply(name: java.lang.String, public: CryptoKey): EcdhKeyDeriveParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcdhKeyDeriveParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcdhKeyDeriveParams] (val x: Self) extends AnyVal {
    
    inline def setPublic(value: CryptoKey): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
  }
}
