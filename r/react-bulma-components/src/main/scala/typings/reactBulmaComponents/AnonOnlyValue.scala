package typings.reactBulmaComponents

import typings.reactBulmaComponents.reactBulmaComponentsStrings.centered
import typings.reactBulmaComponents.reactBulmaComponentsStrings.justified
import typings.reactBulmaComponents.reactBulmaComponentsStrings.left
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnlyValue extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[centered | justified | left | right] = js.undefined
}

object AnonOnlyValue {
  @scala.inline
  def apply(only: js.UndefOr[Boolean] = js.undefined, value: centered | justified | left | right = null): AnonOnlyValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnlyValue]
  }
}

