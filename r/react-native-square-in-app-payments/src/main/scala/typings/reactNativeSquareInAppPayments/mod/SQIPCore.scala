package typings.reactNativeSquareInAppPayments.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SQIPCore {
  
  @JSImport("react-native-square-in-app-payments", "SQIPCore")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Sets the Square Application ID.
    * Used to set a Square Application ID on the InAppPaymentsSDK object.
    * @param applicationId - The Square Application ID obtained from the developer portal
    */
  inline def setSquareApplicationId(applicationId: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setSquareApplicationId")(applicationId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
