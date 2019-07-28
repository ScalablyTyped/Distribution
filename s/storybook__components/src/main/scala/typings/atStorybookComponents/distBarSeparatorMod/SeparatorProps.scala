package typings.atStorybookComponents.distBarSeparatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeparatorProps extends js.Object {
  var force: js.UndefOr[Boolean] = js.undefined
}

object SeparatorProps {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined): SeparatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[SeparatorProps]
  }
}

