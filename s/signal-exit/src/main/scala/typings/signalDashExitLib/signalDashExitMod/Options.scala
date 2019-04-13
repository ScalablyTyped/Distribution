package typings
package signalDashExitLib.signalDashExitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var alwaysLast: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(alwaysLast: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysLast)) __obj.updateDynamic("alwaysLast")(alwaysLast)
    __obj.asInstanceOf[Options]
  }
}

