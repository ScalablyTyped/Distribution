package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DesktopMinWidth extends js.Object {
  var desktopMinWidth: scala.Double
  var desktopType: reactDashMdLib.libDrawersDrawerMod.DrawerType
  var mobileMinWidth: scala.Double
  var mobileType: reactDashMdLib.libDrawersDrawerMod.MobileDrawerType
  var tabletMinWidth: scala.Double
  var tabletType: reactDashMdLib.libDrawersDrawerMod.DrawerType
}

object Anon_DesktopMinWidth {
  @scala.inline
  def apply(
    desktopMinWidth: scala.Double,
    desktopType: reactDashMdLib.libDrawersDrawerMod.DrawerType,
    mobileMinWidth: scala.Double,
    mobileType: reactDashMdLib.libDrawersDrawerMod.MobileDrawerType,
    tabletMinWidth: scala.Double,
    tabletType: reactDashMdLib.libDrawersDrawerMod.DrawerType
  ): Anon_DesktopMinWidth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("desktopMinWidth")(desktopMinWidth)
    __obj.updateDynamic("desktopType")(desktopType)
    __obj.updateDynamic("mobileMinWidth")(mobileMinWidth)
    __obj.updateDynamic("mobileType")(mobileType)
    __obj.updateDynamic("tabletMinWidth")(tabletMinWidth)
    __obj.updateDynamic("tabletType")(tabletType)
    __obj.asInstanceOf[Anon_DesktopMinWidth]
  }
}

