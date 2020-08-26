package typings.squareConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Oauth2 extends js.Object {
  var oauth2: AccessToken = js.native
  var oauth2ClientSecret: In = js.native
}

object Oauth2 {
  @scala.inline
  def apply(oauth2: AccessToken, oauth2ClientSecret: In): Oauth2 = {
    val __obj = js.Dynamic.literal(oauth2 = oauth2.asInstanceOf[js.Any], oauth2ClientSecret = oauth2ClientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oauth2]
  }
  @scala.inline
  implicit class Oauth2Ops[Self <: Oauth2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOauth2(value: AccessToken): Self = this.set("oauth2", value.asInstanceOf[js.Any])
    @scala.inline
    def setOauth2ClientSecret(value: In): Self = this.set("oauth2ClientSecret", value.asInstanceOf[js.Any])
  }
  
}

