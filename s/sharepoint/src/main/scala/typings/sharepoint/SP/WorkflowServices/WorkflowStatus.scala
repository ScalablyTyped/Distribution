package typings.sharepoint.SP.WorkflowServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkflowStatus extends js.Object

@JSGlobal("SP.WorkflowServices.WorkflowStatus")
@js.native
object WorkflowStatus extends js.Object {
  @js.native
  sealed trait canceled extends WorkflowStatus
  
  @js.native
  sealed trait canceling extends WorkflowStatus
  
  @js.native
  sealed trait completed extends WorkflowStatus
  
  @js.native
  sealed trait invalid extends WorkflowStatus
  
  @js.native
  sealed trait notSpecified extends WorkflowStatus
  
  @js.native
  sealed trait notStarted extends WorkflowStatus
  
  @js.native
  sealed trait started extends WorkflowStatus
  
  @js.native
  sealed trait suspended extends WorkflowStatus
  
  @js.native
  sealed trait terminated extends WorkflowStatus
  
  /* 4 */ val canceled: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.canceled with Double = js.native
  /* 3 */ val canceling: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.canceling with Double = js.native
  /* 6 */ val completed: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.completed with Double = js.native
  /* 8 */ val invalid: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.invalid with Double = js.native
  /* 7 */ val notSpecified: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.notSpecified with Double = js.native
  /* 0 */ val notStarted: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.notStarted with Double = js.native
  /* 1 */ val started: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.started with Double = js.native
  /* 2 */ val suspended: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.suspended with Double = js.native
  /* 5 */ val terminated: typings.sharepoint.SP.WorkflowServices.WorkflowStatus.terminated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WorkflowStatus with Double] = js.native
}

