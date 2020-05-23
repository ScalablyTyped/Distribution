package typings.reactCssCollapse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var className: js.UndefOr[String | Null] = js.undefined
  var isOpen: Boolean
  var onRest: js.UndefOr[js.Function0[Unit]] = js.undefined
  var transition: js.UndefOr[String | Null] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    isOpen: Boolean,
    className: js.UndefOr[Null | String] = js.undefined,
    onRest: () => Unit = null,
    transition: js.UndefOr[Null | String] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(className)) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onRest != null) __obj.updateDynamic("onRest")(js.Any.fromFunction0(onRest))
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

