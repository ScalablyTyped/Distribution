package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResumeFrame extends Frame {
  var clientPosition: scala.Double
  var flags: scala.Double
  var majorVersion: scala.Double
  var minorVersion: scala.Double
  var resumeToken: Encodable
  var serverPosition: scala.Double
  var streamId: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0`
  var `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x0d`
}

object ResumeFrame {
  @scala.inline
  def apply(
    clientPosition: scala.Double,
    flags: scala.Double,
    majorVersion: scala.Double,
    minorVersion: scala.Double,
    resumeToken: Encodable,
    serverPosition: scala.Double,
    streamId: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0`,
    `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x0d`
  ): ResumeFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition, flags = flags, majorVersion = majorVersion, minorVersion = minorVersion, resumeToken = resumeToken.asInstanceOf[js.Any], serverPosition = serverPosition, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResumeFrame]
  }
}

