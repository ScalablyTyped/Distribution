package typings.pusherChatkitClient.hooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserParams extends js.Object {
  var userId: String
}

object UserParams {
  @scala.inline
  def apply(userId: String): UserParams = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserParams]
  }
}

