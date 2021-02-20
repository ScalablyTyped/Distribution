package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DhKeyDeriveParams extends Algorithm {
  
  var public: CryptoKey = js.native
}
object DhKeyDeriveParams {
  
  @scala.inline
  def apply(name: java.lang.String, public: CryptoKey): DhKeyDeriveParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.asInstanceOf[DhKeyDeriveParams]
  }
  
  @scala.inline
  implicit class DhKeyDeriveParamsMutableBuilder[Self <: DhKeyDeriveParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPublic(value: CryptoKey): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
  }
}
