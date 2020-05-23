package typings.reactNativeAuth0.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: String
  var emailVerified: Boolean
  var name: String
  var nickname: String
  var picture: String
  var sub: String
  var updatedAt: String
}

object Email {
  @scala.inline
  def apply(
    email: String,
    emailVerified: Boolean,
    name: String,
    nickname: String,
    picture: String,
    sub: String,
    updatedAt: String
  ): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], emailVerified = emailVerified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], picture = picture.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

