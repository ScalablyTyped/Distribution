package typings.reactBulmaComponents.mod

import typings.reactBulmaComponents.reactBulmaComponentsStrings.addons
import typings.reactBulmaComponents.reactBulmaComponentsStrings.centered
import typings.reactBulmaComponents.reactBulmaComponentsStrings.group
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/form/components/field/field.js
trait FieldModifierProps extends js.Object {
  var align: js.UndefOr[centered | right] = js.undefined
  var horizontal: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[addons | group] = js.undefined
  var mulitline: js.UndefOr[Boolean] = js.undefined
}

object FieldModifierProps {
  @scala.inline
  def apply(
    align: centered | right = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    kind: addons | group = null,
    mulitline: js.UndefOr[Boolean] = js.undefined
  ): FieldModifierProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(mulitline)) __obj.updateDynamic("mulitline")(mulitline.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldModifierProps]
  }
}

