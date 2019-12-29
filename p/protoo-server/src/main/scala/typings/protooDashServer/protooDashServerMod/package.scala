package typings.protooDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protooDashServerMod {
  import typings.protooDashServer.protooDashServerStrings.autoAcceptConnections
  import typings.protooDashServer.protooDashServerStrings.disableNagleAlgorithm
  import typings.protooDashServer.protooDashServerStrings.dropConnectionOnKeepaliveTimeout
  import typings.protooDashServer.protooDashServerStrings.httpServer
  import typings.protooDashServer.protooDashServerStrings.ignoreXForwardedFor
  import typings.protooDashServer.protooDashServerStrings.keepalive
  import typings.protooDashServer.protooDashServerStrings.keepaliveGracePeriod
  import typings.protooDashServer.protooDashServerStrings.keepaliveInterval
  import typings.protooDashServer.protooDashServerStrings.maxReceivedFrameSize
  import typings.protooDashServer.protooDashServerStrings.maxReceivedMessageSize
  import typings.protooDashServer.protooDashServerStrings.useNativeKeepalive
  import typings.std.Error
  import typings.std.Exclude
  import typings.std.Pick
  import typings.websocket.websocketMod.IServerConfig

  type AcceptFn = js.Function1[/* data */ js.Any, Unit]
  type ConnectionRequestAcceptFn = js.Function0[WebSocketTransport]
  type ConnectionRequestCb = js.Function3[
    /* info */ ConnectionRequestInfo, 
    /* accept */ ConnectionRequestAcceptFn, 
    /* reject */ ConnectionRequestRejectFn, 
    Unit
  ]
  type ConnectionRequestRejectFn = (js.Function2[/* code */ Double, /* reason */ String, Unit]) with (js.Function1[/* error */ Error, Unit])
  type EmptyCb = js.Function0[Unit]
  type NotificationCb = js.Function1[/* notification */ ProtooNotification, Unit]
  type RejectFn = (js.Function1[/* errorCode */ js.UndefOr[Error], Unit]) with (js.Function2[/* errorCode */ Double, /* errorReason */ Error | String, Unit])
  type RequestCb = js.Function3[/* request */ ProtooRequest, /* accept */ AcceptFn, /* reject */ RejectFn, Unit]
  type WebSocketServerOptions = Pick[
    IServerConfig, 
    Exclude[
      httpServer | maxReceivedFrameSize | maxReceivedMessageSize | keepalive | keepaliveInterval | dropConnectionOnKeepaliveTimeout | keepaliveGracePeriod | useNativeKeepalive | autoAcceptConnections | ignoreXForwardedFor | disableNagleAlgorithm, 
      httpServer
    ]
  ]
}
