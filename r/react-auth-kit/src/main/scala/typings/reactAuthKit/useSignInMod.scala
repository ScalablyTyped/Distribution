package typings.reactAuthKit

import typings.reactAuthKit.typesMod.signInFunctionParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSignInMod {
  
  @JSImport("react-auth-kit/hooks/useSignIn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Authentication SignIn Hook
    *
    * @returns - Sign In function
    */
  @scala.inline
  def default(): js.Function1[/* signInConfig */ signInFunctionParams, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* signInConfig */ signInFunctionParams, Boolean]]
}
