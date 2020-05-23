package typings.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  var counter: String
  var limit: Double
  var timeout: js.UndefOr[Double] = js.undefined
}

object Limit {
  @scala.inline
  def apply(counter: String, limit: Double, timeout: js.UndefOr[Double] = js.undefined): Limit = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
}

