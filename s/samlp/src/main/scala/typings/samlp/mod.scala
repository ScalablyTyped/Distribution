package typings.samlp

import typings.express.mod.Handler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import typings.passport.mod.Profile
import typings.samlp.anon.Post
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("samlp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("samlp", "PassportProfileMapper")
  @js.native
  def PassportProfileMapper: ProfileMapperConstructor = js.native
  @scala.inline
  def PassportProfileMapper_=(x: ProfileMapperConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PassportProfileMapper")(x.asInstanceOf[js.Any])
  
  @JSImport("samlp", "auth")
  @js.native
  def auth(options: IdPOptions): Handler = js.native
  
  @JSImport("samlp", "getSamlResponse")
  @js.native
  def getSamlResponse(
    options: IdPOptions,
    user: js.Any,
    callback: js.Function2[/* err */ js.Any, /* samlResponse */ String, Unit]
  ): Unit = js.native
  
  @JSImport("samlp", "logout")
  @js.native
  def logout(options: IdPOptions): Handler = js.native
  
  @JSImport("samlp", "metadata")
  @js.native
  def metadata(options: IdPMetadataOptions): Handler = js.native
  
  @JSImport("samlp", "parseRequest")
  @js.native
  def parseRequest(
    req: Request_[ParamsDictionary, _, _, Query],
    callback: js.Function2[/* err */ js.Any, /* data */ SamlRequest, Unit]
  ): Unit = js.native
  
  @JSImport("samlp", "sendError")
  @js.native
  def sendError(options: IdPOptions): Handler = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.samlp.samlpStrings.sha1
    - typings.samlp.samlpStrings.sha256
  */
  trait DigestAlgorithmType extends StObject
  object DigestAlgorithmType {
    
    @scala.inline
    def sha1: typings.samlp.samlpStrings.sha1 = "sha1".asInstanceOf[typings.samlp.samlpStrings.sha1]
    
    @scala.inline
    def sha256: typings.samlp.samlpStrings.sha256 = "sha256".asInstanceOf[typings.samlp.samlpStrings.sha256]
  }
  
  @js.native
  trait IdPMetadataOptions extends StObject {
    
    var cert: String | Buffer = js.native
    
    var issuer: String = js.native
    
    var logoutEndpointPaths: js.UndefOr[Post] = js.native
    
    var postEndpointPath: js.UndefOr[String] = js.native
    
    var profileMapper: js.UndefOr[ProfileMapperConstructor] = js.native
    
    var redirectEndpointPath: js.UndefOr[String] = js.native
  }
  object IdPMetadataOptions {
    
    @scala.inline
    def apply(cert: String | Buffer, issuer: String): IdPMetadataOptions = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdPMetadataOptions]
    }
    
    @scala.inline
    implicit class IdPMetadataOptionsMutableBuilder[Self <: IdPMetadataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCert(value: String | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoutEndpointPaths(value: Post): Self = StObject.set(x, "logoutEndpointPaths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogoutEndpointPathsUndefined: Self = StObject.set(x, "logoutEndpointPaths", js.undefined)
      
      @scala.inline
      def setPostEndpointPath(value: String): Self = StObject.set(x, "postEndpointPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostEndpointPathUndefined: Self = StObject.set(x, "postEndpointPath", js.undefined)
      
      @scala.inline
      def setProfileMapper(value: ProfileMapperConstructor): Self = StObject.set(x, "profileMapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileMapperUndefined: Self = StObject.set(x, "profileMapper", js.undefined)
      
      @scala.inline
      def setRedirectEndpointPath(value: String): Self = StObject.set(x, "redirectEndpointPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectEndpointPathUndefined: Self = StObject.set(x, "redirectEndpointPath", js.undefined)
    }
  }
  
  @js.native
  trait IdPOptions extends StObject {
    
    var RelayState: js.UndefOr[String] = js.native
    
    var audience: js.UndefOr[String] = js.native
    
    var authnContextClassRef: js.UndefOr[String] = js.native
    
    var cert: String | Buffer = js.native
    
    var destination: js.UndefOr[String] = js.native
    
    var digestAlgorithm: js.UndefOr[DigestAlgorithmType] = js.native
    
    var encryptionAlgorithm: js.UndefOr[String] = js.native
    
    var encryptionCert: js.UndefOr[String | Buffer] = js.native
    
    var encryptionPublicKey: js.UndefOr[String | Buffer] = js.native
    
    def getPostURL(
      audience: String,
      authnRequestDom: js.Any,
      req: Request_[ParamsDictionary, _, _, Query],
      callback: js.Function2[/* err */ js.Any, /* url */ String, Unit]
    ): Unit = js.native
    
    var getUserFromRequest: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], _]] = js.native
    
    var inResponseTo: js.UndefOr[String] = js.native
    
    var issuer: String = js.native
    
    var key: String | Buffer = js.native
    
    var keyEncryptionAlgorighm: js.UndefOr[String] = js.native
    
    var lifetimeInSeconds: js.UndefOr[Double] = js.native
    
    var profileMapper: js.UndefOr[ProfileMapperConstructor] = js.native
    
    var recipient: js.UndefOr[String] = js.native
    
    var signResponse: js.UndefOr[Boolean] = js.native
    
    var signatureAlgorithm: js.UndefOr[SignatureAlgorithmType] = js.native
  }
  object IdPOptions {
    
    @scala.inline
    def apply(
      cert: String | Buffer,
      getPostURL: (String, js.Any, Request_[ParamsDictionary, _, _, Query], js.Function2[/* err */ js.Any, /* url */ String, Unit]) => Unit,
      issuer: String,
      key: String | Buffer
    ): IdPOptions = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], getPostURL = js.Any.fromFunction4(getPostURL), issuer = issuer.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdPOptions]
    }
    
    @scala.inline
    implicit class IdPOptionsMutableBuilder[Self <: IdPOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      @scala.inline
      def setAuthnContextClassRef(value: String): Self = StObject.set(x, "authnContextClassRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthnContextClassRefUndefined: Self = StObject.set(x, "authnContextClassRef", js.undefined)
      
      @scala.inline
      def setCert(value: String | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      @scala.inline
      def setDigestAlgorithm(value: DigestAlgorithmType): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
      
      @scala.inline
      def setEncryptionAlgorithm(value: String): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "encryptionAlgorithm", js.undefined)
      
      @scala.inline
      def setEncryptionCert(value: String | Buffer): Self = StObject.set(x, "encryptionCert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionCertUndefined: Self = StObject.set(x, "encryptionCert", js.undefined)
      
      @scala.inline
      def setEncryptionPublicKey(value: String | Buffer): Self = StObject.set(x, "encryptionPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionPublicKeyUndefined: Self = StObject.set(x, "encryptionPublicKey", js.undefined)
      
      @scala.inline
      def setGetPostURL(
        value: (String, js.Any, Request_[ParamsDictionary, _, _, Query], js.Function2[/* err */ js.Any, /* url */ String, Unit]) => Unit
      ): Self = StObject.set(x, "getPostURL", js.Any.fromFunction4(value))
      
      @scala.inline
      def setGetUserFromRequest(value: /* req */ Request_[ParamsDictionary, _, _, Query] => _): Self = StObject.set(x, "getUserFromRequest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetUserFromRequestUndefined: Self = StObject.set(x, "getUserFromRequest", js.undefined)
      
      @scala.inline
      def setInResponseTo(value: String): Self = StObject.set(x, "inResponseTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInResponseToUndefined: Self = StObject.set(x, "inResponseTo", js.undefined)
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyEncryptionAlgorighm(value: String): Self = StObject.set(x, "keyEncryptionAlgorighm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyEncryptionAlgorighmUndefined: Self = StObject.set(x, "keyEncryptionAlgorighm", js.undefined)
      
      @scala.inline
      def setLifetimeInSeconds(value: Double): Self = StObject.set(x, "lifetimeInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifetimeInSecondsUndefined: Self = StObject.set(x, "lifetimeInSeconds", js.undefined)
      
      @scala.inline
      def setProfileMapper(value: ProfileMapperConstructor): Self = StObject.set(x, "profileMapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileMapperUndefined: Self = StObject.set(x, "profileMapper", js.undefined)
      
      @scala.inline
      def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
      
      @scala.inline
      def setRelayState(value: String): Self = StObject.set(x, "RelayState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelayStateUndefined: Self = StObject.set(x, "RelayState", js.undefined)
      
      @scala.inline
      def setSignResponse(value: Boolean): Self = StObject.set(x, "signResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignResponseUndefined: Self = StObject.set(x, "signResponse", js.undefined)
      
      @scala.inline
      def setSignatureAlgorithm(value: SignatureAlgorithmType): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    }
  }
  
  @js.native
  trait MetadataItem extends StObject {
    
    var description: String = js.native
    
    var displayName: String = js.native
    
    var id: String = js.native
    
    var optional: Boolean = js.native
  }
  object MetadataItem {
    
    @scala.inline
    def apply(description: String, displayName: String, id: String, optional: Boolean): MetadataItem = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataItem]
    }
    
    @scala.inline
    implicit class MetadataItemMutableBuilder[Self <: MetadataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProfileMapper extends StObject {
    
    def getClaims(): js.Any = js.native
    
    def getNameIdentifier(): js.Any = js.native
    
    var metadata: js.Array[MetadataItem] = js.native
  }
  object ProfileMapper {
    
    @scala.inline
    def apply(getClaims: () => js.Any, getNameIdentifier: () => js.Any, metadata: js.Array[MetadataItem]): ProfileMapper = {
      val __obj = js.Dynamic.literal(getClaims = js.Any.fromFunction0(getClaims), getNameIdentifier = js.Any.fromFunction0(getNameIdentifier), metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileMapper]
    }
    
    @scala.inline
    implicit class ProfileMapperMutableBuilder[Self <: ProfileMapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetClaims(value: () => js.Any): Self = StObject.set(x, "getClaims", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetNameIdentifier(value: () => js.Any): Self = StObject.set(x, "getNameIdentifier", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMetadata(value: js.Array[MetadataItem]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataVarargs(value: MetadataItem*): Self = StObject.set(x, "metadata", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ProfileMapperConstructor extends StObject {
    
    def apply(pu: Profile): ProfileMapper = js.native
  }
  
  @js.native
  trait SamlRequest extends StObject {
    
    var assertionConsumerServiceURL: js.UndefOr[String] = js.native
    
    var destination: js.UndefOr[String] = js.native
    
    var forceAuthn: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var issuer: js.UndefOr[String] = js.native
  }
  object SamlRequest {
    
    @scala.inline
    def apply(): SamlRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SamlRequest]
    }
    
    @scala.inline
    implicit class SamlRequestMutableBuilder[Self <: SamlRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssertionConsumerServiceURL(value: String): Self = StObject.set(x, "assertionConsumerServiceURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssertionConsumerServiceURLUndefined: Self = StObject.set(x, "assertionConsumerServiceURL", js.undefined)
      
      @scala.inline
      def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      @scala.inline
      def setForceAuthn(value: String): Self = StObject.set(x, "forceAuthn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceAuthnUndefined: Self = StObject.set(x, "forceAuthn", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.samlp.samlpStrings.`rsa-sha1`
    - typings.samlp.samlpStrings.`rsa-sha256`
  */
  trait SignatureAlgorithmType extends StObject
  object SignatureAlgorithmType {
    
    @scala.inline
    def `rsa-sha1`: typings.samlp.samlpStrings.`rsa-sha1` = "rsa-sha1".asInstanceOf[typings.samlp.samlpStrings.`rsa-sha1`]
    
    @scala.inline
    def `rsa-sha256`: typings.samlp.samlpStrings.`rsa-sha256` = "rsa-sha256".asInstanceOf[typings.samlp.samlpStrings.`rsa-sha256`]
  }
}
