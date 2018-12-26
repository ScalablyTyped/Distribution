package typings
package reactDashPlayerLib.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactPlayer
  extends reactLib.reactMod.Component[ReactPlayerProps, js.Any, js.Any] {
  def getCurrentTime(): scala.Double = js.native
  def getDuration(): scala.Double = js.native
  def getInternalPlayer(): js.Object = js.native
  def getInternalPlayer(key: java.lang.String): js.Object = js.native
  def seekTo(fraction: scala.Double): scala.Unit = js.native
}

