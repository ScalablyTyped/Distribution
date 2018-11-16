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
  
  val canceled: canceled with java.lang.String = js.native
  val canceling: canceling with java.lang.String = js.native
  val completed: completed with java.lang.String = js.native
  val invalid: invalid with java.lang.String = js.native
  val notSpecified: notSpecified with java.lang.String = js.native
  val notStarted: notStarted with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  val suspended: suspended with java.lang.String = js.native
  val terminated: terminated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.WorkflowServicesNs.WorkflowStatus with java.lang.String] = js.native
}

