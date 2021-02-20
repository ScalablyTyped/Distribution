package typings.reactAuthKit

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.reactAuthKit.typesMod.AuthContextInterface
import typings.reactAuthKit.typesMod.AuthProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authProviderMod extends Shortcut {
  
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
  @JSImport("react-auth-kit/AuthProvider", JSImport.Default)
  @js.native
  val default: FunctionComponent[AuthProviderProps] = js.native
  
  @JSImport("react-auth-kit/AuthProvider", "AuthContext")
  @js.native
  val AuthContext: Context[AuthContextInterface] = js.native
  
  @JSImport("react-auth-kit/AuthProvider", "AuthContextConsumer")
  @js.native
  val AuthContextConsumer: Consumer[AuthContextInterface] = js.native
  
  type _To = FunctionComponent[AuthProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `authProviderMod.foo` */
  override def _to: FunctionComponent[AuthProviderProps] = default
}
