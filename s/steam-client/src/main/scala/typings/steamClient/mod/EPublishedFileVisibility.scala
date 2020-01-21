package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPublishedFileVisibility extends js.Object

@JSImport("steam-client", "EPublishedFileVisibility")
@js.native
object EPublishedFileVisibility extends js.Object {
  @js.native
  sealed trait FriendsOnly extends EPublishedFileVisibility
  
  @js.native
  sealed trait Private extends EPublishedFileVisibility
  
  @js.native
  sealed trait Public extends EPublishedFileVisibility
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPublishedFileVisibility with Double] = js.native
  /* 1 */ @js.native
  object FriendsOnly extends TopLevel[FriendsOnly with Double]
  
  /* 2 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  /* 0 */ @js.native
  object Public extends TopLevel[Public with Double]
  
}

