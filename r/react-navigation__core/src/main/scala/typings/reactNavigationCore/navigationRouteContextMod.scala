package typings.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactNavigationRouters.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationRouteContextMod extends Shortcut {
  
  /**
    * Context which holds the route prop for a screen.
    */
  @JSImport("@react-navigation/core/lib/typescript/src/NavigationRouteContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  type _To = Context[js.UndefOr[Route[String, js.UndefOr[js.Object]]]]
  
  /* This means you don't have to write `default`, but can instead just say `navigationRouteContextMod.foo` */
  override def _to: Context[js.UndefOr[Route[String, js.UndefOr[js.Object]]]] = default
}
