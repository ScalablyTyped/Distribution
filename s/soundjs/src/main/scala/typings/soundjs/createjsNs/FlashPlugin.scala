package typings.soundjs.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.FlashPlugin")
@js.native
class FlashPlugin () extends js.Object {
  var flashReady: Boolean = js.native
  var showOutput: Boolean = js.native
  // methods
  def create(src: String): AbstractSoundInstance = js.native
  def getVolume(): Double = js.native
  def isPreloadStarted(src: String): Boolean = js.native
  def preload(src: String, instance: js.Object): Unit = js.native
  def register(src: String, instances: Double): js.Object = js.native
  def removeAllSounds(): Unit = js.native
  def removeSound(src: String): Unit = js.native
  def setMute(value: Boolean): Boolean = js.native
  def setVolume(value: Double): Boolean = js.native
}

/* static members */
@JSGlobal("createjs.FlashPlugin")
@js.native
object FlashPlugin extends js.Object {
  // properties
  var buildDate: String = js.native
  var swfPath: String = js.native
  var version: String = js.native
  def isSupported(): Boolean = js.native
}

