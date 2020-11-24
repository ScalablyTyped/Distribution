package typings.reactPlyr.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plyr
  extends Component[Props, js.Object, js.Any] {
  
  def decreaseVolume(step: Boolean): Unit = js.native
  
  def enterFullscreen(): Unit = js.native
  
  def exitFullscreen(): Unit = js.native
  
  def forward(time: Double): Unit = js.native
  
  def getCurrentTime(): Double = js.native
  
  def getDuration(): Double = js.native
  
  def getType(): js.Any = js.native
  
  def getVolume(): Double = js.native
  
  def increaseVolume(step: Boolean): Unit = js.native
  
  def isMuted(): Boolean = js.native
  
  def isPaused(): Boolean = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def restart(): Unit = js.native
  
  def rewind(time: Double): Unit = js.native
  
  def setCurrentTime(time: Double): Unit = js.native
  
  def setMuted(): Unit = js.native
  def setMuted(muted: Boolean): Unit = js.native
  
  def setVolume(amount: Boolean): Unit = js.native
  
  def stop(): Unit = js.native
  
  def toggleFullscreen(): Unit = js.native
  
  def toggleMute(): Unit = js.native
  
  def togglePlay(): Unit = js.native
}
