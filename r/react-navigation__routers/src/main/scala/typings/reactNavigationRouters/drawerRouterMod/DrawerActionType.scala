package typings.reactNavigationRouters.drawerRouterMod

import typings.reactNavigationRouters.anon.NameParams
import typings.reactNavigationRouters.reactNavigationRoutersStrings.CLOSE_DRAWER
import typings.reactNavigationRouters.reactNavigationRoutersStrings.JUMP_TO
import typings.reactNavigationRouters.reactNavigationRoutersStrings.OPEN_DRAWER
import typings.reactNavigationRouters.reactNavigationRoutersStrings.TOGGLE_DRAWER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigationRouters.tabRouterMod.TabActionType
  - typings.reactNavigationRouters.anon.SourceTarget
*/
trait DrawerActionType extends js.Object
object DrawerActionType {
  
  @scala.inline
  def TabActionType(payload: NameParams, `type`: JUMP_TO): DrawerActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerActionType]
  }
  
  @scala.inline
  def SourceTarget(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): DrawerActionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerActionType]
  }
}
