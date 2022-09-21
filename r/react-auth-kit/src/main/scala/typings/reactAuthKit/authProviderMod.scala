package typings.reactAuthKit

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactAuthKit.typesMod.AuthProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authProviderMod extends Shortcut {
  
  /**
    * AuthProvider - The Authentication Context Provider
    *
    * @param children
    * @param authStorageName
    * @param cookieDomain
    * @param cookieSecure
    *
    * @return Functional Component
    */
  @JSImport("react-auth-kit/dist/AuthProvider", JSImport.Default)
  @js.native
  val default: FunctionComponent[AuthProviderProps] = js.native
  
  type _To = FunctionComponent[AuthProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `authProviderMod.foo` */
  override def _to: FunctionComponent[AuthProviderProps] = default
}
