package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreTrustrootMod`.TransparencyLogInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distX509SctMod {
  
  @JSImport("sigstore/dist/x509/sct", "SignedCertificateTimestamp")
  @js.native
  open class SignedCertificateTimestamp protected () extends StObject {
    def this(options: SCTOptions) = this()
    
    def algorithm: String = js.native
    
    def datetime: js.Date = js.native
    
    val extensions: Buffer = js.native
    
    val hashAlgorithm: Double = js.native
    
    val logID: Buffer = js.native
    
    val signature: Buffer = js.native
    
    val signatureAlgorithm: Double = js.native
    
    val timestamp: Buffer = js.native
    
    def verify(preCert: Buffer, logs: js.Array[TransparencyLogInstance]): Boolean = js.native
    
    val version: Double = js.native
  }
  /* static members */
  object SignedCertificateTimestamp {
    
    @JSImport("sigstore/dist/x509/sct", "SignedCertificateTimestamp")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(buf: Buffer): SignedCertificateTimestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buf.asInstanceOf[js.Any]).asInstanceOf[SignedCertificateTimestamp]
  }
  
  trait SCTOptions extends StObject {
    
    var extensions: Buffer
    
    var hashAlgorithm: Double
    
    var logID: Buffer
    
    var signature: Buffer
    
    var signatureAlgorithm: Double
    
    var timestamp: Buffer
    
    var version: Double
  }
  object SCTOptions {
    
    inline def apply(
      extensions: Buffer,
      hashAlgorithm: Double,
      logID: Buffer,
      signature: Buffer,
      signatureAlgorithm: Double,
      timestamp: Buffer,
      version: Double
    ): SCTOptions = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], logID = logID.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], signatureAlgorithm = signatureAlgorithm.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SCTOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SCTOptions] (val x: Self) extends AnyVal {
      
      inline def setExtensions(value: Buffer): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setHashAlgorithm(value: Double): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setLogID(value: Buffer): Self = StObject.set(x, "logID", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureAlgorithm(value: Double): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Buffer): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
