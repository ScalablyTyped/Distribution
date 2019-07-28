package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxCapacity extends js.Object {
  var maxCapacity: js.UndefOr[Double] = js.undefined
  var minCapacity: js.UndefOr[Double] = js.undefined
}

object Anon_MaxCapacity {
  @scala.inline
  def apply(maxCapacity: Int | Double = null, minCapacity: Int | Double = null): Anon_MaxCapacity = {
    val __obj = js.Dynamic.literal()
    if (maxCapacity != null) __obj.updateDynamic("maxCapacity")(maxCapacity.asInstanceOf[js.Any])
    if (minCapacity != null) __obj.updateDynamic("minCapacity")(minCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxCapacity]
  }
}

