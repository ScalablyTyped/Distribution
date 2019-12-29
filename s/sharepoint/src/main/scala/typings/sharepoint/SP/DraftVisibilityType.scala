package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DraftVisibilityType with Double] = js.native
  /* 2 */ @js.native
  object approver extends TopLevel[approver with Double]
  
  /* 1 */ @js.native
  object author extends TopLevel[author with Double]
  
  /* 0 */ @js.native
  object reader extends TopLevel[reader with Double]
  
}

