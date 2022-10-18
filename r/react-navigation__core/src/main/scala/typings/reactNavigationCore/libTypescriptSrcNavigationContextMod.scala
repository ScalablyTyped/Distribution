package typings.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.reactNavigationCore.anon.Readonlykeystringindexnum
import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationProp
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcNavigationContextMod extends Shortcut {
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  @JSImport("@react-navigation/core/lib/typescript/src/NavigationContext", JSImport.Default)
  @js.native
  val default: Context[
    js.UndefOr[
      NavigationProp[ParamListBase, String, Unit, Readonlykeystringindexnum, js.Object, js.Object]
    ]
  ] = js.native
  
  type _To = Context[
    js.UndefOr[
      NavigationProp[ParamListBase, String, Unit, Readonlykeystringindexnum, js.Object, js.Object]
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptSrcNavigationContextMod.foo` */
  override def _to: Context[
    js.UndefOr[
      NavigationProp[ParamListBase, String, Unit, Readonlykeystringindexnum, js.Object, js.Object]
    ]
  ] = default
}
