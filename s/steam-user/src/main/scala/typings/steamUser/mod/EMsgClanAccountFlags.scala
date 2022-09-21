package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMsgClanAccountFlags extends StObject
@JSImport("steam-user", "EMsgClanAccountFlags")
@js.native
object EMsgClanAccountFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMsgClanAccountFlags & Double] = js.native
  
  @js.native
  sealed trait k_EMsgClanAccountFlagDisabled
    extends StObject
       with EMsgClanAccountFlags
  /* 8 */ val k_EMsgClanAccountFlagDisabled: typings.steamUser.mod.EMsgClanAccountFlags.k_EMsgClanAccountFlagDisabled & Double = js.native
  
  @js.native
  sealed trait k_EMsgClanAccountFlagLarge
    extends StObject
       with EMsgClanAccountFlags
  /* 2 */ val k_EMsgClanAccountFlagLarge: typings.steamUser.mod.EMsgClanAccountFlags.k_EMsgClanAccountFlagLarge & Double = js.native
  
  @js.native
  sealed trait k_EMsgClanAccountFlagLocked
    extends StObject
       with EMsgClanAccountFlags
  /* 4 */ val k_EMsgClanAccountFlagLocked: typings.steamUser.mod.EMsgClanAccountFlags.k_EMsgClanAccountFlagLocked & Double = js.native
  
  @js.native
  sealed trait k_EMsgClanAccountFlagOGG
    extends StObject
       with EMsgClanAccountFlags
  /* 16 */ val k_EMsgClanAccountFlagOGG: typings.steamUser.mod.EMsgClanAccountFlags.k_EMsgClanAccountFlagOGG & Double = js.native
  
  @js.native
  sealed trait k_EMsgClanAccountFlagPublic
    extends StObject
       with EMsgClanAccountFlags
  /* 1 */ val k_EMsgClanAccountFlagPublic: typings.steamUser.mod.EMsgClanAccountFlags.k_EMsgClanAccountFlagPublic & Double = js.native
}
