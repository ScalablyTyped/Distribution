package typings.rsocketCore

import typings.rsocketTypes.reactiveSocketTypesMod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataMimeType[D, M] extends js.Object {
  var dataMimeType: String
  var keepAlive: Double
  var lifetime: Double
  var metadataMimeType: String
  var payload: js.UndefOr[Payload[D, M]] = js.undefined
}

object AnonDataMimeType {
  @scala.inline
  def apply[D, M](
    dataMimeType: String,
    keepAlive: Double,
    lifetime: Double,
    metadataMimeType: String,
    payload: Payload[D, M] = null
  ): AnonDataMimeType[D, M] = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDataMimeType[D, M]]
  }
}

