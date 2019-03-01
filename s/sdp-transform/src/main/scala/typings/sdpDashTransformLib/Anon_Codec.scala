package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Codec extends js.Object {
  var codec: java.lang.String
  var encoding: js.UndefOr[scala.Double] = js.undefined
  var payload: scala.Double
  var rate: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Codec {
  @scala.inline
  def apply(
    codec: java.lang.String,
    payload: scala.Double,
    encoding: scala.Int | scala.Double = null,
    rate: scala.Int | scala.Double = null
  ): Anon_Codec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codec")(codec)
    __obj.updateDynamic("payload")(payload)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Codec]
  }
}

