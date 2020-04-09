package typings.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpanded extends js.Object {
  var expanded: js.UndefOr[js.Array[_]] = js.undefined
}

object AnonExpanded {
  @scala.inline
  def apply(expanded: js.Array[_] = null): AnonExpanded = {
    val __obj = js.Dynamic.literal()
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpanded]
  }
}

