package typings.squareDashConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Oauth2 extends js.Object {
  var oauth2: Anon_AccessToken
  var oauth2ClientSecret: Anon_In
}

object Anon_Oauth2 {
  @scala.inline
  def apply(oauth2: Anon_AccessToken, oauth2ClientSecret: Anon_In): Anon_Oauth2 = {
    val __obj = js.Dynamic.literal(oauth2 = oauth2, oauth2ClientSecret = oauth2ClientSecret)
  
    __obj.asInstanceOf[Anon_Oauth2]
  }
}

