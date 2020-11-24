package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EUCMFilePrivacyState extends js.Object
@JSImport("steam-client", "EUCMFilePrivacyState")
@js.native
object EUCMFilePrivacyState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EUCMFilePrivacyState with Double] = js.native
  
   // 14
  @js.native
  sealed trait All extends EUCMFilePrivacyState
  /* 8 | 4 | 2 */ @js.native
  object All extends TopLevel[All with Double]
  
  @js.native
  sealed trait FriendsOnly extends EUCMFilePrivacyState
  /* 4 */ @js.native
  object FriendsOnly extends TopLevel[FriendsOnly with Double]
  
  @js.native
  sealed trait Invalid extends EUCMFilePrivacyState
  /* -1 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  @js.native
  sealed trait Private extends EUCMFilePrivacyState
  /* 2 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  @js.native
  sealed trait Public extends EUCMFilePrivacyState
  /* 8 */ @js.native
  object Public extends TopLevel[Public with Double]
}
