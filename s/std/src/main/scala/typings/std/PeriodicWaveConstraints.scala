package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeriodicWaveConstraints extends js.Object {
  var disableNormalization: js.UndefOr[scala.Boolean] = js.undefined
}

object PeriodicWaveConstraints {
  @scala.inline
  def apply(disableNormalization: js.UndefOr[scala.Boolean] = js.undefined): PeriodicWaveConstraints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableNormalization)) __obj.updateDynamic("disableNormalization")(disableNormalization.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeriodicWaveConstraints]
  }
}

