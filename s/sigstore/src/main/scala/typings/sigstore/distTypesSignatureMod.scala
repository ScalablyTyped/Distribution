package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstore.anon.Id
import typings.sigstore.anon.Signature
import typings.sigstore.distTypesUtilityMod.OneOf
import typings.sigstoreProtobufSpecs.`dist@GeneratedEnvelopeMod`.Envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSignatureMod {
  
  @JSImport("sigstore/dist/types/signature", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extractSignatureMaterial(dsseEnvelope: Envelope, publicKey: String): SignatureMaterial = (^.asInstanceOf[js.Dynamic].applyDynamic("extractSignatureMaterial")(dsseEnvelope.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[SignatureMaterial]
  
  type SignatureMaterial = Signature & OneOf[VerificationMaterial]
  
  type SignerFunc = js.Function1[/* payload */ Buffer, js.Promise[SignatureMaterial]]
  
  trait VerificationMaterial extends StObject {
    
    var certificates: js.Array[String]
    
    var key: Id
  }
  object VerificationMaterial {
    
    inline def apply(certificates: js.Array[String], key: Id): VerificationMaterial = {
      val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationMaterial]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerificationMaterial] (val x: Self) extends AnyVal {
      
      inline def setCertificates(value: js.Array[String]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
      
      inline def setCertificatesVarargs(value: String*): Self = StObject.set(x, "certificates", js.Array(value*))
      
      inline def setKey(value: Id): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
}
