package typings
package reactDashNativeDashAuth0Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Email extends js.Object {
  var email: java.lang.String
  var emailVerified: scala.Boolean
  var name: java.lang.String
  var nickname: java.lang.String
  var picture: java.lang.String
  var sub: java.lang.String
  var updatedAt: java.lang.String
}

object Anon_Email {
  @scala.inline
  def apply(
    email: java.lang.String,
    emailVerified: scala.Boolean,
    name: java.lang.String,
    nickname: java.lang.String,
    picture: java.lang.String,
    sub: java.lang.String,
    updatedAt: java.lang.String
  ): Anon_Email = {
    val __obj = js.Dynamic.literal(email = email, emailVerified = emailVerified, name = name, nickname = nickname, picture = picture, sub = sub, updatedAt = updatedAt)
  
    __obj.asInstanceOf[Anon_Email]
  }
}

