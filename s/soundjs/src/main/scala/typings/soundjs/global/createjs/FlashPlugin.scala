package typings.soundjs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.FlashPlugin")
@js.native
class FlashPlugin ()
  extends typings.soundjs.createjs.FlashPlugin {
  /* CompleteClass */
  override var flashReady: Boolean = js.native
  /* CompleteClass */
  override var showOutput: Boolean = js.native
  // methods
  /* CompleteClass */
  override def create(src: String): typings.soundjs.createjs.AbstractSoundInstance = js.native
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

