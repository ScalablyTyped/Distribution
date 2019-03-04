package typings
package saml20Lib.saml20Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var claims: js.Any
  var issuer: java.lang.String
  var sessionIndex: js.UndefOr[java.lang.String] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    claims: js.Any,
    issuer: java.lang.String,
    audience: java.lang.String = null,
    sessionIndex: java.lang.String = null
  ): Profile = {
    val __obj = js.Dynamic.literal(claims = claims, issuer = issuer)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (sessionIndex != null) __obj.updateDynamic("sessionIndex")(sessionIndex)
    __obj.asInstanceOf[Profile]
  }
}

