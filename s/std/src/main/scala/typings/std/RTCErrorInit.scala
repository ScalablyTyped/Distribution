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
    httpRequestStatusCode: js.UndefOr[Double] = js.undefined,
    receivedAlert: js.UndefOr[Double] = js.undefined,
    sctpCauseCode: js.UndefOr[Double] = js.undefined,
    sdpLineNumber: js.UndefOr[Double] = js.undefined,
    sentAlert: js.UndefOr[Double] = js.undefined
  ): RTCErrorInit = {
    val __obj = js.Dynamic.literal(errorDetail = errorDetail.asInstanceOf[js.Any])
    if (!js.isUndefined(httpRequestStatusCode)) __obj.updateDynamic("httpRequestStatusCode")(httpRequestStatusCode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(receivedAlert)) __obj.updateDynamic("receivedAlert")(receivedAlert.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sctpCauseCode)) __obj.updateDynamic("sctpCauseCode")(sctpCauseCode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sdpLineNumber)) __obj.updateDynamic("sdpLineNumber")(sdpLineNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sentAlert)) __obj.updateDynamic("sentAlert")(sentAlert.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCErrorInit]
  }
}

