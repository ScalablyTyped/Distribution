package typings.saml.samlMod

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
    lifetimeInSeconds: Int | Double = null,
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
    val __obj = js.Dynamic.literal(cert = cert, key = key)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (audiences != null) __obj.updateDynamic("audiences")(audiences.asInstanceOf[js.Any])
    if (authnContextClassRef != null) __obj.updateDynamic("authnContextClassRef")(authnContextClassRef)
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm)
    if (encryptionAlgorithm != null) __obj.updateDynamic("encryptionAlgorithm")(encryptionAlgorithm)
    if (encryptionCert != null) __obj.updateDynamic("encryptionCert")(encryptionCert)
    if (encryptionPublicKey != null) __obj.updateDynamic("encryptionPublicKey")(encryptionPublicKey)
    if (holderOfKeyProofSecret != null) __obj.updateDynamic("holderOfKeyProofSecret")(holderOfKeyProofSecret)
    if (inResponseTo != null) __obj.updateDynamic("inResponseTo")(inResponseTo)
    if (!js.isUndefined(includeAttributeNameFormat)) __obj.updateDynamic("includeAttributeNameFormat")(includeAttributeNameFormat)
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    if (keyEncryptionAlgorighm != null) __obj.updateDynamic("keyEncryptionAlgorighm")(keyEncryptionAlgorighm)
    if (keyInfoProvider != null) __obj.updateDynamic("keyInfoProvider")(keyInfoProvider)
    if (lifetimeInSeconds != null) __obj.updateDynamic("lifetimeInSeconds")(lifetimeInSeconds.asInstanceOf[js.Any])
    if (nameIdentifier != null) __obj.updateDynamic("nameIdentifier")(nameIdentifier)
    if (nameIdentifierFormat != null) __obj.updateDynamic("nameIdentifierFormat")(nameIdentifierFormat)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (recipient != null) __obj.updateDynamic("recipient")(recipient)
    if (sessionIndex != null) __obj.updateDynamic("sessionIndex")(sessionIndex)
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm)
    if (signatureNamespacePrefix != null) __obj.updateDynamic("signatureNamespacePrefix")(signatureNamespacePrefix)
    if (subjectConfirmationMethod != null) __obj.updateDynamic("subjectConfirmationMethod")(subjectConfirmationMethod)
    if (!js.isUndefined(typedAttributes)) __obj.updateDynamic("typedAttributes")(typedAttributes)
    if (uid != null) __obj.updateDynamic("uid")(uid)
    if (xpathToNodeBeforeSignature != null) __obj.updateDynamic("xpathToNodeBeforeSignature")(xpathToNodeBeforeSignature)
    __obj.asInstanceOf[SamlOpts]
  }
}

