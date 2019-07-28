package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HighWaterMarkSize extends js.Object {
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_HighWaterMarkSize {
  @scala.inline
  def apply(highWaterMark: Int | Double = null, size: js.UndefOr[scala.Nothing] = js.undefined): Anon_HighWaterMarkSize = {
    val __obj = js.Dynamic.literal()
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_HighWaterMarkSize]
  }
}

