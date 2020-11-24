package typings.reactNativeSquareInAppPayments.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-square-in-app-payments", "SQIPCore")
@js.native
object SQIPCore extends js.Object {
  
  /**
    * Sets the Square Application ID.
    * Used to set a Square Application ID on the InAppPaymentsSDK object.
    * @param applicationId - The Square Application ID obtained from the developer portal
    */
  def setSquareApplicationId(applicationId: String): js.Promise[Unit] = js.native
}
