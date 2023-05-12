package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.KeyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCaMod {
  
  @JSImport("sigstore/dist/ca", "CAClient")
  @js.native
  open class CAClient protected ()
    extends StObject
       with CA {
    def this(options: CAClientOptions) = this()
    
    /* CompleteClass */
    override def createSigningCertificate(identityToken: String, publicKey: KeyObject, challenge: Buffer): js.Promise[js.Array[String]] = js.native
    
    /* private */ var fulcio: Any = js.native
  }
  
  trait CA extends StObject {
    
    def createSigningCertificate(identityToken: String, publicKey: KeyObject, challenge: Buffer): js.Promise[js.Array[String]]
  }
  object CA {
    
    inline def apply(createSigningCertificate: (String, KeyObject, Buffer) => js.Promise[js.Array[String]]): CA = {
      val __obj = js.Dynamic.literal(createSigningCertificate = js.Any.fromFunction3(createSigningCertificate))
      __obj.asInstanceOf[CA]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CA] (val x: Self) extends AnyVal {
      
      inline def setCreateSigningCertificate(value: (String, KeyObject, Buffer) => js.Promise[js.Array[String]]): Self = StObject.set(x, "createSigningCertificate", js.Any.fromFunction3(value))
    }
  }
  
  trait CAClientOptions extends StObject {
    
    var fulcioBaseURL: String
  }
  object CAClientOptions {
    
    inline def apply(fulcioBaseURL: String): CAClientOptions = {
      val __obj = js.Dynamic.literal(fulcioBaseURL = fulcioBaseURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[CAClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CAClientOptions] (val x: Self) extends AnyVal {
      
      inline def setFulcioBaseURL(value: String): Self = StObject.set(x, "fulcioBaseURL", value.asInstanceOf[js.Any])
    }
  }
}
