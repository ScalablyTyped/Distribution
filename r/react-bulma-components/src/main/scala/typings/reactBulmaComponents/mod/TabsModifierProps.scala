package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.`toggle-rounded`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.boolean
import typings.reactBulmaComponents.reactBulmaComponentsStrings.boxed
import typings.reactBulmaComponents.reactBulmaComponentsStrings.centered
import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import typings.reactBulmaComponents.reactBulmaComponentsStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Tabs ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/tabs/tabs.js
trait TabsModifierProps extends js.Object {
  var align: js.UndefOr[centered | right] = js.undefined
  var fullwidth: js.UndefOr[boolean] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
  var `type`: js.UndefOr[toggle | boxed | `toggle-rounded`] = js.undefined
}

object TabsModifierProps {
  @scala.inline
  def apply(
    align: centered | right = null,
    fullwidth: boolean = null,
    size: small | medium | large = null,
    `type`: toggle | boxed | `toggle-rounded` = null
  ): TabsModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (fullwidth != null) __obj.updateDynamic("fullwidth")(fullwidth.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsModifierProps]
  }
}

