package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstore.distCaMod.CA
import typings.sigstore.distIdentityProviderMod.Provider
import typings.sigstore.distTlogMod.TLog
import typings.sigstore.distTypesSignatureMod.SignatureMaterial
import typings.sigstore.distTypesSignatureMod.SignerFunc
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreBundleMod`.Bundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSignMod {
  
  @JSImport("sigstore/dist/sign", "Signer")
  @js.native
  open class Signer protected () extends StObject {
    def this(options: SignOptions) = this()
    
    /* private */ var ca: Any = js.native
    
    /* private */ var getIdentityToken: Any = js.native
    
    /* private */ var identityProviders: Any = js.native
    
    def signAttestation(payload: Buffer, payloadType: String): js.Promise[Bundle] = js.native
    
    def signBlob(payload: Buffer): js.Promise[Bundle] = js.native
    
    /* private */ var signWithEphemeralKey: Any = js.native
    
    /* private */ var signer: Any = js.native
    
    /* private */ var tlog: Any = js.native
  }
  
  trait SignOptions extends StObject {
    
    var ca: CA
    
    var identityProviders: js.Array[Provider]
    
    var signer: js.UndefOr[SignerFunc] = js.undefined
    
    var tlog: TLog
  }
  object SignOptions {
    
    inline def apply(ca: CA, identityProviders: js.Array[Provider], tlog: TLog): SignOptions = {
      val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], identityProviders = identityProviders.asInstanceOf[js.Any], tlog = tlog.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignOptions] (val x: Self) extends AnyVal {
      
      inline def setCa(value: CA): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setIdentityProviders(value: js.Array[Provider]): Self = StObject.set(x, "identityProviders", value.asInstanceOf[js.Any])
      
      inline def setIdentityProvidersVarargs(value: Provider*): Self = StObject.set(x, "identityProviders", js.Array(value*))
      
      inline def setSigner(value: /* payload */ Buffer => js.Promise[SignatureMaterial]): Self = StObject.set(x, "signer", js.Any.fromFunction1(value))
      
      inline def setSignerUndefined: Self = StObject.set(x, "signer", js.undefined)
      
      inline def setTlog(value: TLog): Self = StObject.set(x, "tlog", value.asInstanceOf[js.Any])
    }
  }
}
