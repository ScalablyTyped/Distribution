package typings
package restDashIoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ADMIN extends js.Object {
  var ADMIN: java.lang.String
  var MODERATOR: java.lang.String
  var SUPER_USER: java.lang.String
  var USER: java.lang.String
}

object Anon_ADMIN {
  @scala.inline
  def apply(
    ADMIN: java.lang.String,
    MODERATOR: java.lang.String,
    SUPER_USER: java.lang.String,
    USER: java.lang.String
  ): Anon_ADMIN = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADMIN")(ADMIN)
    __obj.updateDynamic("MODERATOR")(MODERATOR)
    __obj.updateDynamic("SUPER_USER")(SUPER_USER)
    __obj.updateDynamic("USER")(USER)
    __obj.asInstanceOf[Anon_ADMIN]
  }
}

