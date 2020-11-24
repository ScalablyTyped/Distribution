package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERegionCode extends js.Object
@JSImport("steam-client", "ERegionCode")
@js.native
object ERegionCode extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERegionCode with Double] = js.native
  
  @js.native
  sealed trait Africa extends ERegionCode
  /* 0x07 */ @js.native
  object Africa extends TopLevel[Africa with Double]
  
  @js.native
  sealed trait Asia extends ERegionCode
  /* 0x04 */ @js.native
  object Asia extends TopLevel[Asia with Double]
  
  @js.native
  sealed trait Australia extends ERegionCode
  /* 0x05 */ @js.native
  object Australia extends TopLevel[Australia with Double]
  
  @js.native
  sealed trait Europe extends ERegionCode
  /* 0x03 */ @js.native
  object Europe extends TopLevel[Europe with Double]
  
  @js.native
  sealed trait MiddleEast extends ERegionCode
  /* 0x06 */ @js.native
  object MiddleEast extends TopLevel[MiddleEast with Double]
  
  @js.native
  sealed trait SouthAmerica extends ERegionCode
  /* 0x02 */ @js.native
  object SouthAmerica extends TopLevel[SouthAmerica with Double]
  
  @js.native
  sealed trait USEast extends ERegionCode
  /* 0x00 */ @js.native
  object USEast extends TopLevel[USEast with Double]
  
  @js.native
  sealed trait USWest extends ERegionCode
  /* 0x01 */ @js.native
  object USWest extends TopLevel[USWest with Double]
  
  @js.native
  sealed trait World extends ERegionCode
  /* 0xFF */ @js.native
  object World extends TopLevel[World with Double]
}
