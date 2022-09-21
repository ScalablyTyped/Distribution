package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EProtoExecutionSite extends StObject
@JSImport("steam-user", "EProtoExecutionSite")
@js.native
object EProtoExecutionSite extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EProtoExecutionSite & Double] = js.native
  
  @js.native
  sealed trait SteamClient
    extends StObject
       with EProtoExecutionSite
  /* 2 */ val SteamClient: typings.steamUser.mod.EProtoExecutionSite.SteamClient & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EProtoExecutionSite
  /* 0 */ val Unknown: typings.steamUser.mod.EProtoExecutionSite.Unknown & Double = js.native
}
