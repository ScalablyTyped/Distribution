package typings.reactBulmaComponents

import typings.reactBulmaComponents.reactBulmaComponentsStrings.`inline-block`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`inline-flex`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.`inline`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.block
import typings.reactBulmaComponents.reactBulmaComponentsStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnly extends js.Object {
  var only: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[block | flex | `inline` | `inline-block` | `inline-flex`] = js.undefined
}

object AnonOnly {
  @scala.inline
  def apply(
    only: js.UndefOr[Boolean] = js.undefined,
    value: block | flex | `inline` | `inline-block` | `inline-flex` = null
  ): AnonOnly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(only)) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnly]
  }
}

