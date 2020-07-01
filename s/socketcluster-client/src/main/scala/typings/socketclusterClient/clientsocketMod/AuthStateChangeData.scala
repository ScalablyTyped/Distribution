package typings.socketclusterClient.clientsocketMod

import typings.socketclusterClient.authMod.AuthToken
import typings.socketclusterClient.authMod.SignedAuthToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthStateChangeData extends js.Object {
  var authToken: js.UndefOr[AuthToken] = js.undefined
  var newAuthState: AuthStates
  var oldAuthState: AuthStates
  var signedAuthToken: js.UndefOr[SignedAuthToken] = js.undefined
}

object AuthStateChangeData {
  @scala.inline
  def apply(
    newAuthState: AuthStates,
    oldAuthState: AuthStates,
    authToken: AuthToken = null,
    signedAuthToken: SignedAuthToken = null
  ): AuthStateChangeData = {
    val __obj = js.Dynamic.literal(newAuthState = newAuthState.asInstanceOf[js.Any], oldAuthState = oldAuthState.asInstanceOf[js.Any])
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    if (signedAuthToken != null) __obj.updateDynamic("signedAuthToken")(signedAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStateChangeData]
  }
}

