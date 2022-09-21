package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ESteamPipeWorkType extends StObject
@JSImport("steam-user", "ESteamPipeWorkType")
@js.native
object ESteamPipeWorkType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESteamPipeWorkType & Double] = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with ESteamPipeWorkType
  /* 0 */ val Invalid: typings.steamUser.mod.ESteamPipeWorkType.Invalid & Double = js.native
  
  @js.native
  sealed trait StageFromChunkStores
    extends StObject
       with ESteamPipeWorkType
  /* 1 */ val StageFromChunkStores: typings.steamUser.mod.ESteamPipeWorkType.StageFromChunkStores & Double = js.native
}
