package typings.reactNavigationRouters.stackRouterMod

import typings.reactNavigationRouters.anon.Count
import typings.reactNavigationRouters.anon.Name
import typings.reactNavigationRouters.reactNavigationRoutersStrings.POP
import typings.reactNavigationRouters.reactNavigationRoutersStrings.POP_TO_TOP
import typings.reactNavigationRouters.reactNavigationRoutersStrings.PUSH
import typings.reactNavigationRouters.reactNavigationRoutersStrings.REPLACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNavigationRouters.anon.PayloadSource
  - typings.reactNavigationRouters.anon.TargetType
  - typings.reactNavigationRouters.anon.PayloadSourceTarget
  - typings.reactNavigationRouters.anon.SourceTargetType
*/
trait StackActionType extends js.Object
object StackActionType {
  
  @scala.inline
  def PayloadSource(payload: Name, `type`: REPLACE): StackActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
  
  @scala.inline
  def TargetType(payload: Name, `type`: PUSH): StackActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
  
  @scala.inline
  def PayloadSourceTarget(payload: Count, `type`: POP): StackActionType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
  
  @scala.inline
  def SourceTargetType(`type`: POP_TO_TOP): StackActionType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackActionType]
  }
}
