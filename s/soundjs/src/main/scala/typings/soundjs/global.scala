package typings.soundjs

import typings.createjsLib.createjs.Event
import typings.createjsLib.createjs.EventDispatcher
import typings.soundjs.anon.HandleEvent
import typings.soundjs.anon.`0`
import typings.std.AudioContext
import typings.std.AudioNode
import typings.std.DynamicsCompressorNode
import typings.std.GainNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object createjs {
    
    @JSGlobal("createjs.AbstractPlugin")
    @js.native
    open class AbstractPlugin ()
      extends StObject
         with typings.soundjs.createjs.AbstractPlugin {
      
      // methods
      /* CompleteClass */
      override def create(src: String, startTime: Double, duration: Double): typings.soundjs.createjs.AbstractSoundInstance = js.native
      
      /* CompleteClass */
      override def getVolume(): Double = js.native
      
      /* CompleteClass */
      override def isPreloadComplete(src: String): Boolean = js.native
      
      /* CompleteClass */
      override def isPreloadStarted(src: String): Boolean = js.native
      
      /* CompleteClass */
      override def isSupported(): Boolean = js.native
      
      /* CompleteClass */
      override def preload(loader: js.Object): Unit = js.native
      
      /* CompleteClass */
      override def register(loadItem: String, instances: Double): js.Object = js.native
      
      /* CompleteClass */
      override def removeAllSounds(src: String): Unit = js.native
      
      /* CompleteClass */
      override def removeSound(src: String): Unit = js.native
      
      /* CompleteClass */
      override def setMute(value: Boolean): Boolean = js.native
      
      /* CompleteClass */
      override def setVolume(value: Double): Boolean = js.native
    }
    
    @JSGlobal("createjs.AbstractSoundInstance")
    @js.native
    open class AbstractSoundInstance protected ()
      extends StObject
         with typings.soundjs.createjs.AbstractSoundInstance {
      def this(src: String, startTime: Double, duration: Double, playbackResource: js.Object) = this()
    }
    
    @JSGlobal("createjs.FlashAudioLoader")
    @js.native
    open class FlashAudioLoader ()
      extends StObject
         with typings.soundjs.createjs.FlashAudioLoader
    
    @JSGlobal("createjs.FlashAudioPlugin")
    @js.native
    open class FlashAudioPlugin ()
      extends StObject
         with typings.soundjs.createjs.FlashAudioPlugin {
      
      // methods
      /* CompleteClass */
      override def create(src: String, startTime: Double, duration: Double): typings.soundjs.createjs.AbstractSoundInstance = js.native
      
      // properties
      /* CompleteClass */
      var flashReady: Boolean = js.native
      
      /* CompleteClass */
      override def getVolume(): Double = js.native
      
      /* CompleteClass */
      override def isPreloadComplete(src: String): Boolean = js.native
      
      /* CompleteClass */
      override def isPreloadStarted(src: String): Boolean = js.native
      
      /* CompleteClass */
      override def isSupported(): Boolean = js.native
      
      /* CompleteClass */
      override def preload(loader: js.Object): Unit = js.native
      
      /* CompleteClass */
      override def register(loadItem: String, instances: Double): js.Object = js.native
      
      /* CompleteClass */
      override def removeAllSounds(src: String): Unit = js.native
      
      /* CompleteClass */
      override def removeSound(src: String): Unit = js.native
      
      /* CompleteClass */
      override def setMute(value: Boolean): Boolean = js.native
      
      /* CompleteClass */
      override def setVolume(value: Double): Boolean = js.native
      
      /* CompleteClass */
      var showOutput: Boolean = js.native
    }
    /* static members */
    object FlashAudioPlugin {
      
      @JSGlobal("createjs.FlashAudioPlugin")
      @js.native
      val ^ : js.Any = js.native
      
      // methods
      inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
      
      @JSGlobal("createjs.FlashAudioPlugin.swfPath")
      @js.native
      def swfPath: String = js.native
      inline def swfPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("swfPath")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("createjs.FlashAudioSoundInstance")
    @js.native
    open class FlashAudioSoundInstance protected ()
      extends StObject
         with typings.soundjs.createjs.AbstractSoundInstance {
      def this(src: String, startTime: Double, duration: Double, playbackResource: js.Object) = this()
    }
    
    @JSGlobal("createjs.FlashPlugin")
    @js.native
    open class FlashPlugin ()
      extends StObject
         with typings.soundjs.createjs.FlashPlugin {
      
      // methods
      /* CompleteClass */
      override def create(src: String): typings.soundjs.createjs.AbstractSoundInstance = js.native
      
      /* CompleteClass */
      var flashReady: Boolean = js.native
      
      /* CompleteClass */
      override def getVolume(): Double = js.native
      
      /* CompleteClass */
      override def isPreloadStarted(src: String): Boolean = js.native
      
      /* CompleteClass */
      override def preload(src: String, instance: js.Object): Unit = js.native
      
      /* CompleteClass */
      override def register(src: String, instances: Double): js.Object = js.native
      
      /* CompleteClass */
      override def removeAllSounds(): Unit = js.native
      
      /* CompleteClass */
      override def removeSound(src: String): Unit = js.native
      
      /* CompleteClass */
      override def setMute(value: Boolean): Boolean = js.native
      
      /* CompleteClass */
      override def setVolume(value: Double): Boolean = js.native
      
      /* CompleteClass */
      var showOutput: Boolean = js.native
    }
    /* static members */
    object FlashPlugin {
      
      @JSGlobal("createjs.FlashPlugin")
      @js.native
      val ^ : js.Any = js.native
      
      // properties
      @JSGlobal("createjs.FlashPlugin.buildDate")
      @js.native
      def buildDate: String = js.native
      inline def buildDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildDate")(x.asInstanceOf[js.Any])
      
      inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
      
      @JSGlobal("createjs.FlashPlugin.swfPath")
      @js.native
      def swfPath: String = js.native
      inline def swfPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("swfPath")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.FlashPlugin.version")
      @js.native
      def version: String = js.native
      inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("createjs.HTMLAudioPlugin")
    @js.native
    open class HTMLAudioPlugin ()
      extends StObject
         with typings.soundjs.createjs.HTMLAudioPlugin {
      
      // methods
      /* CompleteClass */
      override def create(src: String, startTime: Double, duration: Double): typings.soundjs.createjs.AbstractSoundInstance = js.native
      
      // properties
      /* CompleteClass */
      var defaultNumChannels: Double = js.native
      
      /* CompleteClass */
      var enableIOS: Boolean = js.native
      
      /* CompleteClass */
      override def getVolume(): Double = js.native
      
      /* CompleteClass */
      override def isPreloadComplete(src: String): Boolean = js.native
      
      /* CompleteClass */
      override def isPreloadStarted(src: String): Boolean = js.native
      
      /* CompleteClass */
      override def isSupported(): Boolean = js.native
      
      /* CompleteClass */
      override def preload(loader: js.Object): Unit = js.native
      
      /* CompleteClass */
      override def register(loadItem: String, instances: Double): js.Object = js.native
      
      /* CompleteClass */
      override def removeAllSounds(src: String): Unit = js.native
      
      /* CompleteClass */
      override def removeSound(src: String): Unit = js.native
      
      /* CompleteClass */
      override def setMute(value: Boolean): Boolean = js.native
      
      /* CompleteClass */
      override def setVolume(value: Double): Boolean = js.native
    }
    /* static members */
    object HTMLAudioPlugin {
      
      @JSGlobal("createjs.HTMLAudioPlugin")
      @js.native
      val ^ : js.Any = js.native
      
      // deprecated
      @JSGlobal("createjs.HTMLAudioPlugin.MAX_INSTANCES")
      @js.native
      def MAX_INSTANCES: Double = js.native
      inline def MAX_INSTANCES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_INSTANCES")(x.asInstanceOf[js.Any])
      
      // methods
      inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
    }
    
    @JSGlobal("createjs.HTMLAudioSoundInstance")
    @js.native
    open class HTMLAudioSoundInstance protected ()
      extends StObject
         with typings.soundjs.createjs.AbstractSoundInstance {
      def this(src: String, startTime: Double, duration: Double, playbackResource: js.Object) = this()
    }
    
    @JSGlobal("createjs.HTMLAudioTagPool")
    @js.native
    open class HTMLAudioTagPool ()
      extends StObject
         with typings.soundjs.createjs.HTMLAudioTagPool
    
    @JSGlobal("createjs.PlayPropsConfig")
    @js.native
    open class PlayPropsConfig ()
      extends StObject
         with typings.soundjs.createjs.PlayPropsConfig {
      
      /* CompleteClass */
      var delay: Double = js.native
      
      /* CompleteClass */
      var duration: Double = js.native
      
      /* CompleteClass */
      var interrupt: String = js.native
      
      /* CompleteClass */
      var loop: Double = js.native
      
      /* CompleteClass */
      var offset: Double = js.native
      
      /* CompleteClass */
      var pan: Double = js.native
      
      /* CompleteClass */
      override def set(props: Any): typings.soundjs.createjs.PlayPropsConfig = js.native
      
      /* CompleteClass */
      var startTime: Double = js.native
      
      /* CompleteClass */
      var volume: Double = js.native
    }
    /* static members */
    object PlayPropsConfig {
      
      @JSGlobal("createjs.PlayPropsConfig")
      @js.native
      val ^ : js.Any = js.native
      
      inline def create(value: Any): typings.soundjs.createjs.PlayPropsConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[typings.soundjs.createjs.PlayPropsConfig]
      inline def create(value: typings.soundjs.createjs.PlayPropsConfig): typings.soundjs.createjs.PlayPropsConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(value.asInstanceOf[js.Any]).asInstanceOf[typings.soundjs.createjs.PlayPropsConfig]
    }
    
    @JSGlobal("createjs.Sound")
    @js.native
    open class Sound ()
      extends StObject
         with EventDispatcher
    /* static members */
    object Sound {
      
      @JSGlobal("createjs.Sound")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("createjs.Sound.EXTENSION_MAP")
      @js.native
      def EXTENSION_MAP: js.Object = js.native
      inline def EXTENSION_MAP_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTENSION_MAP")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.INTERRUPT_ANY")
      @js.native
      def INTERRUPT_ANY: String = js.native
      inline def INTERRUPT_ANY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERRUPT_ANY")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.INTERRUPT_EARLY")
      @js.native
      def INTERRUPT_EARLY: String = js.native
      inline def INTERRUPT_EARLY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERRUPT_EARLY")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.INTERRUPT_LATE")
      @js.native
      def INTERRUPT_LATE: String = js.native
      inline def INTERRUPT_LATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERRUPT_LATE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.INTERRUPT_NONE")
      @js.native
      def INTERRUPT_NONE: String = js.native
      inline def INTERRUPT_NONE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERRUPT_NONE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.PLAY_FAILED")
      @js.native
      def PLAY_FAILED: String = js.native
      inline def PLAY_FAILED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAY_FAILED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.PLAY_FINISHED")
      @js.native
      def PLAY_FINISHED: String = js.native
      inline def PLAY_FINISHED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAY_FINISHED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.PLAY_INITED")
      @js.native
      def PLAY_INITED: String = js.native
      inline def PLAY_INITED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAY_INITED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.PLAY_INTERRUPTED")
      @js.native
      def PLAY_INTERRUPTED: String = js.native
      inline def PLAY_INTERRUPTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAY_INTERRUPTED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.PLAY_SUCCEEDED")
      @js.native
      def PLAY_SUCCEEDED: String = js.native
      inline def PLAY_SUCCEEDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAY_SUCCEEDED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.SUPPORTED_EXTENSIONS")
      @js.native
      def SUPPORTED_EXTENSIONS: js.Array[String] = js.native
      inline def SUPPORTED_EXTENSIONS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPPORTED_EXTENSIONS")(x.asInstanceOf[js.Any])
      
      // properties
      @JSGlobal("createjs.Sound.activePlugin")
      @js.native
      def activePlugin: js.Object = js.native
      inline def activePlugin_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activePlugin")(x.asInstanceOf[js.Any])
      
      // EventDispatcher mixins
      inline def addEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def addEventListener(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        useCapture: Boolean
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def addEventListener(`type`: String, listener: HandleEvent): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def addEventListener(`type`: String, listener: HandleEvent, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def addEventListener(`type`: String, listener: `0`): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def addEventListener(`type`: String, listener: `0`, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      
      @JSGlobal("createjs.Sound.alternateExtensions")
      @js.native
      def alternateExtensions: js.Array[Any] = js.native
      inline def alternateExtensions_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alternateExtensions")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.capabilities")
      @js.native
      def capabilities: Any = js.native
      inline def capabilities_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(x.asInstanceOf[js.Any])
      
      // methods
      inline def createInstance(src: String): typings.soundjs.createjs.AbstractSoundInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(src.asInstanceOf[js.Any]).asInstanceOf[typings.soundjs.createjs.AbstractSoundInstance]
      
      @JSGlobal("createjs.Sound.defaultInterruptBehavior")
      @js.native
      def defaultInterruptBehavior: String = js.native
      inline def defaultInterruptBehavior_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInterruptBehavior")(x.asInstanceOf[js.Any])
      
      inline def dispatchEvent(eventObj: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(eventObj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def dispatchEvent(eventObj: String, target: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(eventObj.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def dispatchEvent(eventObj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(eventObj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def dispatchEvent(eventObj: js.Object, target: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(eventObj.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def dispatchEvent(eventObj: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(eventObj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      inline def dispatchEvent(eventObj: Event, target: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(eventObj.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def getCapabilities(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getCapabilities")().asInstanceOf[js.Object]
      
      inline def getCapability(key: String): Double | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getCapability")(key.asInstanceOf[js.Any]).asInstanceOf[Double | Boolean]
      
      inline def getMute(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getMute")().asInstanceOf[Boolean]
      
      inline def getVolume(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getVolume")().asInstanceOf[Double]
      
      inline def hasEventListener(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasEventListener")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def initializeDefaultPlugins(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeDefaultPlugins")().asInstanceOf[Boolean]
      
      inline def isReady(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReady")().asInstanceOf[Boolean]
      
      inline def loadComplete(src: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("loadComplete")(src.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      @JSGlobal("createjs.Sound.muted")
      @js.native
      def muted: Boolean = js.native
      inline def muted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muted")(x.asInstanceOf[js.Any])
      
      inline def off(`type`: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def off(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def off(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        useCapture: Boolean
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def off(`type`: String, listener: js.Function, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def off(`type`: String, listener: HandleEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def off(`type`: String, listener: HandleEvent, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def off(`type`: String, listener: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def off(`type`: String, listener: `0`, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      // It is necessary for "arguments.callee"
      inline def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: Boolean
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: Boolean,
        data: Any
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: Boolean,
        data: Any,
        useCapture: Boolean
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: Boolean,
        data: Unit,
        useCapture: Boolean
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: Unit,
        data: Any
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: Unit,
        data: Any,
        useCapture: Boolean
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: Unit,
        data: Unit,
        useCapture: Boolean
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: Unit,
        once: Boolean
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: Unit,
        once: Boolean,
        data: Any
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: Unit,
        once: Boolean,
        data: Any,
        useCapture: Boolean
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: Unit,
        once: Boolean,
        data: Unit,
        useCapture: Boolean
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: Unit,
        once: Unit,
        data: Any
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: Unit,
        once: Unit,
        data: Any,
        useCapture: Boolean
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: Unit,
        once: Unit,
        data: Unit,
        useCapture: Boolean
      ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Function]
      inline def on(`type`: String, listener: HandleEvent): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: HandleEvent, scope: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean, data: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.Object,
        once: Boolean,
        data: Any,
        useCapture: Boolean
      ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.Object,
        once: Boolean,
        data: Unit,
        useCapture: Boolean
      ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Unit, data: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.Object,
        once: Unit,
        data: Any,
        useCapture: Boolean
      ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.Object,
        once: Unit,
        data: Unit,
        useCapture: Boolean
      ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: HandleEvent, scope: Unit, once: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: HandleEvent, scope: Unit, once: Boolean, data: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: HandleEvent, scope: Unit, once: Boolean, data: Any, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: HandleEvent, scope: Unit, once: Boolean, data: Unit, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: HandleEvent, scope: Unit, once: Unit, data: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: HandleEvent, scope: Unit, once: Unit, data: Any, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: HandleEvent, scope: Unit, once: Unit, data: Unit, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: Any, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: Unit, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: js.Object, once: Unit, data: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: js.Object, once: Unit, data: Any, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: js.Object, once: Unit, data: Unit, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: Unit, once: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: Unit, once: Boolean, data: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: Unit, once: Boolean, data: Any, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: Unit, once: Boolean, data: Unit, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: Unit, once: Unit, data: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: Unit, once: Unit, data: Any, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def on(`type`: String, listener: `0`, scope: Unit, once: Unit, data: Unit, useCapture: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], once.asInstanceOf[js.Any], data.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      
      inline def play(
        src: String,
        interrupt: js.UndefOr[Any],
        delay: js.UndefOr[Double],
        offset: js.UndefOr[Double],
        loop: js.UndefOr[Double],
        volume: js.UndefOr[Double],
        pan: js.UndefOr[Double]
      ): typings.soundjs.createjs.AbstractSoundInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("play")(src.asInstanceOf[js.Any], interrupt.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], loop.asInstanceOf[js.Any], volume.asInstanceOf[js.Any], pan.asInstanceOf[js.Any])).asInstanceOf[typings.soundjs.createjs.AbstractSoundInstance]
      
      inline def registerManifest(manifest: js.Array[js.Object], basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerManifest")(manifest.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      
      inline def registerPlugins(plugins: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugins")(plugins.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def registerSound(src: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any]).asInstanceOf[js.Object]
      inline def registerSound(src: String, id: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: String, id: String, data: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: String, id: String, data: js.Object, basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: String, id: String, data: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: String, id: String, data: Double, basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: String, id: String, data: Unit, basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: String, id: Unit, data: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: String, id: Unit, data: js.Object, basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: String, id: Unit, data: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: String, id: Unit, data: Double, basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: String, id: Unit, data: Unit, basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any]).asInstanceOf[js.Object]
      inline def registerSound(src: js.Object, id: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: js.Object, id: String, data: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: js.Object, id: String, data: js.Object, basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: js.Object, id: String, data: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: js.Object, id: String, data: Double, basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: js.Object, id: String, data: Unit, basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: js.Object, id: Unit, data: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: js.Object, id: Unit, data: js.Object, basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: js.Object, id: Unit, data: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: js.Object, id: Unit, data: Double, basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      inline def registerSound(src: js.Object, id: Unit, data: Unit, basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSound")(src.asInstanceOf[js.Any], id.asInstanceOf[js.Any], data.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      
      inline def registerSounds(sounds: js.Array[js.Object]): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSounds")(sounds.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
      inline def registerSounds(sounds: js.Array[js.Object], basePath: String): js.Array[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("registerSounds")(sounds.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Object]]
      
      inline def removeAllEventListeners(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllEventListeners")().asInstanceOf[Unit]
      inline def removeAllEventListeners(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllEventListeners")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def removeAllSounds(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllSounds")().asInstanceOf[Unit]
      
      inline def removeEventListener(`type`: String, listener: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def removeEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def removeEventListener(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        useCapture: Boolean
      ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def removeEventListener(`type`: String, listener: HandleEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def removeEventListener(`type`: String, listener: HandleEvent, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def removeEventListener(`type`: String, listener: `0`): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def removeEventListener(`type`: String, listener: `0`, useCapture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], listener.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def removeManifest(manifest: js.Array[Any], basePath: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("removeManifest")(manifest.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Object]
      
      inline def removeSound(src: String, basePath: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("removeSound")(src.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      inline def removeSound(src: js.Object, basePath: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("removeSound")(src.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def setMute(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("setMute")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
      
      inline def setVolume(value: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVolume")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
      
      @JSGlobal("createjs.Sound.volume")
      @js.native
      def volume: Double = js.native
      inline def volume_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("volume")(x.asInstanceOf[js.Any])
      
      inline def willTrigger(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("willTrigger")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    }
    
    @JSGlobal("createjs.SoundJS")
    @js.native
    open class SoundJS ()
      extends StObject
         with typings.soundjs.createjs.SoundJS
    /* static members */
    object SoundJS {
      
      @JSGlobal("createjs.SoundJS")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("createjs.SoundJS.buildDate")
      @js.native
      def buildDate: String = js.native
      inline def buildDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildDate")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.SoundJS.version")
      @js.native
      def version: String = js.native
      inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("createjs.WebAudioLoader")
    @js.native
    open class WebAudioLoader ()
      extends StObject
         with typings.soundjs.createjs.WebAudioLoader
    /* static members */
    object WebAudioLoader {
      
      @JSGlobal("createjs.WebAudioLoader")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("createjs.WebAudioLoader.context")
      @js.native
      def context: AudioContext = js.native
      inline def context_=(x: AudioContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("context")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("createjs.WebAudioPlugin")
    @js.native
    open class WebAudioPlugin ()
      extends StObject
         with typings.soundjs.createjs.WebAudioPlugin {
      
      /* CompleteClass */
      var context: AudioContext = js.native
      
      // methods
      /* CompleteClass */
      override def create(src: String, startTime: Double, duration: Double): typings.soundjs.createjs.AbstractSoundInstance = js.native
      
      /* CompleteClass */
      var dynamicsCompressorNode: DynamicsCompressorNode = js.native
      
      /* CompleteClass */
      var gainNode: GainNode = js.native
      
      /* CompleteClass */
      override def getVolume(): Double = js.native
      
      /* CompleteClass */
      override def isPreloadComplete(src: String): Boolean = js.native
      
      /* CompleteClass */
      override def isPreloadStarted(src: String): Boolean = js.native
      
      /* CompleteClass */
      override def isSupported(): Boolean = js.native
      
      /* CompleteClass */
      override def preload(loader: js.Object): Unit = js.native
      
      /* CompleteClass */
      override def register(loadItem: String, instances: Double): js.Object = js.native
      
      /* CompleteClass */
      override def removeAllSounds(src: String): Unit = js.native
      
      /* CompleteClass */
      override def removeSound(src: String): Unit = js.native
      
      /* CompleteClass */
      override def setMute(value: Boolean): Boolean = js.native
      
      /* CompleteClass */
      override def setVolume(value: Double): Boolean = js.native
    }
    /* static members */
    object WebAudioPlugin {
      
      @JSGlobal("createjs.WebAudioPlugin")
      @js.native
      val ^ : js.Any = js.native
      
      // properties
      @JSGlobal("createjs.WebAudioPlugin.context")
      @js.native
      def context: AudioContext = js.native
      inline def context_=(x: AudioContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("context")(x.asInstanceOf[js.Any])
      
      // methods
      inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
      
      inline def playEmptySound(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playEmptySound")().asInstanceOf[Unit]
    }
    
    @JSGlobal("createjs.WebAudioSoundInstance")
    @js.native
    open class WebAudioSoundInstance protected ()
      extends StObject
         with typings.soundjs.createjs.WebAudioSoundInstance {
      def this(src: String, startTime: Double, duration: Double, playbackResource: js.Object) = this()
    }
    /* static members */
    object WebAudioSoundInstance {
      
      @JSGlobal("createjs.WebAudioSoundInstance")
      @js.native
      val ^ : js.Any = js.native
      
      // properties
      @JSGlobal("createjs.WebAudioSoundInstance.context")
      @js.native
      def context: AudioContext = js.native
      inline def context_=(x: AudioContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("context")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.WebAudioSoundInstance.destinationNode")
      @js.native
      def destinationNode: AudioNode = js.native
      inline def destinationNode_=(x: AudioNode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destinationNode")(x.asInstanceOf[js.Any])
    }
  }
}
