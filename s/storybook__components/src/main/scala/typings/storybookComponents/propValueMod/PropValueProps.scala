package typings.storybookComponents.propValueMod

import typings.storybookComponents.propDefMod.PropSummaryValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropValueProps extends js.Object {
  var value: js.UndefOr[PropSummaryValue] = js.native
}

object PropValueProps {
  @scala.inline
  def apply(value: PropSummaryValue = null): PropValueProps = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropValueProps]
  }
}

