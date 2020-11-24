package typings.reactNativeSquareInAppPayments.mod.SQIPGooglePay

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GooglePayPriceStatus extends js.Object
// Types
@JSImport("react-native-square-in-app-payments", "SQIPGooglePay.GooglePayPriceStatus")
@js.native
object GooglePayPriceStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GooglePayPriceStatus with Double] = js.native
  
  /** Total price may adjust based on the details of the response, such as sales tax collected based on a billing address. */
  @js.native
  sealed trait TotalPriceStatusEstimated extends GooglePayPriceStatus
  /* 2 */ @js.native
  object TotalPriceStatusEstimated extends TopLevel[TotalPriceStatusEstimated with Double]
  
  /** Total price will not change from the amount presented to the user. */
  @js.native
  sealed trait TotalPriceStatusFinal extends GooglePayPriceStatus
  /* 3 */ @js.native
  object TotalPriceStatusFinal extends TopLevel[TotalPriceStatusFinal with Double]
  
  /** used for a capability check */
  @js.native
  sealed trait TotalPriceStatusNotCurrentlyKnown extends GooglePayPriceStatus
  /* 1 */ @js.native
  object TotalPriceStatusNotCurrentlyKnown extends TopLevel[TotalPriceStatusNotCurrentlyKnown with Double]
}
