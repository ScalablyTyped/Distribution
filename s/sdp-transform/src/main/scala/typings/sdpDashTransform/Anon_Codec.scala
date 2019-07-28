package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Codec extends js.Object {
  var codec: String
  var encoding: js.UndefOr[Double] = js.undefined
  var payload: Double
  var rate: js.UndefOr[Double] = js.undefined
}

object Anon_Codec {
  @scala.inline
  def apply(codec: String, payload: Double, encoding: Int | Double = null, rate: Int | Double = null): Anon_Codec = {
    val __obj = js.Dynamic.literal(codec = codec, payload = payload)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Codec]
  }
}

