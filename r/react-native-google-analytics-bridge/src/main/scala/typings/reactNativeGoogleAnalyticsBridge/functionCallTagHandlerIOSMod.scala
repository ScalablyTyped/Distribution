package typings.reactNativeGoogleAnalyticsBridge

import typings.reactNativeGoogleAnalyticsBridge.modelsMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionCallTagHandlerIOSMod {
  
  @JSImport("react-native-google-analytics-bridge/dist/Helpers/FunctionCallTagHandler/FunctionCallTagHandlerIOS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(functionName: String, handler: Handler): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(functionName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
