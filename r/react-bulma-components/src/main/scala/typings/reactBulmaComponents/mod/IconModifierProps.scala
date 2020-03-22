package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.auto
import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.left
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Icon ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/icon/icon.js
trait IconModifierProps extends js.Object {
  var align: js.UndefOr[left | right] = js.undefined
  var color: js.UndefOr[Color] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[small | medium | large | auto] = js.undefined
}

object IconModifierProps {
  @scala.inline
  def apply(
    align: left | right = null,
    color: Color = null,
    icon: String = null,
    size: small | medium | large | auto = null
  ): IconModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconModifierProps]
  }
}

