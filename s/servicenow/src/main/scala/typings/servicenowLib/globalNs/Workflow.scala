package typings
package servicenowLib.globalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("global.Workflow")
@js.native
class Workflow () extends js.Object {
  def broadcastEvent(contextId: java.lang.String, eventName: java.lang.String): scala.Unit = js.native
  def cancel(record: servicenowLib.servicenowNs.GlideRecord): scala.Unit = js.native
  def cancelContext(context: servicenowLib.servicenowNs.GlideRecord): scala.Unit = js.native
  def deleteWorkflow(current: servicenowLib.servicenowNs.GlideRecord): scala.Unit = js.native
  def fireEvent(eventRecord: servicenowLib.servicenowNs.GlideRecord, eventName: java.lang.String): scala.Unit = js.native
  def fireEventById(eventRecordId: java.lang.String, eventName: java.lang.String): scala.Unit = js.native
  def getContexts(record: servicenowLib.servicenowNs.GlideRecord): servicenowLib.servicenowNs.GlideRecord = js.native
  def getEstimatedDeliveryTime(workflowId: java.lang.String): java.lang.String = js.native
  def getEstimatedDeliveryTimeFromWFVersion(wfVersion: servicenowLib.servicenowNs.GlideRecord): java.lang.String = js.native
  def getReturnValue(workflowID: java.lang.String, amount: scala.Double, result: scala.Boolean): js.Object = js.native
  def getRunningFlows(record: servicenowLib.servicenowNs.GlideRecord): servicenowLib.servicenowNs.GlideRecord = js.native
  def getVersion(workflowId: java.lang.String): scala.Unit = js.native
  def getVersionFromName(workflowName: java.lang.String): scala.Unit = js.native
  def getWorkflowFromName(workflowName: java.lang.String): scala.Unit = js.native
  def hasWorkflow(record: servicenowLib.servicenowNs.GlideRecord): scala.Boolean = js.native
  def restartWorkflow(record: servicenowLib.servicenowNs.GlideRecord, maintainStateFlag: scala.Boolean): scala.Unit = js.native
  def runFlows(
    record: servicenowLib.servicenowNs.GlideRecord,
    operation: servicenowLib.servicenowNs.GlideRecordOperation
  ): scala.Unit = js.native
  def startFlow(
    workflowId: java.lang.String,
    current: scala.Null,
    operation: servicenowLib.servicenowNs.GlideRecordOperation
  ): java.lang.String = js.native
  def startFlow(
    workflowId: java.lang.String,
    current: scala.Null,
    operation: servicenowLib.servicenowNs.GlideRecordOperation,
    vars: js.Object
  ): java.lang.String = js.native
  def startFlow(
    workflowId: java.lang.String,
    current: servicenowLib.servicenowNs.GlideRecord,
    operation: servicenowLib.servicenowNs.GlideRecordOperation
  ): java.lang.String = js.native
  def startFlow(
    workflowId: java.lang.String,
    current: servicenowLib.servicenowNs.GlideRecord,
    operation: servicenowLib.servicenowNs.GlideRecordOperation,
    vars: js.Object
  ): java.lang.String = js.native
  def startFlowFromContextInsert(
    context: servicenowLib.servicenowNs.GlideRecord,
    operation: servicenowLib.servicenowNs.GlideRecordOperation
  ): scala.Unit = js.native
  def startFlowRetroactive(
    workflowID: java.lang.String,
    retroactiveMSecs: scala.Double,
    current: servicenowLib.servicenowNs.GlideRecord,
    operation: servicenowLib.servicenowNs.GlideRecordOperation
  ): servicenowLib.servicenowNs.GlideRecord = js.native
  def startFlowRetroactive(
    workflowID: java.lang.String,
    retroactiveMSecs: scala.Double,
    current: servicenowLib.servicenowNs.GlideRecord,
    operation: servicenowLib.servicenowNs.GlideRecordOperation,
    vars: js.Object
  ): servicenowLib.servicenowNs.GlideRecord = js.native
  def startFlowRetroactive(
    workflowID: java.lang.String,
    retroactiveMSecs: scala.Double,
    current: servicenowLib.servicenowNs.GlideRecord,
    operation: servicenowLib.servicenowNs.GlideRecordOperation,
    vars: js.Object,
    withSchedule: js.Any
  ): servicenowLib.servicenowNs.GlideRecord = js.native
}

