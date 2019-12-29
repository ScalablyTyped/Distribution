package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelationshipDeleteBehaviorType with Double] = js.native
  /* 1 */ @js.native
  object cascade extends TopLevel[cascade with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object restrict extends TopLevel[restrict with Double]
  
}

