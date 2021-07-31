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
  
  @scala.inline
  def apply(): CryptoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CryptoParameters]
  }
  
  @scala.inline
  implicit class CryptoParametersMutableBuilder[Self <: CryptoParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptKey(value: Boolean): Self = StObject.set(x, "encryptKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptKeyUndefined: Self = StObject.set(x, "encryptKey", js.undefined)
    
    @scala.inline
    def setKeyEncoding(value: String): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
    
    @scala.inline
    def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
