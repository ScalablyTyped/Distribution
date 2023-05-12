package typings.reactAuthKit

import typings.reactAuthKit.distTypesMod.AuthKitStateInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsUtilsMod {
  
  @JSImport("react-auth-kit/dist/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *@function
    *@name isAuthenticated
    *@description A utility function to check
    * weather the auth state is justified as athenticated
    * or not
    *
    * It checks if the state in null or not,
    * It the state is not NULL, it checks the expires time.
    */
  inline def isAuthenticated(auth: AuthKitStateInterface): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAuthenticated")(auth.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
