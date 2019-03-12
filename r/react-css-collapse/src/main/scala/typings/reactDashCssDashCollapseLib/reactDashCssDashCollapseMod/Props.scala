package typings
package reactDashCssDashCollapseLib.reactDashCssDashCollapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var className: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var isOpen: scala.Boolean
  var onRest: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var transition: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    isOpen: scala.Boolean,
    className: java.lang.String = null,
    onRest: () => scala.Unit = null,
    transition: java.lang.String = null
  ): Props = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onRest != null) __obj.updateDynamic("onRest")(js.Any.fromFunction0(onRest))
    if (transition != null) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[Props]
  }
}

