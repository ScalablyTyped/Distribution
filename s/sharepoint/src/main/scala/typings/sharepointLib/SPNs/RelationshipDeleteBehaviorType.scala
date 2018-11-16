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
  
  val cascade: cascade with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val restrict: restrict with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.RelationshipDeleteBehaviorType with java.lang.String] = js.native
}

