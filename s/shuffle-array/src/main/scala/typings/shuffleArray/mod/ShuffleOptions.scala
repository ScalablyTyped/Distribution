package typings.shuffleArray.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShuffleOptions extends js.Object {
  var copy: js.UndefOr[Boolean] = js.undefined
  var rng: js.UndefOr[js.Function0[Double]] = js.undefined
}

object ShuffleOptions {
  @scala.inline
  def apply(copy: js.UndefOr[Boolean] = js.undefined, rng: () => Double = null): ShuffleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(copy)) __obj.updateDynamic("copy")(copy.get.asInstanceOf[js.Any])
    if (rng != null) __obj.updateDynamic("rng")(js.Any.fromFunction0(rng))
    __obj.asInstanceOf[ShuffleOptions]
  }
}

