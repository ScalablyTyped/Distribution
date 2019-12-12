package typings.reactDashSound.reactDashSoundMod

import org.scalablytyped.runtime.TopLevel
import typings.reactDashSound.reactDashSoundMod.PlayStatus.Paused
import typings.reactDashSound.reactDashSoundMod.PlayStatus.Playing
import typings.reactDashSound.reactDashSoundMod.PlayStatus.Stopped
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PlayStatus with String] = js.native
  /* "PAUSED" */ @js.native
  object Paused extends TopLevel[Paused with String]
  
  /* "PLAYING" */ @js.native
  object Playing extends TopLevel[Playing with String]
  
  /* "STOPPED" */ @js.native
  object Stopped extends TopLevel[Stopped with String]
  
}

