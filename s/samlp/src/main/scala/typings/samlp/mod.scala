package typings.samlp

import typings.express.mod.Handler
import typings.express.mod.Request_
import typings.node.bufferMod.global.Buffer
import typings.passport.mod.Profile
import typings.samlp.anon.Post
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("samlp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("samlp", "PassportProfileMapper")
  @js.native
  def PassportProfileMapper: ProfileMapperConstructor = js.native
  inline def PassportProfileMapper_=(x: ProfileMapperConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PassportProfileMapper")(x.asInstanceOf[js.Any])
  
  inline def auth(options: IdPOptions): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("auth")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  inline def getSamlResponse(
    options: IdPOptions,
    user: Any,
    callback: js.Function2[/* err */ Any, /* samlResponse */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getSamlResponse")(options.asInstanceOf[js.Any], user.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logout(options: IdPOptions): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  inline def metadata(options: IdPMetadataOptions): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("metadata")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  inline def parseRequest(
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    callback: js.Function2[/* err */ Any, /* data */ SamlRequest, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRequest")(req.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sendError(options: IdPOptions): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("sendError")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  /* Rewritten from type alias, can be one of: 
    - typings.samlp.samlpStrings.sha1
    - typings.samlp.samlpStrings.sha256
  */
  trait DigestAlgorithmType extends StObject
  object DigestAlgorithmType {
    
    inline def sha1: typings.samlp.samlpStrings.sha1 = "sha1".asInstanceOf[typings.samlp.samlpStrings.sha1]
    
    inline def sha256: typings.samlp.samlpStrings.sha256 = "sha256".asInstanceOf[typings.samlp.samlpStrings.sha256]
  }
  
  trait IdPMetadataOptions extends StObject {
    
    var cert: String | Buffer
    
    var issuer: String
    
    var logoutEndpointPaths: js.UndefOr[Post] = js.undefined
    
    var postEndpointPath: js.UndefOr[String] = js.undefined
    
    var profileMapper: js.UndefOr[ProfileMapperConstructor] = js.undefined
    
    var redirectEndpointPath: js.UndefOr[String] = js.undefined
  }
  object IdPMetadataOptions {
    
    inline def apply(cert: String | Buffer, issuer: String): IdPMetadataOptions = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdPMetadataOptions]
    }
    
    extension [Self <: IdPMetadataOptions](x: Self) {
      
      inline def setCert(value: String | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setLogoutEndpointPaths(value: Post): Self = StObject.set(x, "logoutEndpointPaths", value.asInstanceOf[js.Any])
      
      inline def setLogoutEndpointPathsUndefined: Self = StObject.set(x, "logoutEndpointPaths", js.undefined)
      
      inline def setPostEndpointPath(value: String): Self = StObject.set(x, "postEndpointPath", value.asInstanceOf[js.Any])
      
      inline def setPostEndpointPathUndefined: Self = StObject.set(x, "postEndpointPath", js.undefined)
      
      inline def setProfileMapper(value: /* pu */ Profile => ProfileMapper): Self = StObject.set(x, "profileMapper", js.Any.fromFunction1(value))
      
      inline def setProfileMapperUndefined: Self = StObject.set(x, "profileMapper", js.undefined)
      
      inline def setRedirectEndpointPath(value: String): Self = StObject.set(x, "redirectEndpointPath", value.asInstanceOf[js.Any])
      
      inline def setRedirectEndpointPathUndefined: Self = StObject.set(x, "redirectEndpointPath", js.undefined)
    }
  }
  
  trait IdPOptions extends StObject {
    
    var RelayState: js.UndefOr[String] = js.undefined
    
    var audience: js.UndefOr[String] = js.undefined
    
    var authnContextClassRef: js.UndefOr[String] = js.undefined
    
    var cert: String | Buffer
    
    var destination: js.UndefOr[String] = js.undefined
    
    var digestAlgorithm: js.UndefOr[DigestAlgorithmType] = js.undefined
    
    var encryptionAlgorithm: js.UndefOr[String] = js.undefined
    
    var encryptionCert: js.UndefOr[String | Buffer] = js.undefined
    
    var encryptionPublicKey: js.UndefOr[String | Buffer] = js.undefined
    
    def getPostURL(
      audience: String,
      authnRequestDom: Any,
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      callback: js.Function2[/* err */ Any, /* url */ String, Unit]
    ): Unit
    
    var getUserFromRequest: js.UndefOr[
        js.Function1[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          Any
        ]
      ] = js.undefined
    
    var inResponseTo: js.UndefOr[String] = js.undefined
    
    var issuer: String
    
    var key: String | Buffer
    
    var keyEncryptionAlgorighm: js.UndefOr[String] = js.undefined
    
    var lifetimeInSeconds: js.UndefOr[Double] = js.undefined
    
    var profileMapper: js.UndefOr[ProfileMapperConstructor] = js.undefined
    
    var recipient: js.UndefOr[String] = js.undefined
    
    var signResponse: js.UndefOr[Boolean] = js.undefined
    
    var signatureAlgorithm: js.UndefOr[SignatureAlgorithmType] = js.undefined
  }
  object IdPOptions {
    
    inline def apply(
      cert: String | Buffer,
      getPostURL: (String, Any, Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], js.Function2[/* err */ Any, /* url */ String, Unit]) => Unit,
      issuer: String,
      key: String | Buffer
    ): IdPOptions = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], getPostURL = js.Any.fromFunction4(getPostURL), issuer = issuer.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdPOptions]
    }
    
    extension [Self <: IdPOptions](x: Self) {
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAuthnContextClassRef(value: String): Self = StObject.set(x, "authnContextClassRef", value.asInstanceOf[js.Any])
      
      inline def setAuthnContextClassRefUndefined: Self = StObject.set(x, "authnContextClassRef", js.undefined)
      
      inline def setCert(value: String | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setDigestAlgorithm(value: DigestAlgorithmType): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
      
      inline def setEncryptionAlgorithm(value: String): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "encryptionAlgorithm", js.undefined)
      
      inline def setEncryptionCert(value: String | Buffer): Self = StObject.set(x, "encryptionCert", value.asInstanceOf[js.Any])
      
      inline def setEncryptionCertUndefined: Self = StObject.set(x, "encryptionCert", js.undefined)
      
      inline def setEncryptionPublicKey(value: String | Buffer): Self = StObject.set(x, "encryptionPublicKey", value.asInstanceOf[js.Any])
      
      inline def setEncryptionPublicKeyUndefined: Self = StObject.set(x, "encryptionPublicKey", js.undefined)
      
      inline def setGetPostURL(
        value: (String, Any, Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], js.Function2[/* err */ Any, /* url */ String, Unit]) => Unit
      ): Self = StObject.set(x, "getPostURL", js.Any.fromFunction4(value))
      
      inline def setGetUserFromRequest(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => Any
      ): Self = StObject.set(x, "getUserFromRequest", js.Any.fromFunction1(value))
      
      inline def setGetUserFromRequestUndefined: Self = StObject.set(x, "getUserFromRequest", js.undefined)
      
      inline def setInResponseTo(value: String): Self = StObject.set(x, "inResponseTo", value.asInstanceOf[js.Any])
      
      inline def setInResponseToUndefined: Self = StObject.set(x, "inResponseTo", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyEncryptionAlgorighm(value: String): Self = StObject.set(x, "keyEncryptionAlgorighm", value.asInstanceOf[js.Any])
      
      inline def setKeyEncryptionAlgorighmUndefined: Self = StObject.set(x, "keyEncryptionAlgorighm", js.undefined)
      
      inline def setLifetimeInSeconds(value: Double): Self = StObject.set(x, "lifetimeInSeconds", value.asInstanceOf[js.Any])
      
      inline def setLifetimeInSecondsUndefined: Self = StObject.set(x, "lifetimeInSeconds", js.undefined)
      
      inline def setProfileMapper(value: /* pu */ Profile => ProfileMapper): Self = StObject.set(x, "profileMapper", js.Any.fromFunction1(value))
      
      inline def setProfileMapperUndefined: Self = StObject.set(x, "profileMapper", js.undefined)
      
      inline def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
      
      inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
      
      inline def setRelayState(value: String): Self = StObject.set(x, "RelayState", value.asInstanceOf[js.Any])
      
      inline def setRelayStateUndefined: Self = StObject.set(x, "RelayState", js.undefined)
      
      inline def setSignResponse(value: Boolean): Self = StObject.set(x, "signResponse", value.asInstanceOf[js.Any])
      
      inline def setSignResponseUndefined: Self = StObject.set(x, "signResponse", js.undefined)
      
      inline def setSignatureAlgorithm(value: SignatureAlgorithmType): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    }
  }
  
  trait MetadataItem extends StObject {
    
    var description: String
    
    var displayName: String
    
    var id: String
    
    var optional: Boolean
  }
  object MetadataItem {
    
    inline def apply(description: String, displayName: String, id: String, optional: Boolean): MetadataItem = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataItem]
    }
    
    extension [Self <: MetadataItem](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProfileMapper extends StObject {
    
    def getClaims(): Any
    
    def getNameIdentifier(): Any
    
    var metadata: js.Array[MetadataItem]
  }
  object ProfileMapper {
    
    inline def apply(getClaims: () => Any, getNameIdentifier: () => Any, metadata: js.Array[MetadataItem]): ProfileMapper = {
      val __obj = js.Dynamic.literal(getClaims = js.Any.fromFunction0(getClaims), getNameIdentifier = js.Any.fromFunction0(getNameIdentifier), metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProfileMapper]
    }
    
    extension [Self <: ProfileMapper](x: Self) {
      
      inline def setGetClaims(value: () => Any): Self = StObject.set(x, "getClaims", js.Any.fromFunction0(value))
      
      inline def setGetNameIdentifier(value: () => Any): Self = StObject.set(x, "getNameIdentifier", js.Any.fromFunction0(value))
      
      inline def setMetadata(value: js.Array[MetadataItem]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataVarargs(value: MetadataItem*): Self = StObject.set(x, "metadata", js.Array(value*))
    }
  }
  
  type ProfileMapperConstructor = js.Function1[/* pu */ Profile, ProfileMapper]
  
  trait SamlRequest extends StObject {
    
    var assertionConsumerServiceURL: js.UndefOr[String] = js.undefined
    
    var destination: js.UndefOr[String] = js.undefined
    
    var forceAuthn: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
  }
  object SamlRequest {
    
    inline def apply(): SamlRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SamlRequest]
    }
    
    extension [Self <: SamlRequest](x: Self) {
      
      inline def setAssertionConsumerServiceURL(value: String): Self = StObject.set(x, "assertionConsumerServiceURL", value.asInstanceOf[js.Any])
      
      inline def setAssertionConsumerServiceURLUndefined: Self = StObject.set(x, "assertionConsumerServiceURL", js.undefined)
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setForceAuthn(value: String): Self = StObject.set(x, "forceAuthn", value.asInstanceOf[js.Any])
      
      inline def setForceAuthnUndefined: Self = StObject.set(x, "forceAuthn", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.samlp.samlpStrings.`rsa-sha1`
    - typings.samlp.samlpStrings.`rsa-sha256`
  */
  trait SignatureAlgorithmType extends StObject
  object SignatureAlgorithmType {
    
    inline def `rsa-sha1`: typings.samlp.samlpStrings.`rsa-sha1` = "rsa-sha1".asInstanceOf[typings.samlp.samlpStrings.`rsa-sha1`]
    
    inline def `rsa-sha256`: typings.samlp.samlpStrings.`rsa-sha256` = "rsa-sha256".asInstanceOf[typings.samlp.samlpStrings.`rsa-sha256`]
  }
}
