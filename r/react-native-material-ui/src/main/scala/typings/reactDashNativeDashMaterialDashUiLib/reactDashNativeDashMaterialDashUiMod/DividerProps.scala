package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DividerProps extends js.Object {
  var inset: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContainerViewStyle] = js.undefined
}

object DividerProps {
  @scala.inline
  def apply(
    inset: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContainerViewStyle = null
  ): DividerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inset)) __obj.updateDynamic("inset")(inset)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DividerProps]
  }
}

