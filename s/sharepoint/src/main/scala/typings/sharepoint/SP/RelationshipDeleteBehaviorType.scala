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
  
}

