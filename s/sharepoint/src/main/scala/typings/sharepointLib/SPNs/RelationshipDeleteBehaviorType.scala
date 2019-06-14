package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelationshipDeleteBehaviorType extends js.Object

@JSGlobal("SP.RelationshipDeleteBehaviorType")
@js.native
object RelationshipDeleteBehaviorType extends js.Object {
  @js.native
  sealed trait cascade
    extends sharepointLib.SPNs.RelationshipDeleteBehaviorType
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.RelationshipDeleteBehaviorType
  
  @js.native
  sealed trait restrict
    extends sharepointLib.SPNs.RelationshipDeleteBehaviorType
  
  /* 1 */ val cascade: cascade with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val restrict: restrict with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.RelationshipDeleteBehaviorType with scala.Double] = js.native
}

