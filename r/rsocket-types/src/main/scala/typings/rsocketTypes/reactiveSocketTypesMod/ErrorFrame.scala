package typings.rsocketTypes.reactiveSocketTypesMod

import typings.rsocketTypes.rsocketTypesNumbers.`0x0b`
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
    length: js.UndefOr[Double] = js.undefined
  ): ErrorFrame = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorFrame]
  }
}

