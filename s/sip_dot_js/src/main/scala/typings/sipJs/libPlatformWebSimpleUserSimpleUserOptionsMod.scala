package typings.sipJs

import typings.sipJs.libApiRegistererOptionsMod.RegistererOptions
import typings.sipJs.libApiUserAgentOptionsMod.UserAgentOptions
import typings.sipJs.libPlatformWebSimpleUserSimpleUserDelegateMod.SimpleUserDelegate
import typings.std.HTMLAudioElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlatformWebSimpleUserSimpleUserOptionsMod {
  
  trait SimpleUserMedia extends StObject {
    
    /**
      * Offer/Answer constraints determine if audio and/or video are utilized.
      * If not specified, only audio is utilized (audio is true, video is false).
      * @remarks
      * Constraints are used when creating local media stream.
      * If undefined, defaults to audio true and video false.
      * If audio and video are false, media stream will have no tracks.
      */
    var constraints: js.UndefOr[SimpleUserMediaConstraints] = js.undefined
    
    /** HTML elements for local media streams. */
    var local: js.UndefOr[SimpleUserMediaLocal] = js.undefined
    
    /** Local HTML media elements. */
    var remote: js.UndefOr[SimpleUserMediaRemote] = js.undefined
  }
  object SimpleUserMedia {
    
    inline def apply(): SimpleUserMedia = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleUserMedia]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleUserMedia] (val x: Self) extends AnyVal {
      
      inline def setConstraints(value: SimpleUserMediaConstraints): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setLocal(value: SimpleUserMediaLocal): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setRemote(value: SimpleUserMediaRemote): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRemoteUndefined: Self = StObject.set(x, "remote", js.undefined)
    }
  }
  
  trait SimpleUserMediaConstraints extends StObject {
    
    /** If true, offer and answer to send and receive audio. */
    var audio: Boolean
    
    /** If true, offer and answer to send and receive video. */
    var video: Boolean
  }
  object SimpleUserMediaConstraints {
    
    inline def apply(audio: Boolean, video: Boolean): SimpleUserMediaConstraints = {
      val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleUserMediaConstraints]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleUserMediaConstraints] (val x: Self) extends AnyVal {
      
      inline def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimpleUserMediaLocal extends StObject {
    
    /** The local video media stream is attached to this element. */
    var video: js.UndefOr[HTMLVideoElement] = js.undefined
  }
  object SimpleUserMediaLocal {
    
    inline def apply(): SimpleUserMediaLocal = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleUserMediaLocal]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleUserMediaLocal] (val x: Self) extends AnyVal {
      
      inline def setVideo(value: HTMLVideoElement): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  trait SimpleUserMediaRemote extends StObject {
    
    /** The remote audio media stream is attached to this element. */
    var audio: js.UndefOr[HTMLAudioElement] = js.undefined
    
    /** The remote video media stream is attached to this element. */
    var video: js.UndefOr[HTMLVideoElement] = js.undefined
  }
  object SimpleUserMediaRemote {
    
    inline def apply(): SimpleUserMediaRemote = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleUserMediaRemote]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleUserMediaRemote] (val x: Self) extends AnyVal {
      
      inline def setAudio(value: HTMLAudioElement): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      inline def setVideo(value: HTMLVideoElement): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  trait SimpleUserOptions extends StObject {
    
    /**
      * User's SIP Address of Record (AOR).
      * @remarks
      * The AOR is registered to receive incoming calls.
      * If not specified, a random anonymous address is created for the user.
      */
    var aor: js.UndefOr[String] = js.undefined
    
    /**
      * Delegate for SimpleUser.
      */
    var delegate: js.UndefOr[SimpleUserDelegate] = js.undefined
    
    /**
      * Media options.
      */
    var media: js.UndefOr[SimpleUserMedia] = js.undefined
    
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
      * Options for Registerer.
      */
    var registererOptions: js.UndefOr[RegistererOptions] = js.undefined
    
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
  object SimpleUserOptions {
    
    inline def apply(): SimpleUserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleUserOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleUserOptions] (val x: Self) extends AnyVal {
      
      inline def setAor(value: String): Self = StObject.set(x, "aor", value.asInstanceOf[js.Any])
      
      inline def setAorUndefined: Self = StObject.set(x, "aor", js.undefined)
      
      inline def setDelegate(value: SimpleUserDelegate): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
      
      inline def setMedia(value: SimpleUserMedia): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      inline def setReconnectionAttempts(value: Double): Self = StObject.set(x, "reconnectionAttempts", value.asInstanceOf[js.Any])
      
      inline def setReconnectionAttemptsUndefined: Self = StObject.set(x, "reconnectionAttempts", js.undefined)
      
      inline def setReconnectionDelay(value: Double): Self = StObject.set(x, "reconnectionDelay", value.asInstanceOf[js.Any])
      
      inline def setReconnectionDelayUndefined: Self = StObject.set(x, "reconnectionDelay", js.undefined)
      
      inline def setRegistererOptions(value: RegistererOptions): Self = StObject.set(x, "registererOptions", value.asInstanceOf[js.Any])
      
      inline def setRegistererOptionsUndefined: Self = StObject.set(x, "registererOptions", js.undefined)
      
      inline def setSendDTMFUsingSessionDescriptionHandler(value: Boolean): Self = StObject.set(x, "sendDTMFUsingSessionDescriptionHandler", value.asInstanceOf[js.Any])
      
      inline def setSendDTMFUsingSessionDescriptionHandlerUndefined: Self = StObject.set(x, "sendDTMFUsingSessionDescriptionHandler", js.undefined)
      
      inline def setUserAgentOptions(value: UserAgentOptions): Self = StObject.set(x, "userAgentOptions", value.asInstanceOf[js.Any])
      
      inline def setUserAgentOptionsUndefined: Self = StObject.set(x, "userAgentOptions", js.undefined)
    }
  }
}
