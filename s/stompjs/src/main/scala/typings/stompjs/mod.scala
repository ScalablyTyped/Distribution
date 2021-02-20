package typings.stompjs

import typings.node.NodeJS.Timer
import typings.std.WebSocket
import typings.stompjs.anon.Host
import typings.stompjs.anon.Incoming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stompjs", "Client")
  @js.native
  class Client_ () extends StObject {
    
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
  
  @JSImport("stompjs", "Frame")
  @js.native
  class Frame protected () extends StObject {
    def this(command: String) = this()
    def this(command: String, headers: js.Object) = this()
    def this(command: String, headers: js.UndefOr[scala.Nothing], body: String) = this()
    def this(command: String, headers: js.Object, body: String) = this()
    
    var body: String = js.native
    
    var command: String = js.native
  }
  /* static members */
  object Frame {
    
    @JSImport("stompjs", "Frame.marshall")
    @js.native
    def marshall(command: String): js.Any = js.native
    @JSImport("stompjs", "Frame.marshall")
    @js.native
    def marshall(command: String, headers: js.UndefOr[scala.Nothing], body: String): js.Any = js.native
    @JSImport("stompjs", "Frame.marshall")
    @js.native
    def marshall(command: String, headers: js.Object): js.Any = js.native
    @JSImport("stompjs", "Frame.marshall")
    @js.native
    def marshall(command: String, headers: js.Object, body: String): js.Any = js.native
    
    @JSImport("stompjs", "Frame.sizeOfUTF8")
    @js.native
    def sizeOfUTF8(s: String): Double = js.native
    
    @JSImport("stompjs", "Frame.unmarshall")
    @js.native
    def unmarshall(datas: js.Any): js.Any = js.native
  }
  
  object VERSIONS {
    
    @JSImport("stompjs", "VERSIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("stompjs", "VERSIONS.V1_0")
    @js.native
    def V1_0: String = js.native
    @scala.inline
    def V1_0_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("V1_0")(x.asInstanceOf[js.Any])
    
    @JSImport("stompjs", "VERSIONS.V1_1")
    @js.native
    def V1_1: String = js.native
    @scala.inline
    def V1_1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("V1_1")(x.asInstanceOf[js.Any])
    
    @JSImport("stompjs", "VERSIONS.V1_2")
    @js.native
    def V1_2: String = js.native
    @scala.inline
    def V1_2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("V1_2")(x.asInstanceOf[js.Any])
    
    @JSImport("stompjs", "VERSIONS.supportedVersions")
    @js.native
    def supportedVersions(): js.Array[String] = js.native
  }
  
  @JSImport("stompjs", "clearInterval")
  @js.native
  def clearInterval(id: Timer): Unit = js.native
  
  @JSImport("stompjs", "client")
  @js.native
  def client(url: String): Client_ = js.native
  @JSImport("stompjs", "client")
  @js.native
  def client(url: String, protocols: String): Client_ = js.native
  @JSImport("stompjs", "client")
  @js.native
  def client(url: String, protocols: js.Array[String]): Client_ = js.native
  
  @JSImport("stompjs", "over")
  @js.native
  def over(ws: WebSocket): Client_ = js.native
  
  @JSImport("stompjs", "overTCP")
  @js.native
  def overTCP(host: String, port: Double): Client_ = js.native
  
  @JSImport("stompjs", "overWS")
  @js.native
  def overWS(url: String): Client_ = js.native
  
  @JSImport("stompjs", "setInterval")
  @js.native
  def setInterval(interval: Double, f: js.Function1[/* repeated */ js.Any, Unit]): Timer = js.native
  
  @js.native
  trait Message extends Frame {
    
    def ack(): js.Any = js.native
    def ack(headers: js.Object): js.Any = js.native
    
    def nack(): js.Any = js.native
    def nack(headers: js.Object): js.Any = js.native
  }
  
  @js.native
  trait Subscription extends StObject {
    
    var id: String = js.native
    
    def unsubscribe(): Unit = js.native
  }
  object Subscription {
    
    @scala.inline
    def apply(id: String, unsubscribe: () => Unit): Subscription = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsubscribe(value: () => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction0(value))
    }
  }
}
