package typings.stompjs.mod

import typings.std.WebSocket
import typings.stompjs.anon.Host
import typings.stompjs.anon.Incoming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stompjs", "Client")
@js.native
class Client_ () extends js.Object {
  
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
  def connect(headers: Host, connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _]): js.Any = js.native
  def connect(
    headers: Host,
    connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _],
    errorCallback: js.Function1[/* error */ Frame | String, _]
  ): js.Any = js.native
  def connect(login: String, passcode: String, connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _]): js.Any = js.native
  def connect(
    login: String,
    passcode: String,
    connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _],
    errorCallback: js.UndefOr[scala.Nothing],
    host: String
  ): js.Any = js.native
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
  
  var connected: Boolean = js.native
  
  var counter: Double = js.native
  
  def debug(args: String*): js.Any = js.native
  
  def disconnect(disconnectCallback: js.Function0[_]): js.Any = js.native
  def disconnect(disconnectCallback: js.Function0[_], headers: js.Object): js.Any = js.native
  
  var heartbeat: Incoming = js.native
  
  var maxWebSocketFrameSize: Double = js.native
  
  def nack(messageID: String, subscription: String): js.Any = js.native
  def nack(messageID: String, subscription: String, headers: js.Object): js.Any = js.native
  
  def send(destination: String): js.Any = js.native
  def send(destination: String, headers: js.UndefOr[scala.Nothing], body: String): js.Any = js.native
  def send(destination: String, headers: js.Object): js.Any = js.native
  def send(destination: String, headers: js.Object, body: String): js.Any = js.native
  
  def subscribe(destination: String): Subscription = js.native
  def subscribe(destination: String, callback: js.UndefOr[scala.Nothing], headers: js.Object): Subscription = js.native
  def subscribe(destination: String, callback: js.Function1[/* message */ Message, _]): Subscription = js.native
  def subscribe(destination: String, callback: js.Function1[/* message */ Message, _], headers: js.Object): Subscription = js.native
  
  def unsubscribe(id: String): Unit = js.native
  
  var ws: WebSocket = js.native
}
