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
  
}

