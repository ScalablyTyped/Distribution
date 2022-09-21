package typings.reactNativeCommunityCliServerApi

import typings.std.Record
import typings.ws.mod.Server
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Broadcast extends StObject {
    
    def broadcast(method: String): Unit = js.native
    def broadcast(method: String, params: Record[String, Any]): Unit = js.native
    
    var server: Server[WebSocket] = js.native
  }
  
  trait DebuggerProxyEndpoint extends StObject {
    
    var debuggerProxyEndpoint: IsDebuggerConnected
    
    var eventsSocketEndpoint: ReportEvent
    
    var messageSocketEndpoint: Broadcast
    
    var middleware: Any
    
    var websocketEndpoints: Debuggerproxy
  }
  object DebuggerProxyEndpoint {
    
    inline def apply(
      debuggerProxyEndpoint: IsDebuggerConnected,
      eventsSocketEndpoint: ReportEvent,
      messageSocketEndpoint: Broadcast,
      middleware: Any,
      websocketEndpoints: Debuggerproxy
    ): DebuggerProxyEndpoint = {
      val __obj = js.Dynamic.literal(debuggerProxyEndpoint = debuggerProxyEndpoint.asInstanceOf[js.Any], eventsSocketEndpoint = eventsSocketEndpoint.asInstanceOf[js.Any], messageSocketEndpoint = messageSocketEndpoint.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], websocketEndpoints = websocketEndpoints.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebuggerProxyEndpoint]
    }
    
    extension [Self <: DebuggerProxyEndpoint](x: Self) {
      
      inline def setDebuggerProxyEndpoint(value: IsDebuggerConnected): Self = StObject.set(x, "debuggerProxyEndpoint", value.asInstanceOf[js.Any])
      
      inline def setEventsSocketEndpoint(value: ReportEvent): Self = StObject.set(x, "eventsSocketEndpoint", value.asInstanceOf[js.Any])
      
      inline def setMessageSocketEndpoint(value: Broadcast): Self = StObject.set(x, "messageSocketEndpoint", value.asInstanceOf[js.Any])
      
      inline def setMiddleware(value: Any): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      inline def setWebsocketEndpoints(value: Debuggerproxy): Self = StObject.set(x, "websocketEndpoints", value.asInstanceOf[js.Any])
    }
  }
  
  trait Debuggerproxy extends StObject {
    
    @JSName("/debugger-proxy")
    var `Slashdebugger-proxy`: Server[WebSocket]
    
    @JSName("/events")
    var Slashevents: Server[WebSocket]
    
    @JSName("/message")
    var Slashmessage: Server[WebSocket]
  }
  object Debuggerproxy {
    
    inline def apply(
      `Slashdebugger-proxy`: Server[WebSocket],
      Slashevents: Server[WebSocket],
      Slashmessage: Server[WebSocket]
    ): Debuggerproxy = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("/debugger-proxy")(`Slashdebugger-proxy`.asInstanceOf[js.Any])
      __obj.updateDynamic("/events")(Slashevents.asInstanceOf[js.Any])
      __obj.updateDynamic("/message")(Slashmessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Debuggerproxy]
    }
    
    extension [Self <: Debuggerproxy](x: Self) {
      
      inline def `setSlashdebugger-proxy`(value: Server[WebSocket]): Self = StObject.set(x, "/debugger-proxy", value.asInstanceOf[js.Any])
      
      inline def setSlashevents(value: Server[WebSocket]): Self = StObject.set(x, "/events", value.asInstanceOf[js.Any])
      
      inline def setSlashmessage(value: Server[WebSocket]): Self = StObject.set(x, "/message", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsDebuggerConnected extends StObject {
    
    def isDebuggerConnected(): Boolean
    
    var server: Server[WebSocket]
  }
  object IsDebuggerConnected {
    
    inline def apply(isDebuggerConnected: () => Boolean, server: Server[WebSocket]): IsDebuggerConnected = {
      val __obj = js.Dynamic.literal(isDebuggerConnected = js.Any.fromFunction0(isDebuggerConnected), server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDebuggerConnected]
    }
    
    extension [Self <: IsDebuggerConnected](x: Self) {
      
      inline def setIsDebuggerConnected(value: () => Boolean): Self = StObject.set(x, "isDebuggerConnected", js.Any.fromFunction0(value))
      
      inline def setServer(value: Server[WebSocket]): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  trait RawBody extends StObject {
    
    var rawBody: String
  }
  object RawBody {
    
    inline def apply(rawBody: String): RawBody = {
      val __obj = js.Dynamic.literal(rawBody = rawBody.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawBody]
    }
    
    extension [Self <: RawBody](x: Self) {
      
      inline def setRawBody(value: String): Self = StObject.set(x, "rawBody", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReportEvent extends StObject {
    
    def reportEvent(event: Any): Unit
    
    var server: Server[WebSocket]
  }
  object ReportEvent {
    
    inline def apply(reportEvent: Any => Unit, server: Server[WebSocket]): ReportEvent = {
      val __obj = js.Dynamic.literal(reportEvent = js.Any.fromFunction1(reportEvent), server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReportEvent]
    }
    
    extension [Self <: ReportEvent](x: Self) {
      
      inline def setReportEvent(value: Any => Unit): Self = StObject.set(x, "reportEvent", js.Any.fromFunction1(value))
      
      inline def setServer(value: Server[WebSocket]): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
