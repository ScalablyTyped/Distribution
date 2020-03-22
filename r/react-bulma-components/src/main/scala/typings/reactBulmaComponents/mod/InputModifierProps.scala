package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/form/components/input.js
trait InputModifierProps extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  var isStatic: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object InputModifierProps {
  @scala.inline
  def apply(
    color: Color = null,
    isStatic: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large = null
  ): InputModifierProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(isStatic)) __obj.updateDynamic("isStatic")(isStatic.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputModifierProps]
  }
}

