package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEncoderEncodeIntoResult extends js.Object {
  var read: js.UndefOr[Double] = js.undefined
  var written: js.UndefOr[Double] = js.undefined
}

object TextEncoderEncodeIntoResult {
  @scala.inline
  def apply(read: js.UndefOr[Double] = js.undefined, written: js.UndefOr[Double] = js.undefined): TextEncoderEncodeIntoResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(read)) __obj.updateDynamic("read")(read.get.asInstanceOf[js.Any])
    if (!js.isUndefined(written)) __obj.updateDynamic("written")(written.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEncoderEncodeIntoResult]
  }
}

