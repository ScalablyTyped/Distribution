package typings.selfsigned

import typings.nodeForge.mod.pki.CertificateField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("selfsigned", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(): GenerateResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[GenerateResult]
  inline def generate(attrs: js.Array[CertificateField]): GenerateResult = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(attrs.asInstanceOf[js.Any]).asInstanceOf[GenerateResult]
  inline def generate(
    attrs: js.Array[CertificateField],
    opts: Unit,
    /** Optional callback, if not provided the generation is synchronous */
  done: js.Function2[/* err */ js.UndefOr[js.Error], /* result */ GenerateResult, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(attrs.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generate(attrs: js.Array[CertificateField], opts: SelfsignedOptions): GenerateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(attrs.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GenerateResult]
  inline def generate(
    attrs: js.Array[CertificateField],
    opts: SelfsignedOptions,
    /** Optional callback, if not provided the generation is synchronous */
  done: js.Function2[/* err */ js.UndefOr[js.Error], /* result */ GenerateResult, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(attrs.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generate(
    attrs: Unit,
    opts: Unit,
    /** Optional callback, if not provided the generation is synchronous */
  done: js.Function2[/* err */ js.UndefOr[js.Error], /* result */ GenerateResult, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(attrs.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generate(attrs: Unit, opts: SelfsignedOptions): GenerateResult = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(attrs.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GenerateResult]
  inline def generate(
    attrs: Unit,
    opts: SelfsignedOptions,
    /** Optional callback, if not provided the generation is synchronous */
  done: js.Function2[/* err */ js.UndefOr[js.Error], /* result */ GenerateResult, Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(attrs.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def generate_Unit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[Unit]
  inline def generate_Unit(attrs: js.Array[CertificateField]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(attrs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def generate_Unit(attrs: js.Array[CertificateField], opts: SelfsignedOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(attrs.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def generate_Unit(attrs: Unit, opts: SelfsignedOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(attrs.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait GenerateResult extends StObject {
    
    var cert: String
    
    var fingerprint: String
    
    var `private`: String
    
    var public: String
  }
  object GenerateResult {
    
    inline def apply(cert: String, fingerprint: String, `private`: String, public: String): GenerateResult = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
      __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateResult] (val x: Self) extends AnyVal {
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setPrivate(value: String): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelfsignedOptions extends StObject {
    
    /**
      * The signature algorithm sha256 or sha1
      * @default "sha1"
      */
    var algorithm: js.UndefOr[String] = js.undefined
    
    /**
      * generate client cert signed by the original key
      * @default false
      */
    var clientCertificate: Unit
    
    /**
      * client certificate's common name
      * @default "John Doe jdoe123"
      */
    var clientCertificateCN: js.UndefOr[String] = js.undefined
    
    /**
      * The number of days before expiration
      *
      * @default 365 */
    var days: js.UndefOr[Double] = js.undefined
    
    /**
      * additional extensions for the certificate
      */
    var extensions: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * the size for the private key in bits
      * @default 1024
      */
    var keySize: js.UndefOr[Double] = js.undefined
    
    /**
      * include PKCS#7 as part of the output
      * @default false
      */
    var pkcs7: js.UndefOr[Boolean] = js.undefined
  }
  object SelfsignedOptions {
    
    inline def apply(clientCertificate: Unit): SelfsignedOptions = {
      val __obj = js.Dynamic.literal(clientCertificate = clientCertificate.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelfsignedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelfsignedOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setClientCertificate(value: Unit): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
      
      inline def setClientCertificateCN(value: String): Self = StObject.set(x, "clientCertificateCN", value.asInstanceOf[js.Any])
      
      inline def setClientCertificateCNUndefined: Self = StObject.set(x, "clientCertificateCN", js.undefined)
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      inline def setExtensions(value: js.Array[Any]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: Any*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setKeySize(value: Double): Self = StObject.set(x, "keySize", value.asInstanceOf[js.Any])
      
      inline def setKeySizeUndefined: Self = StObject.set(x, "keySize", js.undefined)
      
      inline def setPkcs7(value: Boolean): Self = StObject.set(x, "pkcs7", value.asInstanceOf[js.Any])
      
      inline def setPkcs7Undefined: Self = StObject.set(x, "pkcs7", js.undefined)
    }
  }
}
