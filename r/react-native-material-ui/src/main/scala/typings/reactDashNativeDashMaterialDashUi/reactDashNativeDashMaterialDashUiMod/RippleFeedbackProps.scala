package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod.Global.JSX.Element
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
    val __obj = js.Dynamic.literal(children = children)
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[RippleFeedbackProps]
  }
}

