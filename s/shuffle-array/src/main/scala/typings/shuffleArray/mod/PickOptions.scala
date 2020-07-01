package typings.shuffleArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * picks - Specifies how many random elements you want to pick. By default it picks 1.
  * rng - Specifies a custom random number generator.
  */
trait PickOptions extends js.Object {
  var picks: js.UndefOr[Double] = js.undefined
  var rng: js.UndefOr[js.Function0[Double]] = js.undefined
}

object PickOptions {
  @scala.inline
  def apply(picks: js.UndefOr[Double] = js.undefined, rng: () => Double = null): PickOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(picks)) __obj.updateDynamic("picks")(picks.get.asInstanceOf[js.Any])
    if (rng != null) __obj.updateDynamic("rng")(js.Any.fromFunction0(rng))
    __obj.asInstanceOf[PickOptions]
  }
}

