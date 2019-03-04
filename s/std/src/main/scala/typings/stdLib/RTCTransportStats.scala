package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCTransportStats extends RTCStats {
  var activeConnection: js.UndefOr[scala.Boolean] = js.undefined
  var bytesReceived: js.UndefOr[scala.Double] = js.undefined
  var bytesSent: js.UndefOr[scala.Double] = js.undefined
  var localCertificateId: js.UndefOr[java.lang.String] = js.undefined
  var remoteCertificateId: js.UndefOr[java.lang.String] = js.undefined
  var rtcpTransportStatsId: js.UndefOr[java.lang.String] = js.undefined
  var selectedCandidatePairId: js.UndefOr[java.lang.String] = js.undefined
}

object RTCTransportStats {
  @scala.inline
  def apply(
    id: java.lang.String,
    timestamp: scala.Double,
    `type`: RTCStatsType,
    activeConnection: js.UndefOr[scala.Boolean] = js.undefined,
    bytesReceived: scala.Int | scala.Double = null,
    bytesSent: scala.Int | scala.Double = null,
    localCertificateId: java.lang.String = null,
    remoteCertificateId: java.lang.String = null,
    rtcpTransportStatsId: java.lang.String = null,
    selectedCandidatePairId: java.lang.String = null
  ): RTCTransportStats = {
    val __obj = js.Dynamic.literal(id = id, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(activeConnection)) __obj.updateDynamic("activeConnection")(activeConnection)
    if (bytesReceived != null) __obj.updateDynamic("bytesReceived")(bytesReceived.asInstanceOf[js.Any])
    if (bytesSent != null) __obj.updateDynamic("bytesSent")(bytesSent.asInstanceOf[js.Any])
    if (localCertificateId != null) __obj.updateDynamic("localCertificateId")(localCertificateId)
    if (remoteCertificateId != null) __obj.updateDynamic("remoteCertificateId")(remoteCertificateId)
    if (rtcpTransportStatsId != null) __obj.updateDynamic("rtcpTransportStatsId")(rtcpTransportStatsId)
    if (selectedCandidatePairId != null) __obj.updateDynamic("selectedCandidatePairId")(selectedCandidatePairId)
    __obj.asInstanceOf[RTCTransportStats]
  }
}

