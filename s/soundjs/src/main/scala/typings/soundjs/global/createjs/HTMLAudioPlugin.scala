package typings.soundjs.global.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.HTMLAudioPlugin")
@js.native
class HTMLAudioPlugin ()
  extends typings.soundjs.createjs.HTMLAudioPlugin {
  // properties
  /* CompleteClass */
  override var defaultNumChannels: Double = js.native
  /* CompleteClass */
  override var enableIOS: Boolean = js.native
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
@JSGlobal("createjs.HTMLAudioPlugin")
@js.native
object HTMLAudioPlugin extends js.Object {
       // deprecated
  var MAX_INSTANCES: Double = js.native
  // methods
  def isSupported(): Boolean = js.native
}

