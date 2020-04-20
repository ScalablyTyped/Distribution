package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilter extends js.Object {
  var filter: js.Any | String
}

object AnonFilter {
  @scala.inline
  def apply(filter: js.Any | String): AnonFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilter]
  }
}

