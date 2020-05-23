package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `14` extends js.Object {
  var filter: js.UndefOr[js.Any | String] = js.undefined
}

object `14` {
  @scala.inline
  def apply(filter: js.Any | String = null): `14` = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
}

