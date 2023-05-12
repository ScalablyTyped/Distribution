package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyid extends StObject {
  
  /**
    * optional id of the key used to create the signature
    */
  var keyid: js.UndefOr[String] = js.undefined
  
  /**
    * public key that corresponds to this signature
    */
  var publicKey: js.UndefOr[String] = js.undefined
  
  /**
    * signature of the payload
    */
  var sig: js.UndefOr[String] = js.undefined
}
object Keyid {
  
  inline def apply(): Keyid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Keyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Keyid] (val x: Self) extends AnyVal {
    
    inline def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
    
    inline def setKeyidUndefined: Self = StObject.set(x, "keyid", js.undefined)
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setSig(value: String): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    
    inline def setSigUndefined: Self = StObject.set(x, "sig", js.undefined)
  }
}
