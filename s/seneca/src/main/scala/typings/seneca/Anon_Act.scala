package typings.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Act extends js.Object {
  var act: js.UndefOr[Boolean] = js.undefined
  var stack: js.UndefOr[Boolean] = js.undefined
  var unknown: js.UndefOr[String] = js.undefined
}

object Anon_Act {
  @scala.inline
  def apply(
    act: js.UndefOr[Boolean] = js.undefined,
    stack: js.UndefOr[Boolean] = js.undefined,
    unknown: String = null
  ): Anon_Act = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(act)) __obj.updateDynamic("act")(act)
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack)
    if (unknown != null) __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[Anon_Act]
  }
}

