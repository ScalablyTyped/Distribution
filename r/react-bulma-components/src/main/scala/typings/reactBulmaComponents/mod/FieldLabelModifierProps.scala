package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.normal
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/form/components/label.js
trait FieldLabelModifierProps extends js.Object {
  var size: js.UndefOr[small | normal | medium | large] = js.undefined
}

object FieldLabelModifierProps {
  @scala.inline
  def apply(size: small | normal | medium | large = null): FieldLabelModifierProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLabelModifierProps]
  }
}

