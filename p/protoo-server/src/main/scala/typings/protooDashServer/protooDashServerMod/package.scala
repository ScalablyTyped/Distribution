package typings.protooDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object protooDashServerMod {
  import typings.std.Error

  type AcceptFn = js.Function1[/* data */ js.Any, Unit]
  type ConnectionRequestAcceptFn = js.Function0[WebSocketTransport]
  type ConnectionRequestCb = js.Function3[
    /* info */ ConnectionRequestInfo, 
    /* accept */ ConnectionRequestAcceptFn, 
    /* reject */ ConnectionRequestRejectFn, 
    Unit
  ]
  type ConnectionRequestRejectFn = (js.Function2[/* code */ Double, /* reason */ String, Unit]) | (js.Function1[/* error */ Error, Unit])
  type EmptyCb = js.Function0[Unit]
  type NotificationCb = js.Function1[/* notification */ ProtooNotification, Unit]
  type RejectFn = (js.Function1[/* errorCode */ js.UndefOr[Error], Unit]) | (js.Function2[/* errorCode */ Double, /* errorReason */ Error | String, Unit])
  type RequestCb = js.Function3[/* request */ ProtooRequest, /* accept */ AcceptFn, /* reject */ RejectFn, Unit]
}
