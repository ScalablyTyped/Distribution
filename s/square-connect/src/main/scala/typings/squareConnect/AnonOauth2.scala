package typings.squareConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOauth2 extends js.Object {
  var oauth2: AnonAccessToken
  var oauth2ClientSecret: AnonIn
}

object AnonOauth2 {
  @scala.inline
  def apply(oauth2: AnonAccessToken, oauth2ClientSecret: AnonIn): AnonOauth2 = {
    val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any], oauth2ClientSecret = oauth2ClientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOauth2]
  }
}

