package typings
package soundjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.AbstractSoundInstance")
@js.native
class AbstractSoundInstance protected ()
  extends createjsDashLibLib.createjsNs.EventDispatcher {
  def this(src: java.lang.String, startTime: scala.Double, duration: scala.Double, playbackResource: js.Object) = this()
  // properties
  var duration: scala.Double = js.native
  var loop: scala.Double = js.native
  var muted: scala.Boolean = js.native
  var pan: scala.Double = js.native
  var paused: scala.Boolean = js.native
  var playState: java.lang.String = js.native
  var playbackResource: js.Object = js.native
  var position: scala.Double = js.native
  var src: java.lang.String = js.native
  var uniqueId: scala.Double | java.lang.String = js.native
  var volume: scala.Double = js.native
  // methods
  def destroy(): scala.Unit = js.native
  def getDuration(): scala.Double = js.native
  def getLoop(): scala.Double = js.native
  def getMute(): scala.Boolean = js.native
  def getPan(): scala.Double = js.native
  def getPaused(): scala.Boolean = js.native
  def getPosition(): scala.Double = js.native
  def getVolume(): scala.Double = js.native
  def play(
    interrupt: js.UndefOr[js.Object | java.lang.String],
    delay: js.UndefOr[scala.Double],
    offset: js.UndefOr[scala.Double],
    loop: js.UndefOr[scala.Double],
    volume: js.UndefOr[scala.Double],
    pan: js.UndefOr[scala.Double]
  ): AbstractSoundInstance = js.native
  def setDuration(value: scala.Double): AbstractSoundInstance = js.native
  def setLoop(value: scala.Double): scala.Unit = js.native
  def setMute(value: scala.Boolean): AbstractSoundInstance = js.native
  def setPan(value: scala.Double): AbstractSoundInstance = js.native
  def setPlayback(value: js.Object): AbstractSoundInstance = js.native
  def setPosition(value: scala.Double): AbstractSoundInstance = js.native
  def setVolume(value: scala.Double): AbstractSoundInstance = js.native
  def stop(): AbstractSoundInstance = js.native
}

