package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Codec extends js.Object {
  var codec: String
  var encoding: js.UndefOr[Double] = js.undefined
  var payload: Double
  var rate: js.UndefOr[Double] = js.undefined
}

object Codec {
  @scala.inline
  def apply(
    codec: String,
    payload: Double,
    encoding: js.UndefOr[Double] = js.undefined,
    rate: js.UndefOr[Double] = js.undefined
  ): Codec = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codec]
  }
}

