package typings.reactNativeGoogleAnalyticsBridge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-google-analytics-bridge/dist/Helpers/FunctionCallTagHandler/models", JSImport.Namespace)
@js.native
object modelsMod extends js.Object {
  
  type Handler = js.Function2[/* functionName */ String, /* tagArguments */ js.Any, js.Any]
  
  type RegisterHandler = js.Function2[/* functionName */ String, /* handler */ Handler, js.Promise[Boolean]]
}
