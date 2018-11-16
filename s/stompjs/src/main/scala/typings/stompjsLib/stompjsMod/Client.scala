package typings
package stompjsLib.stompjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompjs", "Client")
@js.native
class Client () extends js.Object {
  var connected: scala.Boolean = js.native
  var counter: scala.Double = js.native
  var heartbeat: stompjsLib.Anon_Incoming = js.native
  var maxWebSocketFrameSize: scala.Double = js.native
  var ws: stdLib.WebSocket = js.native
  def abort(transaction: java.lang.String): js.Any = js.native
  def ack(messageID: java.lang.String, subscription: java.lang.String): js.Any = js.native
  def ack(messageID: java.lang.String, subscription: java.lang.String, headers: js.Object): js.Any = js.native
  def begin(transaction: java.lang.String): js.Any = js.native
  def commit(transaction: java.lang.String): js.Any = js.native
  def connect(headers: js.Object, connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _]): js.Any = js.native
  def connect(
    headers: js.Object,
    connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _],
    errorCallback: js.Function1[/* error */ Frame | java.lang.String, _]
  ): js.Any = js.native
  def connect(headers: stompjsLib.Anon_Passcode, connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _]): js.Any = js.native
  def connect(
    headers: stompjsLib.Anon_Passcode,
    connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _],
    errorCallback: js.Function1[/* error */ Frame | java.lang.String, _]
  ): js.Any = js.native
  def connect(
    login: java.lang.String,
    passcode: java.lang.String,
    connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _]
  ): js.Any = js.native
  def connect(
    login: java.lang.String,
    passcode: java.lang.String,
    connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _],
    errorCallback: js.Function1[/* error */ Frame | java.lang.String, _]
  ): js.Any = js.native
  def connect(
    login: java.lang.String,
    passcode: java.lang.String,
    connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], _],
    errorCallback: js.Function1[/* error */ Frame | java.lang.String, _],
    host: java.lang.String
  ): js.Any = js.native
  def debug(args: java.lang.String*): js.Any = js.native
  def disconnect(disconnectCallback: js.Function0[_]): js.Any = js.native
  def disconnect(disconnectCallback: js.Function0[_], headers: js.Object): js.Any = js.native
  def nack(messageID: java.lang.String, subscription: java.lang.String): js.Any = js.native
  def nack(messageID: java.lang.String, subscription: java.lang.String, headers: js.Object): js.Any = js.native
  def send(destination: java.lang.String): js.Any = js.native
  def send(destination: java.lang.String, headers: js.Object): js.Any = js.native
  def send(destination: java.lang.String, headers: js.Object, body: java.lang.String): js.Any = js.native
  def subscribe(destination: java.lang.String): Subscription = js.native
  def subscribe(destination: java.lang.String, callback: js.Function1[/* message */ Message, _]): Subscription = js.native
  def subscribe(
    destination: java.lang.String,
    callback: js.Function1[/* message */ Message, _],
    headers: js.Object
  ): Subscription = js.native
  def unsubscribe(id: java.lang.String): scala.Unit = js.native
}

