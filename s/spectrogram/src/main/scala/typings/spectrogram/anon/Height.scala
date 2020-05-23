package typings.spectrogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var height: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  var width: js.UndefOr[Double | js.Function0[Double]] = js.undefined
}

object Height {
  @scala.inline
  def apply(height: Double | js.Function0[Double] = null, width: Double | js.Function0[Double] = null): Height = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

