package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerSectionProps extends js.Object {
  var divider: js.UndefOr[scala.Boolean] = js.undefined
  var items: js.Array[DrawerSectionItem]
  var style: js.UndefOr[reactDashNativeDashMaterialDashUiLib.Anon_ContainerIconItem] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object DrawerSectionProps {
  @scala.inline
  def apply(
    items: js.Array[DrawerSectionItem],
    divider: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactDashNativeDashMaterialDashUiLib.Anon_ContainerIconItem = null,
    title: java.lang.String = null
  ): DrawerSectionProps = {
    val __obj = js.Dynamic.literal(items = items)
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[DrawerSectionProps]
  }
}

