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

