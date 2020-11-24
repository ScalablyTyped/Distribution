package typings.reactNavigationCore

import typings.react.mod.Context
import typings.reactNavigationCore.typesMod.NavigationProp
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/NavigationContext", JSImport.Namespace)
@js.native
object navigationContextMod extends js.Object {
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  val default: Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, js.Any, js.Any, js.Object]
    ]
  ] = js.native
}
