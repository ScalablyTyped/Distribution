package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PrivacyState extends StObject
// region Static enums
@JSImport("steamcommunity", "PrivacyState")
@js.native
object PrivacyState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PrivacyState & Double] = js.native
  
  @js.native
  sealed trait FriendsOnly
    extends StObject
       with PrivacyState
  /* 2 */ val FriendsOnly: typings.steamcommunity.mod.PrivacyState.FriendsOnly & Double = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with PrivacyState
  /* 1 */ val Private: typings.steamcommunity.mod.PrivacyState.Private & Double = js.native
  
  @js.native
  sealed trait Public
    extends StObject
       with PrivacyState
  /* 3 */ val Public: typings.steamcommunity.mod.PrivacyState.Public & Double = js.native
}
