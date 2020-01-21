package typings.soundjs.createjs

import typings.createjsLib.createjs.Event
import typings.createjsLib.createjs.EventDispatcher
import typings.soundjs.AnonEventObj
import typings.soundjs.AnonEventObjHandleEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Sound")
@js.native
class Sound () extends EventDispatcher

/* static members */
@JSGlobal("createjs.Sound")
@js.native
object Sound extends js.Object {
  var EXTENSION_MAP: js.Object = js.native
  var INTERRUPT_ANY: String = js.native
  var INTERRUPT_EARLY: String = js.native
  var INTERRUPT_LATE: String = js.native
  var INTERRUPT_NONE: String = js.native
  var PLAY_FAILED: String = js.native
  var PLAY_FINISHED: String = js.native
  var PLAY_INITED: String = js.native
  var PLAY_INTERRUPTED: String = js.native
  var PLAY_SUCCEEDED: String = js.native
  var SUPPORTED_EXTENSIONS: js.Array[String] = js.native
  // properties
  var activePlugin: js.Object = js.native
  var alternateExtensions: js.Array[_] = js.native
  var capabilities: js.Any = js.native
  var defaultInterruptBehavior: String = js.native
  var muted: Boolean = js.native
  var volume: Double = js.native
  // EventDispatcher mixins
  def addEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
  def addEventListener(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): js.Function = js.native
  def addEventListener(`type`: String, listener: AnonEventObj): js.Object = js.native
  def addEventListener(`type`: String, listener: AnonEventObjHandleEvent): js.Object = js.native
  def addEventListener(`type`: String, listener: AnonEventObjHandleEvent, useCapture: Boolean): js.Object = js.native
  def addEventListener(`type`: String, listener: AnonEventObj, useCapture: Boolean): js.Object = js.native
  // methods
  def createInstance(src: String): AbstractSoundInstance = js.native
  def dispatchEvent(eventObj: String): Boolean = js.native
  def dispatchEvent(eventObj: String, target: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: js.Object, target: js.Object): Boolean = js.native
  def dispatchEvent(eventObj: Event): Boolean = js.native
  def dispatchEvent(eventObj: Event, target: js.Object): Boolean = js.native
  def getCapabilities(): js.Object = js.native
  def getCapability(key: String): Double | Boolean = js.native
  def getMute(): Boolean = js.native
  def getVolume(): Double = js.native
  def hasEventListener(`type`: String): Boolean = js.native
  def initializeDefaultPlugins(): Boolean = js.native
  def isReady(): Boolean = js.native
  def loadComplete(src: String): Boolean = js.native
  def off(`type`: String, listener: js.Function): Unit = js.native
  def off(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = js.native
  def off(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): Unit = js.native
  def off(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  def off(`type`: String, listener: AnonEventObj): Unit = js.native
  def off(`type`: String, listener: AnonEventObjHandleEvent): Unit = js.native
  def off(`type`: String, listener: AnonEventObjHandleEvent, useCapture: Boolean): Unit = js.native
  def off(`type`: String, listener: AnonEventObj, useCapture: Boolean): Unit = js.native
   // It is necessary for "arguments.callee"
  def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): js.Function = js.native
  def on(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit], scope: js.Object): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.Any
  ): js.Function = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Function = js.native
  def on(`type`: String, listener: AnonEventObj): js.Object = js.native
  def on(`type`: String, listener: AnonEventObjHandleEvent): js.Object = js.native
  def on(`type`: String, listener: AnonEventObjHandleEvent, scope: js.Object): js.Object = js.native
  def on(`type`: String, listener: AnonEventObjHandleEvent, scope: js.Object, once: Boolean): js.Object = js.native
  def on(`type`: String, listener: AnonEventObjHandleEvent, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
  def on(
    `type`: String,
    listener: AnonEventObjHandleEvent,
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def on(`type`: String, listener: AnonEventObj, scope: js.Object): js.Object = js.native
  def on(`type`: String, listener: AnonEventObj, scope: js.Object, once: Boolean): js.Object = js.native
  def on(`type`: String, listener: AnonEventObj, scope: js.Object, once: Boolean, data: js.Any): js.Object = js.native
  def on(
    `type`: String,
    listener: AnonEventObj,
    scope: js.Object,
    once: Boolean,
    data: js.Any,
    useCapture: Boolean
  ): js.Object = js.native
  def play(
    src: String,
    interrupt: js.UndefOr[js.Any],
    delay: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    loop: js.UndefOr[Double],
    volume: js.UndefOr[Double],
    pan: js.UndefOr[Double]
  ): AbstractSoundInstance = js.native
  def registerManifest(manifest: js.Array[js.Object], basePath: String): js.Object = js.native
  def registerPlugins(plugins: js.Array[_]): Boolean = js.native
  def registerSound(src: String): js.Object = js.native
  def registerSound(src: String, id: String): js.Object = js.native
  def registerSound(src: String, id: String, data: js.Object): js.Object = js.native
  def registerSound(src: String, id: String, data: js.Object, basePath: String): js.Object = js.native
  def registerSound(src: String, id: String, data: Double): js.Object = js.native
  def registerSound(src: String, id: String, data: Double, basePath: String): js.Object = js.native
  def registerSound(src: js.Object): js.Object = js.native
  def registerSound(src: js.Object, id: String): js.Object = js.native
  def registerSound(src: js.Object, id: String, data: js.Object): js.Object = js.native
  def registerSound(src: js.Object, id: String, data: js.Object, basePath: String): js.Object = js.native
  def registerSound(src: js.Object, id: String, data: Double): js.Object = js.native
  def registerSound(src: js.Object, id: String, data: Double, basePath: String): js.Object = js.native
  def registerSounds(sounds: js.Array[js.Object]): js.Array[js.Object] = js.native
  def registerSounds(sounds: js.Array[js.Object], basePath: String): js.Array[js.Object] = js.native
  def removeAllEventListeners(): Unit = js.native
  def removeAllEventListeners(`type`: String): Unit = js.native
  def removeAllSounds(): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit]): Unit = js.native
  def removeEventListener(
    `type`: String,
    listener: js.Function1[/* eventObj */ js.Object, Boolean | Unit],
    useCapture: Boolean
  ): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: AnonEventObj): Unit = js.native
  def removeEventListener(`type`: String, listener: AnonEventObjHandleEvent): Unit = js.native
  def removeEventListener(`type`: String, listener: AnonEventObjHandleEvent, useCapture: Boolean): Unit = js.native
  def removeEventListener(`type`: String, listener: AnonEventObj, useCapture: Boolean): Unit = js.native
  def removeManifest(manifest: js.Array[_], basePath: String): js.Object = js.native
  def removeSound(src: String, basePath: String): Boolean = js.native
  def removeSound(src: js.Object, basePath: String): Boolean = js.native
  def setMute(value: Boolean): Boolean = js.native
  def setVolume(value: Double): Unit = js.native
  def stop(): Unit = js.native
  def willTrigger(`type`: String): Boolean = js.native
}

