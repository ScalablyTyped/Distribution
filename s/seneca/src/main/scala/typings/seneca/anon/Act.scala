package typings.seneca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Act extends js.Object {
  var act: js.UndefOr[Boolean] = js.undefined
  var stack: js.UndefOr[Boolean] = js.undefined
  var unknown: js.UndefOr[String] = js.undefined
}

object Act {
  @scala.inline
  def apply(
    act: js.UndefOr[Boolean] = js.undefined,
    stack: js.UndefOr[Boolean] = js.undefined,
    unknown: String = null
  ): Act = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(act)) __obj.updateDynamic("act")(act.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack.get.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(unknown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Act]
  }
}

