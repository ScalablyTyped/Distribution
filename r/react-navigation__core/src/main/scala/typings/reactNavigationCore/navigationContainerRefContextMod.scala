package typings.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactNavigationCore.typesMod.NavigationContainerRef
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationContainerRefContextMod extends Shortcut {
  
  /**
    * Context which holds the route prop for a screen.
    */
  @JSImport("@react-navigation/core/lib/typescript/src/NavigationContainerRefContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[NavigationContainerRef[ParamListBase]]] = js.native
  
  type _To = Context[js.UndefOr[NavigationContainerRef[ParamListBase]]]
  
  /* This means you don't have to write `default`, but can instead just say `navigationContainerRefContextMod.foo` */
  override def _to: Context[js.UndefOr[NavigationContainerRef[ParamListBase]]] = default
}
