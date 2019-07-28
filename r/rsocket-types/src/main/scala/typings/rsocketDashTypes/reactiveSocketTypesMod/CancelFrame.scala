package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x09`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelFrame extends Frame {
  var flags: Double
  var streamId: Double
  var `type`: `0x09`
}

object CancelFrame {
  @scala.inline
  def apply(flags: Double, streamId: Double, `type`: `0x09`): CancelFrame = {
    val __obj = js.Dynamic.literal(flags = flags, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CancelFrame]
  }
}

