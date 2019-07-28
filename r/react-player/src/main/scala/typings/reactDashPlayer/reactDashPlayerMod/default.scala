package typings.reactDashPlayer.reactDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-player", JSImport.Default)
@js.native
class default () extends ReactPlayer

/* static members */
@JSImport("react-player", JSImport.Default)
@js.native
object default extends js.Object {
  def addCustomPlayer(player: ReactPlayer): Unit = js.native
  def canEnablePIP(url: String): Boolean = js.native
  def canPlay(url: String): Boolean = js.native
  def removeCustomPlayers(): Unit = js.native
}

