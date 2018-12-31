package typings
package soundjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Sound")
@js.native
class Sound ()
  extends createjsDashLibLib.createjsNs.EventDispatcher

@JSGlobal("createjs.Sound")
@js.native
object Sound extends js.Object {
  var EXTENSION_MAP: js.Object = js.native
  var INTERRUPT_ANY: java.lang.String = js.native
  var INTERRUPT_EARLY: java.lang.String = js.native
  var INTERRUPT_LATE: java.lang.String = js.native
  var INTERRUPT_NONE: java.lang.String = js.native
  var PLAY_FAILED: java.lang.String = js.native
  var PLAY_FINISHED: java.lang.String = js.native
  var PLAY_INITED: java.lang.String = js.native
  var PLAY_INTERRUPTED: java.lang.String = js.native
  var PLAY_SUCCEEDED: java.lang.String = js.native
  var SUPPORTED_EXTENSIONS: js.Array[java.lang.String] = js.native
  // properties
  var activePlugin: js.Object = js.native
  var alternateExtensions: js.Array[_] = js.native
  var capabilities: js.Any = js.native
  var defaultInterruptBehavior: java.lang.String = js.native
  var muted: scala.Boolean = js.native
  var volume: scala.Double = js.native
  // EventDispatcher mixins
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit]
  ): js.Function = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    useCapture: scala.Boolean
  ): js.Function = js.native
  def addEventListener(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEvent): js.Object = js.native
  def addEventListener(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEventEventObj): js.Object = js.native
  def addEventListener(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEventEventObj, useCapture: scala.Boolean): js.Object = js.native
  def addEventListener(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEvent, useCapture: scala.Boolean): js.Object = js.native
  // methods
  def createInstance(src: java.lang.String): soundjsLib.createjsNs.AbstractSoundInstance = js.native
  def dispatchEvent(eventObj: createjsDashLibLib.createjsNs.Event): scala.Boolean = js.native
  def dispatchEvent(eventObj: createjsDashLibLib.createjsNs.Event, target: js.Object): scala.Boolean = js.native
  def dispatchEvent(eventObj: java.lang.String): scala.Boolean = js.native
  def dispatchEvent(eventObj: java.lang.String, target: js.Object): scala.Boolean = js.native
  def dispatchEvent(eventObj: js.Object): scala.Boolean = js.native
  def dispatchEvent(eventObj: js.Object, target: js.Object): scala.Boolean = js.native
  def getCapabilities(): js.Object = js.native
  def getCapability(key: java.lang.String): scala.Double | scala.Boolean = js.native
  def getMute(): scala.Boolean = js.native
  def getVolume(): scala.Double = js.native
  def hasEventListener(`type`: java.lang.String): scala.Boolean = js.native
  def initializeDefaultPlugins(): scala.Boolean = js.native
  def isReady(): scala.Boolean = js.native
  def loadComplete(src: java.lang.String): scala.Boolean = js.native
  def off(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def off(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit]
  ): scala.Unit = js.native
  def off(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEvent): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEventEventObj): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEventEventObj, useCapture: scala.Boolean): scala.Unit = js.native
  def off(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEvent, useCapture: scala.Boolean): scala.Unit = js.native
   // It is necessary for "arguments.callee"
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit]
  ): js.Function = js.native
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    scope: js.Object
  ): js.Function = js.native
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    scope: js.Object,
    once: scala.Boolean
  ): js.Function = js.native
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any
  ): js.Function = js.native
  def on(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any,
    useCapture: scala.Boolean
  ): js.Function = js.native
  def on(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEvent): js.Object = js.native
  def on(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEventEventObj): js.Object = js.native
  def on(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEventEventObj, scope: js.Object): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: soundjsLib.Anon_HandleEventEventObj,
    scope: js.Object,
    once: scala.Boolean
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: soundjsLib.Anon_HandleEventEventObj,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: soundjsLib.Anon_HandleEventEventObj,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any,
    useCapture: scala.Boolean
  ): js.Object = js.native
  def on(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEvent, scope: js.Object): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: soundjsLib.Anon_HandleEvent,
    scope: js.Object,
    once: scala.Boolean
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: soundjsLib.Anon_HandleEvent,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any
  ): js.Object = js.native
  def on(
    `type`: java.lang.String,
    listener: soundjsLib.Anon_HandleEvent,
    scope: js.Object,
    once: scala.Boolean,
    data: js.Any,
    useCapture: scala.Boolean
  ): js.Object = js.native
  def play(
    src: java.lang.String,
    interrupt: js.UndefOr[js.Any],
    delay: js.UndefOr[scala.Double],
    offset: js.UndefOr[scala.Double],
    loop: js.UndefOr[scala.Double],
    volume: js.UndefOr[scala.Double],
    pan: js.UndefOr[scala.Double]
  ): soundjsLib.createjsNs.AbstractSoundInstance = js.native
  def registerManifest(manifest: js.Array[js.Object], basePath: java.lang.String): js.Object = js.native
  def registerPlugins(plugins: js.Array[_]): scala.Boolean = js.native
  def registerSound(src: java.lang.String): js.Object = js.native
  def registerSound(src: java.lang.String, id: java.lang.String): js.Object = js.native
  def registerSound(src: java.lang.String, id: java.lang.String, data: js.Object): js.Object = js.native
  def registerSound(src: java.lang.String, id: java.lang.String, data: js.Object, basePath: java.lang.String): js.Object = js.native
  def registerSound(src: java.lang.String, id: java.lang.String, data: scala.Double): js.Object = js.native
  def registerSound(src: java.lang.String, id: java.lang.String, data: scala.Double, basePath: java.lang.String): js.Object = js.native
  def registerSound(src: js.Object): js.Object = js.native
  def registerSound(src: js.Object, id: java.lang.String): js.Object = js.native
  def registerSound(src: js.Object, id: java.lang.String, data: js.Object): js.Object = js.native
  def registerSound(src: js.Object, id: java.lang.String, data: js.Object, basePath: java.lang.String): js.Object = js.native
  def registerSound(src: js.Object, id: java.lang.String, data: scala.Double): js.Object = js.native
  def registerSound(src: js.Object, id: java.lang.String, data: scala.Double, basePath: java.lang.String): js.Object = js.native
  def registerSounds(sounds: js.Array[js.Object]): js.Array[js.Object] = js.native
  def registerSounds(sounds: js.Array[js.Object], basePath: java.lang.String): js.Array[js.Object] = js.native
  def removeAllEventListeners(): scala.Unit = js.native
  def removeAllEventListeners(`type`: java.lang.String): scala.Unit = js.native
  def removeAllSounds(): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit]
  ): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: js.Function1[/* eventObj */ js.Object, scala.Boolean | scala.Unit],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEvent): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEventEventObj): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEventEventObj, useCapture: scala.Boolean): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: soundjsLib.Anon_HandleEvent, useCapture: scala.Boolean): scala.Unit = js.native
  def removeManifest(manifest: js.Array[_], basePath: java.lang.String): js.Object = js.native
  def removeSound(src: java.lang.String, basePath: java.lang.String): scala.Boolean = js.native
  def removeSound(src: js.Object, basePath: java.lang.String): scala.Boolean = js.native
  def setMute(value: scala.Boolean): scala.Boolean = js.native
  def setVolume(value: scala.Double): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def willTrigger(`type`: java.lang.String): scala.Boolean = js.native
}

