package typings
package stdDashMocksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Print extends js.Object {
  var print: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Print {
  @scala.inline
  def apply(print: js.UndefOr[scala.Boolean] = js.undefined): Anon_Print = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print)
    __obj.asInstanceOf[Anon_Print]
  }
}

