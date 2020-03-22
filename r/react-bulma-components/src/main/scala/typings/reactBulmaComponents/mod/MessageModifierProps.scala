package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Message ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/message/message.js
trait MessageModifierProps extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object MessageModifierProps {
  @scala.inline
  def apply(color: Color = null, size: small | medium | large = null): MessageModifierProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageModifierProps]
  }
}

