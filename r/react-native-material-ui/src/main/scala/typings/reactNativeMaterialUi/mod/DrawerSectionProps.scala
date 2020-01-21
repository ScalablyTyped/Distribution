package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.AnonContainerIconItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerSectionProps extends js.Object {
  var divider: js.UndefOr[Boolean] = js.undefined
  var items: js.Array[DrawerSectionItem]
  var style: js.UndefOr[AnonContainerIconItem] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object DrawerSectionProps {
  @scala.inline
  def apply(
    items: js.Array[DrawerSectionItem],
    divider: js.UndefOr[Boolean] = js.undefined,
    style: AnonContainerIconItem = null,
    title: String = null
  ): DrawerSectionProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerSectionProps]
  }
}

