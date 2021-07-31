package typings.soundmanager2

import org.scalablytyped.runtime.StringDictionary
import typings.soundmanager2.soundmanager2Booleans.`false`
import typings.soundmanager2.soundmanager2Booleans.`true`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object soundmanager {
  
  trait DefaultOptions extends StObject {
    
    var autoLoad: js.UndefOr[Boolean] = js.undefined
    
    var autoPlay: js.UndefOr[Boolean] = js.undefined
    
    var from: js.UndefOr[Double | Null] = js.undefined
    
    var loops: js.UndefOr[Double] = js.undefined
    
    var multiShot: js.UndefOr[Boolean] = js.undefined
    
    var multiShotEvents: js.UndefOr[Boolean] = js.undefined
    
    var onerror: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onfinish: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onid3: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onload: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onpause: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onplay: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onposition: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onresume: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onstop: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var pan: js.UndefOr[Double] = js.undefined
    
    var playbackRate: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[Double | Null] = js.undefined
    
    var stream: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[Double | Null] = js.undefined
    
    var `type`: js.UndefOr[String | Null] = js.undefined
    
    var usePolicyFile: js.UndefOr[Boolean] = js.undefined
    
    var volume: js.UndefOr[Double] = js.undefined
    
    var whileloading: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var whileplaying: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
  }
  object DefaultOptions {
    
    @scala.inline
    def apply(): DefaultOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultOptions]
    }
    
    @scala.inline
    implicit class DefaultOptionsMutableBuilder[Self <: DefaultOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
      
      @scala.inline
      def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromNull: Self = StObject.set(x, "from", null)
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setLoops(value: Double): Self = StObject.set(x, "loops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopsUndefined: Self = StObject.set(x, "loops", js.undefined)
      
      @scala.inline
      def setMultiShot(value: Boolean): Self = StObject.set(x, "multiShot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiShotEvents(value: Boolean): Self = StObject.set(x, "multiShotEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiShotEventsUndefined: Self = StObject.set(x, "multiShotEvents", js.undefined)
      
      @scala.inline
      def setMultiShotUndefined: Self = StObject.set(x, "multiShot", js.undefined)
      
      @scala.inline
      def setOnerror(value: () => Unit): Self = StObject.set(x, "onerror", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnerrorNull: Self = StObject.set(x, "onerror", null)
      
      @scala.inline
      def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
      
      @scala.inline
      def setOnfinish(value: () => Unit): Self = StObject.set(x, "onfinish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnfinishNull: Self = StObject.set(x, "onfinish", null)
      
      @scala.inline
      def setOnfinishUndefined: Self = StObject.set(x, "onfinish", js.undefined)
      
      @scala.inline
      def setOnid3(value: () => Unit): Self = StObject.set(x, "onid3", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnid3Null: Self = StObject.set(x, "onid3", null)
      
      @scala.inline
      def setOnid3Undefined: Self = StObject.set(x, "onid3", js.undefined)
      
      @scala.inline
      def setOnload(value: () => Unit): Self = StObject.set(x, "onload", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnloadNull: Self = StObject.set(x, "onload", null)
      
      @scala.inline
      def setOnloadUndefined: Self = StObject.set(x, "onload", js.undefined)
      
      @scala.inline
      def setOnpause(value: () => Unit): Self = StObject.set(x, "onpause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnpauseNull: Self = StObject.set(x, "onpause", null)
      
      @scala.inline
      def setOnpauseUndefined: Self = StObject.set(x, "onpause", js.undefined)
      
      @scala.inline
      def setOnplay(value: () => Unit): Self = StObject.set(x, "onplay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnplayNull: Self = StObject.set(x, "onplay", null)
      
      @scala.inline
      def setOnplayUndefined: Self = StObject.set(x, "onplay", js.undefined)
      
      @scala.inline
      def setOnposition(value: () => Unit): Self = StObject.set(x, "onposition", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnpositionNull: Self = StObject.set(x, "onposition", null)
      
      @scala.inline
      def setOnpositionUndefined: Self = StObject.set(x, "onposition", js.undefined)
      
      @scala.inline
      def setOnresume(value: () => Unit): Self = StObject.set(x, "onresume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnresumeNull: Self = StObject.set(x, "onresume", null)
      
      @scala.inline
      def setOnresumeUndefined: Self = StObject.set(x, "onresume", js.undefined)
      
      @scala.inline
      def setOnstop(value: () => Unit): Self = StObject.set(x, "onstop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnstopNull: Self = StObject.set(x, "onstop", null)
      
      @scala.inline
      def setOnstopUndefined: Self = StObject.set(x, "onstop", js.undefined)
      
      @scala.inline
      def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
      
      @scala.inline
      def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaybackRateUndefined: Self = StObject.set(x, "playbackRate", js.undefined)
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionNull: Self = StObject.set(x, "position", null)
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToNull: Self = StObject.set(x, "to", null)
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeNull: Self = StObject.set(x, "type", null)
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUsePolicyFile(value: Boolean): Self = StObject.set(x, "usePolicyFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePolicyFileUndefined: Self = StObject.set(x, "usePolicyFile", js.undefined)
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
      
      @scala.inline
      def setWhileloading(value: () => Unit): Self = StObject.set(x, "whileloading", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWhileloadingNull: Self = StObject.set(x, "whileloading", null)
      
      @scala.inline
      def setWhileloadingUndefined: Self = StObject.set(x, "whileloading", js.undefined)
      
      @scala.inline
      def setWhileplaying(value: () => Unit): Self = StObject.set(x, "whileplaying", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWhileplayingNull: Self = StObject.set(x, "whileplaying", null)
      
      @scala.inline
      def setWhileplayingUndefined: Self = StObject.set(x, "whileplaying", js.undefined)
    }
  }
  
  trait Flash9Options extends StObject {
    
    var isMovieStar: js.UndefOr[`true` | Null] = js.undefined
    
    var onbufferchange: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var ondataerror: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var onfailure: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var useEQData: js.UndefOr[Boolean] = js.undefined
    
    var usePeakData: js.UndefOr[Boolean] = js.undefined
    
    var useWaveformData: js.UndefOr[Boolean] = js.undefined
  }
  object Flash9Options {
    
    @scala.inline
    def apply(): Flash9Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Flash9Options]
    }
    
    @scala.inline
    implicit class Flash9OptionsMutableBuilder[Self <: Flash9Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMovieStar(value: `true`): Self = StObject.set(x, "isMovieStar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMovieStarNull: Self = StObject.set(x, "isMovieStar", null)
      
      @scala.inline
      def setIsMovieStarUndefined: Self = StObject.set(x, "isMovieStar", js.undefined)
      
      @scala.inline
      def setOnbufferchange(value: () => Unit): Self = StObject.set(x, "onbufferchange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnbufferchangeNull: Self = StObject.set(x, "onbufferchange", null)
      
      @scala.inline
      def setOnbufferchangeUndefined: Self = StObject.set(x, "onbufferchange", js.undefined)
      
      @scala.inline
      def setOndataerror(value: () => Unit): Self = StObject.set(x, "ondataerror", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOndataerrorNull: Self = StObject.set(x, "ondataerror", null)
      
      @scala.inline
      def setOndataerrorUndefined: Self = StObject.set(x, "ondataerror", js.undefined)
      
      @scala.inline
      def setOnfailure(value: () => Unit): Self = StObject.set(x, "onfailure", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnfailureNull: Self = StObject.set(x, "onfailure", null)
      
      @scala.inline
      def setOnfailureUndefined: Self = StObject.set(x, "onfailure", js.undefined)
      
      @scala.inline
      def setUseEQData(value: Boolean): Self = StObject.set(x, "useEQData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseEQDataUndefined: Self = StObject.set(x, "useEQData", js.undefined)
      
      @scala.inline
      def setUsePeakData(value: Boolean): Self = StObject.set(x, "usePeakData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePeakDataUndefined: Self = StObject.set(x, "usePeakData", js.undefined)
      
      @scala.inline
      def setUseWaveformData(value: Boolean): Self = StObject.set(x, "useWaveformData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWaveformDataUndefined: Self = StObject.set(x, "useWaveformData", js.undefined)
    }
  }
  
  trait MovieStarOptions extends StObject {
    
    var bufferTime: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double | Null] = js.undefined
    
    var onconnect: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var serverURL: js.UndefOr[String | Null] = js.undefined
  }
  object MovieStarOptions {
    
    @scala.inline
    def apply(): MovieStarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MovieStarOptions]
    }
    
    @scala.inline
    implicit class MovieStarOptionsMutableBuilder[Self <: MovieStarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferTime(value: Double): Self = StObject.set(x, "bufferTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferTimeUndefined: Self = StObject.set(x, "bufferTime", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationNull: Self = StObject.set(x, "duration", null)
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setOnconnect(value: () => Unit): Self = StObject.set(x, "onconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnconnectNull: Self = StObject.set(x, "onconnect", null)
      
      @scala.inline
      def setOnconnectUndefined: Self = StObject.set(x, "onconnect", js.undefined)
      
      @scala.inline
      def setServerURL(value: String): Self = StObject.set(x, "serverURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerURLNull: Self = StObject.set(x, "serverURL", null)
      
      @scala.inline
      def setServerURLUndefined: Self = StObject.set(x, "serverURL", js.undefined)
    }
  }
  
  trait PeekData extends StObject {
    
    var left: Double
    
    var right: Double
  }
  object PeekData {
    
    @scala.inline
    def apply(left: Double, right: Double): PeekData = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeekData]
    }
    
    @scala.inline
    implicit class PeekDataMutableBuilder[Self <: PeekData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SMSound extends StObject {
    
    // Dynamic Properties
    var buffered: js.Array[js.Object] = js.native
    
    var bytesLoaded: Double | Null = js.native
    
    var bytesTotal: Double | Null = js.native
    
    var connected: Boolean = js.native
    
    // Methods
    def destruct(): Unit = js.native
    
    var duration: Double | Null = js.native
    
    var durationEstimate: Double | Null = js.native
    
    // Parameters, instance options.
    var id: String = js.native
    
    var isBuffering: Boolean = js.native
    
    var isHTML5: Boolean = js.native
    
    def load(options: js.Object): SMSound = js.native
    
    var loaded: Boolean = js.native
    
    def mute(): SMSound = js.native
    
    var muted: Boolean = js.native
    
    // clearOnPosition(): void;
    def onPosition(mescOffest: Double, callback: js.Object, has: js.Any): SMSound = js.native
    
    // Events
    var onbufferchange: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onconnect: js.UndefOr[js.Function0[Unit]] = js.native
    
    var ondataerror: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onerror: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onfinish: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onid3: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onload: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onpause: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onplay: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onresume: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onstop: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onsuspend: js.UndefOr[js.Function0[Unit]] = js.native
    
    var pan: Double = js.native
    
    def pause(): SMSound = js.native
    
    var paused: Boolean = js.native
    
    var peekData: PeekData = js.native
    
    def play(): SMSound = js.native
    def play(id: String): SMSound = js.native
    def play(id: String, options: DefaultOptions): SMSound = js.native
    def play(id: Unit, options: DefaultOptions): SMSound = js.native
    
    var playState: Double = js.native
    
    var position: Double = js.native
    
    var readyState: Double = js.native
    
    def resume(): SMSound = js.native
    
    def setPan(volume: Double): SMSound = js.native
    
    def setPosition(msecOffset: Double): SMSound = js.native
    
    def setVolume(volume: Double): SMSound = js.native
    
    def stop(): SMSound = js.native
    
    def toggleMute(): SMSound = js.native
    
    def togglePause(): SMSound = js.native
    
    def unload(): SMSound = js.native
    
    def unmute(): SMSound = js.native
    
    var url: String = js.native
    
    var volume: Double = js.native
    
    var whileloading: js.UndefOr[js.Function0[Unit]] = js.native
    
    var whileplaying: js.UndefOr[js.Function0[Unit]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.soundmanager2.soundmanager2Strings.always
    - typings.soundmanager2.soundmanager2Strings.sameDomain
  */
  trait ScriptAccess extends StObject
  object ScriptAccess {
    
    @scala.inline
    def always: typings.soundmanager2.soundmanager2Strings.always = "always".asInstanceOf[typings.soundmanager2.soundmanager2Strings.always]
    
    @scala.inline
    def sameDomain: typings.soundmanager2.soundmanager2Strings.sameDomain = "sameDomain".asInstanceOf[typings.soundmanager2.soundmanager2Strings.sameDomain]
  }
  
  @js.native
  trait SoundManager
    extends StObject
       with SoundManagerProps {
    
    var audioFormats: js.UndefOr[StringDictionary[SoundManagerAudioFormat]] = js.native
    
    def canPlayLink(domElement: HTMLElement): Boolean = js.native
    
    def canPlayMIME(MIMEtype: String): Boolean = js.native
    
    def canPlayURL(mediaURL: String): Boolean = js.native
    
    def clearOnPosition(id: String, msecOffset: Double): SMSound = js.native
    def clearOnPosition(id: String, msecOffset: Double, callback: js.Function0[Unit]): SMSound = js.native
    
    /**
      * Creates a sound object, supporting an arbitrary number of optional arguments. Returns a SMSound object instance. At minimum, a url parameter is required.
      */
    def createSound(properties: SoundProperties): SMSound = js.native
    
    def destroySound(id: String): Unit = js.native
    
    def getMemoryUse(): Double = js.native
    
    def getSoundById(id: String): SMSound = js.native
    
    def load(id: String): SMSound = js.native
    def load(id: String, options: js.Object): SMSound = js.native
    
    def mute(): SMSound = js.native
    def mute(id: String): SMSound = js.native
    
    def ok(): Boolean = js.native
    
    def onPosition(id: String, msecOffset: Double, callback: js.Function1[/* eventPosition */ js.Any, Unit]): SMSound = js.native
    
    def pause(id: String): SMSound = js.native
    
    def pauseAll(): Unit = js.native
    
    def play(): SMSound = js.native
    def play(id: String): SMSound = js.native
    def play(id: String, options: DefaultOptions): SMSound = js.native
    def play(id: String, options: Flash9Options): SMSound = js.native
    def play(id: Unit, options: DefaultOptions): SMSound = js.native
    def play(id: Unit, options: Flash9Options): SMSound = js.native
    
    def reboot(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def resume(id: String): SMSound = js.native
    
    def resumeAll(): Unit = js.native
    
    def setPan(id: String, volume: Double): SMSound = js.native
    
    def setPlaybackRate(id: String, playbackRate: Double): Unit = js.native
    
    def setPosition(id: String, msecOffset: Double): SMSound = js.native
    
    def setVolume(id: String, volume: Double): SMSound = js.native
    /**
      * Sets the volume of all sound objects. Accepted values: 0-100. Affects volume property.
      * @param volume Volume of all sound objects. Accepted values: 0 - 100
      */
    def setVolume(volume: Double): Unit = js.native
    
    def setup(options: SoundManagerProps): SoundManager = js.native
    
    def stop(id: String): SMSound = js.native
    
    def stopAll(): Unit = js.native
    
    def toggleMute(id: String): SMSound = js.native
    
    def togglePause(id: String): SMSound = js.native
    
    def unload(id: String): SMSound = js.native
    
    def unmute(): SMSound = js.native
    def unmute(id: String): SMSound = js.native
  }
  
  trait SoundManagerAudioFormat extends StObject {
    
    var related: js.UndefOr[js.Array[String]] = js.undefined
    
    var required: Boolean
    
    var `type`: js.Array[String]
  }
  object SoundManagerAudioFormat {
    
    @scala.inline
    def apply(required: Boolean, `type`: js.Array[String]): SoundManagerAudioFormat = {
      val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SoundManagerAudioFormat]
    }
    
    @scala.inline
    implicit class SoundManagerAudioFormatMutableBuilder[Self <: SoundManagerAudioFormat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRelated(value: js.Array[String]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
      
      @scala.inline
      def setRelatedVarargs(value: String*): Self = StObject.set(x, "related", js.Array(value :_*))
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
  
  trait SoundManagerProps extends StObject {
    
    var allowScriptAccess: js.UndefOr[ScriptAccess] = js.undefined
    
    var altURL: js.UndefOr[String] = js.undefined
    
    var bgColor: js.UndefOr[String] = js.undefined
    
    var consoleOnly: js.UndefOr[Boolean] = js.undefined
    
    var debugFlash: js.UndefOr[Boolean] = js.undefined
    
    var debugMode: js.UndefOr[Boolean] = js.undefined
    
    var defaultOptions: js.UndefOr[DefaultOptions] = js.undefined
    
    /**
      * Some properties are dynamic, determined at initialisation or later
      * during runtime, and should be treated as read-only.
      */
    val features: js.UndefOr[js.Object] = js.undefined
    
    var flash9Options: js.UndefOr[Flash9Options] = js.undefined
    
    // html5PollingInterval: number;
    // html5Test: string;
    var flashLoadTimeout: js.UndefOr[Double] = js.undefined
    
    var flashVersion: js.UndefOr[Double] = js.undefined
    
    // flashPollingInterval: number;
    var forceUseGlobalHTML5Audio: js.UndefOr[Boolean] = js.undefined
    
    val html5Only: js.UndefOr[Boolean] = js.undefined
    
    var idPrefix: js.UndefOr[String] = js.undefined
    
    var ignoreMobileRestrications: js.UndefOr[Boolean] = js.undefined
    
    var movieStarOptions: js.UndefOr[MovieStarOptions] = js.undefined
    
    var noSWFCache: js.UndefOr[Boolean] = js.undefined
    
    var onready: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var ontimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var preferFlash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The directory where SM2 can find the flash movies (soundmanager2.swf,
      * soundmanager2_flash9.swf and debug versions etc.) Note that SM2 will
      * append the correct SWF file name, depending on flashVersion and
      * debugMode settings.
      */
    var url: js.UndefOr[String] = js.undefined
    
    var useAltURL: js.UndefOr[Boolean] = js.undefined
    
    var useConsole: js.UndefOr[Boolean] = js.undefined
    
    var useFlashBlock: js.UndefOr[Boolean] = js.undefined
    
    var useHTML5Audio: js.UndefOr[Boolean] = js.undefined
    
    var useHighPerformance: js.UndefOr[Boolean] = js.undefined
    
    var waitForWindowLoad: js.UndefOr[`false`] = js.undefined
    
    var wmode: js.UndefOr[String | Null] = js.undefined
  }
  object SoundManagerProps {
    
    @scala.inline
    def apply(): SoundManagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoundManagerProps]
    }
    
    @scala.inline
    implicit class SoundManagerPropsMutableBuilder[Self <: SoundManagerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowScriptAccess(value: ScriptAccess): Self = StObject.set(x, "allowScriptAccess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowScriptAccessUndefined: Self = StObject.set(x, "allowScriptAccess", js.undefined)
      
      @scala.inline
      def setAltURL(value: String): Self = StObject.set(x, "altURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltURLUndefined: Self = StObject.set(x, "altURL", js.undefined)
      
      @scala.inline
      def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      @scala.inline
      def setConsoleOnly(value: Boolean): Self = StObject.set(x, "consoleOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsoleOnlyUndefined: Self = StObject.set(x, "consoleOnly", js.undefined)
      
      @scala.inline
      def setDebugFlash(value: Boolean): Self = StObject.set(x, "debugFlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugFlashUndefined: Self = StObject.set(x, "debugFlash", js.undefined)
      
      @scala.inline
      def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      @scala.inline
      def setDefaultOptions(value: DefaultOptions): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
      
      @scala.inline
      def setFeatures(value: js.Object): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      @scala.inline
      def setFlash9Options(value: Flash9Options): Self = StObject.set(x, "flash9Options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlash9OptionsUndefined: Self = StObject.set(x, "flash9Options", js.undefined)
      
      @scala.inline
      def setFlashLoadTimeout(value: Double): Self = StObject.set(x, "flashLoadTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlashLoadTimeoutUndefined: Self = StObject.set(x, "flashLoadTimeout", js.undefined)
      
      @scala.inline
      def setFlashVersion(value: Double): Self = StObject.set(x, "flashVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlashVersionUndefined: Self = StObject.set(x, "flashVersion", js.undefined)
      
      @scala.inline
      def setForceUseGlobalHTML5Audio(value: Boolean): Self = StObject.set(x, "forceUseGlobalHTML5Audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUseGlobalHTML5AudioUndefined: Self = StObject.set(x, "forceUseGlobalHTML5Audio", js.undefined)
      
      @scala.inline
      def setHtml5Only(value: Boolean): Self = StObject.set(x, "html5Only", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtml5OnlyUndefined: Self = StObject.set(x, "html5Only", js.undefined)
      
      @scala.inline
      def setIdPrefix(value: String): Self = StObject.set(x, "idPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdPrefixUndefined: Self = StObject.set(x, "idPrefix", js.undefined)
      
      @scala.inline
      def setIgnoreMobileRestrications(value: Boolean): Self = StObject.set(x, "ignoreMobileRestrications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreMobileRestricationsUndefined: Self = StObject.set(x, "ignoreMobileRestrications", js.undefined)
      
      @scala.inline
      def setMovieStarOptions(value: MovieStarOptions): Self = StObject.set(x, "movieStarOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovieStarOptionsUndefined: Self = StObject.set(x, "movieStarOptions", js.undefined)
      
      @scala.inline
      def setNoSWFCache(value: Boolean): Self = StObject.set(x, "noSWFCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSWFCacheUndefined: Self = StObject.set(x, "noSWFCache", js.undefined)
      
      @scala.inline
      def setOnready(value: () => Unit): Self = StObject.set(x, "onready", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnreadyUndefined: Self = StObject.set(x, "onready", js.undefined)
      
      @scala.inline
      def setOntimeout(value: () => Unit): Self = StObject.set(x, "ontimeout", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOntimeoutUndefined: Self = StObject.set(x, "ontimeout", js.undefined)
      
      @scala.inline
      def setPreferFlash(value: Boolean): Self = StObject.set(x, "preferFlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferFlashUndefined: Self = StObject.set(x, "preferFlash", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUseAltURL(value: Boolean): Self = StObject.set(x, "useAltURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseAltURLUndefined: Self = StObject.set(x, "useAltURL", js.undefined)
      
      @scala.inline
      def setUseConsole(value: Boolean): Self = StObject.set(x, "useConsole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseConsoleUndefined: Self = StObject.set(x, "useConsole", js.undefined)
      
      @scala.inline
      def setUseFlashBlock(value: Boolean): Self = StObject.set(x, "useFlashBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFlashBlockUndefined: Self = StObject.set(x, "useFlashBlock", js.undefined)
      
      @scala.inline
      def setUseHTML5Audio(value: Boolean): Self = StObject.set(x, "useHTML5Audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseHTML5AudioUndefined: Self = StObject.set(x, "useHTML5Audio", js.undefined)
      
      @scala.inline
      def setUseHighPerformance(value: Boolean): Self = StObject.set(x, "useHighPerformance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseHighPerformanceUndefined: Self = StObject.set(x, "useHighPerformance", js.undefined)
      
      @scala.inline
      def setWaitForWindowLoad(value: `false`): Self = StObject.set(x, "waitForWindowLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForWindowLoadUndefined: Self = StObject.set(x, "waitForWindowLoad", js.undefined)
      
      @scala.inline
      def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWmodeNull: Self = StObject.set(x, "wmode", null)
      
      @scala.inline
      def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
    }
  }
  
  trait SoundProperties
    extends StObject
       with DefaultOptions {
    
    var id: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object SoundProperties {
    
    @scala.inline
    def apply(url: String): SoundProperties = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SoundProperties]
    }
    
    @scala.inline
    implicit class SoundPropertiesMutableBuilder[Self <: SoundProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
