package typings.reactAuthKit

import typings.reactAuthKit.distTypesMod.createRefreshParamInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCreateRefreshMod {
  
  @JSImport("react-auth-kit/dist/createRefresh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This function doesn't really "do anything" at runtime,
    * it's just help to organize the code base
    * Use this function to create the refresh token system
    */
  inline def default(param: createRefreshParamInterface): createRefreshParamInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param.asInstanceOf[js.Any]).asInstanceOf[createRefreshParamInterface]
}
