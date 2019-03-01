package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DesktopMobile extends js.Object {
  var desktop: scala.Boolean
  var mobile: scala.Boolean
  var tablet: scala.Boolean
  var `type`: reactDashMdLib.libDrawersDrawerMod.DrawerType
}

object Anon_DesktopMobile {
  @scala.inline
  def apply(
    desktop: scala.Boolean,
    mobile: scala.Boolean,
    tablet: scala.Boolean,
    `type`: reactDashMdLib.libDrawersDrawerMod.DrawerType
  ): Anon_DesktopMobile = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("desktop")(desktop)
    __obj.updateDynamic("mobile")(mobile)
    __obj.updateDynamic("tablet")(tablet)
    __obj.asInstanceOf[Anon_DesktopMobile]
  }
}

