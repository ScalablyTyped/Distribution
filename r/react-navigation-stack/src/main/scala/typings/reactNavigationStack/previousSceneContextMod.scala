package typings.reactNavigationStack

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.vendorTypesMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previousSceneContextMod extends Shortcut {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/utils/PreviousSceneContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[Scene[NavigationRoute[NavigationParams]]]] = js.native
  
  type _To = Context[js.UndefOr[Scene[NavigationRoute[NavigationParams]]]]
  
  /* This means you don't have to write `default`, but can instead just say `previousSceneContextMod.foo` */
  override def _to: Context[js.UndefOr[Scene[NavigationRoute[NavigationParams]]]] = default
}
