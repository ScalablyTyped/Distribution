package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomCenter extends js.Object {
  var verticalAlign: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibStrings.top | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.bottom | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.center
  ] = js.undefined
}

object Anon_BottomCenter {
  @scala.inline
  def apply(
    verticalAlign: reactDashOnsenuiLib.reactDashOnsenuiLibStrings.top | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.bottom | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.center = null
  ): Anon_BottomCenter = {
    val __obj = js.Dynamic.literal()
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BottomCenter]
  }
}

