package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon32 extends js.Object {
  var filter: js.UndefOr[js.Any | String] = js.undefined
}

object Anon32 {
  @scala.inline
  def apply(filter: js.Any | String = null): Anon32 = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon32]
  }
}

