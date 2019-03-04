package typings
package reactDashNativeDashNavbarLib.reactDashNativeDashNavbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarTitle extends js.Object {
  var ellipsizeMode: js.UndefOr[
    reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.head | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.middle | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.tail | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.clip
  ] = js.undefined
  var numberOfLines: js.UndefOr[scala.Double] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  var title: java.lang.String
}

object NavigationBarTitle {
  @scala.inline
  def apply(
    title: java.lang.String,
    ellipsizeMode: reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.head | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.middle | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.tail | reactDashNativeDashNavbarLib.reactDashNativeDashNavbarLibStrings.clip = null,
    numberOfLines: scala.Int | scala.Double = null,
    tintColor: java.lang.String = null
  ): NavigationBarTitle = {
    val __obj = js.Dynamic.literal(title = title)
    if (ellipsizeMode != null) __obj.updateDynamic("ellipsizeMode")(ellipsizeMode.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    __obj.asInstanceOf[NavigationBarTitle]
  }
}

