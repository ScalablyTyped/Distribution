package typings.protooClient.mod

import typings.protooClient.protooClientStrings.close
import typings.protooClient.protooClientStrings.disconnected
import typings.protooClient.protooClientStrings.failed
import typings.protooClient.protooClientStrings.notification
import typings.protooClient.protooClientStrings.open
import typings.protooClient.protooClientStrings.request
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protoo-client", "Peer")
@js.native
class Peer protected () extends js.Object {
  def this(transport: WebSocketTransport) = this()
  val closed: Boolean = js.native
  val connected: Boolean = js.native
  var data: js.Any = js.native
  def close(): Unit = js.native
  def notify(method: String): js.Promise[_] = js.native
  def notify(method: String, data: js.Any): js.Promise[_] = js.native
  @JSName("on")
  def on_close(evt: close, handler: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_disconnected(evt: disconnected, handler: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_failed(evt: failed, handler: js.Function1[/* currentAttempt */ Double, _]): Unit = js.native
  @JSName("on")
  def on_notification(evt: notification, handler: js.Function1[/* notif */ ProtooNotification, _]): Unit = js.native
  @JSName("on")
  def on_open(evt: open, handler: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_request(
    evt: request,
    handler: js.Function3[
      /* request */ ProtooRequest, 
      /* accept */ js.Function1[/* data */ js.UndefOr[ProtooResponse], Unit], 
      /* reject */ js.Function2[/* error */ js.UndefOr[Error | Double], /* errorReason */ js.UndefOr[String], Unit], 
      _
    ]
  ): Unit = js.native
  def request(method: String): js.Promise[_] = js.native
  def request(method: String, data: js.Any): js.Promise[_] = js.native
}

