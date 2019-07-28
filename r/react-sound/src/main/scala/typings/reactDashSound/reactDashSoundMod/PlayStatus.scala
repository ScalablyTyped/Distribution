package typings.reactDashSound.reactDashSoundMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PlayStatus extends js.Object

@JSImport("react-sound", "PlayStatus")
@js.native
object PlayStatus extends js.Object {
  @js.native
  sealed trait Paused extends PlayStatus
  
  @js.native
  sealed trait Playing extends PlayStatus
  
  @js.native
  sealed trait Stopped extends PlayStatus
  
  /* "PAUSED" */ val Paused: typings.reactDashSound.reactDashSoundMod.PlayStatus.Paused with String = js.native
  /* "PLAYING" */ val Playing: typings.reactDashSound.reactDashSoundMod.PlayStatus.Playing with String = js.native
  /* "STOPPED" */ val Stopped: typings.reactDashSound.reactDashSoundMod.PlayStatus.Stopped with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlayStatus with String] = js.native
}

