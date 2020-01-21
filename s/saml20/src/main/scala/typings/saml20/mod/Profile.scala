package typings.saml20.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var audience: js.UndefOr[String] = js.undefined
  var claims: js.Any
  var issuer: String
  var sessionIndex: js.UndefOr[String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(claims: js.Any, issuer: String, audience: String = null, sessionIndex: String = null): Profile = {
    val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (sessionIndex != null) __obj.updateDynamic("sessionIndex")(sessionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

