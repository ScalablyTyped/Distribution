package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.reactDashNativeDashMaterialDashUi.Anon_ContainerText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubheaderProps extends js.Object {
  var inset: js.UndefOr[Boolean] = js.undefined
  var lines: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[Anon_ContainerText] = js.undefined
  var text: String
}

object SubheaderProps {
  @scala.inline
  def apply(
    text: String,
    inset: js.UndefOr[Boolean] = js.undefined,
    lines: Int | Double = null,
    style: Anon_ContainerText = null
  ): SubheaderProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubheaderProps]
  }
}

