package typings.servicenow.globalNs

import typings.servicenow.servicenowNs.GlideRecordOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("global.Workflow")
@js.native
class Workflow () extends js.Object {
  def broadcastEvent(contextId: String, eventName: String): Unit = js.native
  def cancel(record: typings.servicenow.servicenowNs.GlideRecord): Unit = js.native
  def cancelContext(context: typings.servicenow.servicenowNs.GlideRecord): Unit = js.native
  def deleteWorkflow(current: typings.servicenow.servicenowNs.GlideRecord): Unit = js.native
  def fireEvent(eventRecord: typings.servicenow.servicenowNs.GlideRecord, eventName: String): Unit = js.native
  def fireEventById(eventRecordId: String, eventName: String): Unit = js.native
  def getContexts(record: typings.servicenow.servicenowNs.GlideRecord): typings.servicenow.servicenowNs.GlideRecord = js.native
  def getEstimatedDeliveryTime(workflowId: String): String = js.native
  def getEstimatedDeliveryTimeFromWFVersion(wfVersion: typings.servicenow.servicenowNs.GlideRecord): String = js.native
  def getReturnValue(workflowID: String, amount: Double, result: Boolean): js.Object = js.native
  def getRunningFlows(record: typings.servicenow.servicenowNs.GlideRecord): typings.servicenow.servicenowNs.GlideRecord = js.native
  def getVersion(workflowId: String): Unit = js.native
  def getVersionFromName(workflowName: String): Unit = js.native
  def getWorkflowFromName(workflowName: String): Unit = js.native
  def hasWorkflow(record: typings.servicenow.servicenowNs.GlideRecord): Boolean = js.native
  def restartWorkflow(record: typings.servicenow.servicenowNs.GlideRecord, maintainStateFlag: Boolean): Unit = js.native
  def runFlows(record: typings.servicenow.servicenowNs.GlideRecord, operation: GlideRecordOperation): Unit = js.native
  def startFlow(workflowId: String, current: Null, operation: GlideRecordOperation): String = js.native
  def startFlow(workflowId: String, current: Null, operation: GlideRecordOperation, vars: js.Object): String = js.native
  def startFlow(
    workflowId: String,
    current: typings.servicenow.servicenowNs.GlideRecord,
    operation: GlideRecordOperation
  ): String = js.native
  def startFlow(
    workflowId: String,
    current: typings.servicenow.servicenowNs.GlideRecord,
    operation: GlideRecordOperation,
    vars: js.Object
  ): String = js.native
  def startFlowFromContextInsert(context: typings.servicenow.servicenowNs.GlideRecord, operation: GlideRecordOperation): Unit = js.native
  def startFlowRetroactive(
    workflowID: String,
    retroactiveMSecs: Double,
    current: typings.servicenow.servicenowNs.GlideRecord,
    operation: GlideRecordOperation
  ): typings.servicenow.servicenowNs.GlideRecord = js.native
  def startFlowRetroactive(
    workflowID: String,
    retroactiveMSecs: Double,
    current: typings.servicenow.servicenowNs.GlideRecord,
    operation: GlideRecordOperation,
    vars: js.Object
  ): typings.servicenow.servicenowNs.GlideRecord = js.native
  def startFlowRetroactive(
    workflowID: String,
    retroactiveMSecs: Double,
    current: typings.servicenow.servicenowNs.GlideRecord,
    operation: GlideRecordOperation,
    vars: js.Object,
    withSchedule: js.Any
  ): typings.servicenow.servicenowNs.GlideRecord = js.native
}

