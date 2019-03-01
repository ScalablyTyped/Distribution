package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxCapacity extends js.Object {
  var maxCapacity: js.UndefOr[scala.Double] = js.undefined
  var minCapacity: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MaxCapacity {
  @scala.inline
  def apply(maxCapacity: scala.Int | scala.Double = null, minCapacity: scala.Int | scala.Double = null): Anon_MaxCapacity = {
    val __obj = js.Dynamic.literal()
    if (maxCapacity != null) __obj.updateDynamic("maxCapacity")(maxCapacity.asInstanceOf[js.Any])
    if (minCapacity != null) __obj.updateDynamic("minCapacity")(minCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxCapacity]
  }
}

