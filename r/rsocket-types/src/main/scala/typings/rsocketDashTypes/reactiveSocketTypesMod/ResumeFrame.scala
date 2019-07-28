package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0`
import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x0d`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResumeFrame extends Frame {
  var clientPosition: Double
  var flags: Double
  var majorVersion: Double
  var minorVersion: Double
  var resumeToken: Encodable
  var serverPosition: Double
  var streamId: `0`
  var `type`: `0x0d`
}

object ResumeFrame {
  @scala.inline
  def apply(
    clientPosition: Double,
    flags: Double,
    majorVersion: Double,
    minorVersion: Double,
    resumeToken: Encodable,
    serverPosition: Double,
    streamId: `0`,
    `type`: `0x0d`
  ): ResumeFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition, flags = flags, majorVersion = majorVersion, minorVersion = minorVersion, resumeToken = resumeToken.asInstanceOf[js.Any], serverPosition = serverPosition, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ResumeFrame]
  }
}

