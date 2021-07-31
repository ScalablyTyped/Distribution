package typings.reactNavigationNative

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactNavigationNative.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkingContextMod extends Shortcut {
  
  @JSImport("@react-navigation/native/lib/typescript/src/LinkingContext", JSImport.Default)
  @js.native
  val default: Context[Options] = js.native
  
  type _To = Context[Options]
  
  /* This means you don't have to write `default`, but can instead just say `linkingContextMod.foo` */
  override def _to: Context[Options] = default
}
