package typings.reactRelativePortal.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var component: String
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var left: js.UndefOr[Double] = js.undefined
  var onOutClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var right: js.UndefOr[Double] = js.undefined
  var top: js.UndefOr[Double] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    component: String,
    children: ReactNode = null,
    className: String = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    onOutClick: () => Unit = null,
    right: js.UndefOr[Double] = js.undefined,
    top: js.UndefOr[Double] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (onOutClick != null) __obj.updateDynamic("onOutClick")(js.Any.fromFunction0(onOutClick))
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

