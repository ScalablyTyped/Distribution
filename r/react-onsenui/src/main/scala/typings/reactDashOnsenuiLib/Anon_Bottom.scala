package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var verticalAlign: js.UndefOr[
    reactDashOnsenuiLib.reactDashOnsenuiLibStrings.top | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.bottom | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.center
  ] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    verticalAlign: reactDashOnsenuiLib.reactDashOnsenuiLibStrings.top | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.bottom | reactDashOnsenuiLib.reactDashOnsenuiLibStrings.center = null,
    width: java.lang.String = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Bottom]
  }
}

