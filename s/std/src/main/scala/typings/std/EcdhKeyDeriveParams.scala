package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcdhKeyDeriveParams
  extends StObject
     with Algorithm {
  
  var public: CryptoKey
}
object EcdhKeyDeriveParams {
  
  @scala.inline
  def apply(name: java.lang.String, public: CryptoKey): EcdhKeyDeriveParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcdhKeyDeriveParams]
  }
  
  @scala.inline
  implicit class EcdhKeyDeriveParamsMutableBuilder[Self <: EcdhKeyDeriveParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublic(value: CryptoKey): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
  }
}
