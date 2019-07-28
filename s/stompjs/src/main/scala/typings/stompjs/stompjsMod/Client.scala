package typings.stompjs.stompjsMod

import typings.std.WebSocket
import typings.stompjs.Anon_Host
import typings.stompjs.Anon_Incoming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompjs", "Client")
@js.native
class Client () extends js.Object {
  var connected: Boolean = js.native
  var counter: Double = js.native
  var heartbeat: Anon_Incoming = js.native
  var maxWebSocketFrameSize: Double = js.native
  var ws: WebSocket = js.native
  def abort(transaction: String): js.Any = js.native
  def ack(messageID: String, subscription: String): js.Any = js.native
  def ack(messageID: String, subscription: String, headers: js.Object): js.Any = js.native
  def begin(transaction: String): js.Any = js.native
  def commit(transaction: String): js.Any = js.native
  def connect(headers: js.Object, connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _]): js.Any = js.native
  def connect(
    headers: js.Object,
    connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _],
    errorCallback: js.Function1[/* error */ Frame | String, _]
  ): js.Any = js.native
  def connect(headers: Anon_Host, connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _]): js.Any = js.native
  def connect(
    headers: Anon_Host,
    connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _],
    errorCallback: js.Function1[/* error */ Frame | String, _]
  ): js.Any = js.native
  def connect(login: String, passcode: String, connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _]): js.Any = js.native
  def connect(
    login: String,
    passcode: String,
    connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _],
    errorCallback: js.Function1[/* error */ Frame | String, _]
  ): js.Any = js.native
  def connect(
    login: String,
    passcode: String,
    connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _],
    errorCallback: js.Function1[/* error */ Frame | String, _],
    host: String
  ): js.Any = js.native
  def debug(args: String*): js.Any = js.native
  def disconnect(disconnectCallback: js.Function0[_]): js.Any = js.native
  def disconnect(disconnectCallback: js.Function0[_], headers: js.Object): js.Any = js.native
  def nack(messageID: String, subscription: String): js.Any = js.native
  def nack(messageID: String, subscription: String, headers: js.Object): js.Any = js.native
  def send(destination: String): js.Any = js.native
  def send(destination: String, headers: js.Object): js.Any = js.native
  def send(destination: String, headers: js.Object, body: String): js.Any = js.native
  def subscribe(destination: String): Subscription = js.native
  def subscribe(destination: String, callback: js.Function1[/* message */ Message, _]): Subscription = js.native
  def subscribe(destination: String, callback: js.Function1[/* message */ Message, _], headers: js.Object): Subscription = js.native
  def unsubscribe(id: String): Unit = js.native
}

