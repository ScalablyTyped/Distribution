package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DraftVisibilityType extends js.Object

@JSGlobal("SP.DraftVisibilityType")
@js.native
object DraftVisibilityType extends js.Object {
  @js.native
  sealed trait approver extends DraftVisibilityType
  
  @js.native
  sealed trait author extends DraftVisibilityType
  
  @js.native
  sealed trait reader extends DraftVisibilityType
  
  /* 2 */ val approver: typings.sharepoint.SP.DraftVisibilityType.approver with Double = js.native
  /* 1 */ val author: typings.sharepoint.SP.DraftVisibilityType.author with Double = js.native
  /* 0 */ val reader: typings.sharepoint.SP.DraftVisibilityType.reader with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraftVisibilityType with Double] = js.native
}

