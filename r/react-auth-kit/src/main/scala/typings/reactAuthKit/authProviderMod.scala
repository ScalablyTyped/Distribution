package typings.reactAuthKit

import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.reactAuthKit.typesMod.AuthContextInterface
import typings.reactAuthKit.typesMod.AuthProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-auth-kit/AuthProvider", JSImport.Namespace)
@js.native
object authProviderMod extends js.Object {
  
  val AuthContext: Context[AuthContextInterface] = js.native
  
  val AuthContextConsumer: Consumer[AuthContextInterface] = js.native
  
  /**
    * AuthProvider - The Authentication Context Provider
    *
    * @param children
    * @param authStorageName
    * @param authStorageType
    * @param authTimeStorageName
    * @param cookieDomain
    * @param cookieSecure
    * @param stateStorageName
    */
  val default: FunctionComponent[AuthProviderProps] = js.native
}
