package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstore.anon.FulcioURL
import typings.sigstore.anon.RekorURL
import typings.sigstore.distCaMod.CA
import typings.sigstore.distIdentityProviderMod.Provider
import typings.sigstore.distTlogMod.TLog
import typings.sigstore.distTypesSigstoreMod.RequiredArtifactVerificationOptions
import typings.sigstore.distVerifyMod.KeySelector
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigMod {
  
  @JSImport("sigstore/dist/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sigstore/dist/config", "DEFAULT_FULCIO_URL")
  @js.native
  val DEFAULT_FULCIO_URL: /* "https://fulcio.sigstore.dev" */ String = js.native
  
  @JSImport("sigstore/dist/config", "DEFAULT_REKOR_URL")
  @js.native
  val DEFAULT_REKOR_URL: /* "https://rekor.sigstore.dev" */ String = js.native
  
  inline def artifactVerificationOptions(options: VerifyOptions): RequiredArtifactVerificationOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("artifactVerificationOptions")(options.asInstanceOf[js.Any]).asInstanceOf[RequiredArtifactVerificationOptions]
  
  inline def createCAClient(options: FulcioURL): CA = ^.asInstanceOf[js.Dynamic].applyDynamic("createCAClient")(options.asInstanceOf[js.Any]).asInstanceOf[CA]
  
  inline def createTLogClient(options: RekorURL): TLog = ^.asInstanceOf[js.Dynamic].applyDynamic("createTLogClient")(options.asInstanceOf[js.Any]).asInstanceOf[TLog]
  
  inline def identityProviders(options: IdentityProviderOptions): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("identityProviders")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[Provider]]
  
  trait CAOptions extends StObject {
    
    var fulcioURL: js.UndefOr[String] = js.undefined
  }
  object CAOptions {
    
    inline def apply(): CAOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CAOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CAOptions] (val x: Self) extends AnyVal {
      
      inline def setFulcioURL(value: String): Self = StObject.set(x, "fulcioURL", value.asInstanceOf[js.Any])
      
      inline def setFulcioURLUndefined: Self = StObject.set(x, "fulcioURL", js.undefined)
    }
  }
  
  trait IdentityProviderOptions extends StObject {
    
    var identityToken: js.UndefOr[String] = js.undefined
    
    var oidcClientID: js.UndefOr[String] = js.undefined
    
    var oidcClientSecret: js.UndefOr[String] = js.undefined
    
    var oidcIssuer: js.UndefOr[String] = js.undefined
    
    var oidcRedirectURL: js.UndefOr[String] = js.undefined
  }
  object IdentityProviderOptions {
    
    inline def apply(): IdentityProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IdentityProviderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdentityProviderOptions] (val x: Self) extends AnyVal {
      
      inline def setIdentityToken(value: String): Self = StObject.set(x, "identityToken", value.asInstanceOf[js.Any])
      
      inline def setIdentityTokenUndefined: Self = StObject.set(x, "identityToken", js.undefined)
      
      inline def setOidcClientID(value: String): Self = StObject.set(x, "oidcClientID", value.asInstanceOf[js.Any])
      
      inline def setOidcClientIDUndefined: Self = StObject.set(x, "oidcClientID", js.undefined)
      
      inline def setOidcClientSecret(value: String): Self = StObject.set(x, "oidcClientSecret", value.asInstanceOf[js.Any])
      
      inline def setOidcClientSecretUndefined: Self = StObject.set(x, "oidcClientSecret", js.undefined)
      
      inline def setOidcIssuer(value: String): Self = StObject.set(x, "oidcIssuer", value.asInstanceOf[js.Any])
      
      inline def setOidcIssuerUndefined: Self = StObject.set(x, "oidcIssuer", js.undefined)
      
      inline def setOidcRedirectURL(value: String): Self = StObject.set(x, "oidcRedirectURL", value.asInstanceOf[js.Any])
      
      inline def setOidcRedirectURLUndefined: Self = StObject.set(x, "oidcRedirectURL", js.undefined)
    }
  }
  
  trait SignOptions
    extends StObject
       with CAOptions
       with TLogOptions
       with IdentityProviderOptions
  object SignOptions {
    
    inline def apply(): SignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOptions]
    }
  }
  
  trait TLogOptions extends StObject {
    
    var rekorURL: js.UndefOr[String] = js.undefined
  }
  object TLogOptions {
    
    inline def apply(): TLogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TLogOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TLogOptions] (val x: Self) extends AnyVal {
      
      inline def setRekorURL(value: String): Self = StObject.set(x, "rekorURL", value.asInstanceOf[js.Any])
      
      inline def setRekorURLUndefined: Self = StObject.set(x, "rekorURL", js.undefined)
    }
  }
  
  trait TUFOptions extends StObject {
    
    var tufCachePath: js.UndefOr[String] = js.undefined
    
    var tufMirrorURL: js.UndefOr[String] = js.undefined
    
    var tufRootPath: js.UndefOr[String] = js.undefined
  }
  object TUFOptions {
    
    inline def apply(): TUFOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TUFOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TUFOptions] (val x: Self) extends AnyVal {
      
      inline def setTufCachePath(value: String): Self = StObject.set(x, "tufCachePath", value.asInstanceOf[js.Any])
      
      inline def setTufCachePathUndefined: Self = StObject.set(x, "tufCachePath", js.undefined)
      
      inline def setTufMirrorURL(value: String): Self = StObject.set(x, "tufMirrorURL", value.asInstanceOf[js.Any])
      
      inline def setTufMirrorURLUndefined: Self = StObject.set(x, "tufMirrorURL", js.undefined)
      
      inline def setTufRootPath(value: String): Self = StObject.set(x, "tufRootPath", value.asInstanceOf[js.Any])
      
      inline def setTufRootPathUndefined: Self = StObject.set(x, "tufRootPath", js.undefined)
    }
  }
  
  trait VerifyOptions
    extends StObject
       with TLogOptions
       with TUFOptions {
    
    var certificateIdentityEmail: js.UndefOr[String] = js.undefined
    
    var certificateIdentityURI: js.UndefOr[String] = js.undefined
    
    var certificateIssuer: js.UndefOr[String] = js.undefined
    
    var certificateOIDs: js.UndefOr[Record[String, String]] = js.undefined
    
    var ctLogThreshold: js.UndefOr[Double] = js.undefined
    
    var keySelector: js.UndefOr[KeySelector] = js.undefined
    
    var tlogThreshold: js.UndefOr[Double] = js.undefined
  }
  object VerifyOptions {
    
    inline def apply(): VerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VerifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VerifyOptions] (val x: Self) extends AnyVal {
      
      inline def setCertificateIdentityEmail(value: String): Self = StObject.set(x, "certificateIdentityEmail", value.asInstanceOf[js.Any])
      
      inline def setCertificateIdentityEmailUndefined: Self = StObject.set(x, "certificateIdentityEmail", js.undefined)
      
      inline def setCertificateIdentityURI(value: String): Self = StObject.set(x, "certificateIdentityURI", value.asInstanceOf[js.Any])
      
      inline def setCertificateIdentityURIUndefined: Self = StObject.set(x, "certificateIdentityURI", js.undefined)
      
      inline def setCertificateIssuer(value: String): Self = StObject.set(x, "certificateIssuer", value.asInstanceOf[js.Any])
      
      inline def setCertificateIssuerUndefined: Self = StObject.set(x, "certificateIssuer", js.undefined)
      
      inline def setCertificateOIDs(value: Record[String, String]): Self = StObject.set(x, "certificateOIDs", value.asInstanceOf[js.Any])
      
      inline def setCertificateOIDsUndefined: Self = StObject.set(x, "certificateOIDs", js.undefined)
      
      inline def setCtLogThreshold(value: Double): Self = StObject.set(x, "ctLogThreshold", value.asInstanceOf[js.Any])
      
      inline def setCtLogThresholdUndefined: Self = StObject.set(x, "ctLogThreshold", js.undefined)
      
      inline def setKeySelector(value: /* hint */ String => js.UndefOr[String | Buffer]): Self = StObject.set(x, "keySelector", js.Any.fromFunction1(value))
      
      inline def setKeySelectorUndefined: Self = StObject.set(x, "keySelector", js.undefined)
      
      inline def setTlogThreshold(value: Double): Self = StObject.set(x, "tlogThreshold", value.asInstanceOf[js.Any])
      
      inline def setTlogThresholdUndefined: Self = StObject.set(x, "tlogThreshold", js.undefined)
    }
  }
}
