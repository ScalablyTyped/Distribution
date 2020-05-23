package typings.soundjs.global.createjs

import typings.std.AudioContext
import typings.std.DynamicsCompressorNode
import typings.std.GainNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.WebAudioPlugin")
@js.native
class WebAudioPlugin ()
  extends typings.soundjs.createjs.WebAudioPlugin {
  /* CompleteClass */
  override var context: AudioContext = js.native
  /* CompleteClass */
  override var dynamicsCompressorNode: DynamicsCompressorNode = js.native
  /* CompleteClass */
  override var gainNode: GainNode = js.native
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
@JSGlobal("createjs.WebAudioPlugin")
@js.native
object WebAudioPlugin extends js.Object {
  // properties
  var context: AudioContext = js.native
  // methods
  def isSupported(): Boolean = js.native
  def playEmptySound(): Unit = js.native
}

