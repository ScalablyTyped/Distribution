package typings
package prosemirrorDashViewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InclusiveEnd extends js.Object {
  var inclusiveEnd: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var inclusiveStart: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
}

object Anon_InclusiveEnd {
  @scala.inline
  def apply(
    inclusiveEnd: js.UndefOr[scala.Boolean] = js.undefined,
    inclusiveStart: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_InclusiveEnd = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inclusiveEnd)) __obj.updateDynamic("inclusiveEnd")(inclusiveEnd)
    if (!js.isUndefined(inclusiveStart)) __obj.updateDynamic("inclusiveStart")(inclusiveStart)
    __obj.asInstanceOf[Anon_InclusiveEnd]
  }
}

