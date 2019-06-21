package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResumeOkFrame extends Frame {
  var clientPosition: scala.Double
  var flags: scala.Double
  var streamId: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0`
  var `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x0e`
}

object ResumeOkFrame {
  @scala.inline
  def apply(
    clientPosition: scala.Double,
    flags: scala.Double,
    streamId: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0`,
    `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x0e`
  ): ResumeOkFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition, flags = flags, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResumeOkFrame]
  }
}

