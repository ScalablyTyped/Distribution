package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x0b`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorFrame extends Frame {
  var code: Double
  var flags: Double
  var length: js.UndefOr[Double] = js.undefined
  var message: String
  var streamId: Double
  var `type`: `0x0b`
}

object ErrorFrame {
  @scala.inline
  def apply(
    code: Double,
    flags: Double,
    message: String,
    streamId: Double,
    `type`: `0x0b`,
    length: Int | Double = null
  ): ErrorFrame = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorFrame]
  }
}

