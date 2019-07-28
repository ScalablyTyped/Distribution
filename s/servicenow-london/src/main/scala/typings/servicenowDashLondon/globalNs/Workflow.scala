package typings.servicenowDashLondon.globalNs

import typings.servicenowDashLondon.GlideRecordOperation
import typings.servicenowDashLondon.ScopedGlideElement
import typings.servicenowDashLondon.ScopedGlideRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("global.Workflow")
@js.native
class Workflow () extends js.Object {
  def broadcastEvent(contextId: String, eventName: String): Unit = js.native
  def cancel(record: ScopedGlideRecord): Unit = js.native
  def cancelContext(context: ScopedGlideRecord): Unit = js.native
  def deleteWorkflow(current: ScopedGlideRecord): Unit = js.native
  def fireEvent(eventRecord: ScopedGlideRecord, eventName: String): Unit = js.native
  def fireEventById(eventRecordId: String, eventName: String): Unit = js.native
  def getContexts(record: ScopedGlideRecord): ScopedGlideRecord = js.native
  def getEstimatedDeliveryTime(workflowId: String): String = js.native
  def getEstimatedDeliveryTimeFromWFVersion(wfVersion: ScopedGlideRecord): String = js.native
  /**
    * Get the return value set by activity "Return Value"
    *
    * @param context wf_context GlideRecord of the context from which you want the return value
    * @return The value set by activity "Return Value" in the workflow
    */
  def getReturnValue(context: ScopedGlideRecord): js.Any = js.native
  def getRunningFlows(record: ScopedGlideRecord): ScopedGlideRecord = js.native
  def getVersion(workflowId: String): ScopedGlideRecord = js.native
  def getVersionFromName(workflowName: String): ScopedGlideElement = js.native
  def getWorkflowFromName(workflowName: String): String = js.native
  def hasWorkflow(record: ScopedGlideRecord): Boolean = js.native
  def restartWorkflow(record: ScopedGlideRecord): Unit = js.native
  def restartWorkflow(record: ScopedGlideRecord, maintainStateFlag: Boolean): Unit = js.native
  /**
    * Run all flows attached to a current GlideRecord.
    *
    * Calling this method on a current will not implicitly update the current. If the workflow
    * modifies the input current to this method, it is up to the caller to call
    * current.update() to persist these changes.
    *
    * @param record A GlideRecord that holds the current record
    * @param operation A String that holds the operation such as "update", "insert", or perhaps
    * "timer" or some other user defined value.
    */
  def runFlows(record: ScopedGlideRecord, operation: GlideRecordOperation): Unit = js.native
  def startFlow(workflowId: String, current: Null, operation: GlideRecordOperation): String = js.native
  def startFlow(workflowId: String, current: Null, operation: GlideRecordOperation, vars: js.Object): String = js.native
  /**
    * Start a workflow. Internal logic will determine which workflow version should be run. The
    * workflow version to run is either the one checked out to the current user, or the
    * published workflow version. Calling this method on a current will not implicitly update
    * the current. If the workflow modifies the input current to this method, it is up to the
    * caller to call current.update() to persist these changes.
    *
    * @param workflowId The sys_id of the workflow from the wf_workflow table
    * @param current The GlideRecord of the current record to be operated on by the workflow
    * @param operation The String operation for this workflow - not used
    * @param vars JavaScript object of workflow inputs. The key is the variable name, the value
    * is the variable value.
    * @returns The GlideRecord of the wf_context of the running workflow. Do not modify this
    * returned GlideRecord.
    */
  def startFlow(workflowId: String, current: ScopedGlideRecord, operation: GlideRecordOperation): String = js.native
  def startFlow(workflowId: String, current: ScopedGlideRecord, operation: GlideRecordOperation, vars: js.Object): String = js.native
  /**
    * An intermediate method used to start a workflow from the green "run" button on the
    * Graphical Workflow Editor. This should not be used by SNC script writers.
    *
    * @param context GlideRecord on wf_context of the context to start the Workflow engine on
    * @param operation The String event for processing
    */
  def startFlowFromContextInsert(context: ScopedGlideRecord, operation: GlideRecordOperation): Unit = js.native
  /**
    * An intermediate method used to start a workflow with preloaded values for SLA Timer
    * activity.  This should not be used by SNC script writers
    *
    * @param workflowId The sys_id of a record in table wf_workflow for the workflow to run
    * @param retroactiveMSecs Integer value of seconds to start the workflow on. This is used
    * by SLA Timer activity
    * @param current The GlideRecord of the current record
    * @param operation The String event for processing - not used.
    * @param vars JavaScript object or Java HashMap of workflow inputs. The key is the variable
    * name, the value is the variable value
    * @param withSchedule Boolean value to indicate if a schedule should be used
    */
  def startFlowRetroactive(
    workflowID: String,
    retroactiveMSecs: Double,
    current: ScopedGlideRecord,
    operation: GlideRecordOperation
  ): ScopedGlideRecord = js.native
  def startFlowRetroactive(
    workflowID: String,
    retroactiveMSecs: Double,
    current: ScopedGlideRecord,
    operation: GlideRecordOperation,
    vars: js.Object
  ): ScopedGlideRecord = js.native
  def startFlowRetroactive(
    workflowID: String,
    retroactiveMSecs: Double,
    current: ScopedGlideRecord,
    operation: GlideRecordOperation,
    vars: js.Object,
    withSchedule: js.Any
  ): ScopedGlideRecord = js.native
}

