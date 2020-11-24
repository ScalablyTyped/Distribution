package typings.reactNavigationRouters.tabRouterMod

import typings.reactNavigationRouters.anon.Payload
import typings.reactNavigationRouters.anon.PayloadSourceTargetType
import typings.reactNavigationRouters.anon.Source
import typings.reactNavigationRouters.anon.Type
import typings.reactNavigationRouters.typesMod.Router
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/routers/lib/typescript/src/TabRouter", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | PayloadSourceTargetType | Type | TabActionType
  ] = js.native
}
