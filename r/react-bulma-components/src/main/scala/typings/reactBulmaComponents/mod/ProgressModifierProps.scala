package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Progress ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/progress/progress.js
trait ProgressModifierProps extends js.Object {
  var color: js.UndefOr[Color] = js.undefined
  // todo: https://github.com/couds/react-bulma-components/issues/112
  var max: Double
  var size: js.UndefOr[small | medium | large] = js.undefined
  var value: Double
}

object ProgressModifierProps {
  @scala.inline
  def apply(max: Double, value: Double, color: Color = null, size: small | medium | large = null): ProgressModifierProps = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressModifierProps]
  }
}

