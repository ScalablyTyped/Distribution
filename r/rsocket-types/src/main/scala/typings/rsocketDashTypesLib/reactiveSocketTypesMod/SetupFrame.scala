package typings
package rsocketDashTypesLib.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupFrame extends Frame {
  var data: js.UndefOr[Encodable] = js.undefined
  var dataMimeType: java.lang.String
  var flags: scala.Double
  var keepAlive: scala.Double
  var lifetime: scala.Double
  var majorVersion: scala.Double
  var metadata: js.UndefOr[Encodable] = js.undefined
  var metadataMimeType: java.lang.String
  var minorVersion: scala.Double
  var resumeToken: js.UndefOr[Encodable] = js.undefined
  var streamId: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0`
  var `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x01`
}

object SetupFrame {
  @scala.inline
  def apply(
    dataMimeType: java.lang.String,
    flags: scala.Double,
    keepAlive: scala.Double,
    lifetime: scala.Double,
    majorVersion: scala.Double,
    metadataMimeType: java.lang.String,
    minorVersion: scala.Double,
    streamId: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0`,
    `type`: rsocketDashTypesLib.rsocketDashTypesLibNumbers.`0x01`,
    data: Encodable = null,
    metadata: Encodable = null,
    resumeToken: Encodable = null
  ): SetupFrame = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType, flags = flags, keepAlive = keepAlive, lifetime = lifetime, majorVersion = majorVersion, metadataMimeType = metadataMimeType, minorVersion = minorVersion, streamId = streamId)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetupFrame]
  }
}

