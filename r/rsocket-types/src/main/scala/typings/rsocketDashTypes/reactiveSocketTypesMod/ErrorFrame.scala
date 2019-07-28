package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x0B`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorFrame extends Frame {
  var code: Double
  var flags: Double
  var message: String
  var streamId: Double
  var `type`: `0x0B`
}

object ErrorFrame {
  @scala.inline
  def apply(code: Double, flags: Double, message: String, streamId: Double, `type`: `0x0B`): ErrorFrame = {
    val __obj = js.Dynamic.literal(code = code, flags = flags, message = message, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ErrorFrame]
  }
}

