package typings.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAct extends js.Object {
  var act: js.UndefOr[Boolean] = js.undefined
  var stack: js.UndefOr[Boolean] = js.undefined
  var unknown: js.UndefOr[String] = js.undefined
}

object AnonAct {
  @scala.inline
  def apply(
    act: js.UndefOr[Boolean] = js.undefined,
    stack: js.UndefOr[Boolean] = js.undefined,
    unknown: String = null
  ): AnonAct = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(act)) __obj.updateDynamic("act")(act.asInstanceOf[js.Any])
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAct]
  }
}

