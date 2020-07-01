package typings.socketclusterClient.anon

import typings.socketclusterClient.authMod.AuthToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldAuthToken extends js.Object {
  var oldAuthToken: AuthToken
}

object OldAuthToken {
  @scala.inline
  def apply(oldAuthToken: AuthToken): OldAuthToken = {
    val __obj = js.Dynamic.literal(oldAuthToken = oldAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldAuthToken]
  }
}

