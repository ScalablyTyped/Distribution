package typings.reactDashNativeDashNavbar.reactDashNativeDashNavbarMod

import typings.reactDashNativeDashNavbar.reactDashNativeDashNavbarStrings.clip
import typings.reactDashNativeDashNavbar.reactDashNativeDashNavbarStrings.head
import typings.reactDashNativeDashNavbar.reactDashNativeDashNavbarStrings.middle
import typings.reactDashNativeDashNavbar.reactDashNativeDashNavbarStrings.tail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarTitle extends js.Object {
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.undefined
  var numberOfLines: js.UndefOr[Double] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var title: String
}

object NavigationBarTitle {
  @scala.inline
  def apply(
    title: String,
    ellipsizeMode: head | middle | tail | clip = null,
    numberOfLines: Int | Double = null,
    tintColor: String = null
  ): NavigationBarTitle = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (ellipsizeMode != null) __obj.updateDynamic("ellipsizeMode")(ellipsizeMode.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarTitle]
  }
}

