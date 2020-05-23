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
  
}

