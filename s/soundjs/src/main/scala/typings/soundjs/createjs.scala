package typings.soundjs

import typings.createjsLib.createjs.EventDispatcher
import typings.preloadjs.createjs.AbstractLoader
import typings.std.AudioContext
import typings.std.AudioNode
import typings.std.DynamicsCompressorNode
import typings.std.GainNode
import typings.std.PannerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createjs {
  
  @js.native
  trait AbstractPlugin extends StObject {
    
    // methods
    def create(src: String, startTime: Double, duration: Double): AbstractSoundInstance = js.native
    
    def getVolume(): Double = js.native
    
    def isPreloadComplete(src: String): Boolean = js.native
    
    def isPreloadStarted(src: String): Boolean = js.native
    
    def isSupported(): Boolean = js.native
    
    def preload(loader: js.Object): Unit = js.native
    
    def register(loadItem: String, instances: Double): js.Object = js.native
    
    def removeAllSounds(src: String): Unit = js.native
    
    def removeSound(src: String): Unit = js.native
    
    def setMute(value: Boolean): Boolean = js.native
    
    def setVolume(value: Double): Boolean = js.native
  }
  object AbstractPlugin {
    
    @scala.inline
    def apply(
      create: (String, Double, Double) => AbstractSoundInstance,
      getVolume: () => Double,
      isPreloadComplete: String => Boolean,
      isPreloadStarted: String => Boolean,
      isSupported: () => Boolean,
      preload: js.Object => Unit,
      register: (String, Double) => js.Object,
      removeAllSounds: String => Unit,
      removeSound: String => Unit,
      setMute: Boolean => Boolean,
      setVolume: Double => Boolean
    ): AbstractPlugin = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), getVolume = js.Any.fromFunction0(getVolume), isPreloadComplete = js.Any.fromFunction1(isPreloadComplete), isPreloadStarted = js.Any.fromFunction1(isPreloadStarted), isSupported = js.Any.fromFunction0(isSupported), preload = js.Any.fromFunction1(preload), register = js.Any.fromFunction2(register), removeAllSounds = js.Any.fromFunction1(removeAllSounds), removeSound = js.Any.fromFunction1(removeSound), setMute = js.Any.fromFunction1(setMute), setVolume = js.Any.fromFunction1(setVolume))
      __obj.asInstanceOf[AbstractPlugin]
    }
    
    @scala.inline
    implicit class AbstractPluginMutableBuilder[Self <: AbstractPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: (String, Double, Double) => AbstractSoundInstance): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetVolume(value: () => Double): Self = StObject.set(x, "getVolume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPreloadComplete(value: String => Boolean): Self = StObject.set(x, "isPreloadComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsPreloadStarted(value: String => Boolean): Self = StObject.set(x, "isPreloadStarted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsSupported(value: () => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreload(value: js.Object => Unit): Self = StObject.set(x, "preload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRegister(value: (String, Double) => js.Object): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveAllSounds(value: String => Unit): Self = StObject.set(x, "removeAllSounds", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveSound(value: String => Unit): Self = StObject.set(x, "removeSound", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMute(value: Boolean => Boolean): Self = StObject.set(x, "setMute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVolume(value: Double => Boolean): Self = StObject.set(x, "setVolume", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait AbstractSoundInstance extends EventDispatcher {
    
    // methods
    def destroy(): Unit = js.native
    
    // properties
    var duration: Double = js.native
    
    def getDuration(): Double = js.native
    
    def getLoop(): Double = js.native
    
    def getMute(): Boolean = js.native
    
    def getPan(): Double = js.native
    
    def getPaused(): Boolean = js.native
    
    def getPosition(): Double = js.native
    
    def getVolume(): Double = js.native
    
    var loop: Double = js.native
    
    var muted: Boolean = js.native
    
    var pan: Double = js.native
    
    var paused: Boolean = js.native
    
    def play(
      interrupt: js.UndefOr[String | js.Object],
      delay: js.UndefOr[Double],
      offset: js.UndefOr[Double],
      loop: js.UndefOr[Double],
      volume: js.UndefOr[Double],
      pan: js.UndefOr[Double]
    ): AbstractSoundInstance = js.native
    
    var playState: String = js.native
    
    var playbackResource: js.Object = js.native
    
    var position: Double = js.native
    
    def setDuration(value: Double): AbstractSoundInstance = js.native
    
    def setLoop(value: Double): Unit = js.native
    
    def setMute(value: Boolean): AbstractSoundInstance = js.native
    
    def setPan(value: Double): AbstractSoundInstance = js.native
    
    def setPlayback(value: js.Object): AbstractSoundInstance = js.native
    
    def setPosition(value: Double): AbstractSoundInstance = js.native
    
    def setVolume(value: Double): AbstractSoundInstance = js.native
    
    var src: String = js.native
    
    def stop(): AbstractSoundInstance = js.native
    
    var uniqueId: Double | String = js.native
    
    var volume: Double = js.native
  }
  
  @js.native
  trait FlashAudioLoader extends AbstractLoader {
    
    // properties
    var flashId: String = js.native
    
    // methods
    def setFlash(flash: js.Object): Unit = js.native
  }
  
  @js.native
  trait FlashAudioPlugin extends AbstractPlugin {
    
    // properties
    var flashReady: Boolean = js.native
    
    var showOutput: Boolean = js.native
  }
  object FlashAudioPlugin {
    
    @scala.inline
    def apply(
      create: (String, Double, Double) => AbstractSoundInstance,
      flashReady: Boolean,
      getVolume: () => Double,
      isPreloadComplete: String => Boolean,
      isPreloadStarted: String => Boolean,
      isSupported: () => Boolean,
      preload: js.Object => Unit,
      register: (String, Double) => js.Object,
      removeAllSounds: String => Unit,
      removeSound: String => Unit,
      setMute: Boolean => Boolean,
      setVolume: Double => Boolean,
      showOutput: Boolean
    ): FlashAudioPlugin = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), flashReady = flashReady.asInstanceOf[js.Any], getVolume = js.Any.fromFunction0(getVolume), isPreloadComplete = js.Any.fromFunction1(isPreloadComplete), isPreloadStarted = js.Any.fromFunction1(isPreloadStarted), isSupported = js.Any.fromFunction0(isSupported), preload = js.Any.fromFunction1(preload), register = js.Any.fromFunction2(register), removeAllSounds = js.Any.fromFunction1(removeAllSounds), removeSound = js.Any.fromFunction1(removeSound), setMute = js.Any.fromFunction1(setMute), setVolume = js.Any.fromFunction1(setVolume), showOutput = showOutput.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlashAudioPlugin]
    }
    
    @scala.inline
    implicit class FlashAudioPluginMutableBuilder[Self <: FlashAudioPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlashReady(value: Boolean): Self = StObject.set(x, "flashReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOutput(value: Boolean): Self = StObject.set(x, "showOutput", value.asInstanceOf[js.Any])
    }
  }
  
  type FlashAudioSoundInstance = AbstractSoundInstance
  
  @js.native
  trait FlashPlugin extends StObject {
    
    // methods
    def create(src: String): AbstractSoundInstance = js.native
    
    var flashReady: Boolean = js.native
    
    def getVolume(): Double = js.native
    
    def isPreloadStarted(src: String): Boolean = js.native
    
    def preload(src: String, instance: js.Object): Unit = js.native
    
    def register(src: String, instances: Double): js.Object = js.native
    
    def removeAllSounds(): Unit = js.native
    
    def removeSound(src: String): Unit = js.native
    
    def setMute(value: Boolean): Boolean = js.native
    
    def setVolume(value: Double): Boolean = js.native
    
    var showOutput: Boolean = js.native
  }
  object FlashPlugin {
    
    @scala.inline
    def apply(
      create: String => AbstractSoundInstance,
      flashReady: Boolean,
      getVolume: () => Double,
      isPreloadStarted: String => Boolean,
      preload: (String, js.Object) => Unit,
      register: (String, Double) => js.Object,
      removeAllSounds: () => Unit,
      removeSound: String => Unit,
      setMute: Boolean => Boolean,
      setVolume: Double => Boolean,
      showOutput: Boolean
    ): FlashPlugin = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), flashReady = flashReady.asInstanceOf[js.Any], getVolume = js.Any.fromFunction0(getVolume), isPreloadStarted = js.Any.fromFunction1(isPreloadStarted), preload = js.Any.fromFunction2(preload), register = js.Any.fromFunction2(register), removeAllSounds = js.Any.fromFunction0(removeAllSounds), removeSound = js.Any.fromFunction1(removeSound), setMute = js.Any.fromFunction1(setMute), setVolume = js.Any.fromFunction1(setVolume), showOutput = showOutput.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlashPlugin]
    }
    
    @scala.inline
    implicit class FlashPluginMutableBuilder[Self <: FlashPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: String => AbstractSoundInstance): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlashReady(value: Boolean): Self = StObject.set(x, "flashReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetVolume(value: () => Double): Self = StObject.set(x, "getVolume", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsPreloadStarted(value: String => Boolean): Self = StObject.set(x, "isPreloadStarted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreload(value: (String, js.Object) => Unit): Self = StObject.set(x, "preload", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRegister(value: (String, Double) => js.Object): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveAllSounds(value: () => Unit): Self = StObject.set(x, "removeAllSounds", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemoveSound(value: String => Unit): Self = StObject.set(x, "removeSound", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetMute(value: Boolean => Boolean): Self = StObject.set(x, "setMute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetVolume(value: Double => Boolean): Self = StObject.set(x, "setVolume", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowOutput(value: Boolean): Self = StObject.set(x, "showOutput", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HTMLAudioPlugin extends AbstractPlugin {
    
    // properties
    var defaultNumChannels: Double = js.native
    
    var enableIOS: Boolean = js.native
  }
  object HTMLAudioPlugin {
    
    @scala.inline
    def apply(
      create: (String, Double, Double) => AbstractSoundInstance,
      defaultNumChannels: Double,
      enableIOS: Boolean,
      getVolume: () => Double,
      isPreloadComplete: String => Boolean,
      isPreloadStarted: String => Boolean,
      isSupported: () => Boolean,
      preload: js.Object => Unit,
      register: (String, Double) => js.Object,
      removeAllSounds: String => Unit,
      removeSound: String => Unit,
      setMute: Boolean => Boolean,
      setVolume: Double => Boolean
    ): HTMLAudioPlugin = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), defaultNumChannels = defaultNumChannels.asInstanceOf[js.Any], enableIOS = enableIOS.asInstanceOf[js.Any], getVolume = js.Any.fromFunction0(getVolume), isPreloadComplete = js.Any.fromFunction1(isPreloadComplete), isPreloadStarted = js.Any.fromFunction1(isPreloadStarted), isSupported = js.Any.fromFunction0(isSupported), preload = js.Any.fromFunction1(preload), register = js.Any.fromFunction2(register), removeAllSounds = js.Any.fromFunction1(removeAllSounds), removeSound = js.Any.fromFunction1(removeSound), setMute = js.Any.fromFunction1(setMute), setVolume = js.Any.fromFunction1(setVolume))
      __obj.asInstanceOf[HTMLAudioPlugin]
    }
    
    @scala.inline
    implicit class HTMLAudioPluginMutableBuilder[Self <: HTMLAudioPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultNumChannels(value: Double): Self = StObject.set(x, "defaultNumChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableIOS(value: Boolean): Self = StObject.set(x, "enableIOS", value.asInstanceOf[js.Any])
    }
  }
  
  type HTMLAudioSoundInstance = AbstractSoundInstance
  
  @js.native
  trait HTMLAudioTagPool extends StObject
  
  @js.native
  trait PlayPropsConfig extends StObject {
    
    var delay: Double = js.native
    
    var duration: Double = js.native
    
    var interrupt: String = js.native
    
    var loop: Double = js.native
    
    var offset: Double = js.native
    
    var pan: Double = js.native
    
    def set(props: js.Any): PlayPropsConfig = js.native
    
    var startTime: Double = js.native
    
    var volume: Double = js.native
  }
  object PlayPropsConfig {
    
    @scala.inline
    def apply(
      delay: Double,
      duration: Double,
      interrupt: String,
      loop: Double,
      offset: Double,
      pan: Double,
      set: js.Any => PlayPropsConfig,
      startTime: Double,
      volume: Double
    ): PlayPropsConfig = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], interrupt = interrupt.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), startTime = startTime.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayPropsConfig]
    }
    
    @scala.inline
    implicit class PlayPropsConfigMutableBuilder[Self <: PlayPropsConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterrupt(value: String): Self = StObject.set(x, "interrupt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: js.Any => PlayPropsConfig): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
  
  type Sound = EventDispatcher
  
  @js.native
  trait SoundJS extends StObject
  
  @js.native
  trait WebAudioLoader extends StObject
  
  @js.native
  trait WebAudioPlugin extends AbstractPlugin {
    
    var context: AudioContext = js.native
    
    var dynamicsCompressorNode: DynamicsCompressorNode = js.native
    
    var gainNode: GainNode = js.native
  }
  object WebAudioPlugin {
    
    @scala.inline
    def apply(
      context: AudioContext,
      create: (String, Double, Double) => AbstractSoundInstance,
      dynamicsCompressorNode: DynamicsCompressorNode,
      gainNode: GainNode,
      getVolume: () => Double,
      isPreloadComplete: String => Boolean,
      isPreloadStarted: String => Boolean,
      isSupported: () => Boolean,
      preload: js.Object => Unit,
      register: (String, Double) => js.Object,
      removeAllSounds: String => Unit,
      removeSound: String => Unit,
      setMute: Boolean => Boolean,
      setVolume: Double => Boolean
    ): WebAudioPlugin = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], create = js.Any.fromFunction3(create), dynamicsCompressorNode = dynamicsCompressorNode.asInstanceOf[js.Any], gainNode = gainNode.asInstanceOf[js.Any], getVolume = js.Any.fromFunction0(getVolume), isPreloadComplete = js.Any.fromFunction1(isPreloadComplete), isPreloadStarted = js.Any.fromFunction1(isPreloadStarted), isSupported = js.Any.fromFunction0(isSupported), preload = js.Any.fromFunction1(preload), register = js.Any.fromFunction2(register), removeAllSounds = js.Any.fromFunction1(removeAllSounds), removeSound = js.Any.fromFunction1(removeSound), setMute = js.Any.fromFunction1(setMute), setVolume = js.Any.fromFunction1(setVolume))
      __obj.asInstanceOf[WebAudioPlugin]
    }
    
    @scala.inline
    implicit class WebAudioPluginMutableBuilder[Self <: WebAudioPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: AudioContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicsCompressorNode(value: DynamicsCompressorNode): Self = StObject.set(x, "dynamicsCompressorNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGainNode(value: GainNode): Self = StObject.set(x, "gainNode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebAudioSoundInstance extends AbstractSoundInstance {
    
    var gainNode: GainNode = js.native
    
    var panNode: PannerNode = js.native
    
    var sourceNode: AudioNode = js.native
  }
}
