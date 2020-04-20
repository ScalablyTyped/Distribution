package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfoParams extends js.Object {
  var token: String
}

object UserInfoParams {
  @scala.inline
  def apply(token: String): UserInfoParams = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfoParams]
  }
}

