package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limit extends js.Object {
  var limit: scala.Double
  var offset: js.UndefOr[scala.Double] = js.undefined
  var period: java.lang.String
}

object Anon_Limit {
  @scala.inline
  def apply(limit: scala.Double, period: java.lang.String, offset: scala.Int | scala.Double = null): Anon_Limit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("limit")(limit)
    __obj.updateDynamic("period")(period)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Limit]
  }
}

