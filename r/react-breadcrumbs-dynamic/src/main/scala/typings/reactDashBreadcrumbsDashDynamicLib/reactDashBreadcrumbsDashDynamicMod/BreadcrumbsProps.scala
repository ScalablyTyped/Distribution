package typings
package reactDashBreadcrumbsDashDynamicLib.reactDashBreadcrumbsDashDynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbsProps extends js.Object {
  var container: js.UndefOr[java.lang.String | reactLib.Element | js.Object] = js.undefined
  var containerProps: js.UndefOr[js.Object] = js.undefined
  var duplicateProps: js.UndefOr[js.Object] = js.undefined
  var finalItem: js.UndefOr[java.lang.String | reactLib.Element | js.Object] = js.undefined
  var finalProps: js.UndefOr[js.Object] = js.undefined
  var item: js.UndefOr[java.lang.String | reactLib.Element | js.Object] = js.undefined
  var renameProps: js.UndefOr[js.Object] = js.undefined
  var separator: js.UndefOr[java.lang.String | reactLib.Element | js.Object] = js.undefined
}

object BreadcrumbsProps {
  @scala.inline
  def apply(
    container: java.lang.String | reactLib.Element | js.Object = null,
    containerProps: js.Object = null,
    duplicateProps: js.Object = null,
    finalItem: java.lang.String | reactLib.Element | js.Object = null,
    finalProps: js.Object = null,
    item: java.lang.String | reactLib.Element | js.Object = null,
    renameProps: js.Object = null,
    separator: java.lang.String | reactLib.Element | js.Object = null
  ): BreadcrumbsProps = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerProps != null) __obj.updateDynamic("containerProps")(containerProps)
    if (duplicateProps != null) __obj.updateDynamic("duplicateProps")(duplicateProps)
    if (finalItem != null) __obj.updateDynamic("finalItem")(finalItem.asInstanceOf[js.Any])
    if (finalProps != null) __obj.updateDynamic("finalProps")(finalProps)
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (renameProps != null) __obj.updateDynamic("renameProps")(renameProps)
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbsProps]
  }
}

