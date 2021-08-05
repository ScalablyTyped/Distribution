package typings.saml

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Saml11 {
    
    @JSImport("saml", "Saml11")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(opts: SamlOpts): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def create(
      opts: SamlOpts,
      cb: js.Function3[/* err */ Error | Null, /* result */ js.Array[js.Any], /* proofSecret */ Buffer, Unit]
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  object Saml20 {
    
    @JSImport("saml", "Saml20")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(opts: SamlOpts): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    inline def create(opts: SamlOpts, cb: js.Function2[/* err */ Error | Null, /* signed */ String, Unit]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  trait KeyInfoProvider extends StObject {
    
    def getKeyInfo(key: String, prefix: String): String
  }
  object KeyInfoProvider {
    
    inline def apply(getKeyInfo: (String, String) => String): KeyInfoProvider = {
      val __obj = js.Dynamic.literal(getKeyInfo = js.Any.fromFunction2(getKeyInfo))
      __obj.asInstanceOf[KeyInfoProvider]
    }
    
    extension [Self <: KeyInfoProvider](x: Self) {
      
      inline def setGetKeyInfo(value: (String, String) => String): Self = StObject.set(x, "getKeyInfo", js.Any.fromFunction2(value))
    }
  }
  
  type SamlAttributes = StringDictionary[String]
  
  trait SamlOpts extends StObject {
    
    var attributes: js.UndefOr[SamlAttributes] = js.undefined
    
    var audiences: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var authnContextClassRef: js.UndefOr[String] = js.undefined
    
    var cert: Buffer
    
    var digestAlgorithm: js.UndefOr[String] = js.undefined
    
    var encryptionAlgorithm: js.UndefOr[String] = js.undefined
    
    var encryptionCert: js.UndefOr[Buffer] = js.undefined
    
    var encryptionPublicKey: js.UndefOr[Buffer] = js.undefined
    
    var holderOfKeyProofSecret: js.UndefOr[String] = js.undefined
    
    var inResponseTo: js.UndefOr[String] = js.undefined
    
    var includeAttributeNameFormat: js.UndefOr[Boolean] = js.undefined
    
    var issuer: js.UndefOr[String] = js.undefined
    
    var key: Buffer
    
    var keyEncryptionAlgorighm: js.UndefOr[String] = js.undefined
    
    // sic https://github.com/auth0/node-xml-encryption/issues/17
    var keyInfoProvider: js.UndefOr[KeyInfoProvider] = js.undefined
    
    var lifetimeInSeconds: js.UndefOr[Double] = js.undefined
    
    var nameIdentifier: js.UndefOr[String] = js.undefined
    
    var nameIdentifierFormat: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var recipient: js.UndefOr[String] = js.undefined
    
    var sessionIndex: js.UndefOr[String] = js.undefined
    
    var signatureAlgorithm: js.UndefOr[String] = js.undefined
    
    var signatureNamespacePrefix: js.UndefOr[String] = js.undefined
    
    var subjectConfirmationMethod: js.UndefOr[String] = js.undefined
    
    var typedAttributes: js.UndefOr[Boolean] = js.undefined
    
    var uid: js.UndefOr[String] = js.undefined
    
    var xpathToNodeBeforeSignature: js.UndefOr[String] = js.undefined
  }
  object SamlOpts {
    
    inline def apply(cert: Buffer, key: Buffer): SamlOpts = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamlOpts]
    }
    
    extension [Self <: SamlOpts](x: Self) {
      
      inline def setAttributes(value: SamlAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAudiences(value: String | js.Array[String]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
      
      inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
      
      inline def setAudiencesVarargs(value: String*): Self = StObject.set(x, "audiences", js.Array(value :_*))
      
      inline def setAuthnContextClassRef(value: String): Self = StObject.set(x, "authnContextClassRef", value.asInstanceOf[js.Any])
      
      inline def setAuthnContextClassRefUndefined: Self = StObject.set(x, "authnContextClassRef", js.undefined)
      
      inline def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setDigestAlgorithm(value: String): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
      
      inline def setEncryptionAlgorithm(value: String): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "encryptionAlgorithm", js.undefined)
      
      inline def setEncryptionCert(value: Buffer): Self = StObject.set(x, "encryptionCert", value.asInstanceOf[js.Any])
      
      inline def setEncryptionCertUndefined: Self = StObject.set(x, "encryptionCert", js.undefined)
      
      inline def setEncryptionPublicKey(value: Buffer): Self = StObject.set(x, "encryptionPublicKey", value.asInstanceOf[js.Any])
      
      inline def setEncryptionPublicKeyUndefined: Self = StObject.set(x, "encryptionPublicKey", js.undefined)
      
      inline def setHolderOfKeyProofSecret(value: String): Self = StObject.set(x, "holderOfKeyProofSecret", value.asInstanceOf[js.Any])
      
      inline def setHolderOfKeyProofSecretUndefined: Self = StObject.set(x, "holderOfKeyProofSecret", js.undefined)
      
      inline def setInResponseTo(value: String): Self = StObject.set(x, "inResponseTo", value.asInstanceOf[js.Any])
      
      inline def setInResponseToUndefined: Self = StObject.set(x, "inResponseTo", js.undefined)
      
      inline def setIncludeAttributeNameFormat(value: Boolean): Self = StObject.set(x, "includeAttributeNameFormat", value.asInstanceOf[js.Any])
      
      inline def setIncludeAttributeNameFormatUndefined: Self = StObject.set(x, "includeAttributeNameFormat", js.undefined)
      
      inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      inline def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyEncryptionAlgorighm(value: String): Self = StObject.set(x, "keyEncryptionAlgorighm", value.asInstanceOf[js.Any])
      
      inline def setKeyEncryptionAlgorighmUndefined: Self = StObject.set(x, "keyEncryptionAlgorighm", js.undefined)
      
      inline def setKeyInfoProvider(value: KeyInfoProvider): Self = StObject.set(x, "keyInfoProvider", value.asInstanceOf[js.Any])
      
      inline def setKeyInfoProviderUndefined: Self = StObject.set(x, "keyInfoProvider", js.undefined)
      
      inline def setLifetimeInSeconds(value: Double): Self = StObject.set(x, "lifetimeInSeconds", value.asInstanceOf[js.Any])
      
      inline def setLifetimeInSecondsUndefined: Self = StObject.set(x, "lifetimeInSeconds", js.undefined)
      
      inline def setNameIdentifier(value: String): Self = StObject.set(x, "nameIdentifier", value.asInstanceOf[js.Any])
      
      inline def setNameIdentifierFormat(value: String): Self = StObject.set(x, "nameIdentifierFormat", value.asInstanceOf[js.Any])
      
      inline def setNameIdentifierFormatUndefined: Self = StObject.set(x, "nameIdentifierFormat", js.undefined)
      
      inline def setNameIdentifierUndefined: Self = StObject.set(x, "nameIdentifier", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
      
      inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
      
      inline def setSessionIndex(value: String): Self = StObject.set(x, "sessionIndex", value.asInstanceOf[js.Any])
      
      inline def setSessionIndexUndefined: Self = StObject.set(x, "sessionIndex", js.undefined)
      
      inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
      
      inline def setSignatureNamespacePrefix(value: String): Self = StObject.set(x, "signatureNamespacePrefix", value.asInstanceOf[js.Any])
      
      inline def setSignatureNamespacePrefixUndefined: Self = StObject.set(x, "signatureNamespacePrefix", js.undefined)
      
      inline def setSubjectConfirmationMethod(value: String): Self = StObject.set(x, "subjectConfirmationMethod", value.asInstanceOf[js.Any])
      
      inline def setSubjectConfirmationMethodUndefined: Self = StObject.set(x, "subjectConfirmationMethod", js.undefined)
      
      inline def setTypedAttributes(value: Boolean): Self = StObject.set(x, "typedAttributes", value.asInstanceOf[js.Any])
      
      inline def setTypedAttributesUndefined: Self = StObject.set(x, "typedAttributes", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setXpathToNodeBeforeSignature(value: String): Self = StObject.set(x, "xpathToNodeBeforeSignature", value.asInstanceOf[js.Any])
      
      inline def setXpathToNodeBeforeSignatureUndefined: Self = StObject.set(x, "xpathToNodeBeforeSignature", js.undefined)
    }
  }
}
