package typings
package shuffleDashArrayLib.shuffleDashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * picks - Specifies how many random elements you want to pick. By default it picks 1.
  * rng - Specifies a custom random number generator.
  */
trait PickOption extends js.Object {
  var picks: js.UndefOr[scala.Double] = js.undefined
  var rng: js.UndefOr[js.Function0[scala.Double]] = js.undefined
}

object PickOption {
  @scala.inline
  def apply(picks: scala.Int | scala.Double = null, rng: () => scala.Double = null): PickOption = {
    val __obj = js.Dynamic.literal()
    if (picks != null) __obj.updateDynamic("picks")(picks.asInstanceOf[js.Any])
    if (rng != null) __obj.updateDynamic("rng")(js.Any.fromFunction0(rng))
    __obj.asInstanceOf[PickOption]
  }
}

