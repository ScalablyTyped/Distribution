package typings.spotifyDashWebDashApiDashNode.spotifyDashWebDashApiDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var clientSecret: js.UndefOr[String] = js.undefined
  var redirectUri: js.UndefOr[String] = js.undefined
  var refreshToken: js.UndefOr[String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    accessToken: String = null,
    clientId: String = null,
    clientSecret: String = null,
    redirectUri: String = null,
    refreshToken: String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    __obj.asInstanceOf[Credentials]
  }
}

