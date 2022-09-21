package typings.reactNativeCommunityCliDoctor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object environmentVariablesMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/windows/environmentVariables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setEnvironment(variable: String, value: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setEnvironment")(variable.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Prepends the given `value` to the user's environment `variable`.
    * @param {string} variable The environment variable to modify
    * @param {string} value The value to add to the variable
    * @returns {Promise<void>}
    */
  inline def updateEnvironment(variable: String, value: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateEnvironment")(variable.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
