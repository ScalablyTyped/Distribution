package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EStreamP2PScope extends StObject
@JSImport("steam-user", "EStreamP2PScope")
@js.native
object EStreamP2PScope extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EStreamP2PScope & Double] = js.native
  
  @js.native
  sealed trait Disabled
    extends StObject
       with EStreamP2PScope
  /* 1 */ val Disabled: typings.steamUser.mod.EStreamP2PScope.Disabled & Double = js.native
  
  @js.native
  sealed trait Everyone
    extends StObject
       with EStreamP2PScope
  /* 4 */ val Everyone: typings.steamUser.mod.EStreamP2PScope.Everyone & Double = js.native
  
  @js.native
  sealed trait Friends
    extends StObject
       with EStreamP2PScope
  /* 3 */ val Friends: typings.steamUser.mod.EStreamP2PScope.Friends & Double = js.native
  
  @js.native
  sealed trait OnlyMe
    extends StObject
       with EStreamP2PScope
  /* 2 */ val OnlyMe: typings.steamUser.mod.EStreamP2PScope.OnlyMe & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EStreamP2PScope
  /* 0 */ val Unknown: typings.steamUser.mod.EStreamP2PScope.Unknown & Double = js.native
}
