package typings.saml.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamlOpts extends js.Object {
  
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
  implicit class SamlOptsOps[Self <: SamlOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCert(value: Buffer): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: SamlAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setAudiencesVarargs(value: String*): Self = this.set("audiences", js.Array(value :_*))
    
    @scala.inline
    def setAudiences(value: String | js.Array[String]): Self = this.set("audiences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudiences: Self = this.set("audiences", js.undefined)
    
    @scala.inline
    def setAuthnContextClassRef(value: String): Self = this.set("authnContextClassRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthnContextClassRef: Self = this.set("authnContextClassRef", js.undefined)
    
    @scala.inline
    def setDigestAlgorithm(value: String): Self = this.set("digestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigestAlgorithm: Self = this.set("digestAlgorithm", js.undefined)
    
    @scala.inline
    def setEncryptionAlgorithm(value: String): Self = this.set("encryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionAlgorithm: Self = this.set("encryptionAlgorithm", js.undefined)
    
    @scala.inline
    def setEncryptionCert(value: Buffer): Self = this.set("encryptionCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionCert: Self = this.set("encryptionCert", js.undefined)
    
    @scala.inline
    def setEncryptionPublicKey(value: Buffer): Self = this.set("encryptionPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionPublicKey: Self = this.set("encryptionPublicKey", js.undefined)
    
    @scala.inline
    def setHolderOfKeyProofSecret(value: String): Self = this.set("holderOfKeyProofSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHolderOfKeyProofSecret: Self = this.set("holderOfKeyProofSecret", js.undefined)
    
    @scala.inline
    def setInResponseTo(value: String): Self = this.set("inResponseTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInResponseTo: Self = this.set("inResponseTo", js.undefined)
    
    @scala.inline
    def setIncludeAttributeNameFormat(value: Boolean): Self = this.set("includeAttributeNameFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAttributeNameFormat: Self = this.set("includeAttributeNameFormat", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setKeyEncryptionAlgorighm(value: String): Self = this.set("keyEncryptionAlgorighm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyEncryptionAlgorighm: Self = this.set("keyEncryptionAlgorighm", js.undefined)
    
    @scala.inline
    def setKeyInfoProvider(value: KeyInfoProvider): Self = this.set("keyInfoProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyInfoProvider: Self = this.set("keyInfoProvider", js.undefined)
    
    @scala.inline
    def setLifetimeInSeconds(value: Double): Self = this.set("lifetimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifetimeInSeconds: Self = this.set("lifetimeInSeconds", js.undefined)
    
    @scala.inline
    def setNameIdentifier(value: String): Self = this.set("nameIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameIdentifier: Self = this.set("nameIdentifier", js.undefined)
    
    @scala.inline
    def setNameIdentifierFormat(value: String): Self = this.set("nameIdentifierFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameIdentifierFormat: Self = this.set("nameIdentifierFormat", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRecipient(value: String): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
    
    @scala.inline
    def setSessionIndex(value: String): Self = this.set("sessionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionIndex: Self = this.set("sessionIndex", js.undefined)
    
    @scala.inline
    def setSignatureAlgorithm(value: String): Self = this.set("signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureAlgorithm: Self = this.set("signatureAlgorithm", js.undefined)
    
    @scala.inline
    def setSignatureNamespacePrefix(value: String): Self = this.set("signatureNamespacePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureNamespacePrefix: Self = this.set("signatureNamespacePrefix", js.undefined)
    
    @scala.inline
    def setSubjectConfirmationMethod(value: String): Self = this.set("subjectConfirmationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectConfirmationMethod: Self = this.set("subjectConfirmationMethod", js.undefined)
    
    @scala.inline
    def setTypedAttributes(value: Boolean): Self = this.set("typedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypedAttributes: Self = this.set("typedAttributes", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    
    @scala.inline
    def setXpathToNodeBeforeSignature(value: String): Self = this.set("xpathToNodeBeforeSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXpathToNodeBeforeSignature: Self = this.set("xpathToNodeBeforeSignature", js.undefined)
  }
}
