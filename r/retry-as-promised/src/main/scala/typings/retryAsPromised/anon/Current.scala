package typings.retryAsPromised.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Current extends js.Object {
  var current: js.UndefOr[Double] = js.undefined
}

object Current {
  @scala.inline
  def apply(current: js.UndefOr[Double] = js.undefined): Current = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(current)) __obj.updateDynamic("current")(current.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
}

