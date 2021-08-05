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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createjs {
  
  trait AbstractPlugin extends StObject {
    
    // methods
    def create(src: String, startTime: Double, duration: Double): AbstractSoundInstance
    
    def getVolume(): Double
    
    def isPreloadComplete(src: String): Boolean
    
    def isPreloadStarted(src: String): Boolean
    
    def isSupported(): Boolean
    
    def preload(loader: js.Object): Unit
    
    def register(loadItem: String, instances: Double): js.Object
    
    def removeAllSounds(src: String): Unit
    
    def removeSound(src: String): Unit
    
    def setMute(value: Boolean): Boolean
    
    def setVolume(value: Double): Boolean
  }
  object AbstractPlugin {
    
    inline def apply(
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
    
    extension [Self <: AbstractPlugin](x: Self) {
      
      inline def setCreate(value: (String, Double, Double) => AbstractSoundInstance): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
      
      inline def setGetVolume(value: () => Double): Self = StObject.set(x, "getVolume", js.Any.fromFunction0(value))
      
      inline def setIsPreloadComplete(value: String => Boolean): Self = StObject.set(x, "isPreloadComplete", js.Any.fromFunction1(value))
      
      inline def setIsPreloadStarted(value: String => Boolean): Self = StObject.set(x, "isPreloadStarted", js.Any.fromFunction1(value))
      
      inline def setIsSupported(value: () => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction0(value))
      
      inline def setPreload(value: js.Object => Unit): Self = StObject.set(x, "preload", js.Any.fromFunction1(value))
      
      inline def setRegister(value: (String, Double) => js.Object): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
      
      inline def setRemoveAllSounds(value: String => Unit): Self = StObject.set(x, "removeAllSounds", js.Any.fromFunction1(value))
      
      inline def setRemoveSound(value: String => Unit): Self = StObject.set(x, "removeSound", js.Any.fromFunction1(value))
      
      inline def setSetMute(value: Boolean => Boolean): Self = StObject.set(x, "setMute", js.Any.fromFunction1(value))
      
      inline def setSetVolume(value: Double => Boolean): Self = StObject.set(x, "setVolume", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait AbstractSoundInstance
    extends StObject
       with EventDispatcher {
    
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
  trait FlashAudioLoader
    extends StObject
       with AbstractLoader {
    
    // properties
    var flashId: String = js.native
    
    // methods
    def setFlash(flash: js.Object): Unit = js.native
  }
  
  trait FlashAudioPlugin
    extends StObject
       with AbstractPlugin {
    
    // properties
    var flashReady: Boolean
    
    var showOutput: Boolean
  }
  object FlashAudioPlugin {
    
    inline def apply(
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
    
    extension [Self <: FlashAudioPlugin](x: Self) {
      
      inline def setFlashReady(value: Boolean): Self = StObject.set(x, "flashReady", value.asInstanceOf[js.Any])
      
      inline def setShowOutput(value: Boolean): Self = StObject.set(x, "showOutput", value.asInstanceOf[js.Any])
    }
  }
  
  type FlashAudioSoundInstance = AbstractSoundInstance
  
  trait FlashPlugin extends StObject {
    
    // methods
    def create(src: String): AbstractSoundInstance
    
    var flashReady: Boolean
    
    def getVolume(): Double
    
    def isPreloadStarted(src: String): Boolean
    
    def preload(src: String, instance: js.Object): Unit
    
    def register(src: String, instances: Double): js.Object
    
    def removeAllSounds(): Unit
    
    def removeSound(src: String): Unit
    
    def setMute(value: Boolean): Boolean
    
    def setVolume(value: Double): Boolean
    
    var showOutput: Boolean
  }
  object FlashPlugin {
    
    inline def apply(
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
    
    extension [Self <: FlashPlugin](x: Self) {
      
      inline def setCreate(value: String => AbstractSoundInstance): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setFlashReady(value: Boolean): Self = StObject.set(x, "flashReady", value.asInstanceOf[js.Any])
      
      inline def setGetVolume(value: () => Double): Self = StObject.set(x, "getVolume", js.Any.fromFunction0(value))
      
      inline def setIsPreloadStarted(value: String => Boolean): Self = StObject.set(x, "isPreloadStarted", js.Any.fromFunction1(value))
      
      inline def setPreload(value: (String, js.Object) => Unit): Self = StObject.set(x, "preload", js.Any.fromFunction2(value))
      
      inline def setRegister(value: (String, Double) => js.Object): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
      
      inline def setRemoveAllSounds(value: () => Unit): Self = StObject.set(x, "removeAllSounds", js.Any.fromFunction0(value))
      
      inline def setRemoveSound(value: String => Unit): Self = StObject.set(x, "removeSound", js.Any.fromFunction1(value))
      
      inline def setSetMute(value: Boolean => Boolean): Self = StObject.set(x, "setMute", js.Any.fromFunction1(value))
      
      inline def setSetVolume(value: Double => Boolean): Self = StObject.set(x, "setVolume", js.Any.fromFunction1(value))
      
      inline def setShowOutput(value: Boolean): Self = StObject.set(x, "showOutput", value.asInstanceOf[js.Any])
    }
  }
  
  trait HTMLAudioPlugin
    extends StObject
       with AbstractPlugin {
    
    // properties
    var defaultNumChannels: Double
    
    var enableIOS: Boolean
  }
  object HTMLAudioPlugin {
    
    inline def apply(
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
    
    extension [Self <: HTMLAudioPlugin](x: Self) {
      
      inline def setDefaultNumChannels(value: Double): Self = StObject.set(x, "defaultNumChannels", value.asInstanceOf[js.Any])
      
      inline def setEnableIOS(value: Boolean): Self = StObject.set(x, "enableIOS", value.asInstanceOf[js.Any])
    }
  }
  
  type HTMLAudioSoundInstance = AbstractSoundInstance
  
  trait HTMLAudioTagPool extends StObject
  
  trait PlayPropsConfig extends StObject {
    
    var delay: Double
    
    var duration: Double
    
    var interrupt: String
    
    var loop: Double
    
    var offset: Double
    
    var pan: Double
    
    def set(props: js.Any): PlayPropsConfig
    
    var startTime: Double
    
    var volume: Double
  }
  object PlayPropsConfig {
    
    inline def apply(
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
    
    extension [Self <: PlayPropsConfig](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setInterrupt(value: String): Self = StObject.set(x, "interrupt", value.asInstanceOf[js.Any])
      
      inline def setLoop(value: Double): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      inline def setSet(value: js.Any => PlayPropsConfig): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
  
  type Sound = EventDispatcher
  
  trait SoundJS extends StObject
  
  trait WebAudioLoader extends StObject
  
  trait WebAudioPlugin
    extends StObject
       with AbstractPlugin {
    
    var context: AudioContext
    
    var dynamicsCompressorNode: DynamicsCompressorNode
    
    var gainNode: GainNode
  }
  object WebAudioPlugin {
    
    inline def apply(
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
    
    extension [Self <: WebAudioPlugin](x: Self) {
      
      inline def setContext(value: AudioContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDynamicsCompressorNode(value: DynamicsCompressorNode): Self = StObject.set(x, "dynamicsCompressorNode", value.asInstanceOf[js.Any])
      
      inline def setGainNode(value: GainNode): Self = StObject.set(x, "gainNode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebAudioSoundInstance
    extends StObject
       with AbstractSoundInstance {
    
    var gainNode: GainNode = js.native
    
    var panNode: PannerNode = js.native
    
    var sourceNode: AudioNode = js.native
  }
}
