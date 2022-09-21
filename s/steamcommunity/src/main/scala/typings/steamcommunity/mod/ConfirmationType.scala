package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ConfirmationType extends StObject
/**
  * 1 is unknown, possibly "Invalid".
  * 4 is opt-out or other like account confirmation?
  */
@JSImport("steamcommunity", "ConfirmationType")
@js.native
object ConfirmationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConfirmationType & Double] = js.native
  
  @js.native
  sealed trait MarketListing
    extends StObject
       with ConfirmationType
  /* 3 */ val MarketListing: typings.steamcommunity.mod.ConfirmationType.MarketListing & Double = js.native
  
  @js.native
  sealed trait Trade
    extends StObject
       with ConfirmationType
  /* 2 */ val Trade: typings.steamcommunity.mod.ConfirmationType.Trade & Double = js.native
}
