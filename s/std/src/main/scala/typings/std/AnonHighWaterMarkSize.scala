package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHighWaterMarkSize extends js.Object {
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonHighWaterMarkSize {
  @scala.inline
  def apply(highWaterMark: Int | Double = null, size: js.UndefOr[scala.Nothing] = js.undefined): AnonHighWaterMarkSize = {
    val __obj = js.Dynamic.literal()
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHighWaterMarkSize]
  }
}

