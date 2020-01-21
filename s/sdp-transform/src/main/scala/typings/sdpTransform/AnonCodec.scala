package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodec extends js.Object {
  var codec: String
  var encoding: js.UndefOr[Double] = js.undefined
  var payload: Double
  var rate: js.UndefOr[Double] = js.undefined
}

object AnonCodec {
  @scala.inline
  def apply(codec: String, payload: Double, encoding: Int | Double = null, rate: Int | Double = null): AnonCodec = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodec]
  }
}

