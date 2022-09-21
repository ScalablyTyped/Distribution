package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ETradeOfferConfirmationMethod extends StObject
@JSImport("steam-user", "ETradeOfferConfirmationMethod")
@js.native
object ETradeOfferConfirmationMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ETradeOfferConfirmationMethod & Double] = js.native
  
  @js.native
  sealed trait Email
    extends StObject
       with ETradeOfferConfirmationMethod
  /* 1 */ val Email: typings.steamUser.mod.ETradeOfferConfirmationMethod.Email & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with ETradeOfferConfirmationMethod
  /* 0 */ val Invalid: typings.steamUser.mod.ETradeOfferConfirmationMethod.Invalid & Double = js.native
  
  @js.native
  sealed trait MobileApp
    extends StObject
       with ETradeOfferConfirmationMethod
  /* 2 */ val MobileApp: typings.steamUser.mod.ETradeOfferConfirmationMethod.MobileApp & Double = js.native
}
