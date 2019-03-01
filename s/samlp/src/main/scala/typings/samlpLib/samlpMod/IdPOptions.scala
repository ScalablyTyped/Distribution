package typings
package samlpLib.samlpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdPOptions extends js.Object {
  var RelayState: js.UndefOr[java.lang.String] = js.undefined
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var authnContextClassRef: js.UndefOr[java.lang.String] = js.undefined
  var cert: java.lang.String | nodeLib.Buffer
  var destination: js.UndefOr[java.lang.String] = js.undefined
  var digestAlgorithm: js.UndefOr[DigestAlgorithmType] = js.undefined
  var encryptionAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  var encryptionCert: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var encryptionPublicKey: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var getUserFromRequest: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.eNs.Request, _]] = js.undefined
  var inResponseTo: js.UndefOr[java.lang.String] = js.undefined
  var issuer: java.lang.String
  var key: java.lang.String | nodeLib.Buffer
  var keyEncryptionAlgorighm: js.UndefOr[java.lang.String] = js.undefined
  var lifetimeInSeconds: js.UndefOr[scala.Double] = js.undefined
  var profileMapper: js.UndefOr[ProfileMapperConstructor] = js.undefined
  var recipient: js.UndefOr[java.lang.String] = js.undefined
  var signResponse: js.UndefOr[scala.Boolean] = js.undefined
  var signatureAlgorithm: js.UndefOr[SignatureAlgorithmType] = js.undefined
  def getPostURL(
    audience: java.lang.String,
    authnRequestDom: js.Any,
    req: expressLib.expressMod.eNs.Request,
    callback: js.Function2[/* err */ js.Any, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit
}

object IdPOptions {
  @scala.inline
  def apply(
    cert: java.lang.String | nodeLib.Buffer,
    getPostURL: js.Function4[
      java.lang.String, 
      js.Any, 
      expressLib.expressMod.eNs.Request, 
      js.Function2[/* err */ js.Any, /* url */ java.lang.String, scala.Unit], 
      scala.Unit
    ],
    issuer: java.lang.String,
    key: java.lang.String | nodeLib.Buffer,
    RelayState: java.lang.String = null,
    audience: java.lang.String = null,
    authnContextClassRef: java.lang.String = null,
    destination: java.lang.String = null,
    digestAlgorithm: DigestAlgorithmType = null,
    encryptionAlgorithm: java.lang.String = null,
    encryptionCert: java.lang.String | nodeLib.Buffer = null,
    encryptionPublicKey: java.lang.String | nodeLib.Buffer = null,
    getUserFromRequest: js.Function1[/* req */ expressLib.expressMod.eNs.Request, _] = null,
    inResponseTo: java.lang.String = null,
    keyEncryptionAlgorighm: java.lang.String = null,
    lifetimeInSeconds: scala.Int | scala.Double = null,
    profileMapper: ProfileMapperConstructor = null,
    recipient: java.lang.String = null,
    signResponse: js.UndefOr[scala.Boolean] = js.undefined,
    signatureAlgorithm: SignatureAlgorithmType = null
  ): IdPOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    __obj.updateDynamic("getPostURL")(getPostURL)
    __obj.updateDynamic("issuer")(issuer)
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (RelayState != null) __obj.updateDynamic("RelayState")(RelayState)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (authnContextClassRef != null) __obj.updateDynamic("authnContextClassRef")(authnContextClassRef)
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (digestAlgorithm != null) __obj.updateDynamic("digestAlgorithm")(digestAlgorithm)
    if (encryptionAlgorithm != null) __obj.updateDynamic("encryptionAlgorithm")(encryptionAlgorithm)
    if (encryptionCert != null) __obj.updateDynamic("encryptionCert")(encryptionCert.asInstanceOf[js.Any])
    if (encryptionPublicKey != null) __obj.updateDynamic("encryptionPublicKey")(encryptionPublicKey.asInstanceOf[js.Any])
    if (getUserFromRequest != null) __obj.updateDynamic("getUserFromRequest")(getUserFromRequest)
    if (inResponseTo != null) __obj.updateDynamic("inResponseTo")(inResponseTo)
    if (keyEncryptionAlgorighm != null) __obj.updateDynamic("keyEncryptionAlgorighm")(keyEncryptionAlgorighm)
    if (lifetimeInSeconds != null) __obj.updateDynamic("lifetimeInSeconds")(lifetimeInSeconds.asInstanceOf[js.Any])
    if (profileMapper != null) __obj.updateDynamic("profileMapper")(profileMapper)
    if (recipient != null) __obj.updateDynamic("recipient")(recipient)
    if (!js.isUndefined(signResponse)) __obj.updateDynamic("signResponse")(signResponse)
    if (signatureAlgorithm != null) __obj.updateDynamic("signatureAlgorithm")(signatureAlgorithm)
    __obj.asInstanceOf[IdPOptions]
  }
}

