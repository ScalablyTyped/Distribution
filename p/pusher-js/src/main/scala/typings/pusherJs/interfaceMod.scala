package typings.pusherJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.pusherJs.ajaxMod.Ajax
import typings.pusherJs.anon.Instantiable
import typings.pusherJs.authTransportsMod.AuthTransports
import typings.pusherJs.configMod.Config
import typings.pusherJs.httpFactoryMod.HTTPFactory
import typings.pusherJs.jsonpRequestMod.default
import typings.pusherJs.reachabilityMod.Reachability
import typings.pusherJs.socketMod.Socket
import typings.pusherJs.strategyMod.Strategy
import typings.pusherJs.strategyOptionsMod.StrategyOptions
import typings.pusherJs.timelineTransportMod.TimelineTransport
import typings.pusherJs.transportsTableMod.TransportsTable
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  trait Runtime extends StObject {
    
    var HTTPFactory: typings.pusherJs.httpFactoryMod.HTTPFactory
    
    var ScriptReceivers: js.UndefOr[Any] = js.undefined
    
    var TimelineTransport: typings.pusherJs.timelineTransportMod.TimelineTransport
    
    var Transports: TransportsTable
    
    def addUnloadListener(listener: js.Function): Unit
    
    var createJSONPRequest: js.UndefOr[js.Function2[/* url */ String, /* data */ Any, default]] = js.undefined
    
    var createScriptRequest: js.UndefOr[js.Function1[/* url */ String, Any]] = js.undefined
    
    def createSocketRequest(method: String, url: String): typings.pusherJs.httpRequestMod.default
    
    def createWebSocket(url: String): Socket
    
    def createXHR(): Ajax
    
    def getAuthorizers(): AuthTransports
    
    def getDefaultStrategy(config: Config, options: StrategyOptions, defineTransport: js.Function): Strategy
    
    var getDocument: js.UndefOr[js.Function0[Document]] = js.undefined
    
    def getLocalStorage(): Any
    
    def getNetwork(): Reachability
    
    def getProtocol(): String
    
    def getWebSocketAPI(): Instantiable1[/* url */ String, Socket]
    
    def getXHRAPI(): Instantiable0[Ajax]
    
    var isXDRSupported: js.UndefOr[js.Function1[/* useTLS */ js.UndefOr[Boolean], Boolean]] = js.undefined
    
    def isXHRSupported(): Boolean
    
    def randomInt(max: Double): Double
    
    def removeUnloadListener(listener: js.Function): Unit
    
    def setup(PusherClass: Instantiable): Unit
    
    var transportConnectionInitializer: js.Function
  }
  object Runtime {
    
    inline def apply(
      HTTPFactory: HTTPFactory,
      TimelineTransport: TimelineTransport,
      Transports: TransportsTable,
      addUnloadListener: js.Function => Unit,
      createSocketRequest: (String, String) => typings.pusherJs.httpRequestMod.default,
      createWebSocket: String => Socket,
      createXHR: () => Ajax,
      getAuthorizers: () => AuthTransports,
      getDefaultStrategy: (Config, StrategyOptions, js.Function) => Strategy,
      getLocalStorage: () => Any,
      getNetwork: () => Reachability,
      getProtocol: () => String,
      getWebSocketAPI: () => Instantiable1[/* url */ String, Socket],
      getXHRAPI: () => Instantiable0[Ajax],
      isXHRSupported: () => Boolean,
      randomInt: Double => Double,
      removeUnloadListener: js.Function => Unit,
      setup: Instantiable => Unit,
      transportConnectionInitializer: js.Function
    ): Runtime = {
      val __obj = js.Dynamic.literal(HTTPFactory = HTTPFactory.asInstanceOf[js.Any], TimelineTransport = TimelineTransport.asInstanceOf[js.Any], Transports = Transports.asInstanceOf[js.Any], addUnloadListener = js.Any.fromFunction1(addUnloadListener), createSocketRequest = js.Any.fromFunction2(createSocketRequest), createWebSocket = js.Any.fromFunction1(createWebSocket), createXHR = js.Any.fromFunction0(createXHR), getAuthorizers = js.Any.fromFunction0(getAuthorizers), getDefaultStrategy = js.Any.fromFunction3(getDefaultStrategy), getLocalStorage = js.Any.fromFunction0(getLocalStorage), getNetwork = js.Any.fromFunction0(getNetwork), getProtocol = js.Any.fromFunction0(getProtocol), getWebSocketAPI = js.Any.fromFunction0(getWebSocketAPI), getXHRAPI = js.Any.fromFunction0(getXHRAPI), isXHRSupported = js.Any.fromFunction0(isXHRSupported), randomInt = js.Any.fromFunction1(randomInt), removeUnloadListener = js.Any.fromFunction1(removeUnloadListener), setup = js.Any.fromFunction1(setup), transportConnectionInitializer = transportConnectionInitializer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Runtime]
    }
    
    extension [Self <: Runtime](x: Self) {
      
      inline def setAddUnloadListener(value: js.Function => Unit): Self = StObject.set(x, "addUnloadListener", js.Any.fromFunction1(value))
      
      inline def setCreateJSONPRequest(value: (/* url */ String, /* data */ Any) => default): Self = StObject.set(x, "createJSONPRequest", js.Any.fromFunction2(value))
      
      inline def setCreateJSONPRequestUndefined: Self = StObject.set(x, "createJSONPRequest", js.undefined)
      
      inline def setCreateScriptRequest(value: /* url */ String => Any): Self = StObject.set(x, "createScriptRequest", js.Any.fromFunction1(value))
      
      inline def setCreateScriptRequestUndefined: Self = StObject.set(x, "createScriptRequest", js.undefined)
      
      inline def setCreateSocketRequest(value: (String, String) => typings.pusherJs.httpRequestMod.default): Self = StObject.set(x, "createSocketRequest", js.Any.fromFunction2(value))
      
      inline def setCreateWebSocket(value: String => Socket): Self = StObject.set(x, "createWebSocket", js.Any.fromFunction1(value))
      
      inline def setCreateXHR(value: () => Ajax): Self = StObject.set(x, "createXHR", js.Any.fromFunction0(value))
      
      inline def setGetAuthorizers(value: () => AuthTransports): Self = StObject.set(x, "getAuthorizers", js.Any.fromFunction0(value))
      
      inline def setGetDefaultStrategy(value: (Config, StrategyOptions, js.Function) => Strategy): Self = StObject.set(x, "getDefaultStrategy", js.Any.fromFunction3(value))
      
      inline def setGetDocument(value: () => Document): Self = StObject.set(x, "getDocument", js.Any.fromFunction0(value))
      
      inline def setGetDocumentUndefined: Self = StObject.set(x, "getDocument", js.undefined)
      
      inline def setGetLocalStorage(value: () => Any): Self = StObject.set(x, "getLocalStorage", js.Any.fromFunction0(value))
      
      inline def setGetNetwork(value: () => Reachability): Self = StObject.set(x, "getNetwork", js.Any.fromFunction0(value))
      
      inline def setGetProtocol(value: () => String): Self = StObject.set(x, "getProtocol", js.Any.fromFunction0(value))
      
      inline def setGetWebSocketAPI(value: () => Instantiable1[/* url */ String, Socket]): Self = StObject.set(x, "getWebSocketAPI", js.Any.fromFunction0(value))
      
      inline def setGetXHRAPI(value: () => Instantiable0[Ajax]): Self = StObject.set(x, "getXHRAPI", js.Any.fromFunction0(value))
      
      inline def setHTTPFactory(value: HTTPFactory): Self = StObject.set(x, "HTTPFactory", value.asInstanceOf[js.Any])
      
      inline def setIsXDRSupported(value: /* useTLS */ js.UndefOr[Boolean] => Boolean): Self = StObject.set(x, "isXDRSupported", js.Any.fromFunction1(value))
      
      inline def setIsXDRSupportedUndefined: Self = StObject.set(x, "isXDRSupported", js.undefined)
      
      inline def setIsXHRSupported(value: () => Boolean): Self = StObject.set(x, "isXHRSupported", js.Any.fromFunction0(value))
      
      inline def setRandomInt(value: Double => Double): Self = StObject.set(x, "randomInt", js.Any.fromFunction1(value))
      
      inline def setRemoveUnloadListener(value: js.Function => Unit): Self = StObject.set(x, "removeUnloadListener", js.Any.fromFunction1(value))
      
      inline def setScriptReceivers(value: Any): Self = StObject.set(x, "ScriptReceivers", value.asInstanceOf[js.Any])
      
      inline def setScriptReceiversUndefined: Self = StObject.set(x, "ScriptReceivers", js.undefined)
      
      inline def setSetup(value: Instantiable => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction1(value))
      
      inline def setTimelineTransport(value: TimelineTransport): Self = StObject.set(x, "TimelineTransport", value.asInstanceOf[js.Any])
      
      inline def setTransportConnectionInitializer(value: js.Function): Self = StObject.set(x, "transportConnectionInitializer", value.asInstanceOf[js.Any])
      
      inline def setTransports(value: TransportsTable): Self = StObject.set(x, "Transports", value.asInstanceOf[js.Any])
    }
  }
}
