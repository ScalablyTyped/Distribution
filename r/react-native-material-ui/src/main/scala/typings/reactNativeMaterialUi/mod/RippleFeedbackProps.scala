package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RippleFeedbackProps extends js.Object {
  var borderless: js.UndefOr[Boolean] = js.undefined
  var children: Element
  var color: js.UndefOr[String] = js.undefined
}

object RippleFeedbackProps {
  @scala.inline
  def apply(children: Element, borderless: js.UndefOr[Boolean] = js.undefined, color: String = null): RippleFeedbackProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleFeedbackProps]
  }
}

