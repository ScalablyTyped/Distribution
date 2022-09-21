package typings.scBroker

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.expirymanager.mod.ExpiryManager
import typings.fleximap.mod.FlexiMap
import typings.fleximap.mod.KeyChain
import typings.ncom.mod.ComSocket
import typings.node.eventsMod.EventEmitter
import typings.scBroker.anon.Run
import typings.scBroker.scBrokerStrings.broker
import typings.scBroker.scBrokerStrings.masterMessage
import typings.scBroker.scBrokerStrings.message
import typings.scBroker.scBrokerStrings.publish
import typings.scBroker.scBrokerStrings.publishIn
import typings.scBroker.scBrokerStrings.subscribe
import typings.scBroker.scBrokerStrings.unsubscribe
import typings.scBroker.scBrokerStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scbrokerMod {
  
  @JSImport("sc-broker/scbroker", JSImport.Namespace)
  @js.native
  open class ^ () extends SCBroker {
    def this(options: Run) = this()
  }
  @JSImport("sc-broker/scbroker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(): SCBroker = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SCBroker]
  inline def create(options: Run): SCBroker = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[SCBroker]
  
  type PublishMiddleware = js.Function1[/* req */ PublishMiddlewareData, Unit]
  
  trait PublishMiddlewareData extends StObject {
    
    var channel: String
    
    var command: js.Object
    
    var socket: ComSocket
  }
  object PublishMiddlewareData {
    
    inline def apply(channel: String, command: js.Object, socket: ComSocket): PublishMiddlewareData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublishMiddlewareData]
    }
    
    extension [Self <: PublishMiddlewareData](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setCommand(value: js.Object): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: ComSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryFunction = js.Function3[
    /* dataMap */ FlexiMap, 
    /* dataExpirer */ ExpiryManager, 
    /* subscriptions */ Subscriptions, 
    Any
  ]
  
  @js.native
  trait SCBroker extends EventEmitter {
    
    val MIDDLEWARE_PUBLISH_IN: publishIn = js.native
    
    val MIDDLEWARE_SUBSCRIBE: subscribe = js.native
    
    @JSName("addMiddleware")
    def addMiddleware_publish(`type`: publish, middleware: PublishMiddleware): Unit = js.native
    @JSName("addMiddleware")
    def addMiddleware_subscribe(`type`: subscribe, middleware: SubscribeMiddleware): Unit = js.native
    
    var dataExpirer: ExpiryManager = js.native
    
    var dataMap: FlexiMap = js.native
    
    var debugPort: Double = js.native
    
    def exec(query: QueryFunction): Any = js.native
    def exec(query: QueryFunction, baseKey: KeyChain): Any = js.native
    
    var id: Double = js.native
    
    var instanceId: Double = js.native
    
    def on(event: subscribe | unsubscribe, listener: js.Function1[/* channel */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_masterMessage(
      event: masterMessage,
      listener: js.Function2[
          /* data */ Any, 
          /* respond */ js.Function2[/* err */ js.Error | Null, /* responseData */ Any, Unit], 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_message(
      event: message,
      listener: js.Function2[
          /* message */ Any, 
          /* respond */ js.Function2[/* err */ js.Error | Null, /* responseData */ Any, Unit], 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_publish(event: publish, listener: js.Function2[/* channel */ String, /* data */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_warning(event: warning, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    var options: SCBrokerOptions = js.native
    
    def publish(channel: String, message: Any): Unit = js.native
    
    @JSName("removeMiddleware")
    def removeMiddleware_publish(`type`: publish, middleware: PublishMiddleware): Unit = js.native
    @JSName("removeMiddleware")
    def removeMiddleware_subscribe(`type`: subscribe, middleware: SubscribeMiddleware): Unit = js.native
    
    def run(): Unit = js.native
    
    def sendToMaster(data: Any): Unit = js.native
    def sendToMaster(data: Any, callback: js.Function2[/* err */ js.Error | Null, /* responseData */ Any, Unit]): Unit = js.native
    
    var subscriptions: Subscriptions = js.native
    
    val `type`: broker = js.native
  }
  
  trait SCBrokerOptions
    extends StObject
       with /* additionalOptions */ StringDictionary[Any] {
    
    // An ID to associate with this specific instance of SC
    // this may be useful if you are running an SC app on multiple
    // hosts - You can access the instanceId from the Broker object
    // (inside brokerController) - If you don't provide an instanceId,
    // SC will generate a random one (UUID v4)
    var instanceId: js.UndefOr[String] = js.undefined
    
    // In milliseconds, the timeout for calling res(err, data) when
    // your sendToWorker, sendToBroker or sendToMaster (IPC) call
    // expects an ACK response from the other process
    // (when callback is provided)
    var ipcAckTimeout: js.UndefOr[Double] = js.undefined
    
    // A key which various SC processes will use to interact with
    // scBroker broker processes securely, defaults to a 256 bits
    // cryptographically random hex string
    var secretKey: js.UndefOr[String] = js.undefined
  }
  object SCBrokerOptions {
    
    inline def apply(): SCBrokerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SCBrokerOptions]
    }
    
    extension [Self <: SCBrokerOptions](x: Self) {
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setIpcAckTimeout(value: Double): Self = StObject.set(x, "ipcAckTimeout", value.asInstanceOf[js.Any])
      
      inline def setIpcAckTimeoutUndefined: Self = StObject.set(x, "ipcAckTimeout", js.undefined)
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
      
      inline def setSecretKeyUndefined: Self = StObject.set(x, "secretKey", js.undefined)
    }
  }
  
  type SubscribeMiddleware = js.Function1[/* req */ SubscribeMiddlewareData, Unit]
  
  trait SubscribeMiddlewareData extends StObject {
    
    var channel: String
    
    var socket: ComSocket
  }
  object SubscribeMiddlewareData {
    
    inline def apply(channel: String, socket: ComSocket): SubscribeMiddlewareData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeMiddlewareData]
    }
    
    extension [Self <: SubscribeMiddlewareData](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: ComSocket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  type Subscriptions = NumberDictionary[StringDictionary[ComSocket]]
}
