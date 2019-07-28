package typings.rsocketDashTypes.reactiveSocketTypesMod

import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0`
import typings.rsocketDashTypes.rsocketDashTypesNumbers.`0x01`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetupFrame extends Frame {
  var data: js.UndefOr[Encodable] = js.undefined
  var dataMimeType: String
  var flags: Double
  var keepAlive: Double
  var lifetime: Double
  var majorVersion: Double
  var metadata: js.UndefOr[Encodable] = js.undefined
  var metadataMimeType: String
  var minorVersion: Double
  var resumeToken: js.UndefOr[Encodable] = js.undefined
  var streamId: `0`
  var `type`: `0x01`
}

object SetupFrame {
  @scala.inline
  def apply(
    dataMimeType: String,
    flags: Double,
    keepAlive: Double,
    lifetime: Double,
    majorVersion: Double,
    metadataMimeType: String,
    minorVersion: Double,
    streamId: `0`,
    `type`: `0x01`,
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

