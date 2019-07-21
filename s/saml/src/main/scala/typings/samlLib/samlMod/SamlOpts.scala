package typings
package samlLib.samlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamlOpts extends js.Object {
  var attributes: js.UndefOr[SamlAttributes] = js.undefined
  var audiences: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var authnContextClassRef: js.UndefOr[java.lang.String] = js.undefined
  var cert: nodeLib.Buffer
  var digestAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  var encryptionAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  var encryptionCert: js.UndefOr[nodeLib.Buffer] = js.undefined
  var encryptionPublicKey: js.UndefOr[nodeLib.Buffer] = js.undefined
  var holderOfKeyProofSecret: js.UndefOr[java.lang.String] = js.undefined
  var inResponseTo: js.UndefOr[java.lang.String] = js.undefined
  var includeAttributeNameFormat: js.UndefOr[scala.Boolean] = js.undefined
  var issuer: js.UndefOr[java.lang.String] = js.undefined
  var key: nodeLib.Buffer
  var keyEncryptionAlgorighm: js.UndefOr[java.lang.String] = js.undefined
   // sic https://github.com/auth0/node-xml-encryption/issues/17
  var keyInfoProvider: js.UndefOr[KeyInfoProvider] = js.undefined
  var lifetimeInSeconds: js.UndefOr[scala.Double] = js.undefined
  var nameIdentifier: js.UndefOr[java.lang.String] = js.undefined
  var nameIdentifierFormat: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var recipient: js.UndefOr[java.lang.String] = js.undefined
  var sessionIndex: js.UndefOr[java.lang.String] = js.undefined
  var signatureAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  var signatureNamespacePrefix: js.UndefOr[java.lang.String] = js.undefined
  var subjectConfirmationMethod: js.UndefOr[java.lang.String] = js.undefined
  var typedAttributes: js.UndefOr[scala.Boolean] = js.undefined
  var uid: js.UndefOr[java.lang.String] = js.undefined
  var xpathToNodeBeforeSignature: js.UndefOr[java.lang.String] = js.undefined
}

object SamlOpts {
  @scala.inline
  def apply(
    cert: nodeLib.Buffer,
    key: nodeLib.Buffer,
    attributes: SamlAttributes = null,
    audiences: java.lang.String | js.Array[java.lang.String] = null,
    authnContextClassRef: java.lang.String = null,
    digestAlgorithm: java.lang.String = null,
    encryptionAlgorithm: java.lang.String = null,
    encryptionCert: nodeLib.Buffer = null,
    encryptionPublicKey: nodeLib.Buffer = null,
    holderOfKeyProofSecret: java.lang.String = null,
    inResponseTo: java.lang.String = null,
    includeAttributeNameFormat: js.UndefOr[scala.Boolean] = js.undefined,
    issuer: java.lang.String = null,
    keyEncryptionAlgorighm: java.lang.String = null,
    keyInfoProvider: KeyInfoProvider = null,
    lifetimeInSeconds: scala.Int | scala.Double = null,
    nameIdentifier: java.lang.String = null,
    nameIdentifierFormat: java.lang.String = null,
    prefix: java.lang.String = null,
    recipient: java.lang.String = null,
    sessionIndex: java.lang.String = null,
    signatureAlgorithm: java.lang.String = null,
    signatureNamespacePrefix: java.lang.String = null,
    subjectConfirmationMethod: java.lang.String = null,
    typedAttributes: js.UndefOr[scala.Boolean] = js.undefined,
    uid: java.lang.String = null,
    xpathToNodeBeforeSignature: java.lang.String = null
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

