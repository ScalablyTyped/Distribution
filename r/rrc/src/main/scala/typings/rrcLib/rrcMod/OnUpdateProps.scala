package typings
package rrcLib.rrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnUpdateProps extends js.Object {
  var call: OnUpdateCall
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
}

object OnUpdateProps {
  @scala.inline
  def apply(call: OnUpdateCall, immediate: js.UndefOr[scala.Boolean] = js.undefined): OnUpdateProps = {
    val __obj = js.Dynamic.literal(call = call)
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate)
    __obj.asInstanceOf[OnUpdateProps]
  }
}

