package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sod extends js.Object {
  var depkeys: js.UndefOr[js.Array[String]] = js.undefined
  var key: String
  var loaded: Boolean
  var qfn: js.UndefOr[js.Array[_]] = js.undefined
  var reset: js.UndefOr[Boolean] = js.undefined
  var state: Sods
  var url: String
}

object Sod {
  @scala.inline
  def apply(
    key: String,
    loaded: Boolean,
    state: Sods,
    url: String,
    depkeys: js.Array[String] = null,
    qfn: js.Array[_] = null,
    reset: js.UndefOr[Boolean] = js.undefined
  ): Sod = {
    val __obj = js.Dynamic.literal(key = key, loaded = loaded, state = state, url = url)
    if (depkeys != null) __obj.updateDynamic("depkeys")(depkeys)
    if (qfn != null) __obj.updateDynamic("qfn")(qfn)
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[Sod]
  }
}

