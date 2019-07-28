package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderForceInset extends js.Object {
  var bottom: js.UndefOr[String] = js.undefined
  var horizontal: js.UndefOr[String] = js.undefined
  var left: js.UndefOr[String] = js.undefined
  var right: js.UndefOr[String] = js.undefined
  var top: js.UndefOr[String] = js.undefined
  var vertical: js.UndefOr[String] = js.undefined
}

object HeaderForceInset {
  @scala.inline
  def apply(
    bottom: String = null,
    horizontal: String = null,
    left: String = null,
    right: String = null,
    top: String = null,
    vertical: String = null
  ): HeaderForceInset = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (top != null) __obj.updateDynamic("top")(top)
    if (vertical != null) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[HeaderForceInset]
  }
}

