package typings.saml

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Saml11 {
    
    @JSImport("saml", "Saml11.create")
    @js.native
    def create(opts: SamlOpts): js.Any = js.native
    @JSImport("saml", "Saml11.create")
    @js.native
    def create(
      opts: SamlOpts,
      cb: js.Function3[/* err */ Error | Null, /* result */ js.Array[_], /* proofSecret */ Buffer, Unit]
    ): js.Any = js.native
  }
  
  object Saml20 {
    
    @JSImport("saml", "Saml20.create")
    @js.native
    def create(opts: SamlOpts): js.Any = js.native
    @JSImport("saml", "Saml20.create")
    @js.native
    def create(opts: SamlOpts, cb: js.Function2[/* err */ Error | Null, /* signed */ String, Unit]): js.Any = js.native
  }
  
  @js.native
  trait KeyInfoProvider extends StObject {
    
    def getKeyInfo(key: String, prefix: String): String = js.native
  }
  object KeyInfoProvider {
    
    @scala.inline
    def apply(getKeyInfo: (String, String) => String): KeyInfoProvider = {
      val __obj = js.Dynamic.literal(getKeyInfo = js.Any.fromFunction2(getKeyInfo))
      __obj.asInstanceOf[KeyInfoProvider]
    }
    
    @scala.inline
    implicit class KeyInfoProviderMutableBuilder[Self <: KeyInfoProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetKeyInfo(value: (String, String) => String): Self = StObject.set(x, "getKeyInfo", js.Any.fromFunction2(value))
    }
  }
  
  type SamlAttributes = StringDictionary[String]
  
  @js.native
  trait SamlOpts extends StObject {
    
    var attributes: js.UndefOr[SamlAttributes] = js.native
    
    var audiences: js.UndefOr[String | js.Array[String]] = js.native
    
    var authnContextClassRef: js.UndefOr[String] = js.native
    
    var cert: Buffer = js.native
    
    var digestAlgorithm: js.UndefOr[String] = js.native
    
    var encryptionAlgorithm: js.UndefOr[String] = js.native
    
    var encryptionCert: js.UndefOr[Buffer] = js.native
    
    var encryptionPublicKey: js.UndefOr[Buffer] = js.native
    
    var holderOfKeyProofSecret: js.UndefOr[String] = js.native
    
    var inResponseTo: js.UndefOr[String] = js.native
    
    var includeAttributeNameFormat: js.UndefOr[Boolean] = js.native
    
    var issuer: js.UndefOr[String] = js.native
    
    var key: Buffer = js.native
    
    var keyEncryptionAlgorighm: js.UndefOr[String] = js.native
    
    // sic https://github.com/auth0/node-xml-encryption/issues/17
    var keyInfoProvider: js.UndefOr[KeyInfoProvider] = js.native
    
    var lifetimeInSeconds: js.UndefOr[Double] = js.native
    
    var nameIdentifier: js.UndefOr[String] = js.native
    
    var nameIdentifierFormat: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var recipient: js.UndefOr[String] = js.native
    
    var sessionIndex: js.UndefOr[String] = js.native
    
    var signatureAlgorithm: js.UndefOr[String] = js.native
    
    var signatureNamespacePrefix: js.UndefOr[String] = js.native
    
    var subjectConfirmationMethod: js.UndefOr[String] = js.native
    
    var typedAttributes: js.UndefOr[Boolean] = js.native
    
    var uid: js.UndefOr[String] = js.native
    
    var xpathToNodeBeforeSignature: js.UndefOr[String] = js.native
  }
  object SamlOpts {
    
    @scala.inline
    def apply(cert: Buffer, key: Buffer): SamlOpts = {
      val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamlOpts]
    }
    
    @scala.inline
    implicit class SamlOptsMutableBuilder[Self <: SamlOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: SamlAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setAudiences(value: String | js.Array[String]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
      
      @scala.inline
      def setAudiencesVarargs(value: String*): Self = StObject.set(x, "audiences", js.Array(value :_*))
      
      @scala.inline
      def setAuthnContextClassRef(value: String): Self = StObject.set(x, "authnContextClassRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthnContextClassRefUndefined: Self = StObject.set(x, "authnContextClassRef", js.undefined)
      
      @scala.inline
      def setCert(value: Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigestAlgorithm(value: String): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
      
      @scala.inline
      def setEncryptionAlgorithm(value: String): Self = StObject.set(x, "encryptionAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionAlgorithmUndefined: Self = StObject.set(x, "encryptionAlgorithm", js.undefined)
      
      @scala.inline
      def setEncryptionCert(value: Buffer): Self = StObject.set(x, "encryptionCert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionCertUndefined: Self = StObject.set(x, "encryptionCert", js.undefined)
      
      @scala.inline
      def setEncryptionPublicKey(value: Buffer): Self = StObject.set(x, "encryptionPublicKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionPublicKeyUndefined: Self = StObject.set(x, "encryptionPublicKey", js.undefined)
      
      @scala.inline
      def setHolderOfKeyProofSecret(value: String): Self = StObject.set(x, "holderOfKeyProofSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHolderOfKeyProofSecretUndefined: Self = StObject.set(x, "holderOfKeyProofSecret", js.undefined)
      
      @scala.inline
      def setInResponseTo(value: String): Self = StObject.set(x, "inResponseTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInResponseToUndefined: Self = StObject.set(x, "inResponseTo", js.undefined)
      
      @scala.inline
      def setIncludeAttributeNameFormat(value: Boolean): Self = StObject.set(x, "includeAttributeNameFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeAttributeNameFormatUndefined: Self = StObject.set(x, "includeAttributeNameFormat", js.undefined)
      
      @scala.inline
      def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
      
      @scala.inline
      def setKey(value: Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyEncryptionAlgorighm(value: String): Self = StObject.set(x, "keyEncryptionAlgorighm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyEncryptionAlgorighmUndefined: Self = StObject.set(x, "keyEncryptionAlgorighm", js.undefined)
      
      @scala.inline
      def setKeyInfoProvider(value: KeyInfoProvider): Self = StObject.set(x, "keyInfoProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyInfoProviderUndefined: Self = StObject.set(x, "keyInfoProvider", js.undefined)
      
      @scala.inline
      def setLifetimeInSeconds(value: Double): Self = StObject.set(x, "lifetimeInSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifetimeInSecondsUndefined: Self = StObject.set(x, "lifetimeInSeconds", js.undefined)
      
      @scala.inline
      def setNameIdentifier(value: String): Self = StObject.set(x, "nameIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameIdentifierFormat(value: String): Self = StObject.set(x, "nameIdentifierFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameIdentifierFormatUndefined: Self = StObject.set(x, "nameIdentifierFormat", js.undefined)
      
      @scala.inline
      def setNameIdentifierUndefined: Self = StObject.set(x, "nameIdentifier", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRecipient(value: String): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
      
      @scala.inline
      def setSessionIndex(value: String): Self = StObject.set(x, "sessionIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIndexUndefined: Self = StObject.set(x, "sessionIndex", js.undefined)
      
      @scala.inline
      def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
      
      @scala.inline
      def setSignatureNamespacePrefix(value: String): Self = StObject.set(x, "signatureNamespacePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureNamespacePrefixUndefined: Self = StObject.set(x, "signatureNamespacePrefix", js.undefined)
      
      @scala.inline
      def setSubjectConfirmationMethod(value: String): Self = StObject.set(x, "subjectConfirmationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectConfirmationMethodUndefined: Self = StObject.set(x, "subjectConfirmationMethod", js.undefined)
      
      @scala.inline
      def setTypedAttributes(value: Boolean): Self = StObject.set(x, "typedAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypedAttributesUndefined: Self = StObject.set(x, "typedAttributes", js.undefined)
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      @scala.inline
      def setXpathToNodeBeforeSignature(value: String): Self = StObject.set(x, "xpathToNodeBeforeSignature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXpathToNodeBeforeSignatureUndefined: Self = StObject.set(x, "xpathToNodeBeforeSignature", js.undefined)
    }
  }
}
