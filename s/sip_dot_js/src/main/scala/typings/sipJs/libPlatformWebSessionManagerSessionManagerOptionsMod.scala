package typings.sipJs

import typings.sipJs.libApiRegistererOptionsMod.RegistererOptions
import typings.sipJs.libApiRegistererRegisterOptionsMod.RegistererRegisterOptions
import typings.sipJs.libApiSessionMod.Session
import typings.sipJs.libApiUserAgentOptionsMod.UserAgentOptions
import typings.sipJs.libPlatformWebSessionManagerManagedSessionFactoryMod.ManagedSessionFactory
import typings.sipJs.libPlatformWebSessionManagerManagedSessionMod.ManagedSession
import typings.sipJs.libPlatformWebSessionManagerSessionManagerDelegateMod.SessionManagerDelegate
import typings.sipJs.libPlatformWebSessionManagerSessionManagerMod.SessionManager
import typings.std.HTMLAudioElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSessionManagerSessionManagerOptionsMod {
  
  trait SessionManagerMedia extends StObject {
    
    /**
      * Offer/Answer constraints determine if audio and/or video are utilized.
      * If not specified, only audio is utilized (audio is true, video is false).
      * @remarks
      * Constraints are used when creating local media stream.
      * If undefined, defaults to audio true and video false.
      * If audio and video are false, media stream will have no tracks.
      */
    var constraints: js.UndefOr[SessionManagerMediaConstraints] = js.undefined
    
    /** HTML elements for local media streams. */
    var local: js.UndefOr[
        SessionManagerMediaLocal | (js.Function1[/* session */ Session, SessionManagerMediaLocal])
      ] = js.undefined
    
    /** Local HTML media elements. */
    var remote: js.UndefOr[
        SessionManagerMediaRemote | (js.Function1[/* session */ Session, SessionManagerMediaRemote])
      ] = js.undefined
  }
  object SessionManagerMedia {
    
    inline def apply(): SessionManagerMedia = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionManagerMedia]
    }
    
    extension [Self <: SessionManagerMedia](x: Self) {
      
      inline def setConstraints(value: SessionManagerMediaConstraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setLocal(value: SessionManagerMediaLocal | (js.Function1[/* session */ Session, SessionManagerMediaLocal])): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalFunction1(value: /* session */ Session => SessionManagerMediaLocal): Self = StObject.set(x, "local", js.Any.fromFunction1(value))
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setRemote(
        value: SessionManagerMediaRemote | (js.Function1[/* session */ Session, SessionManagerMediaRemote])
      ): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteFunction1(value: /* session */ Session => SessionManagerMediaRemote): Self = StObject.set(x, "remote", js.Any.fromFunction1(value))
      
      inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
    }
  }
  
  trait SessionManagerMediaConstraints extends StObject {
    
    /** If true, offer and answer to send and receive audio. */
    var audio: Boolean
    
    /** If true, offer and answer to send and receive video. */
    var video: Boolean
  }
  object SessionManagerMediaConstraints {
    
    inline def apply(audio: Boolean, video: Boolean): SessionManagerMediaConstraints = {
      val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionManagerMediaConstraints]
    }
    
    extension [Self <: SessionManagerMediaConstraints](x: Self) {
      
      inline def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  trait SessionManagerMediaLocal extends StObject {
    
    /** The local video media stream is attached to this element. */
    var video: js.UndefOr[HTMLVideoElement] = js.undefined
  }
  object SessionManagerMediaLocal {
    
    inline def apply(): SessionManagerMediaLocal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionManagerMediaLocal]
    }
    
    extension [Self <: SessionManagerMediaLocal](x: Self) {
      
      inline def setVideo(value: HTMLVideoElement): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  trait SessionManagerMediaRemote extends StObject {
    
    /** The remote audio media stream is attached to this element. */
    var audio: js.UndefOr[HTMLAudioElement] = js.undefined
    
    /** The remote video media stream is attached to this element. */
    var video: js.UndefOr[HTMLVideoElement] = js.undefined
  }
  object SessionManagerMediaRemote {
    
    inline def apply(): SessionManagerMediaRemote = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionManagerMediaRemote]
    }
    
    extension [Self <: SessionManagerMediaRemote](x: Self) {
      
      inline def setAudio(value: HTMLAudioElement): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      inline def setVideo(value: HTMLVideoElement): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  trait SessionManagerOptions extends StObject {
    
    /**
      * User's SIP Address of Record (AOR).
      * @remarks
      * The AOR is registered to receive incoming calls.
      * If not specified, a random anonymous address is created for the user.
      */
    var aor: js.UndefOr[String] = js.undefined
    
    /**
      * If `true`, the user agent calls the `stop()` method on the window event `beforeunload`.
      * @defaultValue `true`
      */
    var autoStop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Delegate for SessionManager.
      */
    var delegate: js.UndefOr[SessionManagerDelegate] = js.undefined
    
    /**
      * Stop waiting for ICE gathering to complete once a server reflexive address is obtained.
      * @remarks
      * This is an aggressive approach to limiting the amount of time spent gathering ICE candidates.
      * While this will contribute to minimizing the post dial/answer delay experienced,
      * it will very likely prevent a complete set of candidates from being gathered.
      * If an ICE gathering timeout is also provided as an option to the session
      * description handler, waiting will stop on whichever event occurs first.
      * @defaultValue `false`
      */
    var iceStopWaitingOnServerReflexive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A factory for generating `ManagedSession` instances.
      * @remarks
      * The factory will be passed a `Session` object for the current session.
      * @defaultValue `Web.SessionManager.defaultManagedSessionFactory`
      */
    var managedSessionFactory: js.UndefOr[ManagedSessionFactory] = js.undefined
    
    /**
      * Maximum number of simultaneous sessions to manage.
      * @remarks
      * Set to 0 for unlimited.
      * @defaultValue 2
      */
    var maxSimultaneousSessions: js.UndefOr[Double] = js.undefined
    
    /**
      * Media options.
      */
    var media: js.UndefOr[SessionManagerMedia] = js.undefined
    
    /**
      * If defined, SIP OPTIONS pings will be sent separated by this interval in seconds.
      * @remarks
      * When this is defined, the user agent will periodically send an OPTIONS request to the destination
      * to determine its reachability and will disconnect the transport if the destination is unreachable.
      * A destination is considered to be "out of service" if it fails to respond to an OPTIONS request,
      * if it sends a Service Unavailable (503) response or Request Timeout (408) response. The overall
      * state is considered to be "in service" when a response other than a 408 or 503 is received.
      *
      * There is currently no Javascript API to send WebSocket Ping frames or receive Pong frames.
      * A Ping frame may serve either as a keepalive or as a means to verify that the remote endpoint
      * is still responsive. It is either supported by your browser, or not. There is also no API to
      * enable, configure or detect whether the browser supports and is using ping/pong frames.
      * As such, if a keepalive and/or a means to verify that the remote endpoint is responsive is
      * desired, an alternative approach is needed. The intention of sending SIP OPTIONS pings
      * herein is to provide an application level alternative.
      *
      * There is no golden rule or best practice here. For example, too low and these messages clutter
      * log files and make more work for the system than is useful (10 seconds is arguably too low).
      * Too high and it may take longer than expected to detect a server or otherwise unreachable
      * (120 seconds is arguably too high). So choose a value that is reasonable for your environment.
      * @defaultValue `undefined`
      */
    var optionsPingInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * The request URI to use for SIP OPTIONS pings.
      * @remarks
      * If this is not defined but the aor option has been defined, the aor host portion of
      * the aor will be used to form the request URI (the assumption is this will target the
      * registrar server assoicated with the AOR).
      * @defaultValue `undefined`
      */
    var optionsPingRequestURI: js.UndefOr[String] = js.undefined
    
    /**
      * Maximum number of times to attempt to reconnection.
      * @remarks
      * When the transport connection is lost (WebSocket disconnects),
      * reconnection will be attempted immediately. If that fails,
      * reconnection will be attempted again when the browser indicates
      * the application has come online. See:
      * https://developer.mozilla.org/en-US/docs/Web/API/NavigatorOnLine
      * @defaultValue 3
      */
    var reconnectionAttempts: js.UndefOr[Double] = js.undefined
    
    /**
      * Seconds to wait between reconnection attempts.
      * @defaultValue 4
      */
    var reconnectionDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Does nothing if undefined or resolves false.
      * If resolves true, the next regitration attempt will be blocked.
      */
    var registerGuard: js.UndefOr[js.Function0[js.Promise[Boolean]] | Null] = js.undefined
    
    /**
      * Options for Registerer.
      */
    var registererOptions: js.UndefOr[RegistererOptions] = js.undefined
    
    /**
      * Options for register requests (auto register only).
      * @remarks
      * Any options provided here are overriden by the options provided via a cal to `register()`.
      */
    var registererRegisterOptions: js.UndefOr[RegistererRegisterOptions] = js.undefined
    
    /**
      * If `true` then registration attempts will be automatically retried
      * when any registration attempts fail or is otherwise rejected.
      * @defaultValue `false`
      */
    var registrationRetry: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Time to wait before retrying to send a registration reqeust in seconds.
      * @defaultValue 3
      */
    var registrationRetryInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Send DTMF using the session description handler (uses RFC 2833 DTMF).
      * @defaultValue `false`
      */
    var sendDTMFUsingSessionDescriptionHandler: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Options for UserAgent.
      */
    var userAgentOptions: js.UndefOr[UserAgentOptions] = js.undefined
  }
  object SessionManagerOptions {
    
    inline def apply(): SessionManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SessionManagerOptions]
    }
    
    extension [Self <: SessionManagerOptions](x: Self) {
      
      inline def setAor(value: String): Self = StObject.set(x, "aor", value.asInstanceOf[js.Any])
      
      inline def setAorUndefined: Self = StObject.set(x, "aor", js.undefined)
      
      inline def setAutoStop(value: Boolean): Self = StObject.set(x, "autoStop", value.asInstanceOf[js.Any])
      
      inline def setAutoStopUndefined: Self = StObject.set(x, "autoStop", js.undefined)
      
      inline def setDelegate(value: SessionManagerDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
      
      inline def setIceStopWaitingOnServerReflexive(value: Boolean): Self = StObject.set(x, "iceStopWaitingOnServerReflexive", value.asInstanceOf[js.Any])
      
      inline def setIceStopWaitingOnServerReflexiveUndefined: Self = StObject.set(x, "iceStopWaitingOnServerReflexive", js.undefined)
      
      inline def setManagedSessionFactory(value: (/* sessionManager */ SessionManager, /* session */ Session) => ManagedSession): Self = StObject.set(x, "managedSessionFactory", js.Any.fromFunction2(value))
      
      inline def setManagedSessionFactoryUndefined: Self = StObject.set(x, "managedSessionFactory", js.undefined)
      
      inline def setMaxSimultaneousSessions(value: Double): Self = StObject.set(x, "maxSimultaneousSessions", value.asInstanceOf[js.Any])
      
      inline def setMaxSimultaneousSessionsUndefined: Self = StObject.set(x, "maxSimultaneousSessions", js.undefined)
      
      inline def setMedia(value: SessionManagerMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setOptionsPingInterval(value: Double): Self = StObject.set(x, "optionsPingInterval", value.asInstanceOf[js.Any])
      
      inline def setOptionsPingIntervalUndefined: Self = StObject.set(x, "optionsPingInterval", js.undefined)
      
      inline def setOptionsPingRequestURI(value: String): Self = StObject.set(x, "optionsPingRequestURI", value.asInstanceOf[js.Any])
      
      inline def setOptionsPingRequestURIUndefined: Self = StObject.set(x, "optionsPingRequestURI", js.undefined)
      
      inline def setReconnectionAttempts(value: Double): Self = StObject.set(x, "reconnectionAttempts", value.asInstanceOf[js.Any])
      
      inline def setReconnectionAttemptsUndefined: Self = StObject.set(x, "reconnectionAttempts", js.undefined)
      
      inline def setReconnectionDelay(value: Double): Self = StObject.set(x, "reconnectionDelay", value.asInstanceOf[js.Any])
      
      inline def setReconnectionDelayUndefined: Self = StObject.set(x, "reconnectionDelay", js.undefined)
      
      inline def setRegisterGuard(value: () => js.Promise[Boolean]): Self = StObject.set(x, "registerGuard", js.Any.fromFunction0(value))
      
      inline def setRegisterGuardNull: Self = StObject.set(x, "registerGuard", null)
      
      inline def setRegisterGuardUndefined: Self = StObject.set(x, "registerGuard", js.undefined)
      
      inline def setRegistererOptions(value: RegistererOptions): Self = StObject.set(x, "registererOptions", value.asInstanceOf[js.Any])
      
      inline def setRegistererOptionsUndefined: Self = StObject.set(x, "registererOptions", js.undefined)
      
      inline def setRegistererRegisterOptions(value: RegistererRegisterOptions): Self = StObject.set(x, "registererRegisterOptions", value.asInstanceOf[js.Any])
      
      inline def setRegistererRegisterOptionsUndefined: Self = StObject.set(x, "registererRegisterOptions", js.undefined)
      
      inline def setRegistrationRetry(value: Boolean): Self = StObject.set(x, "registrationRetry", value.asInstanceOf[js.Any])
      
      inline def setRegistrationRetryInterval(value: Double): Self = StObject.set(x, "registrationRetryInterval", value.asInstanceOf[js.Any])
      
      inline def setRegistrationRetryIntervalUndefined: Self = StObject.set(x, "registrationRetryInterval", js.undefined)
      
      inline def setRegistrationRetryUndefined: Self = StObject.set(x, "registrationRetry", js.undefined)
      
      inline def setSendDTMFUsingSessionDescriptionHandler(value: Boolean): Self = StObject.set(x, "sendDTMFUsingSessionDescriptionHandler", value.asInstanceOf[js.Any])
      
      inline def setSendDTMFUsingSessionDescriptionHandlerUndefined: Self = StObject.set(x, "sendDTMFUsingSessionDescriptionHandler", js.undefined)
      
      inline def setUserAgentOptions(value: UserAgentOptions): Self = StObject.set(x, "userAgentOptions", value.asInstanceOf[js.Any])
      
      inline def setUserAgentOptionsUndefined: Self = StObject.set(x, "userAgentOptions", js.undefined)
    }
  }
}
