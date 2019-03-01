package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sod extends js.Object {
  var depkeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var key: java.lang.String
  var loaded: scala.Boolean
  var qfn: js.UndefOr[js.Array[_]] = js.undefined
  var reset: js.UndefOr[scala.Boolean] = js.undefined
  var state: Sods
  var url: java.lang.String
}

object Sod {
  @scala.inline
  def apply(
    key: java.lang.String,
    loaded: scala.Boolean,
    state: Sods,
    url: java.lang.String,
    depkeys: js.Array[java.lang.String] = null,
    qfn: js.Array[_] = null,
    reset: js.UndefOr[scala.Boolean] = js.undefined
  ): Sod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("loaded")(loaded)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("url")(url)
    if (depkeys != null) __obj.updateDynamic("depkeys")(depkeys)
    if (qfn != null) __obj.updateDynamic("qfn")(qfn)
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[Sod]
  }
}

