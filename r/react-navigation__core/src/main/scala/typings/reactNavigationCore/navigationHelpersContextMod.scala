package typings.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactNavigationCore.typesMod.NavigationHelpers
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationHelpersContextMod extends Shortcut {
  
  /**
    * Context which holds the navigation helpers of the parent navigator.
    * Navigators should use this context in their view component.
    */
  @JSImport("@react-navigation/core/lib/typescript/src/NavigationHelpersContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[NavigationHelpers[ParamListBase, js.Object]]] = js.native
  
  type _To = Context[js.UndefOr[NavigationHelpers[ParamListBase, js.Object]]]
  
  /* This means you don't have to write `default`, but can instead just say `navigationHelpersContextMod.foo` */
  override def _to: Context[js.UndefOr[NavigationHelpers[ParamListBase, js.Object]]] = default
}
