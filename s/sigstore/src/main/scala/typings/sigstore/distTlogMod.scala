package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstore.distTypesSignatureMod.SignatureMaterial
import typings.sigstoreProtobufSpecs.`dist@GeneratedEnvelopeMod`.Envelope
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreBundleMod`.Bundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTlogMod {
  
  @JSImport("sigstore/dist/tlog", "TLogClient")
  @js.native
  open class TLogClient protected ()
    extends StObject
       with TLog {
    def this(options: TLogClientOptions) = this()
    
    /* private */ var createEntry: Any = js.native
    
    def createMessageSignatureEntry(digest: Buffer, sigMaterial: SignatureMaterial, options: CreateEntryOptions): js.Promise[Bundle] = js.native
    
    /* private */ var rekor: Any = js.native
  }
  
  trait CreateEntryOptions extends StObject {
    
    var fetchOnConflict: js.UndefOr[Boolean] = js.undefined
  }
  object CreateEntryOptions {
    
    inline def apply(): CreateEntryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEntryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEntryOptions] (val x: Self) extends AnyVal {
      
      inline def setFetchOnConflict(value: Boolean): Self = StObject.set(x, "fetchOnConflict", value.asInstanceOf[js.Any])
      
      inline def setFetchOnConflictUndefined: Self = StObject.set(x, "fetchOnConflict", js.undefined)
    }
  }
  
  @js.native
  trait TLog extends StObject {
    
    def createDSSEEntry(envelope: Envelope, sigMaterial: SignatureMaterial): js.Promise[Bundle] = js.native
    def createDSSEEntry(envelope: Envelope, sigMaterial: SignatureMaterial, options: CreateEntryOptions): js.Promise[Bundle] = js.native
    
    def createMessageSignatureEntry(digest: Buffer, sigMaterial: SignatureMaterial): js.Promise[Bundle] = js.native
  }
  
  trait TLogClientOptions extends StObject {
    
    var rekorBaseURL: String
  }
  object TLogClientOptions {
    
    inline def apply(rekorBaseURL: String): TLogClientOptions = {
      val __obj = js.Dynamic.literal(rekorBaseURL = rekorBaseURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[TLogClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TLogClientOptions] (val x: Self) extends AnyVal {
      
      inline def setRekorBaseURL(value: String): Self = StObject.set(x, "rekorBaseURL", value.asInstanceOf[js.Any])
    }
  }
}
