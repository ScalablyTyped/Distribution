package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERegionCode extends StObject
@JSImport("steam-client", "ERegionCode")
@js.native
object ERegionCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERegionCode with Double] = js.native
  
  @js.native
  sealed trait Africa extends ERegionCode
  /* 0x07 */ val Africa: typings.steamClient.mod.ERegionCode.Africa with Double = js.native
  
  @js.native
  sealed trait Asia extends ERegionCode
  /* 0x04 */ val Asia: typings.steamClient.mod.ERegionCode.Asia with Double = js.native
  
  @js.native
  sealed trait Australia extends ERegionCode
  /* 0x05 */ val Australia: typings.steamClient.mod.ERegionCode.Australia with Double = js.native
  
  @js.native
  sealed trait Europe extends ERegionCode
  /* 0x03 */ val Europe: typings.steamClient.mod.ERegionCode.Europe with Double = js.native
  
  @js.native
  sealed trait MiddleEast extends ERegionCode
  /* 0x06 */ val MiddleEast: typings.steamClient.mod.ERegionCode.MiddleEast with Double = js.native
  
  @js.native
  sealed trait SouthAmerica extends ERegionCode
  /* 0x02 */ val SouthAmerica: typings.steamClient.mod.ERegionCode.SouthAmerica with Double = js.native
  
  @js.native
  sealed trait USEast extends ERegionCode
  /* 0x00 */ val USEast: typings.steamClient.mod.ERegionCode.USEast with Double = js.native
  
  @js.native
  sealed trait USWest extends ERegionCode
  /* 0x01 */ val USWest: typings.steamClient.mod.ERegionCode.USWest with Double = js.native
  
  @js.native
  sealed trait World extends ERegionCode
  /* 0xFF */ val World: typings.steamClient.mod.ERegionCode.World with Double = js.native
}
