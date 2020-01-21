package typings.restIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonADMIN extends js.Object {
  var ADMIN: String
  var MODERATOR: String
  var SUPER_USER: String
  var USER: String
}

object AnonADMIN {
  @scala.inline
  def apply(ADMIN: String, MODERATOR: String, SUPER_USER: String, USER: String): AnonADMIN = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], MODERATOR = MODERATOR.asInstanceOf[js.Any], SUPER_USER = SUPER_USER.asInstanceOf[js.Any], USER = USER.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonADMIN]
  }
}

