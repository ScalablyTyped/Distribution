package typings.reactPlayer.mod

import typings.react.mod.Component
import typings.reactPlayer.reactPlayerStrings.fraction
import typings.reactPlayer.reactPlayerStrings.seconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactPlayer
  extends Component[ReactPlayerProps, js.Any, js.Any] {
  
  def getCurrentTime(): Double = js.native
  
  def getDuration(): Double = js.native
  
  def getInternalPlayer(): js.Object = js.native
  def getInternalPlayer(key: String): js.Object = js.native
  
  def getSecondsLoaded(): Double = js.native
  
  def seekTo(amount: Double): Unit = js.native
  @JSName("seekTo")
  def seekTo_fraction(amount: Double, `type`: fraction): Unit = js.native
  @JSName("seekTo")
  def seekTo_seconds(amount: Double, `type`: seconds): Unit = js.native
  
  def showPreview(): Unit = js.native
}
