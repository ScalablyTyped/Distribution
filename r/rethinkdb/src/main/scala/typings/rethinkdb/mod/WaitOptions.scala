package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
  var waitFor: js.UndefOr[typings.rethinkdb.mod.waitFor] = js.undefined
}

object WaitOptions {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined, waitFor: waitFor = null): WaitOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitOptions]
  }
}

