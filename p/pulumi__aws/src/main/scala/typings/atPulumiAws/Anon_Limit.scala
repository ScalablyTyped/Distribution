package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limit extends js.Object {
  var limit: Double
  var offset: js.UndefOr[Double] = js.undefined
  var period: String
}

object Anon_Limit {
  @scala.inline
  def apply(limit: Double, period: String, offset: Int | Double = null): Anon_Limit = {
    val __obj = js.Dynamic.literal(limit = limit, period = period)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Limit]
  }
}

