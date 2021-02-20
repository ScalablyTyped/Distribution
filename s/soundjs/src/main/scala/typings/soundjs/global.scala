package typings.soundjs

import typings.createjsLib.createjs.Event
import typings.createjsLib.createjs.EventDispatcher
import typings.soundjs.anon.HandleEvent
import typings.soundjs.anon.`0`
import typings.std.AudioContext
import typings.std.AudioNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object createjs {
    
    @JSGlobal("createjs.AbstractPlugin")
    @js.native
    class AbstractPlugin ()
      extends typings.soundjs.createjs.AbstractPlugin
    
    @JSGlobal("createjs.AbstractSoundInstance")
    @js.native
    class AbstractSoundInstance protected ()
      extends typings.soundjs.createjs.AbstractSoundInstance {
      def this(src: String, startTime: Double, duration: Double, playbackResource: js.Object) = this()
    }
    
    @JSGlobal("createjs.FlashAudioLoader")
    @js.native
    class FlashAudioLoader ()
      extends typings.soundjs.createjs.FlashAudioLoader
    
    @JSGlobal("createjs.FlashAudioPlugin")
    @js.native
    class FlashAudioPlugin ()
      extends typings.soundjs.createjs.FlashAudioPlugin
    /* static members */
    object FlashAudioPlugin {
      
      @JSGlobal("createjs.FlashAudioPlugin")
      @js.native
      val ^ : js.Any = js.native
      
      // methods
      @JSGlobal("createjs.FlashAudioPlugin.isSupported")
      @js.native
      def isSupported(): Boolean = js.native
      
      @JSGlobal("createjs.FlashAudioPlugin.swfPath")
      @js.native
      def swfPath: String = js.native
      @scala.inline
      def swfPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("swfPath")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("createjs.FlashAudioSoundInstance")
    @js.native
    class FlashAudioSoundInstance protected ()
      extends typings.soundjs.createjs.AbstractSoundInstance {
      def this(src: String, startTime: Double, duration: Double, playbackResource: js.Object) = this()
    }
    
    @JSGlobal("createjs.FlashPlugin")
    @js.native
    class FlashPlugin ()
      extends typings.soundjs.createjs.FlashPlugin
    /* static members */
    object FlashPlugin {
      
      @JSGlobal("createjs.FlashPlugin")
      @js.native
      val ^ : js.Any = js.native
      
      // properties
      @JSGlobal("createjs.FlashPlugin.buildDate")
      @js.native
      def buildDate: String = js.native
      @scala.inline
      def buildDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildDate")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.FlashPlugin.isSupported")
      @js.native
      def isSupported(): Boolean = js.native
      
      @JSGlobal("createjs.FlashPlugin.swfPath")
      @js.native
      def swfPath: String = js.native
      @scala.inline
      def swfPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("swfPath")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.FlashPlugin.version")
      @js.native
      def version: String = js.native
      @scala.inline
      def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("createjs.HTMLAudioPlugin")
    @js.native
    class HTMLAudioPlugin ()
      extends typings.soundjs.createjs.HTMLAudioPlugin
    /* static members */
    object HTMLAudioPlugin {
      
      @JSGlobal("createjs.HTMLAudioPlugin")
      @js.native
      val ^ : js.Any = js.native
      
      // deprecated
      @JSGlobal("createjs.HTMLAudioPlugin.MAX_INSTANCES")
      @js.native
      def MAX_INSTANCES: Double = js.native
      @scala.inline
      def MAX_INSTANCES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_INSTANCES")(x.asInstanceOf[js.Any])
      
      // methods
      @JSGlobal("createjs.HTMLAudioPlugin.isSupported")
      @js.native
      def isSupported(): Boolean = js.native
    }
    
    @JSGlobal("createjs.HTMLAudioSoundInstance")
    @js.native
    class HTMLAudioSoundInstance protected ()
      extends typings.soundjs.createjs.AbstractSoundInstance {
      def this(src: String, startTime: Double, duration: Double, playbackResource: js.Object) = this()
    }
    
    @JSGlobal("createjs.HTMLAudioTagPool")
    @js.native
    class HTMLAudioTagPool ()
      extends typings.soundjs.createjs.HTMLAudioTagPool
    
    @JSGlobal("createjs.PlayPropsConfig")
    @js.native
    class PlayPropsConfig ()
      extends typings.soundjs.createjs.PlayPropsConfig
    /* static members */
    object PlayPropsConfig {
      
      @JSGlobal("createjs.PlayPropsConfig.create")
      @js.native
      def create(value: js.Any): typings.soundjs.createjs.PlayPropsConfig = js.native
      @JSGlobal("createjs.PlayPropsConfig.create")
      @js.native
      def create(value: typings.soundjs.createjs.PlayPropsConfig): typings.soundjs.createjs.PlayPropsConfig = js.native
    }
    
    @JSGlobal("createjs.Sound")
    @js.native
    class Sound () extends EventDispatcher
    /* static members */
    object Sound {
      
      @JSGlobal("createjs.Sound")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("createjs.Sound.EXTENSION_MAP")
      @js.native
      def EXTENSION_MAP: js.Object = js.native
      @scala.inline
      def EXTENSION_MAP_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXTENSION_MAP")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.INTERRUPT_ANY")
      @js.native
      def INTERRUPT_ANY: String = js.native
      @scala.inline
      def INTERRUPT_ANY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERRUPT_ANY")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.INTERRUPT_EARLY")
      @js.native
      def INTERRUPT_EARLY: String = js.native
      @scala.inline
      def INTERRUPT_EARLY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERRUPT_EARLY")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.INTERRUPT_LATE")
      @js.native
      def INTERRUPT_LATE: String = js.native
      @scala.inline
      def INTERRUPT_LATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERRUPT_LATE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.INTERRUPT_NONE")
      @js.native
      def INTERRUPT_NONE: String = js.native
      @scala.inline
      def INTERRUPT_NONE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERRUPT_NONE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.PLAY_FAILED")
      @js.native
      def PLAY_FAILED: String = js.native
      @scala.inline
      def PLAY_FAILED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAY_FAILED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.PLAY_FINISHED")
      @js.native
      def PLAY_FINISHED: String = js.native
      @scala.inline
      def PLAY_FINISHED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAY_FINISHED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.PLAY_INITED")
      @js.native
      def PLAY_INITED: String = js.native
      @scala.inline
      def PLAY_INITED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAY_INITED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.PLAY_INTERRUPTED")
      @js.native
      def PLAY_INTERRUPTED: String = js.native
      @scala.inline
      def PLAY_INTERRUPTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAY_INTERRUPTED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.PLAY_SUCCEEDED")
      @js.native
      def PLAY_SUCCEEDED: String = js.native
      @scala.inline
      def PLAY_SUCCEEDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PLAY_SUCCEEDED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.SUPPORTED_EXTENSIONS")
      @js.native
      def SUPPORTED_EXTENSIONS: js.Array[String] = js.native
      @scala.inline
      def SUPPORTED_EXTENSIONS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUPPORTED_EXTENSIONS")(x.asInstanceOf[js.Any])
      
      // properties
      @JSGlobal("createjs.Sound.activePlugin")
      @js.native
      def activePlugin: js.Object = js.native
      @scala.inline
      def activePlugin_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activePlugin")(x.asInstanceOf[js.Any])
      
      // EventDispatcher mixins
      @JSGlobal("createjs.Sound.addEventListener")
      @js.native
      def addEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
      @JSGlobal("createjs.Sound.addEventListener")
      @js.native
      def addEventListener(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        useCapture: Boolean
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.addEventListener")
      @js.native
      def addEventListener(`type`: String, listener: HandleEvent): js.Object = js.native
      @JSGlobal("createjs.Sound.addEventListener")
      @js.native
      def addEventListener(`type`: String, listener: HandleEvent, useCapture: Boolean): js.Object = js.native
      @JSGlobal("createjs.Sound.addEventListener")
      @js.native
      def addEventListener(`type`: String, listener: `0`): js.Object = js.native
      @JSGlobal("createjs.Sound.addEventListener")
      @js.native
      def addEventListener(`type`: String, listener: `0`, useCapture: Boolean): js.Object = js.native
      
      @JSGlobal("createjs.Sound.alternateExtensions")
      @js.native
      def alternateExtensions: js.Array[js.Any] = js.native
      @scala.inline
      def alternateExtensions_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alternateExtensions")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.capabilities")
      @js.native
      def capabilities: js.Any = js.native
      @scala.inline
      def capabilities_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(x.asInstanceOf[js.Any])
      
      // methods
      @JSGlobal("createjs.Sound.createInstance")
      @js.native
      def createInstance(src: String): typings.soundjs.createjs.AbstractSoundInstance = js.native
      
      @JSGlobal("createjs.Sound.defaultInterruptBehavior")
      @js.native
      def defaultInterruptBehavior: String = js.native
      @scala.inline
      def defaultInterruptBehavior_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInterruptBehavior")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.dispatchEvent")
      @js.native
      def dispatchEvent(eventObj: String): Boolean = js.native
      @JSGlobal("createjs.Sound.dispatchEvent")
      @js.native
      def dispatchEvent(eventObj: String, target: js.Object): Boolean = js.native
      @JSGlobal("createjs.Sound.dispatchEvent")
      @js.native
      def dispatchEvent(eventObj: js.Object): Boolean = js.native
      @JSGlobal("createjs.Sound.dispatchEvent")
      @js.native
      def dispatchEvent(eventObj: js.Object, target: js.Object): Boolean = js.native
      @JSGlobal("createjs.Sound.dispatchEvent")
      @js.native
      def dispatchEvent(eventObj: Event): Boolean = js.native
      @JSGlobal("createjs.Sound.dispatchEvent")
      @js.native
      def dispatchEvent(eventObj: Event, target: js.Object): Boolean = js.native
      
      @JSGlobal("createjs.Sound.getCapabilities")
      @js.native
      def getCapabilities(): js.Object = js.native
      
      @JSGlobal("createjs.Sound.getCapability")
      @js.native
      def getCapability(key: String): Double | Boolean = js.native
      
      @JSGlobal("createjs.Sound.getMute")
      @js.native
      def getMute(): Boolean = js.native
      
      @JSGlobal("createjs.Sound.getVolume")
      @js.native
      def getVolume(): Double = js.native
      
      @JSGlobal("createjs.Sound.hasEventListener")
      @js.native
      def hasEventListener(`type`: String): Boolean = js.native
      
      @JSGlobal("createjs.Sound.initializeDefaultPlugins")
      @js.native
      def initializeDefaultPlugins(): Boolean = js.native
      
      @JSGlobal("createjs.Sound.isReady")
      @js.native
      def isReady(): Boolean = js.native
      
      @JSGlobal("createjs.Sound.loadComplete")
      @js.native
      def loadComplete(src: String): Boolean = js.native
      
      @JSGlobal("createjs.Sound.muted")
      @js.native
      def muted: Boolean = js.native
      @scala.inline
      def muted_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muted")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.off")
      @js.native
      def off(`type`: String, listener: js.Function): Unit = js.native
      @JSGlobal("createjs.Sound.off")
      @js.native
      def off(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = js.native
      @JSGlobal("createjs.Sound.off")
      @js.native
      def off(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        useCapture: Boolean
      ): Unit = js.native
      @JSGlobal("createjs.Sound.off")
      @js.native
      def off(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
      @JSGlobal("createjs.Sound.off")
      @js.native
      def off(`type`: String, listener: HandleEvent): Unit = js.native
      @JSGlobal("createjs.Sound.off")
      @js.native
      def off(`type`: String, listener: HandleEvent, useCapture: Boolean): Unit = js.native
      @JSGlobal("createjs.Sound.off")
      @js.native
      def off(`type`: String, listener: `0`): Unit = js.native
      @JSGlobal("createjs.Sound.off")
      @js.native
      def off(`type`: String, listener: `0`, useCapture: Boolean): Unit = js.native
      
      // It is necessary for "arguments.callee"
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.UndefOr[scala.Nothing],
        once: js.UndefOr[scala.Nothing],
        data: js.UndefOr[scala.Nothing],
        useCapture: Boolean
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.UndefOr[scala.Nothing],
        once: js.UndefOr[scala.Nothing],
        data: js.Any
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.UndefOr[scala.Nothing],
        once: js.UndefOr[scala.Nothing],
        data: js.Any,
        useCapture: Boolean
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.UndefOr[scala.Nothing],
        once: Boolean
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.UndefOr[scala.Nothing],
        once: Boolean,
        data: js.UndefOr[scala.Nothing],
        useCapture: Boolean
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.UndefOr[scala.Nothing],
        once: Boolean,
        data: js.Any
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.UndefOr[scala.Nothing],
        once: Boolean,
        data: js.Any,
        useCapture: Boolean
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: js.UndefOr[scala.Nothing],
        data: js.UndefOr[scala.Nothing],
        useCapture: Boolean
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: js.UndefOr[scala.Nothing],
        data: js.Any
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: js.UndefOr[scala.Nothing],
        data: js.Any,
        useCapture: Boolean
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: Boolean
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: Boolean,
        data: js.UndefOr[scala.Nothing],
        useCapture: Boolean
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: Boolean,
        data: js.Any
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        scope: js.Object,
        once: Boolean,
        data: js.Any,
        useCapture: Boolean
      ): js.Function = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: HandleEvent): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.UndefOr[scala.Nothing],
        once: js.UndefOr[scala.Nothing],
        data: js.UndefOr[scala.Nothing],
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.UndefOr[scala.Nothing],
        once: js.UndefOr[scala.Nothing],
        data: js.Any
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.UndefOr[scala.Nothing],
        once: js.UndefOr[scala.Nothing],
        data: js.Any,
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: HandleEvent, scope: js.UndefOr[scala.Nothing], once: Boolean): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.UndefOr[scala.Nothing],
        once: Boolean,
        data: js.UndefOr[scala.Nothing],
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.UndefOr[scala.Nothing],
        once: Boolean,
        data: js.Any
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.UndefOr[scala.Nothing],
        once: Boolean,
        data: js.Any,
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: HandleEvent, scope: js.Object): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.Object,
        once: js.UndefOr[scala.Nothing],
        data: js.UndefOr[scala.Nothing],
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.Object,
        once: js.UndefOr[scala.Nothing],
        data: js.Any
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.Object,
        once: js.UndefOr[scala.Nothing],
        data: js.Any,
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.Object,
        once: Boolean,
        data: js.UndefOr[scala.Nothing],
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: HandleEvent, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: HandleEvent,
        scope: js.Object,
        once: Boolean,
        data: js.Any,
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: `0`): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: `0`,
        scope: js.UndefOr[scala.Nothing],
        once: js.UndefOr[scala.Nothing],
        data: js.UndefOr[scala.Nothing],
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: `0`,
        scope: js.UndefOr[scala.Nothing],
        once: js.UndefOr[scala.Nothing],
        data: js.Any
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: `0`,
        scope: js.UndefOr[scala.Nothing],
        once: js.UndefOr[scala.Nothing],
        data: js.Any,
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: `0`, scope: js.UndefOr[scala.Nothing], once: Boolean): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: `0`,
        scope: js.UndefOr[scala.Nothing],
        once: Boolean,
        data: js.UndefOr[scala.Nothing],
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: `0`, scope: js.UndefOr[scala.Nothing], once: Boolean, data: js.Any): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: `0`,
        scope: js.UndefOr[scala.Nothing],
        once: Boolean,
        data: js.Any,
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: `0`, scope: js.Object): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: `0`,
        scope: js.Object,
        once: js.UndefOr[scala.Nothing],
        data: js.UndefOr[scala.Nothing],
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: `0`, scope: js.Object, once: js.UndefOr[scala.Nothing], data: js.Any): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: `0`,
        scope: js.Object,
        once: js.UndefOr[scala.Nothing],
        data: js.Any,
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(
        `type`: String,
        listener: `0`,
        scope: js.Object,
        once: Boolean,
        data: js.UndefOr[scala.Nothing],
        useCapture: Boolean
      ): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
      @JSGlobal("createjs.Sound.on")
      @js.native
      def on(`type`: String, listener: `0`, scope: js.Object, once: Boolean, data: js.Any, useCapture: Boolean): js.Object = js.native
      
      @JSGlobal("createjs.Sound.play")
      @js.native
      def play(
        src: String,
        interrupt: js.UndefOr[js.Any],
        delay: js.UndefOr[Double],
        offset: js.UndefOr[Double],
        loop: js.UndefOr[Double],
        volume: js.UndefOr[Double],
        pan: js.UndefOr[Double]
      ): typings.soundjs.createjs.AbstractSoundInstance = js.native
      
      @JSGlobal("createjs.Sound.registerManifest")
      @js.native
      def registerManifest(manifest: js.Array[js.Object], basePath: String): js.Object = js.native
      
      @JSGlobal("createjs.Sound.registerPlugins")
      @js.native
      def registerPlugins(plugins: js.Array[_]): Boolean = js.native
      
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: String, id: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], basePath: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: String, id: js.UndefOr[scala.Nothing], data: js.Object): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: String, id: js.UndefOr[scala.Nothing], data: js.Object, basePath: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: String, id: js.UndefOr[scala.Nothing], data: Double): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: String, id: js.UndefOr[scala.Nothing], data: Double, basePath: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: String, id: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: String, id: String, data: js.UndefOr[scala.Nothing], basePath: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: String, id: String, data: js.Object): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: String, id: String, data: js.Object, basePath: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: String, id: String, data: Double): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: String, id: String, data: Double, basePath: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: js.Object): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: js.Object, id: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], basePath: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: js.Object, id: js.UndefOr[scala.Nothing], data: js.Object): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: js.Object, id: js.UndefOr[scala.Nothing], data: js.Object, basePath: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: js.Object, id: js.UndefOr[scala.Nothing], data: Double): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: js.Object, id: js.UndefOr[scala.Nothing], data: Double, basePath: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: js.Object, id: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: js.Object, id: String, data: js.UndefOr[scala.Nothing], basePath: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: js.Object, id: String, data: js.Object): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: js.Object, id: String, data: js.Object, basePath: String): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: js.Object, id: String, data: Double): js.Object = js.native
      @JSGlobal("createjs.Sound.registerSound")
      @js.native
      def registerSound(src: js.Object, id: String, data: Double, basePath: String): js.Object = js.native
      
      @JSGlobal("createjs.Sound.registerSounds")
      @js.native
      def registerSounds(sounds: js.Array[js.Object]): js.Array[js.Object] = js.native
      @JSGlobal("createjs.Sound.registerSounds")
      @js.native
      def registerSounds(sounds: js.Array[js.Object], basePath: String): js.Array[js.Object] = js.native
      
      @JSGlobal("createjs.Sound.removeAllEventListeners")
      @js.native
      def removeAllEventListeners(): Unit = js.native
      @JSGlobal("createjs.Sound.removeAllEventListeners")
      @js.native
      def removeAllEventListeners(`type`: String): Unit = js.native
      
      @JSGlobal("createjs.Sound.removeAllSounds")
      @js.native
      def removeAllSounds(): Unit = js.native
      
      @JSGlobal("createjs.Sound.removeEventListener")
      @js.native
      def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
      @JSGlobal("createjs.Sound.removeEventListener")
      @js.native
      def removeEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = js.native
      @JSGlobal("createjs.Sound.removeEventListener")
      @js.native
      def removeEventListener(
        `type`: String,
        listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
        useCapture: Boolean
      ): Unit = js.native
      @JSGlobal("createjs.Sound.removeEventListener")
      @js.native
      def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
      @JSGlobal("createjs.Sound.removeEventListener")
      @js.native
      def removeEventListener(`type`: String, listener: HandleEvent): Unit = js.native
      @JSGlobal("createjs.Sound.removeEventListener")
      @js.native
      def removeEventListener(`type`: String, listener: HandleEvent, useCapture: Boolean): Unit = js.native
      @JSGlobal("createjs.Sound.removeEventListener")
      @js.native
      def removeEventListener(`type`: String, listener: `0`): Unit = js.native
      @JSGlobal("createjs.Sound.removeEventListener")
      @js.native
      def removeEventListener(`type`: String, listener: `0`, useCapture: Boolean): Unit = js.native
      
      @JSGlobal("createjs.Sound.removeManifest")
      @js.native
      def removeManifest(manifest: js.Array[_], basePath: String): js.Object = js.native
      
      @JSGlobal("createjs.Sound.removeSound")
      @js.native
      def removeSound(src: String, basePath: String): Boolean = js.native
      @JSGlobal("createjs.Sound.removeSound")
      @js.native
      def removeSound(src: js.Object, basePath: String): Boolean = js.native
      
      @JSGlobal("createjs.Sound.setMute")
      @js.native
      def setMute(value: Boolean): Boolean = js.native
      
      @JSGlobal("createjs.Sound.setVolume")
      @js.native
      def setVolume(value: Double): Unit = js.native
      
      @JSGlobal("createjs.Sound.stop")
      @js.native
      def stop(): Unit = js.native
      
      @JSGlobal("createjs.Sound.volume")
      @js.native
      def volume: Double = js.native
      @scala.inline
      def volume_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("volume")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.Sound.willTrigger")
      @js.native
      def willTrigger(`type`: String): Boolean = js.native
    }
    
    @JSGlobal("createjs.SoundJS")
    @js.native
    class SoundJS ()
      extends typings.soundjs.createjs.SoundJS
    /* static members */
    object SoundJS {
      
      @JSGlobal("createjs.SoundJS")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("createjs.SoundJS.buildDate")
      @js.native
      def buildDate: String = js.native
      @scala.inline
      def buildDate_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildDate")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.SoundJS.version")
      @js.native
      def version: String = js.native
      @scala.inline
      def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("createjs.WebAudioLoader")
    @js.native
    class WebAudioLoader ()
      extends typings.soundjs.createjs.WebAudioLoader
    /* static members */
    object WebAudioLoader {
      
      @JSGlobal("createjs.WebAudioLoader")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("createjs.WebAudioLoader.context")
      @js.native
      def context: AudioContext = js.native
      @scala.inline
      def context_=(x: AudioContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("context")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("createjs.WebAudioPlugin")
    @js.native
    class WebAudioPlugin ()
      extends typings.soundjs.createjs.WebAudioPlugin
    /* static members */
    object WebAudioPlugin {
      
      @JSGlobal("createjs.WebAudioPlugin")
      @js.native
      val ^ : js.Any = js.native
      
      // properties
      @JSGlobal("createjs.WebAudioPlugin.context")
      @js.native
      def context: AudioContext = js.native
      @scala.inline
      def context_=(x: AudioContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("context")(x.asInstanceOf[js.Any])
      
      // methods
      @JSGlobal("createjs.WebAudioPlugin.isSupported")
      @js.native
      def isSupported(): Boolean = js.native
      
      @JSGlobal("createjs.WebAudioPlugin.playEmptySound")
      @js.native
      def playEmptySound(): Unit = js.native
    }
    
    @JSGlobal("createjs.WebAudioSoundInstance")
    @js.native
    class WebAudioSoundInstance protected ()
      extends typings.soundjs.createjs.WebAudioSoundInstance {
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
      @scala.inline
      def context_=(x: AudioContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("context")(x.asInstanceOf[js.Any])
      
      @JSGlobal("createjs.WebAudioSoundInstance.destinationNode")
      @js.native
      def destinationNode: AudioNode = js.native
      @scala.inline
      def destinationNode_=(x: AudioNode): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destinationNode")(x.asInstanceOf[js.Any])
    }
  }
}
