package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCIceServer extends js.Object {
  var credential: js.UndefOr[java.lang.String | RTCOAuthCredential] = js.undefined
  var credentialType: js.UndefOr[RTCIceCredentialType] = js.undefined
  var urls: java.lang.String | js.Array[java.lang.String]
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object RTCIceServer {
  @scala.inline
  def apply(
    urls: java.lang.String | js.Array[java.lang.String],
    credential: java.lang.String | RTCOAuthCredential = null,
    credentialType: RTCIceCredentialType = null,
    username: java.lang.String = null
  ): RTCIceServer = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    if (credential != null) __obj.updateDynamic("credential")(credential.asInstanceOf[js.Any])
    if (credentialType != null) __obj.updateDynamic("credentialType")(credentialType.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceServer]
  }
}

