package typings.storybookComponents.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisuallyHiddenProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.native
}

object VisuallyHiddenProps {
  @scala.inline
  def apply(active: js.UndefOr[Boolean] = js.undefined): VisuallyHiddenProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisuallyHiddenProps]
  }
}

