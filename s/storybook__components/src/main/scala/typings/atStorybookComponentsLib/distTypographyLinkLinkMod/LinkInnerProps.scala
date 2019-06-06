package typings
package atStorybookComponentsLib.distTypographyLinkLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkInnerProps extends js.Object {
  var containsIcon: js.UndefOr[scala.Boolean] = js.undefined
  var withArrow: js.UndefOr[scala.Boolean] = js.undefined
}

object LinkInnerProps {
  @scala.inline
  def apply(
    containsIcon: js.UndefOr[scala.Boolean] = js.undefined,
    withArrow: js.UndefOr[scala.Boolean] = js.undefined
  ): LinkInnerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(containsIcon)) __obj.updateDynamic("containsIcon")(containsIcon)
    if (!js.isUndefined(withArrow)) __obj.updateDynamic("withArrow")(withArrow)
    __obj.asInstanceOf[LinkInnerProps]
  }
}

