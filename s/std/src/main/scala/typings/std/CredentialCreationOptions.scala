package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialCreationOptions extends StObject {
  
  var publicKey: js.UndefOr[PublicKeyCredentialCreationOptions] = js.undefined
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object CredentialCreationOptions {
  
  inline def apply(): CredentialCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialCreationOptions]
  }
  
  extension [Self <: CredentialCreationOptions](x: Self) {
    
    inline def setPublicKey(value: PublicKeyCredentialCreationOptions): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
