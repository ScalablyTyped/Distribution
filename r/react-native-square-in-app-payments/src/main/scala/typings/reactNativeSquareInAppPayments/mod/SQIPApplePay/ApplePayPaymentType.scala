package typings.reactNativeSquareInAppPayments.mod.SQIPApplePay

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplePayPaymentType extends js.Object
// Types
@JSImport("react-native-square-in-app-payments", "SQIPApplePay.ApplePayPaymentType")
@js.native
object ApplePayPaymentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplePayPaymentType with Double] = js.native
  
  /** A summary item representing the known, final cost. */
  @js.native
  sealed trait PaymentTypeFinal extends ApplePayPaymentType
  /* 2 */ @js.native
  object PaymentTypeFinal extends TopLevel[PaymentTypeFinal with Double]
  
  /** A summary item representing an estimated or unknown cost. */
  @js.native
  sealed trait PaymentTypePending extends ApplePayPaymentType
  /* 1 */ @js.native
  object PaymentTypePending extends TopLevel[PaymentTypePending with Double]
}
