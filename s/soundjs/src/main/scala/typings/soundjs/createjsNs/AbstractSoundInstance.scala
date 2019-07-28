package typings.soundjs.createjsNs

import typings.createjsDashLib.createjsNs.EventDispatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.AbstractSoundInstance")
@js.native
class AbstractSoundInstance protected () extends EventDispatcher {
  def this(src: String, startTime: Double, duration: Double, playbackResource: js.Object) = this()
  // properties
  var duration: Double = js.native
  var loop: Double = js.native
  var muted: Boolean = js.native
  var pan: Double = js.native
  var paused: Boolean = js.native
  var playState: String = js.native
  var playbackResource: js.Object = js.native
  var position: Double = js.native
  var src: String = js.native
  var uniqueId: Double | String = js.native
  var volume: Double = js.native
  // methods
  def destroy(): Unit = js.native
  def getDuration(): Double = js.native
  def getLoop(): Double = js.native
  def getMute(): Boolean = js.native
  def getPan(): Double = js.native
  def getPaused(): Boolean = js.native
  def getPosition(): Double = js.native
  def getVolume(): Double = js.native
  def play(
    interrupt: js.UndefOr[js.Object | String],
    delay: js.UndefOr[Double],
    offset: js.UndefOr[Double],
    loop: js.UndefOr[Double],
    volume: js.UndefOr[Double],
    pan: js.UndefOr[Double]
  ): AbstractSoundInstance = js.native
  def setDuration(value: Double): AbstractSoundInstance = js.native
  def setLoop(value: Double): Unit = js.native
  def setMute(value: Boolean): AbstractSoundInstance = js.native
  def setPan(value: Double): AbstractSoundInstance = js.native
  def setPlayback(value: js.Object): AbstractSoundInstance = js.native
  def setPosition(value: Double): AbstractSoundInstance = js.native
  def setVolume(value: Double): AbstractSoundInstance = js.native
  def stop(): AbstractSoundInstance = js.native
}

