package typings
package restDashIoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  val ROLES: Anon_ADMIN
  var default: Anon_ROLES
}

object Anon_Default {
  @scala.inline
  def apply(ROLES: Anon_ADMIN, default: Anon_ROLES): Anon_Default = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ROLES")(ROLES)
    __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[Anon_Default]
  }
}

