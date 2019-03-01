package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderForceInset extends js.Object {
  var bottom: js.UndefOr[java.lang.String] = js.undefined
  var horizontal: js.UndefOr[java.lang.String] = js.undefined
  var left: js.UndefOr[java.lang.String] = js.undefined
  var right: js.UndefOr[java.lang.String] = js.undefined
  var top: js.UndefOr[java.lang.String] = js.undefined
  var vertical: js.UndefOr[java.lang.String] = js.undefined
}

object HeaderForceInset {
  @scala.inline
  def apply(
    bottom: java.lang.String = null,
    horizontal: java.lang.String = null,
    left: java.lang.String = null,
    right: java.lang.String = null,
    top: java.lang.String = null,
    vertical: java.lang.String = null
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

