package typings
package sharepointLib.SPNs.WorkflowServicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WorkflowStatus extends js.Object

@JSGlobal("SP.WorkflowServices.WorkflowStatus")
@js.native
object WorkflowStatus extends js.Object {
  @js.native
  sealed trait canceled
    extends sharepointLib.SPNs.WorkflowServicesNs.WorkflowStatus
  
  @js.native
  sealed trait canceling
    extends sharepointLib.SPNs.WorkflowServicesNs.WorkflowStatus
  
  @js.native
  sealed trait completed
    extends sharepointLib.SPNs.WorkflowServicesNs.WorkflowStatus
  
  @js.native
  sealed trait invalid
    extends sharepointLib.SPNs.WorkflowServicesNs.WorkflowStatus
  
  @js.native
  sealed trait notSpecified
    extends sharepointLib.SPNs.WorkflowServicesNs.WorkflowStatus
  
  @js.native
  sealed trait notStarted
    extends sharepointLib.SPNs.WorkflowServicesNs.WorkflowStatus
  
  @js.native
  sealed trait started
    extends sharepointLib.SPNs.WorkflowServicesNs.WorkflowStatus
  
  @js.native
  sealed trait suspended
    extends sharepointLib.SPNs.WorkflowServicesNs.WorkflowStatus
  
  @js.native
  sealed trait terminated
    extends sharepointLib.SPNs.WorkflowServicesNs.WorkflowStatus
  
  /* 4 */ val canceled: canceled with scala.Double = js.native
  /* 3 */ val canceling: canceling with scala.Double = js.native
  /* 6 */ val completed: completed with scala.Double = js.native
  /* 8 */ val invalid: invalid with scala.Double = js.native
  /* 7 */ val notSpecified: notSpecified with scala.Double = js.native
  /* 0 */ val notStarted: notStarted with scala.Double = js.native
  /* 1 */ val started: started with scala.Double = js.native
  /* 2 */ val suspended: suspended with scala.Double = js.native
  /* 5 */ val terminated: terminated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.WorkflowServicesNs.WorkflowStatus with scala.Double] = js.native
}

