package typings.reactNavigationCore

import typings.react.mod.Context
import typings.reactNavigationCore.typesMod.NavigationHelpers
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/NavigationHelpersContext", JSImport.Namespace)
@js.native
object navigationHelpersContextMod extends js.Object {
  
  /**
    * Context which holds the navigation helpers of the parent navigator.
    * Navigators should use this context in their view component.
    */
  val default: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = js.native
}
