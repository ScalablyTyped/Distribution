package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DesktopDrawerType extends js.Object {
  var desktopDrawerType: reactDashMdLib.libDrawersDrawerMod.DrawerType
  var desktopMinWidth: scala.Double
  var mobileDrawerType: reactDashMdLib.libDrawersDrawerMod.MobileDrawerType
  var mobileMinWidth: scala.Double
  var tabletDrawerType: reactDashMdLib.libDrawersDrawerMod.DrawerType
  var tabletMinWidth: scala.Double
}

object Anon_DesktopDrawerType {
  @scala.inline
  def apply(
    desktopDrawerType: reactDashMdLib.libDrawersDrawerMod.DrawerType,
    desktopMinWidth: scala.Double,
    mobileDrawerType: reactDashMdLib.libDrawersDrawerMod.MobileDrawerType,
    mobileMinWidth: scala.Double,
    tabletDrawerType: reactDashMdLib.libDrawersDrawerMod.DrawerType,
    tabletMinWidth: scala.Double
  ): Anon_DesktopDrawerType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("desktopDrawerType")(desktopDrawerType)
    __obj.updateDynamic("desktopMinWidth")(desktopMinWidth)
    __obj.updateDynamic("mobileDrawerType")(mobileDrawerType)
    __obj.updateDynamic("mobileMinWidth")(mobileMinWidth)
    __obj.updateDynamic("tabletDrawerType")(tabletDrawerType)
    __obj.updateDynamic("tabletMinWidth")(tabletMinWidth)
    __obj.asInstanceOf[Anon_DesktopDrawerType]
  }
}

