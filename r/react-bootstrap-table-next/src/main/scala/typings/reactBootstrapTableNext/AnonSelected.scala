package typings.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelected extends js.Object {
  var selected: js.UndefOr[js.Array[_]] = js.undefined
}

object AnonSelected {
  @scala.inline
  def apply(selected: js.Array[_] = null): AnonSelected = {
    val __obj = js.Dynamic.literal()
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelected]
  }
}

