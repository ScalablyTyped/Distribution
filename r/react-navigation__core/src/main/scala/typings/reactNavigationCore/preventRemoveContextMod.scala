package typings.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactNavigationCore.anon.PreventRemove
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preventRemoveContextMod extends Shortcut {
  
  @JSImport("@react-navigation/core/lib/typescript/src/PreventRemoveContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[typings.reactNavigationCore.anon.PreventedRoutes]] = js.native
  
  type PreventedRoutes = Record[String, PreventRemove]
  
  type _To = Context[js.UndefOr[typings.reactNavigationCore.anon.PreventedRoutes]]
  
  /* This means you don't have to write `default`, but can instead just say `preventRemoveContextMod.foo` */
  override def _to: Context[js.UndefOr[typings.reactNavigationCore.anon.PreventedRoutes]] = default
}
