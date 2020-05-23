package typings.soundjs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.FlashAudioPlugin")
@js.native
class FlashAudioPlugin ()
  extends typings.soundjs.createjs.FlashAudioPlugin {
  // properties
  /* CompleteClass */
  override var flashReady: Boolean = js.native
  /* CompleteClass */
  override var showOutput: Boolean = js.native
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

/* static members */
@JSGlobal("createjs.FlashAudioPlugin")
@js.native
object FlashAudioPlugin extends js.Object {
  var swfPath: String = js.native
  // methods
  def isSupported(): Boolean = js.native
}

