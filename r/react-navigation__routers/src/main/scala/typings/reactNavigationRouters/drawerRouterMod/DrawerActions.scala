package typings.reactNavigationRouters.drawerRouterMod

import typings.reactNavigationRouters.tabRouterMod.TabActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/routers/lib/typescript/src/DrawerRouter", "DrawerActions")
@js.native
object DrawerActions extends js.Object {
  
  def closeDrawer(): DrawerActionType = js.native
  
  def jumpTo(name: String): TabActionType = js.native
  def jumpTo(name: String, params: js.Object): TabActionType = js.native
  
  def openDrawer(): DrawerActionType = js.native
  
  def toggleDrawer(): DrawerActionType = js.native
}
