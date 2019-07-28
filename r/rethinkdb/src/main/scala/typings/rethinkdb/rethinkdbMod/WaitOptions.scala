package typings.rethinkdb.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
  var waitFor: js.UndefOr[typings.rethinkdb.rethinkdbMod.waitFor] = js.undefined
}

object WaitOptions {
  @scala.inline
  def apply(timeout: Int | Double = null, waitFor: waitFor = null): WaitOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor)
    __obj.asInstanceOf[WaitOptions]
  }
}

