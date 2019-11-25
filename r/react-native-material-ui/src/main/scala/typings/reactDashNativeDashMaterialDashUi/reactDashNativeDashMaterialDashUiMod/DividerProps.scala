package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.reactDashNativeDashMaterialDashUi.Anon_ContainerViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DividerProps extends js.Object {
  var inset: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[Anon_ContainerViewStyle] = js.undefined
}

object DividerProps {
  @scala.inline
  def apply(inset: js.UndefOr[Boolean] = js.undefined, style: Anon_ContainerViewStyle = null): DividerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DividerProps]
  }
}

