package typings.stompjs

import typings.node.NodeJS.Timer
import typings.std.WebSocket
import typings.stompjs.anon.Host
import typings.stompjs.anon.Incoming
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stompjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("stompjs", "Client")
  @js.native
  class Client_ () extends StObject {
    
    def abort(transaction: String): js.Any = js.native
    
    def ack(messageID: String, subscription: String): js.Any = js.native
    def ack(messageID: String, subscription: String, headers: js.Object): js.Any = js.native
    
    def begin(transaction: String): js.Any = js.native
    
    def commit(transaction: String): js.Any = js.native
    
    def connect(headers: js.Object, connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], js.Any]): js.Any = js.native
    def connect(
      headers: js.Object,
      connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], js.Any],
      errorCallback: js.Function1[/* error */ Frame | String, js.Any]
    ): js.Any = js.native
    def connect(headers: Host, connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], js.Any]): js.Any = js.native
    def connect(
      headers: Host,
      connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], js.Any],
      errorCallback: js.Function1[/* error */ Frame | String, js.Any]
    ): js.Any = js.native
    def connect(
      login: String,
      passcode: String,
      connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], js.Any]
    ): js.Any = js.native
    def connect(
      login: String,
      passcode: String,
      connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], js.Any],
      errorCallback: js.Function1[/* error */ Frame | String, js.Any]
    ): js.Any = js.native
    def connect(
      login: String,
      passcode: String,
      connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], js.Any],
      errorCallback: js.Function1[/* error */ Frame | String, js.Any],
      host: String
    ): js.Any = js.native
    def connect(
      login: String,
      passcode: String,
      connectCallback: js.Function1[/* frame */ js.UndefOr[Frame], js.Any],
      errorCallback: Unit,
      host: String
    ): js.Any = js.native
    
    var connected: Boolean = js.native
    
    var counter: Double = js.native
    
    def debug(args: String*): js.Any = js.native
    
    def disconnect(disconnectCallback: js.Function0[js.Any]): js.Any = js.native
    def disconnect(disconnectCallback: js.Function0[js.Any], headers: js.Object): js.Any = js.native
    
    var heartbeat: Incoming = js.native
    
    var maxWebSocketFrameSize: Double = js.native
    
    def nack(messageID: String, subscription: String): js.Any = js.native
    def nack(messageID: String, subscription: String, headers: js.Object): js.Any = js.native
    
    def send(destination: String): js.Any = js.native
    def send(destination: String, headers: js.Object): js.Any = js.native
    def send(destination: String, headers: js.Object, body: String): js.Any = js.native
    def send(destination: String, headers: Unit, body: String): js.Any = js.native
    
    def subscribe(destination: String): Subscription = js.native
    def subscribe(destination: String, callback: js.Function1[/* message */ Message, js.Any]): Subscription = js.native
    def subscribe(destination: String, callback: js.Function1[/* message */ Message, js.Any], headers: js.Object): Subscription = js.native
    def subscribe(destination: String, callback: Unit, headers: js.Object): Subscription = js.native
    
    def unsubscribe(id: String): Unit = js.native
    
    var ws: WebSocket = js.native
  }
  
  @JSImport("stompjs", "Frame")
  @js.native
  class Frame protected () extends StObject {
    def this(command: String) = this()
    def this(command: String, headers: js.Object) = this()
    def this(command: String, headers: js.Object, body: String) = this()
    def this(command: String, headers: Unit, body: String) = this()
    
    var body: String = js.native
    
    var command: String = js.native
  }
  /* static members */
  object Frame {
    
    @JSImport("stompjs", "Frame")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def marshall(command: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(command.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    @scala.inline
    def marshall(command: String, headers: js.Object): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(command.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def marshall(command: String, headers: js.Object, body: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(command.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    @scala.inline
    def marshall(command: String, headers: Unit, body: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("marshall")(command.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def sizeOfUTF8(s: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeOfUTF8")(s.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def unmarshall(datas: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unmarshall")(datas.asInstanceOf[js.Any]).asInstanceOf[js.Any]
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
    
    @scala.inline
    def supportedVersions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedVersions")().asInstanceOf[js.Array[String]]
  }
  
  @scala.inline
  def clearInterval(id: Timer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def client(url: String): Client_ = ^.asInstanceOf[js.Dynamic].applyDynamic("client")(url.asInstanceOf[js.Any]).asInstanceOf[Client_]
  @scala.inline
  def client(url: String, protocols: String): Client_ = (^.asInstanceOf[js.Dynamic].applyDynamic("client")(url.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[Client_]
  @scala.inline
  def client(url: String, protocols: js.Array[String]): Client_ = (^.asInstanceOf[js.Dynamic].applyDynamic("client")(url.asInstanceOf[js.Any], protocols.asInstanceOf[js.Any])).asInstanceOf[Client_]
  
  @scala.inline
  def over(ws: WebSocket): Client_ = ^.asInstanceOf[js.Dynamic].applyDynamic("over")(ws.asInstanceOf[js.Any]).asInstanceOf[Client_]
  
  @scala.inline
  def overTCP(host: String, port: Double): Client_ = (^.asInstanceOf[js.Dynamic].applyDynamic("overTCP")(host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Client_]
  
  @scala.inline
  def overWS(url: String): Client_ = ^.asInstanceOf[js.Dynamic].applyDynamic("overWS")(url.asInstanceOf[js.Any]).asInstanceOf[Client_]
  
  @scala.inline
  def setInterval(interval: Double, f: js.Function1[/* repeated */ js.Any, Unit]): Timer = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(interval.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Timer]
  
  @js.native
  trait Message extends Frame {
    
    def ack(): js.Any = js.native
    def ack(headers: js.Object): js.Any = js.native
    
    def nack(): js.Any = js.native
    def nack(headers: js.Object): js.Any = js.native
  }
  
  trait Subscription extends StObject {
    
    var id: String
    
    def unsubscribe(): Unit
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
