package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x08`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestNFrame extends Frame {
  var flags: Double
  var requestN: Double
  var streamId: Double
  var `type`: `0x08`
}

object RequestNFrame {
  @scala.inline
  def apply(flags: Double, requestN: Double, streamId: Double, `type`: `0x08`): RequestNFrame = {
    val __obj = js.Dynamic.literal(flags = flags, requestN = requestN, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RequestNFrame]
  }
}

