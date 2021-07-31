package typings.reactPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-player", JSImport.Default)
@js.native
class default () extends ReactPlayer
/* static members */
object default {
  
  @JSImport("react-player", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addCustomPlayer(player: ReactPlayer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomPlayer")(player.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def canEnablePIP(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canEnablePIP")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def canPlay(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canPlay")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def removeCustomPlayers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCustomPlayers")().asInstanceOf[Unit]
}
