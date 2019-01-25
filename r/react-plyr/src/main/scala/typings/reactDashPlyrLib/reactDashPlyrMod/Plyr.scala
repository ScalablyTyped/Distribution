package typings
package reactDashPlyrLib.reactDashPlyrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plyr
  extends reactLib.reactMod.Component[Props, js.Object, js.Any] {
  def decreaseVolume(step: scala.Boolean): scala.Unit = js.native
  def enterFullscreen(): scala.Unit = js.native
  def exitFullscreen(): scala.Unit = js.native
  def forward(time: scala.Double): scala.Unit = js.native
  def getCurrentTime(): scala.Double = js.native
  def getDuration(): scala.Double = js.native
  def getType(): js.Any = js.native
  def getVolume(): scala.Double = js.native
  def increaseVolume(step: scala.Boolean): scala.Unit = js.native
  def isMuted(): scala.Boolean = js.native
  def isPaused(): scala.Boolean = js.native
  def pause(): scala.Unit = js.native
  def play(): scala.Unit = js.native
  def restart(): scala.Unit = js.native
  def rewind(time: scala.Double): scala.Unit = js.native
  def setCurrentTime(time: scala.Double): scala.Unit = js.native
  def setMuted(): scala.Unit = js.native
  def setMuted(muted: scala.Boolean): scala.Unit = js.native
  def setVolume(amount: scala.Boolean): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def toggleFullscreen(): scala.Unit = js.native
  def toggleMute(): scala.Unit = js.native
  def togglePlay(): scala.Unit = js.native
}

