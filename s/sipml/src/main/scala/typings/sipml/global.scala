package typings.sipml

import typings.sipml.SIPml.Session.EventSubscriptionType
import typings.sipml.SIPml.Stack.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object SIPml {
    
    @JSGlobal("SIPml")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("SIPml.Event")
    @js.native
    class Event ()
      extends StObject
         with typings.sipml.SIPml.Event {
      
      /* CompleteClass */
      var description: String = js.native
      
      /* CompleteClass */
      override def getContent(): js.Object = js.native
      
      /* CompleteClass */
      override def getContentString(): String = js.native
      
      /* CompleteClass */
      override def getContentType(): js.Object = js.native
      
      /* CompleteClass */
      override def getSipResponseCode(): Double = js.native
      
      /* CompleteClass */
      var `type`: String = js.native
    }
    
    @JSGlobal("SIPml.EventTarget")
    @js.native
    class EventTarget[EventSubscriptionType /* <: String */, EventType /* <: typings.sipml.SIPml.Event */] ()
      extends StObject
         with typings.sipml.SIPml.EventTarget[EventSubscriptionType, EventType] {
      
      /* CompleteClass */
      override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[EventType, Unit]): Unit = js.native
      
      /* CompleteClass */
      override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
    }
    
    @JSGlobal("SIPml.Session")
    @js.native
    class Session ()
      extends StObject
         with typings.sipml.SIPml.Session {
      
      /* CompleteClass */
      override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[typings.sipml.SIPml.Session.Event, Unit]): Unit = js.native
      
      /* CompleteClass */
      override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
    }
    object Session {
      
      @JSGlobal("SIPml.Session.Call")
      @js.native
      class Call ()
        extends StObject
           with typings.sipml.SIPml.Session.Call {
        
        /* CompleteClass */
        override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[typings.sipml.SIPml.Session.Event, Unit]): Unit = js.native
        
        /* CompleteClass */
        override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
      }
      
      @JSGlobal("SIPml.Session.Event")
      @js.native
      class Event ()
        extends StObject
           with typings.sipml.SIPml.Session.Event {
        
        /* CompleteClass */
        var description: String = js.native
        
        /* CompleteClass */
        override def getContent(): js.Object = js.native
        
        /* CompleteClass */
        override def getContentString(): String = js.native
        
        /* CompleteClass */
        override def getContentType(): js.Object = js.native
        
        /* CompleteClass */
        override def getSipResponseCode(): Double = js.native
        
        /* CompleteClass */
        override def getTransferDestinationFriendlyName(): String = js.native
        
        /* CompleteClass */
        var session: typings.sipml.SIPml.Session = js.native
        
        /* CompleteClass */
        var `type`: String = js.native
      }
      
      @JSGlobal("SIPml.Session.Message")
      @js.native
      class Message ()
        extends StObject
           with typings.sipml.SIPml.Session.Message {
        
        /* CompleteClass */
        override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[typings.sipml.SIPml.Session.Event, Unit]): Unit = js.native
        
        /* CompleteClass */
        override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
      }
      
      @JSGlobal("SIPml.Session.Publish")
      @js.native
      class Publish ()
        extends StObject
           with typings.sipml.SIPml.Session.Publish {
        
        /* CompleteClass */
        override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[typings.sipml.SIPml.Session.Event, Unit]): Unit = js.native
        
        /* CompleteClass */
        override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
      }
      
      @JSGlobal("SIPml.Session.Registration")
      @js.native
      class Registration ()
        extends StObject
           with typings.sipml.SIPml.Session.Registration {
        
        /* CompleteClass */
        override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[typings.sipml.SIPml.Session.Event, Unit]): Unit = js.native
        
        /* CompleteClass */
        override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
      }
      
      @JSGlobal("SIPml.Session.Subscribe")
      @js.native
      class Subscribe ()
        extends StObject
           with typings.sipml.SIPml.Session.Subscribe {
        
        /* CompleteClass */
        override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[typings.sipml.SIPml.Session.Event, Unit]): Unit = js.native
        
        /* CompleteClass */
        override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
      }
    }
    
    @JSGlobal("SIPml.Stack")
    @js.native
    class Stack ()
      extends StObject
         with typings.sipml.SIPml.Stack {
      def this(configuration: Configuration) = this()
      
      /* CompleteClass */
      override def addEventListener(
        `type`: typings.sipml.SIPml.Stack.EventSubscriptionType,
        listener: js.Function1[typings.sipml.SIPml.Stack.Event, Unit]
      ): Unit = js.native
      
      /* CompleteClass */
      override def removeEventListener(`type`: typings.sipml.SIPml.Stack.EventSubscriptionType): Unit = js.native
    }
    object Stack {
      
      @JSGlobal("SIPml.Stack.Event")
      @js.native
      class Event ()
        extends StObject
           with typings.sipml.SIPml.Stack.Event {
        
        /* CompleteClass */
        var description: String = js.native
        
        /* CompleteClass */
        override def getContent(): js.Object = js.native
        
        /* CompleteClass */
        override def getContentString(): String = js.native
        
        /* CompleteClass */
        override def getContentType(): js.Object = js.native
        
        /* CompleteClass */
        override def getSipResponseCode(): Double = js.native
        
        /* CompleteClass */
        var newSession: typings.sipml.SIPml.Session = js.native
        
        /* CompleteClass */
        var `type`: String = js.native
      }
    }
    
    inline def getNavigatorFriendlyName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNavigatorFriendlyName")().asInstanceOf[String]
    
    inline def getNavigatorVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNavigatorVersion")().asInstanceOf[String]
    
    inline def getSystemFriendlyName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSystemFriendlyName")().asInstanceOf[String]
    
    inline def getWebRtc4AllVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getWebRtc4AllVersion")().asInstanceOf[String]
    
    inline def haveMediaStream(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("haveMediaStream")().asInstanceOf[Boolean]
    
    inline def init(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Boolean]
    inline def init(readyCallback: js.Function1[/* e */ js.Any, js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(readyCallback.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def init(
      readyCallback: js.Function1[/* e */ js.Any, js.Any],
      errorCallback: js.Function1[/* e */ js.Any, js.Any]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(readyCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def init(readyCallback: Unit, errorCallback: js.Function1[/* e */ js.Any, js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(readyCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isInitialized(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInitialized")().asInstanceOf[Boolean]
    
    inline def isNavigatorOutdated(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNavigatorOutdated")().asInstanceOf[Boolean]
    
    inline def isReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReady")().asInstanceOf[Boolean]
    
    inline def isScreenShareSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScreenShareSupported")().asInstanceOf[Boolean]
    
    inline def isWebRtc4AllSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebRtc4AllSupported")().asInstanceOf[Boolean]
    
    inline def isWebRtcPluginOutdated(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebRtcPluginOutdated")().asInstanceOf[Boolean]
    
    inline def isWebRtcSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebRtcSupported")().asInstanceOf[Boolean]
    
    inline def isWebSocketSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebSocketSupported")().asInstanceOf[Boolean]
    
    inline def setDebugLevel(level: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDebugLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setWebRtcType(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("setWebRtcType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
