package typings.sentryUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encrypted extends StObject {
  
  var encrypted: js.UndefOr[Boolean] = js.undefined
  
  var remoteAddress: js.UndefOr[String] = js.undefined
}
object Encrypted {
  
  inline def apply(): Encrypted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encrypted]
  }
  
  extension [Self <: Encrypted](x: Self) {
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    
    inline def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
  }
}
