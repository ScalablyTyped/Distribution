package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterAny extends js.Object {
  var filter: js.UndefOr[js.Any | String] = js.undefined
}

object AnonFilterAny {
  @scala.inline
  def apply(filter: js.Any | String = null): AnonFilterAny = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterAny]
  }
}

