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
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (depkeys != null) __obj.updateDynamic("depkeys")(depkeys.asInstanceOf[js.Any])
    if (qfn != null) __obj.updateDynamic("qfn")(qfn.asInstanceOf[js.Any])
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sod]
  }
}

