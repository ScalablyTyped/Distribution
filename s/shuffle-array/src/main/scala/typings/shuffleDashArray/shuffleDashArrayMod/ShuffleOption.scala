package typings.shuffleDashArray.shuffleDashArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShuffleOption extends js.Object {
  var copy: js.UndefOr[Boolean] = js.undefined
  var rng: js.UndefOr[js.Function0[Double]] = js.undefined
}

object ShuffleOption {
  @scala.inline
  def apply(copy: js.UndefOr[Boolean] = js.undefined, rng: () => Double = null): ShuffleOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(copy)) __obj.updateDynamic("copy")(copy)
    if (rng != null) __obj.updateDynamic("rng")(js.Any.fromFunction0(rng))
    __obj.asInstanceOf[ShuffleOption]
  }
}

