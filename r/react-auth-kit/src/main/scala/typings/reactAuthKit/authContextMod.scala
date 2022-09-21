package typings.reactAuthKit

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Consumer
import typings.react.mod.Context
import typings.reactAuthKit.typesMod.AuthContextInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authContextMod extends Shortcut {
  
  @JSImport("react-auth-kit/dist/AuthContext", JSImport.Default)
  @js.native
  val default: Context[AuthContextInterface | Null] = js.native
  
  @JSImport("react-auth-kit/dist/AuthContext", "AuthContextConsumer")
  @js.native
  val AuthContextConsumer: Consumer[AuthContextInterface | Null] = js.native
  
  type _To = Context[AuthContextInterface | Null]
  
  /* This means you don't have to write `default`, but can instead just say `authContextMod.foo` */
  override def _to: Context[AuthContextInterface | Null] = default
}
