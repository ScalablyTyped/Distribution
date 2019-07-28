package typings.soundjs.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.AbstractPlugin")
@js.native
class AbstractPlugin () extends js.Object {
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

