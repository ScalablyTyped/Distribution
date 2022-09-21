package typings.sipml

import typings.sipml.SIPml.Session.Configuration
import typings.sipml.SIPml.Session.EventSubscriptionType
import typings.sipml.anon.Audio
import typings.sipml.anon.Events
import typings.sipml.anon.Listener
import typings.sipml.anon.MaxHeight
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SIPml {
  
  trait Event extends StObject {
    
    var description: String
    
    def getContent(): js.Object
    
    def getContentString(): String
    
    def getContentType(): js.Object
    
    def getSipResponseCode(): Double
    
    var `type`: String
  }
  object Event {
    
    inline def apply(
      description: String,
      getContent: () => js.Object,
      getContentString: () => String,
      getContentType: () => js.Object,
      getSipResponseCode: () => Double,
      `type`: String
    ): Event = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], getContent = js.Any.fromFunction0(getContent), getContentString = js.Any.fromFunction0(getContentString), getContentType = js.Any.fromFunction0(getContentType), getSipResponseCode = js.Any.fromFunction0(getSipResponseCode))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setGetContent(value: () => js.Object): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setGetContentString(value: () => String): Self = StObject.set(x, "getContentString", js.Any.fromFunction0(value))
      
      inline def setGetContentType(value: () => js.Object): Self = StObject.set(x, "getContentType", js.Any.fromFunction0(value))
      
      inline def setGetSipResponseCode(value: () => Double): Self = StObject.set(x, "getSipResponseCode", js.Any.fromFunction0(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventTarget[EventSubscriptionType /* <: String */, EventType /* <: Event */] extends StObject {
    
    def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[/* e */ EventType, Unit]): Unit
    
    def removeEventListener(`type`: EventSubscriptionType): Unit
  }
  object EventTarget {
    
    inline def apply[EventSubscriptionType /* <: String */, EventType /* <: Event */](
      addEventListener: (EventSubscriptionType, js.Function1[/* e */ EventType, Unit]) => Unit,
      removeEventListener: EventSubscriptionType => Unit
    ): EventTarget[EventSubscriptionType, EventType] = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener))
      __obj.asInstanceOf[EventTarget[EventSubscriptionType, EventType]]
    }
    
    extension [Self <: EventTarget[?, ?], EventSubscriptionType /* <: String */, EventType /* <: Event */](x: Self & (EventTarget[EventSubscriptionType, EventType])) {
      
      inline def setAddEventListener(value: (EventSubscriptionType, js.Function1[/* e */ EventType, Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setRemoveEventListener(value: EventSubscriptionType => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Session
    extends StObject
       with EventTarget[EventSubscriptionType, typings.sipml.SIPml.Session.Event] {
    
    def accept(): Double = js.native
    def accept(configuration: Configuration): Double = js.native
    
    def getId(): Double = js.native
    
    def getRemoteFriendlyName(): String = js.native
    
    def getRemoteUri(): String = js.native
    
    def reject(): Double = js.native
    def reject(configuration: Configuration): Double = js.native
    
    def setConfiguration(): Unit = js.native
    def setConfiguration(configuration: Configuration): Unit = js.native
  }
  object Session {
    
    @js.native
    trait Call
      extends StObject
         with Session {
      
      def acceptTransfer(): Double = js.native
      def acceptTransfer(configuration: Configuration): Double = js.native
      
      def call(to: String): Double = js.native
      def call(to: String, configuration: Configuration): Double = js.native
      
      def dtmf(): Double = js.native
      
      def hangup(): Double = js.native
      def hangup(configuration: Configuration): Double = js.native
      
      def hold(): Double = js.native
      def hold(configuration: Configuration): Double = js.native
      
      def info(): Double = js.native
      
      def rejectTransfer(): Double = js.native
      
      def resume(): Double = js.native
      
      def transfer(): Double = js.native
    }
    object Call {
      
      /**
        * Should be 
        *
        * Session.EventSubscriptionType |
        * "m_early_media" |
        * "m_local_hold_ok" |
        * "m_local_hold_nok" |
        * "m_local_resume_ok" |
        * "m_local_resume_nok" |
        * "m_remote_hold" |
        * "m_remote_resume" |
        * "m_stream_video_local_added" |
        * "m_stream_video_local_removed" |
        * "m_stream_video_remote_added" |
        * "m_stream_video_remote_removed" |
        * "m_stream_audio_local_added" |
        * "m_stream_audio_local_removed" |
        * "m_stream_audio_remote_added" |
        * "m_stream_audio_remote_removed" |
        * "i_ect_new_call" |
        * "o_ect_trying" |
        * "o_ect_accepted" |
        * "o_ect_completed" |
        * "i_ect_completed" |
        * "o_ect_failed" |
        * "i_ect_failed" |
        * "o_ect_notify" |
        * "i_ect_notify" |
        * "i_ect_requested " |
        * "m_bfcp_info" |
        * "i_info" |
        */
      type EventSubscriptionType = typings.sipml.SIPml.Session.EventSubscriptionType
    }
    
    trait Configuration extends StObject {
      
      var audio_remote: js.UndefOr[HTMLElement] = js.undefined
      
      var bandwidth: js.UndefOr[Audio] = js.undefined
      
      var events_listener: js.UndefOr[Events] = js.undefined
      
      var expires: js.UndefOr[Double] = js.undefined
      
      var from: js.UndefOr[String] = js.undefined
      
      var sip_caps: js.UndefOr[js.Array[js.Object]] = js.undefined
      
      var sip_headers: js.UndefOr[js.Array[js.Object]] = js.undefined
      
      var video_local: js.UndefOr[HTMLElement] = js.undefined
      
      var video_remote: js.UndefOr[HTMLElement] = js.undefined
      
      var video_size: js.UndefOr[MaxHeight] = js.undefined
    }
    object Configuration {
      
      inline def apply(): Configuration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Configuration]
      }
      
      extension [Self <: Configuration](x: Self) {
        
        inline def setAudio_remote(value: HTMLElement): Self = StObject.set(x, "audio_remote", value.asInstanceOf[js.Any])
        
        inline def setAudio_remoteUndefined: Self = StObject.set(x, "audio_remote", js.undefined)
        
        inline def setBandwidth(value: Audio): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
        
        inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
        
        inline def setEvents_listener(value: Events): Self = StObject.set(x, "events_listener", value.asInstanceOf[js.Any])
        
        inline def setEvents_listenerUndefined: Self = StObject.set(x, "events_listener", js.undefined)
        
        inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
        
        inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
        
        inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
        
        inline def setSip_caps(value: js.Array[js.Object]): Self = StObject.set(x, "sip_caps", value.asInstanceOf[js.Any])
        
        inline def setSip_capsUndefined: Self = StObject.set(x, "sip_caps", js.undefined)
        
        inline def setSip_capsVarargs(value: js.Object*): Self = StObject.set(x, "sip_caps", js.Array(value*))
        
        inline def setSip_headers(value: js.Array[js.Object]): Self = StObject.set(x, "sip_headers", value.asInstanceOf[js.Any])
        
        inline def setSip_headersUndefined: Self = StObject.set(x, "sip_headers", js.undefined)
        
        inline def setSip_headersVarargs(value: js.Object*): Self = StObject.set(x, "sip_headers", js.Array(value*))
        
        inline def setVideo_local(value: HTMLElement): Self = StObject.set(x, "video_local", value.asInstanceOf[js.Any])
        
        inline def setVideo_localUndefined: Self = StObject.set(x, "video_local", js.undefined)
        
        inline def setVideo_remote(value: HTMLElement): Self = StObject.set(x, "video_remote", value.asInstanceOf[js.Any])
        
        inline def setVideo_remoteUndefined: Self = StObject.set(x, "video_remote", js.undefined)
        
        inline def setVideo_size(value: MaxHeight): Self = StObject.set(x, "video_size", value.asInstanceOf[js.Any])
        
        inline def setVideo_sizeUndefined: Self = StObject.set(x, "video_size", js.undefined)
      }
    }
    
    trait Event
      extends StObject
         with typings.sipml.SIPml.Event {
      
      def getTransferDestinationFriendlyName(): String
      
      var session: Session
    }
    object Event {
      
      inline def apply(
        description: String,
        getContent: () => js.Object,
        getContentString: () => String,
        getContentType: () => js.Object,
        getSipResponseCode: () => Double,
        getTransferDestinationFriendlyName: () => String,
        session: Session,
        `type`: String
      ): typings.sipml.SIPml.Session.Event = {
        val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], getContent = js.Any.fromFunction0(getContent), getContentString = js.Any.fromFunction0(getContentString), getContentType = js.Any.fromFunction0(getContentType), getSipResponseCode = js.Any.fromFunction0(getSipResponseCode), getTransferDestinationFriendlyName = js.Any.fromFunction0(getTransferDestinationFriendlyName), session = session.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.sipml.SIPml.Session.Event]
      }
      
      extension [Self <: typings.sipml.SIPml.Session.Event](x: Self) {
        
        inline def setGetTransferDestinationFriendlyName(value: () => String): Self = StObject.set(x, "getTransferDestinationFriendlyName", js.Any.fromFunction0(value))
        
        inline def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Should be
      *
      * "*" |
      * "connecting" |
      * "connected" |
      * "terminating" |
      * "terminated" |
      * "i_ao_request" |
      * "media_added" |
      * "media_removed" |
      * "i_request" |
      * "o_request" |
      * "cancelled_request" |
      * "sent_request" |
      * "transport_error" |
      * "global_error" |
      * "message_error" |
      * "webrtc_error" |
      */
    type EventSubscriptionType = String
    
    @js.native
    trait Message
      extends StObject
         with Session {
      
      def send(to: String): Double = js.native
      def send(to: String, content: Any): Double = js.native
      def send(to: String, content: Any, contentType: String): Double = js.native
      def send(to: String, content: Any, contentType: String, configuration: Configuration): Double = js.native
      def send(to: String, content: Any, contentType: Unit, configuration: Configuration): Double = js.native
      def send(to: String, content: Unit, contentType: String): Double = js.native
      def send(to: String, content: Unit, contentType: String, configuration: Configuration): Double = js.native
      def send(to: String, content: Unit, contentType: Unit, configuration: Configuration): Double = js.native
    }
    
    @js.native
    trait Publish
      extends StObject
         with Session {
      
      def publish(): Double = js.native
      def publish(content: Any): Double = js.native
      def publish(content: Any, contentType: String): Double = js.native
      def publish(content: Any, contentType: String, configuration: Configuration): Double = js.native
      def publish(content: Any, contentType: Unit, configuration: Configuration): Double = js.native
      def publish(content: Unit, contentType: String): Double = js.native
      def publish(content: Unit, contentType: String, configuration: Configuration): Double = js.native
      def publish(content: Unit, contentType: Unit, configuration: Configuration): Double = js.native
      
      def unpublish(): Unit = js.native
      def unpublish(configuration: Configuration): Unit = js.native
    }
    
    @js.native
    trait Registration
      extends StObject
         with Session {
      
      def register(): Unit = js.native
      def register(configuration: Configuration): Unit = js.native
      
      def unregister(): Unit = js.native
      def unregister(configuration: Configuration): Unit = js.native
    }
    
    @js.native
    trait Subscribe
      extends StObject
         with Session {
      
      def subscribe(to: String): Double = js.native
      def subscribe(to: String, configuration: Configuration): Double = js.native
      
      def unsubscribe(): Double = js.native
      def unsubscribe(configuration: Configuration): Double = js.native
    }
    object Subscribe {
      
      /**
        * Should be
        *
        * Session.EventSubscriptionType | "i_notify"
        */
      type EventSubscriptionType = typings.sipml.SIPml.Session.EventSubscriptionType
    }
  }
  
  @js.native
  trait Stack
    extends StObject
       with EventTarget[typings.sipml.SIPml.Stack.EventSubscriptionType, typings.sipml.SIPml.Stack.Event] {
    
    def newSession(`type`: String): Any = js.native
    def newSession(`type`: String, configuration: Configuration): Any = js.native
    
    def setConfiguration(configuration: typings.sipml.SIPml.Stack.Configuration): Double = js.native
    
    def start(): Double = js.native
    
    def stop(): Double = js.native
    def stop(timeout: Double): Double = js.native
  }
  object Stack {
    
    trait Configuration extends StObject {
      
      var bandwidth: js.UndefOr[Audio] = js.undefined
      
      var display_name: js.UndefOr[String] = js.undefined
      
      var enable_click2call: js.UndefOr[Boolean] = js.undefined
      
      var enable_early_ims: js.UndefOr[Boolean] = js.undefined
      
      var enable_media_stream_cache: js.UndefOr[Boolean] = js.undefined
      
      var enable_rtcweb_breaker: js.UndefOr[Boolean] = js.undefined
      
      var events_listener: js.UndefOr[Listener] = js.undefined
      
      var ice_servers: js.UndefOr[js.Array[js.Object]] = js.undefined
      
      var impi: js.UndefOr[String] = js.undefined
      
      var impu: js.UndefOr[String] = js.undefined
      
      var outbound_proxy_url: js.UndefOr[String] = js.undefined
      
      var password: js.UndefOr[String] = js.undefined
      
      var realm: js.UndefOr[String] = js.undefined
      
      var sip_headers: js.UndefOr[js.Array[js.Object]] = js.undefined
      
      var video_size: js.UndefOr[MaxHeight] = js.undefined
      
      var websocket_proxy_url: js.UndefOr[String] = js.undefined
    }
    object Configuration {
      
      inline def apply(): typings.sipml.SIPml.Stack.Configuration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.sipml.SIPml.Stack.Configuration]
      }
      
      extension [Self <: typings.sipml.SIPml.Stack.Configuration](x: Self) {
        
        inline def setBandwidth(value: Audio): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
        
        inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
        
        inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
        
        inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
        
        inline def setEnable_click2call(value: Boolean): Self = StObject.set(x, "enable_click2call", value.asInstanceOf[js.Any])
        
        inline def setEnable_click2callUndefined: Self = StObject.set(x, "enable_click2call", js.undefined)
        
        inline def setEnable_early_ims(value: Boolean): Self = StObject.set(x, "enable_early_ims", value.asInstanceOf[js.Any])
        
        inline def setEnable_early_imsUndefined: Self = StObject.set(x, "enable_early_ims", js.undefined)
        
        inline def setEnable_media_stream_cache(value: Boolean): Self = StObject.set(x, "enable_media_stream_cache", value.asInstanceOf[js.Any])
        
        inline def setEnable_media_stream_cacheUndefined: Self = StObject.set(x, "enable_media_stream_cache", js.undefined)
        
        inline def setEnable_rtcweb_breaker(value: Boolean): Self = StObject.set(x, "enable_rtcweb_breaker", value.asInstanceOf[js.Any])
        
        inline def setEnable_rtcweb_breakerUndefined: Self = StObject.set(x, "enable_rtcweb_breaker", js.undefined)
        
        inline def setEvents_listener(value: Listener): Self = StObject.set(x, "events_listener", value.asInstanceOf[js.Any])
        
        inline def setEvents_listenerUndefined: Self = StObject.set(x, "events_listener", js.undefined)
        
        inline def setIce_servers(value: js.Array[js.Object]): Self = StObject.set(x, "ice_servers", value.asInstanceOf[js.Any])
        
        inline def setIce_serversUndefined: Self = StObject.set(x, "ice_servers", js.undefined)
        
        inline def setIce_serversVarargs(value: js.Object*): Self = StObject.set(x, "ice_servers", js.Array(value*))
        
        inline def setImpi(value: String): Self = StObject.set(x, "impi", value.asInstanceOf[js.Any])
        
        inline def setImpiUndefined: Self = StObject.set(x, "impi", js.undefined)
        
        inline def setImpu(value: String): Self = StObject.set(x, "impu", value.asInstanceOf[js.Any])
        
        inline def setImpuUndefined: Self = StObject.set(x, "impu", js.undefined)
        
        inline def setOutbound_proxy_url(value: String): Self = StObject.set(x, "outbound_proxy_url", value.asInstanceOf[js.Any])
        
        inline def setOutbound_proxy_urlUndefined: Self = StObject.set(x, "outbound_proxy_url", js.undefined)
        
        inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
        
        inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
        
        inline def setSip_headers(value: js.Array[js.Object]): Self = StObject.set(x, "sip_headers", value.asInstanceOf[js.Any])
        
        inline def setSip_headersUndefined: Self = StObject.set(x, "sip_headers", js.undefined)
        
        inline def setSip_headersVarargs(value: js.Object*): Self = StObject.set(x, "sip_headers", js.Array(value*))
        
        inline def setVideo_size(value: MaxHeight): Self = StObject.set(x, "video_size", value.asInstanceOf[js.Any])
        
        inline def setVideo_sizeUndefined: Self = StObject.set(x, "video_size", js.undefined)
        
        inline def setWebsocket_proxy_url(value: String): Self = StObject.set(x, "websocket_proxy_url", value.asInstanceOf[js.Any])
        
        inline def setWebsocket_proxy_urlUndefined: Self = StObject.set(x, "websocket_proxy_url", js.undefined)
      }
    }
    
    trait Event
      extends StObject
         with typings.sipml.SIPml.Event {
      
      var newSession: Session
    }
    object Event {
      
      inline def apply(
        description: String,
        getContent: () => js.Object,
        getContentString: () => String,
        getContentType: () => js.Object,
        getSipResponseCode: () => Double,
        newSession: Session,
        `type`: String
      ): typings.sipml.SIPml.Stack.Event = {
        val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], getContent = js.Any.fromFunction0(getContent), getContentString = js.Any.fromFunction0(getContentString), getContentType = js.Any.fromFunction0(getContentType), getSipResponseCode = js.Any.fromFunction0(getSipResponseCode), newSession = newSession.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.sipml.SIPml.Stack.Event]
      }
      
      extension [Self <: typings.sipml.SIPml.Stack.Event](x: Self) {
        
        inline def setNewSession(value: Session): Self = StObject.set(x, "newSession", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Should be
      *
      * "*" |
      * "starting" |
      * "started" |
      * "stopping" |
      * "stopped" |
      * "failed_to_start" |
      * "failed_to_stop" |
      * "i_new_call" |
      * "i_new_message" |
      * "m_permission_requested" |
      * "m_permission_accepted" |
      * "m_permission_refused";
      */
    type EventSubscriptionType = String
  }
}
