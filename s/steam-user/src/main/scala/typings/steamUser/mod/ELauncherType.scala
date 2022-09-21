package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELauncherType extends StObject
@JSImport("steam-user", "ELauncherType")
@js.native
object ELauncherType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELauncherType & Double] = js.native
  
  @js.native
  sealed trait CSGO
    extends StObject
       with ELauncherType
  /* 4 */ val CSGO: typings.steamUser.mod.ELauncherType.CSGO & Double = js.native
  
  @js.native
  sealed trait ClientUI
    extends StObject
       with ELauncherType
  /* 5 */ val ClientUI: typings.steamUser.mod.ELauncherType.ClientUI & Double = js.native
  
  @js.native
  sealed trait CmdLine
    extends StObject
       with ELauncherType
  /* 3 */ val CmdLine: typings.steamUser.mod.ELauncherType.CmdLine & Double = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with ELauncherType
  /* 0 */ val Default: typings.steamUser.mod.ELauncherType.Default & Double = js.native
  
  @js.native
  sealed trait Headless
    extends StObject
       with ELauncherType
  /* 6 */ val Headless: typings.steamUser.mod.ELauncherType.Headless & Double = js.native
  
  @js.native
  sealed trait Nexon
    extends StObject
       with ELauncherType
  /* 2 */ val Nexon: typings.steamUser.mod.ELauncherType.Nexon & Double = js.native
  
  @js.native
  sealed trait PerfectWorld
    extends StObject
       with ELauncherType
  /* 1 */ val PerfectWorld: typings.steamUser.mod.ELauncherType.PerfectWorld & Double = js.native
  
  @js.native
  sealed trait SingleApp
    extends StObject
       with ELauncherType
  /* 8 */ val SingleApp: typings.steamUser.mod.ELauncherType.SingleApp & Double = js.native
  
  @js.native
  sealed trait SteamChina
    extends StObject
       with ELauncherType
  /* 7 */ val SteamChina: typings.steamUser.mod.ELauncherType.SteamChina & Double = js.native
}
