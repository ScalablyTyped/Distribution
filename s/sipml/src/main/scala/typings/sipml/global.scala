package typings.sipml

import typings.sipml.SIPml.Session.EventSubscriptionType
import typings.sipml.SIPml.Stack.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object SIPml extends js.Object {
    @js.native
    class Event ()
      extends typings.sipml.SIPml.Event {
      /* CompleteClass */
      override var description: String = js.native
      /* CompleteClass */
      override var `type`: String = js.native
      /* CompleteClass */
      override def getContent(): js.Object = js.native
      /* CompleteClass */
      override def getContentString(): String = js.native
      /* CompleteClass */
      override def getContentType(): js.Object = js.native
      /* CompleteClass */
      override def getSipResponseCode(): Double = js.native
    }
    
    @js.native
    class EventTarget[EventSubscriptionType /* <: String */, EventType /* <: typings.sipml.SIPml.Event */] ()
      extends typings.sipml.SIPml.EventTarget[EventSubscriptionType, EventType] {
      /* CompleteClass */
      override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[EventType, Unit]): Unit = js.native
      /* CompleteClass */
      override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
    }
    
    @js.native
    class Session ()
      extends typings.sipml.SIPml.Session {
      /* CompleteClass */
      override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[typings.sipml.SIPml.Session.Event, Unit]): Unit = js.native
      /* CompleteClass */
      override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
    }
    
    @js.native
    class Stack ()
      extends typings.sipml.SIPml.Stack {
      def this(configuration: Configuration) = this()
      /* CompleteClass */
      override def addEventListener(
        `type`: typings.sipml.SIPml.Stack.EventSubscriptionType,
        listener: js.Function1[typings.sipml.SIPml.Stack.Event, Unit]
      ): Unit = js.native
      /* CompleteClass */
      override def removeEventListener(`type`: typings.sipml.SIPml.Stack.EventSubscriptionType): Unit = js.native
    }
    
    def getNavigatorFriendlyName(): String = js.native
    def getNavigatorVersion(): String = js.native
    def getSystemFriendlyName(): String = js.native
    def getWebRtc4AllVersion(): String = js.native
    def haveMediaStream(): Boolean = js.native
    def init(): Boolean = js.native
    def init(readyCallback: js.Function1[/* e */ js.Any, _]): Boolean = js.native
    def init(readyCallback: js.Function1[/* e */ js.Any, _], errorCallback: js.Function1[/* e */ js.Any, _]): Boolean = js.native
    def isInitialized(): Boolean = js.native
    def isNavigatorOutdated(): Boolean = js.native
    def isReady(): Boolean = js.native
    def isScreenShareSupported(): Boolean = js.native
    def isWebRtc4AllSupported(): Boolean = js.native
    def isWebRtcPluginOutdated(): Boolean = js.native
    def isWebRtcSupported(): Boolean = js.native
    def isWebSocketSupported(): Boolean = js.native
    def setDebugLevel(level: String): Unit = js.native
    def setWebRtcType(`type`: String): Boolean = js.native
    @js.native
    object Session extends js.Object {
      @js.native
      class Call ()
        extends typings.sipml.SIPml.Session.Call {
        /* CompleteClass */
        override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[typings.sipml.SIPml.Session.Event, Unit]): Unit = js.native
        /* CompleteClass */
        override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
      }
      
      @js.native
      class Event ()
        extends typings.sipml.SIPml.Session.Event {
        /* CompleteClass */
        override var description: String = js.native
        /* CompleteClass */
        override var session: typings.sipml.SIPml.Session = js.native
        /* CompleteClass */
        override var `type`: String = js.native
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
      }
      
      @js.native
      class Message ()
        extends typings.sipml.SIPml.Session.Message {
        /* CompleteClass */
        override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[typings.sipml.SIPml.Session.Event, Unit]): Unit = js.native
        /* CompleteClass */
        override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
      }
      
      @js.native
      class Publish ()
        extends typings.sipml.SIPml.Session.Publish {
        /* CompleteClass */
        override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[typings.sipml.SIPml.Session.Event, Unit]): Unit = js.native
        /* CompleteClass */
        override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
      }
      
      @js.native
      class Registration ()
        extends typings.sipml.SIPml.Session.Registration {
        /* CompleteClass */
        override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[typings.sipml.SIPml.Session.Event, Unit]): Unit = js.native
        /* CompleteClass */
        override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
      }
      
      @js.native
      class Subscribe ()
        extends typings.sipml.SIPml.Session.Subscribe {
        /* CompleteClass */
        override def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[typings.sipml.SIPml.Session.Event, Unit]): Unit = js.native
        /* CompleteClass */
        override def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
      }
      
    }
    
    @js.native
    object Stack extends js.Object {
      @js.native
      class Event ()
        extends typings.sipml.SIPml.Stack.Event {
        /* CompleteClass */
        override var description: String = js.native
        /* CompleteClass */
        override var newSession: typings.sipml.SIPml.Session = js.native
        /* CompleteClass */
        override var `type`: String = js.native
        /* CompleteClass */
        override def getContent(): js.Object = js.native
        /* CompleteClass */
        override def getContentString(): String = js.native
        /* CompleteClass */
        override def getContentType(): js.Object = js.native
        /* CompleteClass */
        override def getSipResponseCode(): Double = js.native
      }
      
    }
    
  }
  
}

