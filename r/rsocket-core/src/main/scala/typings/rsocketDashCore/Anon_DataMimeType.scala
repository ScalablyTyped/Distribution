package typings.rsocketDashCore

import typings.rsocketDashTypes.reactiveSocketTypesMod.Payload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataMimeType[D, M] extends js.Object {
  var dataMimeType: String
  var keepAlive: Double
  var lifetime: Double
  var metadataMimeType: String
  var payload: js.UndefOr[Payload[D, M]] = js.undefined
}

object Anon_DataMimeType {
  @scala.inline
  def apply[D, M](
    dataMimeType: String,
    keepAlive: Double,
    lifetime: Double,
    metadataMimeType: String,
    payload: Payload[D, M] = null
  ): Anon_DataMimeType[D, M] = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType, keepAlive = keepAlive, lifetime = lifetime, metadataMimeType = metadataMimeType)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[Anon_DataMimeType[D, M]]
  }
}

