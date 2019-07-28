package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0`
import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x0e`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResumeOkFrame extends Frame {
  var clientPosition: Double
  var flags: Double
  var streamId: `0`
  var `type`: `0x0e`
}

object ResumeOkFrame {
  @scala.inline
  def apply(clientPosition: Double, flags: Double, streamId: `0`, `type`: `0x0e`): ResumeOkFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition, flags = flags, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResumeOkFrame]
  }
}

