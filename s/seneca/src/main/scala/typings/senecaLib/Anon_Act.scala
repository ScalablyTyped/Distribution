package typings
package senecaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Act extends js.Object {
  var act: js.UndefOr[scala.Boolean] = js.undefined
  var stack: js.UndefOr[scala.Boolean] = js.undefined
  var unknown: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Act {
  @scala.inline
  def apply(
    act: js.UndefOr[scala.Boolean] = js.undefined,
    stack: js.UndefOr[scala.Boolean] = js.undefined,
    unknown: java.lang.String = null
  ): Anon_Act = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(act)) __obj.updateDynamic("act")(act)
    if (!js.isUndefined(stack)) __obj.updateDynamic("stack")(stack)
    if (unknown != null) __obj.updateDynamic("unknown")(unknown)
    __obj.asInstanceOf[Anon_Act]
  }
}

