package typings.atStorybookComponents.distScrollAreaScrollAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollAreaProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object ScrollAreaProps {
  @scala.inline
  def apply(
    className: String = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): ScrollAreaProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[ScrollAreaProps]
  }
}

