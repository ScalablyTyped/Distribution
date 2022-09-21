package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPrivacyState extends StObject
@JSImport("steam-user", "EPrivacyState")
@js.native
object EPrivacyState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPrivacyState & Double] = js.native
  
  @js.native
  sealed trait FriendsOnly
    extends StObject
       with EPrivacyState
  /* 2 */ val FriendsOnly: typings.steamUser.mod.EPrivacyState.FriendsOnly & Double = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with EPrivacyState
  /* 1 */ val Private: typings.steamUser.mod.EPrivacyState.Private & Double = js.native
  
  @js.native
  sealed trait Public
    extends StObject
       with EPrivacyState
  /* 3 */ val Public: typings.steamUser.mod.EPrivacyState.Public & Double = js.native
}
