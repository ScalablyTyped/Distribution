package typings.reactDashNativeDashAuth0

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: String
  var emailVerified: Boolean
  var name: String
  var nickname: String
  var picture: String
  var sub: String
  var updatedAt: String
}

object Anon_Email {
  @scala.inline
  def apply(
    email: String,
    emailVerified: Boolean,
    name: String,
    nickname: String,
    picture: String,
    sub: String,
    updatedAt: String
  ): Anon_Email = {
    val __obj = js.Dynamic.literal(email = email, emailVerified = emailVerified, name = name, nickname = nickname, picture = picture, sub = sub, updatedAt = updatedAt)
  
    __obj.asInstanceOf[Anon_Email]
  }
}

