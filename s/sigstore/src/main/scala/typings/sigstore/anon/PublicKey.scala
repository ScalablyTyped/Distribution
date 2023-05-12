package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKey extends StObject {
  
  /**
    * Specifies the content of the signature inline within the document
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The public key that can verify the signature; this can also be an X509 code signing certificate that contains the raw public key information
    */
  var publicKey: js.UndefOr[Content] = js.undefined
}
object PublicKey {
  
  inline def apply(): PublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setPublicKey(value: Content): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
  }
}
