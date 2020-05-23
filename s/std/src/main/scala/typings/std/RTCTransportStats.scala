package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCTransportStats extends RTCStats {
  var activeConnection: js.UndefOr[scala.Boolean] = js.undefined
  var bytesReceived: js.UndefOr[Double] = js.undefined
  var bytesSent: js.UndefOr[Double] = js.undefined
  var localCertificateId: js.UndefOr[java.lang.String] = js.undefined
  var remoteCertificateId: js.UndefOr[java.lang.String] = js.undefined
  var rtcpTransportStatsId: js.UndefOr[java.lang.String] = js.undefined
  var selectedCandidatePairId: js.UndefOr[java.lang.String] = js.undefined
}

object RTCTransportStats {
  @scala.inline
  def apply(
    id: java.lang.String,
    timestamp: Double,
    `type`: RTCStatsType,
    activeConnection: js.UndefOr[scala.Boolean] = js.undefined,
    bytesReceived: js.UndefOr[Double] = js.undefined,
    bytesSent: js.UndefOr[Double] = js.undefined,
    localCertificateId: java.lang.String = null,
    remoteCertificateId: java.lang.String = null,
    rtcpTransportStatsId: java.lang.String = null,
    selectedCandidatePairId: java.lang.String = null
  ): RTCTransportStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(activeConnection)) __obj.updateDynamic("activeConnection")(activeConnection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesReceived)) __obj.updateDynamic("bytesReceived")(bytesReceived.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bytesSent)) __obj.updateDynamic("bytesSent")(bytesSent.get.asInstanceOf[js.Any])
    if (localCertificateId != null) __obj.updateDynamic("localCertificateId")(localCertificateId.asInstanceOf[js.Any])
    if (remoteCertificateId != null) __obj.updateDynamic("remoteCertificateId")(remoteCertificateId.asInstanceOf[js.Any])
    if (rtcpTransportStatsId != null) __obj.updateDynamic("rtcpTransportStatsId")(rtcpTransportStatsId.asInstanceOf[js.Any])
    if (selectedCandidatePairId != null) __obj.updateDynamic("selectedCandidatePairId")(selectedCandidatePairId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTransportStats]
  }
}

