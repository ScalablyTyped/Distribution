package typings.protooServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AcceptFn = js.Function1[/* data */ js.Any, scala.Unit]
  type ConnectionRequestAcceptFn = js.Function0[typings.protooServer.mod.WebSocketTransport]
  type ConnectionRequestCb = js.Function3[
    /* info */ typings.protooServer.mod.ConnectionRequestInfo, 
    /* accept */ typings.protooServer.mod.ConnectionRequestAcceptFn, 
    /* reject */ typings.protooServer.mod.ConnectionRequestRejectFn, 
    scala.Unit
  ]
  type ConnectionRequestRejectFn = (js.Function2[/* code */ scala.Double, /* reason */ java.lang.String, scala.Unit]) with (js.Function1[/* error */ typings.std.Error, scala.Unit])
  type EmptyCb = js.Function0[scala.Unit]
  type NotificationCb = js.Function1[/* notification */ typings.protooServer.mod.ProtooNotification, scala.Unit]
  type RejectFn = (js.Function1[/* errorCode */ js.UndefOr[typings.std.Error], scala.Unit]) with (js.Function2[
    /* errorCode */ scala.Double, 
    /* errorReason */ typings.std.Error | java.lang.String, 
    scala.Unit
  ])
  type RequestCb = js.Function3[
    /* request */ typings.protooServer.mod.ProtooRequest, 
    /* accept */ typings.protooServer.mod.AcceptFn, 
    /* reject */ typings.protooServer.mod.RejectFn, 
    scala.Unit
  ]
  type WebSocketServerOptions = typings.std.Pick[
    typings.websocket.mod.IServerConfig, 
    typings.std.Exclude[
      typings.protooServer.protooServerStrings.httpServer | typings.protooServer.protooServerStrings.maxReceivedFrameSize | typings.protooServer.protooServerStrings.maxReceivedMessageSize | typings.protooServer.protooServerStrings.keepalive | typings.protooServer.protooServerStrings.keepaliveInterval | typings.protooServer.protooServerStrings.dropConnectionOnKeepaliveTimeout | typings.protooServer.protooServerStrings.keepaliveGracePeriod | typings.protooServer.protooServerStrings.useNativeKeepalive | typings.protooServer.protooServerStrings.autoAcceptConnections | typings.protooServer.protooServerStrings.ignoreXForwardedFor | typings.protooServer.protooServerStrings.disableNagleAlgorithm, 
      typings.protooServer.protooServerStrings.httpServer
    ]
  ]
}
