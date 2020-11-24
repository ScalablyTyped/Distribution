package typings.reactNativePaypalLib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-paypal-lib", JSImport.Default)
@js.native
object default extends js.Object {
  
  val ENVIRONMENT: EnvironmentParam = js.native
  
  val INTENT: IntentParam = js.native
  
  def paymentRequest(params: PaymentParams): js.Promise[PaymentConfirmation] = js.native
}
