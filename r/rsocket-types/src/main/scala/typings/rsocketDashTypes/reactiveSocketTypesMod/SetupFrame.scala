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
  var length: js.UndefOr[Double] = js.undefined
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
    length: Int | Double = null,
    metadata: Encodable = null,
    resumeToken: Encodable = null
  ): SetupFrame = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetupFrame]
  }
}

