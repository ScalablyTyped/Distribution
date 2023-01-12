package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// encrypt & decrypt
trait CryptoParameters extends StObject {
  
  var encryptKey: js.UndefOr[Boolean] = js.undefined
  
  var keyEncoding: js.UndefOr[String] = js.undefined
  
  var keyLength: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
}
object CryptoParameters {
  
  inline def apply(): CryptoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoParameters] (val x: Self) extends AnyVal {
    
    inline def setEncryptKey(value: Boolean): Self = StObject.set(x, "encryptKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptKeyUndefined: Self = StObject.set(x, "encryptKey", js.undefined)
    
    inline def setKeyEncoding(value: String): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
    
    inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
    
    inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
