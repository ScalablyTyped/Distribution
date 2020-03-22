package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.AnonActive
import typings.reactBulmaComponents.reactBulmaComponentsStrings.arrow
import typings.reactBulmaComponents.reactBulmaComponentsStrings.bullet
import typings.reactBulmaComponents.reactBulmaComponentsStrings.center
import typings.reactBulmaComponents.reactBulmaComponentsStrings.dot
import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import typings.reactBulmaComponents.reactBulmaComponentsStrings.succeeds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Breadcrumb ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/breadcrumb/breadcrumb.js
trait BreadcrumbModifierProps extends js.Object {
  var align: js.UndefOr[right | center] = js.undefined
  var hrefAttr: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[AnonActive]] = js.undefined
  var separator: js.UndefOr[arrow | bullet | dot | succeeds] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object BreadcrumbModifierProps {
  @scala.inline
  def apply(
    align: right | center = null,
    hrefAttr: String = null,
    items: js.Array[AnonActive] = null,
    separator: arrow | bullet | dot | succeeds = null,
    size: small | medium | large = null
  ): BreadcrumbModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (hrefAttr != null) __obj.updateDynamic("hrefAttr")(hrefAttr.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbModifierProps]
  }
}

