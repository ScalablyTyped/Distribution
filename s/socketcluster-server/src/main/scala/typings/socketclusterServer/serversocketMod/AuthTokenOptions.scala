package typings.socketclusterServer.serversocketMod

import typings.jsonwebtoken.mod.Algorithm
import typings.jsonwebtoken.mod.SignOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthTokenOptions extends SignOptions {
  var rejectOnFailedDelivery: js.UndefOr[Boolean] = js.undefined
}

object AuthTokenOptions {
  @scala.inline
  def apply(
    algorithm: Algorithm = null,
    audience: String | js.Array[String] = null,
    encoding: String = null,
    expiresIn: String | Double = null,
    header: js.Object = null,
    issuer: String = null,
    jwtid: String = null,
    keyid: String = null,
    mutatePayload: js.UndefOr[Boolean] = js.undefined,
    noTimestamp: js.UndefOr[Boolean] = js.undefined,
    notBefore: String | Double = null,
    rejectOnFailedDelivery: js.UndefOr[Boolean] = js.undefined,
    subject: String = null
  ): AuthTokenOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (jwtid != null) __obj.updateDynamic("jwtid")(jwtid.asInstanceOf[js.Any])
    if (keyid != null) __obj.updateDynamic("keyid")(keyid.asInstanceOf[js.Any])
    if (!js.isUndefined(mutatePayload)) __obj.updateDynamic("mutatePayload")(mutatePayload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noTimestamp)) __obj.updateDynamic("noTimestamp")(noTimestamp.get.asInstanceOf[js.Any])
    if (notBefore != null) __obj.updateDynamic("notBefore")(notBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectOnFailedDelivery)) __obj.updateDynamic("rejectOnFailedDelivery")(rejectOnFailedDelivery.get.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthTokenOptions]
  }
}

