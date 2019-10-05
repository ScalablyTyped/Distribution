package typings.servicenow

import typings.servicenow.servicenow.GlideRecordOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("global")
@js.native
object global extends js.Object {
  @js.native
  class Workflow () extends js.Object {
    def broadcastEvent(contextId: String, eventName: String): Unit = js.native
    def cancel(record: typings.servicenow.servicenow.GlideRecord): Unit = js.native
    def cancelContext(context: typings.servicenow.servicenow.GlideRecord): Unit = js.native
    def deleteWorkflow(current: typings.servicenow.servicenow.GlideRecord): Unit = js.native
    def fireEvent(eventRecord: typings.servicenow.servicenow.GlideRecord, eventName: String): Unit = js.native
    def fireEventById(eventRecordId: String, eventName: String): Unit = js.native
    def getContexts(record: typings.servicenow.servicenow.GlideRecord): typings.servicenow.servicenow.GlideRecord = js.native
    def getEstimatedDeliveryTime(workflowId: String): String = js.native
    def getEstimatedDeliveryTimeFromWFVersion(wfVersion: typings.servicenow.servicenow.GlideRecord): String = js.native
    def getReturnValue(workflowID: String, amount: Double, result: Boolean): js.Object = js.native
    def getRunningFlows(record: typings.servicenow.servicenow.GlideRecord): typings.servicenow.servicenow.GlideRecord = js.native
    def getVersion(workflowId: String): Unit = js.native
    def getVersionFromName(workflowName: String): Unit = js.native
    def getWorkflowFromName(workflowName: String): Unit = js.native
    def hasWorkflow(record: typings.servicenow.servicenow.GlideRecord): Boolean = js.native
    def restartWorkflow(record: typings.servicenow.servicenow.GlideRecord, maintainStateFlag: Boolean): Unit = js.native
    def runFlows(record: typings.servicenow.servicenow.GlideRecord, operation: GlideRecordOperation): Unit = js.native
    def startFlow(workflowId: String, current: Null, operation: GlideRecordOperation): String = js.native
    def startFlow(workflowId: String, current: Null, operation: GlideRecordOperation, vars: js.Object): String = js.native
    def startFlow(
      workflowId: String,
      current: typings.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation
    ): String = js.native
    def startFlow(
      workflowId: String,
      current: typings.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation,
      vars: js.Object
    ): String = js.native
    def startFlowFromContextInsert(context: typings.servicenow.servicenow.GlideRecord, operation: GlideRecordOperation): Unit = js.native
    def startFlowRetroactive(
      workflowID: String,
      retroactiveMSecs: Double,
      current: typings.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation
    ): typings.servicenow.servicenow.GlideRecord = js.native
    def startFlowRetroactive(
      workflowID: String,
      retroactiveMSecs: Double,
      current: typings.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation,
      vars: js.Object
    ): typings.servicenow.servicenow.GlideRecord = js.native
    def startFlowRetroactive(
      workflowID: String,
      retroactiveMSecs: Double,
      current: typings.servicenow.servicenow.GlideRecord,
      operation: GlideRecordOperation,
      vars: js.Object,
      withSchedule: js.Any
    ): typings.servicenow.servicenow.GlideRecord = js.native
  }
  
  @js.native
  object Class extends js.Object {
    def create(): js.Any = js.native
  }
  
  @js.native
  object GlideStringUtil extends js.Object {
    def base64Decode(value: String): String = js.native
    def base64DecodeAsBytes(value: String): js.Any = js.native
    def escapeHTML(value: String): String = js.native
    def getStringFromStream(stream: js.Object): String = js.native
  }
  
}

