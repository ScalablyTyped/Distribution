package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIdentityProviderOptions extends js.Object {
  var peerIdentity: js.UndefOr[java.lang.String] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var usernameHint: js.UndefOr[java.lang.String] = js.undefined
}

object RTCIdentityProviderOptions {
  @scala.inline
  def apply(
    peerIdentity: java.lang.String = null,
    protocol: java.lang.String = null,
    usernameHint: java.lang.String = null
  ): RTCIdentityProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (peerIdentity != null) __obj.updateDynamic("peerIdentity")(peerIdentity.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (usernameHint != null) __obj.updateDynamic("usernameHint")(usernameHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIdentityProviderOptions]
  }
}

