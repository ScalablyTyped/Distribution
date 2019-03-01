package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitOptions extends js.Object {
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var waitFor: js.UndefOr[waitFor] = js.undefined
}

object WaitOptions {
  @scala.inline
  def apply(timeout: scala.Int | scala.Double = null, waitFor: waitFor = null): WaitOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor)
    __obj.asInstanceOf[WaitOptions]
  }
}

