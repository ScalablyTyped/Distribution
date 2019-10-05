package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelationshipDeleteBehaviorType extends js.Object

@JSGlobal("SP.RelationshipDeleteBehaviorType")
@js.native
object RelationshipDeleteBehaviorType extends js.Object {
  @js.native
  sealed trait cascade extends RelationshipDeleteBehaviorType
  
  @js.native
  sealed trait none extends RelationshipDeleteBehaviorType
  
  @js.native
  sealed trait restrict extends RelationshipDeleteBehaviorType
  
  /* 1 */ val cascade: typings.sharepoint.SP.RelationshipDeleteBehaviorType.cascade with Double = js.native
  /* 0 */ val none: typings.sharepoint.SP.RelationshipDeleteBehaviorType.none with Double = js.native
  /* 2 */ val restrict: typings.sharepoint.SP.RelationshipDeleteBehaviorType.restrict with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelationshipDeleteBehaviorType with Double] = js.native
}

