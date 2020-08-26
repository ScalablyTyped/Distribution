package typings.signalr.SignalR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resources extends js.Object {
  var errorDuringStartRequest: String = js.native
  var errorOnNegotiate: String = js.native
  var errorParsingNegotiateResponse: String = js.native
  var errorParsingStartResponse: String = js.native
  var eventSourceError: String = js.native
  var eventSourceFailedToConnect: String = js.native
  var invalidStartResponse: String = js.native
  var longPollFailed: String = js.native
  var noConnectionTransport: String = js.native
  var noTransportOnInit: String = js.native
  var nojQuery: String = js.native
  var parseFailed: String = js.native
  var pingServerFailed: String = js.native
  var pingServerFailedInvalidResponse: String = js.native
  var pingServerFailedParse: String = js.native
  var pingServerFailedStatusCode: String = js.native
  var protocolIncompatible: String = js.native
  var reconnectTimeout: String = js.native
  var reconnectWindowTimeout: String = js.native
  var sendFailed: String = js.native
  var stoppedDuringStartRequest: String = js.native
  var stoppedWhileLoading: String = js.native
  var stoppedWhileNegotiating: String = js.native
  var webSocketClosed: String = js.native
  var webSocketsInvalidState: String = js.native
}

object Resources {
  @scala.inline
  def apply(
    errorDuringStartRequest: String,
    errorOnNegotiate: String,
    errorParsingNegotiateResponse: String,
    errorParsingStartResponse: String,
    eventSourceError: String,
    eventSourceFailedToConnect: String,
    invalidStartResponse: String,
    longPollFailed: String,
    noConnectionTransport: String,
    noTransportOnInit: String,
    nojQuery: String,
    parseFailed: String,
    pingServerFailed: String,
    pingServerFailedInvalidResponse: String,
    pingServerFailedParse: String,
    pingServerFailedStatusCode: String,
    protocolIncompatible: String,
    reconnectTimeout: String,
    reconnectWindowTimeout: String,
    sendFailed: String,
    stoppedDuringStartRequest: String,
    stoppedWhileLoading: String,
    stoppedWhileNegotiating: String,
    webSocketClosed: String,
    webSocketsInvalidState: String
  ): Resources = {
    val __obj = js.Dynamic.literal(errorDuringStartRequest = errorDuringStartRequest.asInstanceOf[js.Any], errorOnNegotiate = errorOnNegotiate.asInstanceOf[js.Any], errorParsingNegotiateResponse = errorParsingNegotiateResponse.asInstanceOf[js.Any], errorParsingStartResponse = errorParsingStartResponse.asInstanceOf[js.Any], eventSourceError = eventSourceError.asInstanceOf[js.Any], eventSourceFailedToConnect = eventSourceFailedToConnect.asInstanceOf[js.Any], invalidStartResponse = invalidStartResponse.asInstanceOf[js.Any], longPollFailed = longPollFailed.asInstanceOf[js.Any], noConnectionTransport = noConnectionTransport.asInstanceOf[js.Any], noTransportOnInit = noTransportOnInit.asInstanceOf[js.Any], nojQuery = nojQuery.asInstanceOf[js.Any], parseFailed = parseFailed.asInstanceOf[js.Any], pingServerFailed = pingServerFailed.asInstanceOf[js.Any], pingServerFailedInvalidResponse = pingServerFailedInvalidResponse.asInstanceOf[js.Any], pingServerFailedParse = pingServerFailedParse.asInstanceOf[js.Any], pingServerFailedStatusCode = pingServerFailedStatusCode.asInstanceOf[js.Any], protocolIncompatible = protocolIncompatible.asInstanceOf[js.Any], reconnectTimeout = reconnectTimeout.asInstanceOf[js.Any], reconnectWindowTimeout = reconnectWindowTimeout.asInstanceOf[js.Any], sendFailed = sendFailed.asInstanceOf[js.Any], stoppedDuringStartRequest = stoppedDuringStartRequest.asInstanceOf[js.Any], stoppedWhileLoading = stoppedWhileLoading.asInstanceOf[js.Any], stoppedWhileNegotiating = stoppedWhileNegotiating.asInstanceOf[js.Any], webSocketClosed = webSocketClosed.asInstanceOf[js.Any], webSocketsInvalidState = webSocketsInvalidState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resources]
  }
  @scala.inline
  implicit class ResourcesOps[Self <: Resources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorDuringStartRequest(value: String): Self = this.set("errorDuringStartRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorOnNegotiate(value: String): Self = this.set("errorOnNegotiate", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorParsingNegotiateResponse(value: String): Self = this.set("errorParsingNegotiateResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorParsingStartResponse(value: String): Self = this.set("errorParsingStartResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventSourceError(value: String): Self = this.set("eventSourceError", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventSourceFailedToConnect(value: String): Self = this.set("eventSourceFailedToConnect", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidStartResponse(value: String): Self = this.set("invalidStartResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongPollFailed(value: String): Self = this.set("longPollFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoConnectionTransport(value: String): Self = this.set("noConnectionTransport", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoTransportOnInit(value: String): Self = this.set("noTransportOnInit", value.asInstanceOf[js.Any])
    @scala.inline
    def setNojQuery(value: String): Self = this.set("nojQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def setParseFailed(value: String): Self = this.set("parseFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPingServerFailed(value: String): Self = this.set("pingServerFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPingServerFailedInvalidResponse(value: String): Self = this.set("pingServerFailedInvalidResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def setPingServerFailedParse(value: String): Self = this.set("pingServerFailedParse", value.asInstanceOf[js.Any])
    @scala.inline
    def setPingServerFailedStatusCode(value: String): Self = this.set("pingServerFailedStatusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocolIncompatible(value: String): Self = this.set("protocolIncompatible", value.asInstanceOf[js.Any])
    @scala.inline
    def setReconnectTimeout(value: String): Self = this.set("reconnectTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setReconnectWindowTimeout(value: String): Self = this.set("reconnectWindowTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSendFailed(value: String): Self = this.set("sendFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoppedDuringStartRequest(value: String): Self = this.set("stoppedDuringStartRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoppedWhileLoading(value: String): Self = this.set("stoppedWhileLoading", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoppedWhileNegotiating(value: String): Self = this.set("stoppedWhileNegotiating", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebSocketClosed(value: String): Self = this.set("webSocketClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebSocketsInvalidState(value: String): Self = this.set("webSocketsInvalidState", value.asInstanceOf[js.Any])
  }
  
}

