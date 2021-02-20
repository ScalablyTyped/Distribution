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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SIPml {
  
  @js.native
  trait Event extends StObject {
    
    var description: String = js.native
    
    def getContent(): js.Object = js.native
    
    def getContentString(): String = js.native
    
    def getContentType(): js.Object = js.native
    
    def getSipResponseCode(): Double = js.native
    
    var `type`: String = js.native
  }
  object Event {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetContent(value: () => js.Object): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentString(value: () => String): Self = StObject.set(x, "getContentString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentType(value: () => js.Object): Self = StObject.set(x, "getContentType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetSipResponseCode(value: () => Double): Self = StObject.set(x, "getSipResponseCode", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventTarget[EventSubscriptionType /* <: String */, EventType /* <: Event */] extends StObject {
    
    def addEventListener(`type`: EventSubscriptionType, listener: js.Function1[/* e */ EventType, Unit]): Unit = js.native
    
    def removeEventListener(`type`: EventSubscriptionType): Unit = js.native
  }
  object EventTarget {
    
    @scala.inline
    def apply[EventSubscriptionType /* <: String */, EventType /* <: Event */](
      addEventListener: (EventSubscriptionType, js.Function1[/* e */ EventType, Unit]) => Unit,
      removeEventListener: EventSubscriptionType => Unit
    ): EventTarget[EventSubscriptionType, EventType] = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener))
      __obj.asInstanceOf[EventTarget[EventSubscriptionType, EventType]]
    }
    
    @scala.inline
    implicit class EventTargetMutableBuilder[Self <: EventTarget[_, _], EventSubscriptionType /* <: String */, EventType /* <: Event */] (val x: Self with (EventTarget[EventSubscriptionType, EventType])) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: (EventSubscriptionType, js.Function1[/* e */ EventType, Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveEventListener(value: EventSubscriptionType => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Session
    extends EventTarget[EventSubscriptionType, typings.sipml.SIPml.Session.Event] {
    
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
    trait Call extends Session {
      
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
    
    @js.native
    trait Configuration extends StObject {
      
      var audio_remote: js.UndefOr[HTMLElement] = js.native
      
      var bandwidth: js.UndefOr[Audio] = js.native
      
      var events_listener: js.UndefOr[Events] = js.native
      
      var expires: js.UndefOr[Double] = js.native
      
      var from: js.UndefOr[String] = js.native
      
      var sip_caps: js.UndefOr[js.Array[js.Object]] = js.native
      
      var sip_headers: js.UndefOr[js.Array[js.Object]] = js.native
      
      var video_local: js.UndefOr[HTMLElement] = js.native
      
      var video_remote: js.UndefOr[HTMLElement] = js.native
      
      var video_size: js.UndefOr[MaxHeight] = js.native
    }
    object Configuration {
      
      @scala.inline
      def apply(): Configuration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Configuration]
      }
      
      @scala.inline
      implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAudio_remote(value: HTMLElement): Self = StObject.set(x, "audio_remote", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudio_remoteUndefined: Self = StObject.set(x, "audio_remote", js.undefined)
        
        @scala.inline
        def setBandwidth(value: Audio): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
        
        @scala.inline
        def setEvents_listener(value: Events): Self = StObject.set(x, "events_listener", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEvents_listenerUndefined: Self = StObject.set(x, "events_listener", js.undefined)
        
        @scala.inline
        def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
        
        @scala.inline
        def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
        
        @scala.inline
        def setSip_caps(value: js.Array[js.Object]): Self = StObject.set(x, "sip_caps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSip_capsUndefined: Self = StObject.set(x, "sip_caps", js.undefined)
        
        @scala.inline
        def setSip_capsVarargs(value: js.Object*): Self = StObject.set(x, "sip_caps", js.Array(value :_*))
        
        @scala.inline
        def setSip_headers(value: js.Array[js.Object]): Self = StObject.set(x, "sip_headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSip_headersUndefined: Self = StObject.set(x, "sip_headers", js.undefined)
        
        @scala.inline
        def setSip_headersVarargs(value: js.Object*): Self = StObject.set(x, "sip_headers", js.Array(value :_*))
        
        @scala.inline
        def setVideo_local(value: HTMLElement): Self = StObject.set(x, "video_local", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVideo_localUndefined: Self = StObject.set(x, "video_local", js.undefined)
        
        @scala.inline
        def setVideo_remote(value: HTMLElement): Self = StObject.set(x, "video_remote", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVideo_remoteUndefined: Self = StObject.set(x, "video_remote", js.undefined)
        
        @scala.inline
        def setVideo_size(value: MaxHeight): Self = StObject.set(x, "video_size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVideo_sizeUndefined: Self = StObject.set(x, "video_size", js.undefined)
      }
    }
    
    @js.native
    trait Event
      extends typings.sipml.SIPml.Event {
      
      def getTransferDestinationFriendlyName(): String = js.native
      
      var session: Session = js.native
    }
    object Event {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class EventMutableBuilder[Self <: typings.sipml.SIPml.Session.Event] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetTransferDestinationFriendlyName(value: () => String): Self = StObject.set(x, "getTransferDestinationFriendlyName", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSession(value: Session): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
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
    trait Message extends Session {
      
      def send(to: String): Double = js.native
      def send(
        to: String,
        content: js.UndefOr[scala.Nothing],
        contentType: js.UndefOr[scala.Nothing],
        configuration: Configuration
      ): Double = js.native
      def send(to: String, content: js.UndefOr[scala.Nothing], contentType: String): Double = js.native
      def send(to: String, content: js.UndefOr[scala.Nothing], contentType: String, configuration: Configuration): Double = js.native
      def send(to: String, content: js.Any): Double = js.native
      def send(to: String, content: js.Any, contentType: js.UndefOr[scala.Nothing], configuration: Configuration): Double = js.native
      def send(to: String, content: js.Any, contentType: String): Double = js.native
      def send(to: String, content: js.Any, contentType: String, configuration: Configuration): Double = js.native
    }
    
    @js.native
    trait Publish extends Session {
      
      def publish(): Double = js.native
      def publish(
        content: js.UndefOr[scala.Nothing],
        contentType: js.UndefOr[scala.Nothing],
        configuration: Configuration
      ): Double = js.native
      def publish(content: js.UndefOr[scala.Nothing], contentType: String): Double = js.native
      def publish(content: js.UndefOr[scala.Nothing], contentType: String, configuration: Configuration): Double = js.native
      def publish(content: js.Any): Double = js.native
      def publish(content: js.Any, contentType: js.UndefOr[scala.Nothing], configuration: Configuration): Double = js.native
      def publish(content: js.Any, contentType: String): Double = js.native
      def publish(content: js.Any, contentType: String, configuration: Configuration): Double = js.native
      
      def unpublish(): Unit = js.native
      def unpublish(configuration: Configuration): Unit = js.native
    }
    
    @js.native
    trait Registration extends Session {
      
      def register(): Unit = js.native
      def register(configuration: Configuration): Unit = js.native
      
      def unregister(): Unit = js.native
      def unregister(configuration: Configuration): Unit = js.native
    }
    
    @js.native
    trait Subscribe extends Session {
      
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
    extends EventTarget[typings.sipml.SIPml.Stack.EventSubscriptionType, typings.sipml.SIPml.Stack.Event] {
    
    def newSession(`type`: String): js.Any = js.native
    def newSession(`type`: String, configuration: Configuration): js.Any = js.native
    
    def setConfiguration(configuration: typings.sipml.SIPml.Stack.Configuration): Double = js.native
    
    def start(): Double = js.native
    
    def stop(): Double = js.native
    def stop(timeout: Double): Double = js.native
  }
  object Stack {
    
    @js.native
    trait Configuration extends StObject {
      
      var bandwidth: js.UndefOr[Audio] = js.native
      
      var display_name: js.UndefOr[String] = js.native
      
      var enable_click2call: js.UndefOr[Boolean] = js.native
      
      var enable_early_ims: js.UndefOr[Boolean] = js.native
      
      var enable_media_stream_cache: js.UndefOr[Boolean] = js.native
      
      var enable_rtcweb_breaker: js.UndefOr[Boolean] = js.native
      
      var events_listener: js.UndefOr[Listener] = js.native
      
      var ice_servers: js.UndefOr[js.Array[js.Object]] = js.native
      
      var impi: js.UndefOr[String] = js.native
      
      var impu: js.UndefOr[String] = js.native
      
      var outbound_proxy_url: js.UndefOr[String] = js.native
      
      var password: js.UndefOr[String] = js.native
      
      var realm: js.UndefOr[String] = js.native
      
      var sip_headers: js.UndefOr[js.Array[js.Object]] = js.native
      
      var video_size: js.UndefOr[MaxHeight] = js.native
      
      var websocket_proxy_url: js.UndefOr[String] = js.native
    }
    object Configuration {
      
      @scala.inline
      def apply(): typings.sipml.SIPml.Stack.Configuration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.sipml.SIPml.Stack.Configuration]
      }
      
      @scala.inline
      implicit class ConfigurationMutableBuilder[Self <: typings.sipml.SIPml.Stack.Configuration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBandwidth(value: Audio): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
        
        @scala.inline
        def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
        
        @scala.inline
        def setEnable_click2call(value: Boolean): Self = StObject.set(x, "enable_click2call", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnable_click2callUndefined: Self = StObject.set(x, "enable_click2call", js.undefined)
        
        @scala.inline
        def setEnable_early_ims(value: Boolean): Self = StObject.set(x, "enable_early_ims", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnable_early_imsUndefined: Self = StObject.set(x, "enable_early_ims", js.undefined)
        
        @scala.inline
        def setEnable_media_stream_cache(value: Boolean): Self = StObject.set(x, "enable_media_stream_cache", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnable_media_stream_cacheUndefined: Self = StObject.set(x, "enable_media_stream_cache", js.undefined)
        
        @scala.inline
        def setEnable_rtcweb_breaker(value: Boolean): Self = StObject.set(x, "enable_rtcweb_breaker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnable_rtcweb_breakerUndefined: Self = StObject.set(x, "enable_rtcweb_breaker", js.undefined)
        
        @scala.inline
        def setEvents_listener(value: Listener): Self = StObject.set(x, "events_listener", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEvents_listenerUndefined: Self = StObject.set(x, "events_listener", js.undefined)
        
        @scala.inline
        def setIce_servers(value: js.Array[js.Object]): Self = StObject.set(x, "ice_servers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIce_serversUndefined: Self = StObject.set(x, "ice_servers", js.undefined)
        
        @scala.inline
        def setIce_serversVarargs(value: js.Object*): Self = StObject.set(x, "ice_servers", js.Array(value :_*))
        
        @scala.inline
        def setImpi(value: String): Self = StObject.set(x, "impi", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImpiUndefined: Self = StObject.set(x, "impi", js.undefined)
        
        @scala.inline
        def setImpu(value: String): Self = StObject.set(x, "impu", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setImpuUndefined: Self = StObject.set(x, "impu", js.undefined)
        
        @scala.inline
        def setOutbound_proxy_url(value: String): Self = StObject.set(x, "outbound_proxy_url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutbound_proxy_urlUndefined: Self = StObject.set(x, "outbound_proxy_url", js.undefined)
        
        @scala.inline
        def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        @scala.inline
        def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
        
        @scala.inline
        def setSip_headers(value: js.Array[js.Object]): Self = StObject.set(x, "sip_headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSip_headersUndefined: Self = StObject.set(x, "sip_headers", js.undefined)
        
        @scala.inline
        def setSip_headersVarargs(value: js.Object*): Self = StObject.set(x, "sip_headers", js.Array(value :_*))
        
        @scala.inline
        def setVideo_size(value: MaxHeight): Self = StObject.set(x, "video_size", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVideo_sizeUndefined: Self = StObject.set(x, "video_size", js.undefined)
        
        @scala.inline
        def setWebsocket_proxy_url(value: String): Self = StObject.set(x, "websocket_proxy_url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebsocket_proxy_urlUndefined: Self = StObject.set(x, "websocket_proxy_url", js.undefined)
      }
    }
    
    @js.native
    trait Event
      extends typings.sipml.SIPml.Event {
      
      var newSession: Session = js.native
    }
    object Event {
      
      @scala.inline
      def apply(
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
      
      @scala.inline
      implicit class EventMutableBuilder[Self <: typings.sipml.SIPml.Stack.Event] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNewSession(value: Session): Self = StObject.set(x, "newSession", value.asInstanceOf[js.Any])
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
