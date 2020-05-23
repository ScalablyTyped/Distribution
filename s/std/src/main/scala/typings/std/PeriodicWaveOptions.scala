package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeriodicWaveOptions extends PeriodicWaveConstraints {
  var imag: js.UndefOr[js.Array[Double] | Float32Array] = js.undefined
  var real: js.UndefOr[js.Array[Double] | Float32Array] = js.undefined
}

object PeriodicWaveOptions {
  @scala.inline
  def apply(
    disableNormalization: js.UndefOr[scala.Boolean] = js.undefined,
    imag: js.Array[Double] | Float32Array = null,
    real: js.Array[Double] | Float32Array = null
  ): PeriodicWaveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableNormalization)) __obj.updateDynamic("disableNormalization")(disableNormalization.get.asInstanceOf[js.Any])
    if (imag != null) __obj.updateDynamic("imag")(imag.asInstanceOf[js.Any])
    if (real != null) __obj.updateDynamic("real")(real.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeriodicWaveOptions]
  }
}

