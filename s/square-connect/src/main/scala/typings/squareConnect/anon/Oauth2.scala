package typings.squareConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Oauth2 extends js.Object {
  var oauth2: AccessToken
  var oauth2ClientSecret: In
}

object Oauth2 {
  @scala.inline
  def apply(oauth2: AccessToken, oauth2ClientSecret: In): Oauth2 = {
    val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any], oauth2ClientSecret = oauth2ClientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oauth2]
  }
}

