package typings.restIo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ADMIN extends js.Object {
  var ADMIN: String
  var MODERATOR: String
  var SUPER_USER: String
  var USER: String
}

object ADMIN {
  @scala.inline
  def apply(ADMIN: String, MODERATOR: String, SUPER_USER: String, USER: String): ADMIN = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], MODERATOR = MODERATOR.asInstanceOf[js.Any], SUPER_USER = SUPER_USER.asInstanceOf[js.Any], USER = USER.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADMIN]
  }
}

