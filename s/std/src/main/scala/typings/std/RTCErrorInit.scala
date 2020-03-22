package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCErrorInit extends js.Object {
  var errorDetail: RTCErrorDetailType
  var httpRequestStatusCode: js.UndefOr[Double] = js.undefined
  var receivedAlert: js.UndefOr[Double] = js.undefined
  var sctpCauseCode: js.UndefOr[Double] = js.undefined
  var sdpLineNumber: js.UndefOr[Double] = js.undefined
  var sentAlert: js.UndefOr[Double] = js.undefined
}

object RTCErrorInit {
  @scala.inline
  def apply(
    errorDetail: RTCErrorDetailType,
    httpRequestStatusCode: Int | Double = null,
    receivedAlert: Int | Double = null,
    sctpCauseCode: Int | Double = null,
    sdpLineNumber: Int | Double = null,
    sentAlert: Int | Double = null
  ): RTCErrorInit = {
    val __obj = js.Dynamic.literal(errorDetail = errorDetail.asInstanceOf[js.Any])
    if (httpRequestStatusCode != null) __obj.updateDynamic("httpRequestStatusCode")(httpRequestStatusCode.asInstanceOf[js.Any])
    if (receivedAlert != null) __obj.updateDynamic("receivedAlert")(receivedAlert.asInstanceOf[js.Any])
    if (sctpCauseCode != null) __obj.updateDynamic("sctpCauseCode")(sctpCauseCode.asInstanceOf[js.Any])
    if (sdpLineNumber != null) __obj.updateDynamic("sdpLineNumber")(sdpLineNumber.asInstanceOf[js.Any])
    if (sentAlert != null) __obj.updateDynamic("sentAlert")(sentAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCErrorInit]
  }
}

