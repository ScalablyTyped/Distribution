package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEventInit extends EventInit {
  var lengthComputable: js.UndefOr[scala.Boolean] = js.undefined
  var loaded: js.UndefOr[Double] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object ProgressEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    lengthComputable: js.UndefOr[scala.Boolean] = js.undefined,
    loaded: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined
  ): ProgressEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lengthComputable)) __obj.updateDynamic("lengthComputable")(lengthComputable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEventInit]
  }
}

