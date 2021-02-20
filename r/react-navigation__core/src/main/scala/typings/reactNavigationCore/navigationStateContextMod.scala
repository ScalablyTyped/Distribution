package typings.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactNavigationCore.anon.AddOptionsGetter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationStateContextMod extends Shortcut {
  
  @JSImport("@react-navigation/core/lib/typescript/src/NavigationStateContext", JSImport.Default)
  @js.native
  val default: Context[AddOptionsGetter] = js.native
  
  type _To = Context[AddOptionsGetter]
  
  /* This means you don't have to write `default`, but can instead just say `navigationStateContextMod.foo` */
  override def _to: Context[AddOptionsGetter] = default
}
