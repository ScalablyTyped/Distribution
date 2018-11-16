package typings
package reactDashSoundLib.reactDashSoundMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayStatus extends js.Object

@JSImport("react-sound", "PlayStatus")
@js.native
object PlayStatus extends js.Object {
  @js.native
  sealed trait Paused
    extends reactDashSoundLib.reactDashSoundMod.PlayStatus
  
  @js.native
  sealed trait Playing
    extends reactDashSoundLib.reactDashSoundMod.PlayStatus
  
  @js.native
  sealed trait Stopped
    extends reactDashSoundLib.reactDashSoundMod.PlayStatus
  
  /* "PAUSED" */ val Paused: Paused with java.lang.String = js.native
  /* "PLAYING" */ val Playing: Playing with java.lang.String = js.native
  /* "STOPPED" */ val Stopped: Stopped with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[reactDashSoundLib.reactDashSoundMod.PlayStatus with java.lang.String] = js.native
}

