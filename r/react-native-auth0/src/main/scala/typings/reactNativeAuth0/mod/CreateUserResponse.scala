package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserResponse extends js.Object {
  var Id: String
  var email: String
  var emailVerified: Boolean
}

object CreateUserResponse {
  @scala.inline
  def apply(Id: String, email: String, emailVerified: Boolean): CreateUserResponse = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], emailVerified = emailVerified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateUserResponse]
  }
}

