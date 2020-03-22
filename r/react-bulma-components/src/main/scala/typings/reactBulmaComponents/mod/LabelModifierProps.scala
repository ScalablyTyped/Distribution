package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.large
import typings.reactBulmaComponents.reactBulmaComponentsStrings.medium
import typings.reactBulmaComponents.reactBulmaComponentsStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/form/components/label.js
trait LabelModifierProps extends js.Object {
  var htmlFor: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object LabelModifierProps {
  @scala.inline
  def apply(htmlFor: String = null, size: small | medium | large = null): LabelModifierProps = {
    val __obj = js.Dynamic.literal()
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelModifierProps]
  }
}

