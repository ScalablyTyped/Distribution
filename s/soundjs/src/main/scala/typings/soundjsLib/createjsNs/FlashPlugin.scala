package typings
package soundjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.FlashPlugin")
@js.native
class FlashPlugin () extends js.Object {
  var flashReady: scala.Boolean = js.native
  var showOutput: scala.Boolean = js.native
  // methods
  def create(src: java.lang.String): AbstractSoundInstance = js.native
  def getVolume(): scala.Double = js.native
  def isPreloadStarted(src: java.lang.String): scala.Boolean = js.native
  def preload(src: java.lang.String, instance: js.Object): scala.Unit = js.native
  def register(src: java.lang.String, instances: scala.Double): js.Object = js.native
  def removeAllSounds(): scala.Unit = js.native
  def removeSound(src: java.lang.String): scala.Unit = js.native
  def setMute(value: scala.Boolean): scala.Boolean = js.native
  def setVolume(value: scala.Double): scala.Boolean = js.native
}

@JSGlobal("createjs.FlashPlugin")
@js.native
object FlashPlugin extends js.Object {
  // properties
  var buildDate: java.lang.String = js.native
  var swfPath: java.lang.String = js.native
  var version: java.lang.String = js.native
  def isSupported(): scala.Boolean = js.native
}

