package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorFrame extends Frame {
  var code: scala.Double
  var flags: scala.Double
  var message: java.lang.String
  var streamId: scala.Double
  var `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x0B`
}

object ErrorFrame {
  @scala.inline
  def apply(
    code: scala.Double,
    flags: scala.Double,
    message: java.lang.String,
    streamId: scala.Double,
    `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x0B`
  ): ErrorFrame = {
    val __obj = js.Dynamic.literal(code = code, flags = flags, message = message, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ErrorFrame]
  }
}

