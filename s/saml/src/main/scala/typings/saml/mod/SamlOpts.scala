package typings.saml.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamlOpts extends js.Object {
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
  @scala.inline
  def apply(
    cert: Buffer,
    key: Buffer,
    attributes: SamlAttributes = null,
    audiences: String | js.Array[String] = null,
    authnContextClassRef: String = null,
    digestAlgorithm: String = null,
    encryptionAlgorithm: String = null,
    encryptionCert: Buffer = null,
    encryptionPublicKey: Buffer = null,
    holderOfKeyProofSecret: String = null,
    inResponseTo: String = null,
    includeAttributeNameFormat: js.UndefOr[Boolean] = js.undefined,
    issuer: String = null,
    keyEncryptionAlgorighm: String = null,
    keyInfoProvider: KeyInfoProvider = null,
    lifetimeInSeconds: js.UndefOr[Double] = js.undefined,
    nameIdentifier: String = null,
    nameIdentifierFormat: String = null,
    prefix: String = null,
    recipient: String = null,
    sessionIndex: String = null,
    signatureAlgorithm: String = null,
    signatureNamespacePrefix: String = null,
    subjectConfirmationMethod: String = null,
    typedAttributes: js.UndefOr[Boolean] = js.undefined,
    uid: String = null,
    xpathToNodeBeforeSignature: String = null
  ): SamlOpts = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (audiences != null) __obj.updateDynamic("audiences")(audiences.asInstanceOf[js.Any])
    if (authnContextClassRef != null) __obj.updateDynamic("authnContextClassRef")(authnContextClassRef.asInstanceOf[js.Any])
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm.asInstanceOf[js.Any])
    if (encryptionAlgorithm != null) __obj.updateDynamic("encryptionAlgorithm")(encryptionAlgorithm.asInstanceOf[js.Any])
    if (encryptionCert != null) __obj.updateDynamic("encryptionCert")(encryptionCert.asInstanceOf[js.Any])
    if (encryptionPublicKey != null) __obj.updateDynamic("encryptionPublicKey")(encryptionPublicKey.asInstanceOf[js.Any])
    if (holderOfKeyProofSecret != null) __obj.updateDynamic("holderOfKeyProofSecret")(holderOfKeyProofSecret.asInstanceOf[js.Any])
    if (inResponseTo != null) __obj.updateDynamic("inResponseTo")(inResponseTo.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAttributeNameFormat)) __obj.updateDynamic("includeAttributeNameFormat")(includeAttributeNameFormat.get.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (keyEncryptionAlgorighm != null) __obj.updateDynamic("keyEncryptionAlgorighm")(keyEncryptionAlgorighm.asInstanceOf[js.Any])
    if (keyInfoProvider != null) __obj.updateDynamic("keyInfoProvider")(keyInfoProvider.asInstanceOf[js.Any])
    if (!js.isUndefined(lifetimeInSeconds)) __obj.updateDynamic("lifetimeInSeconds")(lifetimeInSeconds.get.asInstanceOf[js.Any])
    if (nameIdentifier != null) __obj.updateDynamic("nameIdentifier")(nameIdentifier.asInstanceOf[js.Any])
    if (nameIdentifierFormat != null) __obj.updateDynamic("nameIdentifierFormat")(nameIdentifierFormat.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (sessionIndex != null) __obj.updateDynamic("sessionIndex")(sessionIndex.asInstanceOf[js.Any])
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm.asInstanceOf[js.Any])
    if (signatureNamespacePrefix != null) __obj.updateDynamic("signatureNamespacePrefix")(signatureNamespacePrefix.asInstanceOf[js.Any])
    if (subjectConfirmationMethod != null) __obj.updateDynamic("subjectConfirmationMethod")(subjectConfirmationMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(typedAttributes)) __obj.updateDynamic("typedAttributes")(typedAttributes.get.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (xpathToNodeBeforeSignature != null) __obj.updateDynamic("xpathToNodeBeforeSignature")(xpathToNodeBeforeSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamlOpts]
  }
}

