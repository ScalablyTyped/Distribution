package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideRecord
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, GlideRecord] {
  val sys_created_by: java.lang.String with GlideElement = js.native
  val sys_created_on: servicenowLib.GlideDateTime with GlideElement = js.native
  val sys_id: java.lang.String = js.native
  val sys_mod_count: scala.Double with GlideElement = js.native
  val sys_updated_by: java.lang.String with GlideElement = js.native
  val sys_updated_on: servicenowLib.GlideDateTime with GlideElement = js.native
  def _next(): scala.Boolean = js.native
  def _query(): scala.Unit = js.native
  def _query(field: java.lang.String): scala.Unit = js.native
  def _query(field: java.lang.String, value: js.Object): scala.Unit = js.native
  def addActiveQuery(): GlideQueryCondition = js.native
  def addEncodedQuery(query: java.lang.String): scala.Unit = js.native
  def addJoinQuery(joinTable: java.lang.String): GlideQueryCondition = js.native
  def addJoinQuery(joinTable: java.lang.String, primaryField: java.lang.String): GlideQueryCondition = js.native
  def addJoinQuery(joinTable: java.lang.String, primaryField: java.lang.String, joinTableField: java.lang.String): GlideQueryCondition = js.native
  def addNotNullQuery(fieldName: java.lang.String): GlideQueryCondition = js.native
  def addNullQuery(fieldName: java.lang.String): GlideQueryCondition = js.native
  def addQuery(fieldName: java.lang.String): GlideQueryCondition = js.native
  def addQuery(fieldName: java.lang.String, operator: QueryOperator, value: java.lang.String): GlideQueryCondition = js.native
  def addQuery(fieldName: java.lang.String, operator: QueryOperator, value: js.Object): GlideQueryCondition = js.native
  def addQuery(fieldName: java.lang.String, operator: QueryOperator, value: scala.Double): GlideQueryCondition = js.native
  def addQuery(fieldName: java.lang.String, value: java.lang.String): GlideQueryCondition = js.native
  def addQuery(fieldName: java.lang.String, value: js.Object): GlideQueryCondition = js.native
  def addQuery(fieldName: java.lang.String, value: scala.Double): GlideQueryCondition = js.native
  def canCreate(): scala.Boolean = js.native
  def canDelete(): scala.Boolean = js.native
  def canRead(): scala.Boolean = js.native
  def canWrite(): scala.Boolean = js.native
  def chooseWindow(firstRow: scala.Double, lastRow: scala.Double): scala.Unit = js.native
  def chooseWindow(firstRow: scala.Double, lastRow: scala.Double, forceCount: scala.Boolean): scala.Unit = js.native
  def deleteMultiple(): scala.Unit = js.native
  def deleteRecord(): scala.Boolean = js.native
  def get(name: java.lang.String): scala.Boolean = js.native
  def get(name: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def getAttribute(fieldName: java.lang.String): java.lang.String = js.native
  def getClassDisplayValue(): java.lang.String = js.native
  def getDisplayValue(): java.lang.String = js.native
  def getDisplayValue(field: java.lang.String): java.lang.String = js.native
  def getED(): GlideElementDescriptor = js.native
  def getElement(columnName: java.lang.String): GlideElement = js.native
  def getEncodedQuery(): java.lang.String = js.native
  def getLabel(): java.lang.String = js.native
  def getLastErrorMessage(): java.lang.String = js.native
  def getLink(noStack: scala.Boolean): java.lang.String = js.native
  def getRecordClassName(): java.lang.String = js.native
  def getRowCount(): scala.Double = js.native
  def getTableName(): java.lang.String = js.native
  def getUniqueValue(): java.lang.String = js.native
  def getValue(name: java.lang.String): java.lang.String = js.native
  def hasNext(): scala.Boolean = js.native
  def initialize(): scala.Unit = js.native
  def insert(): java.lang.String = js.native
  def isActionAborted(): scala.Boolean = js.native
  def isNewRecord(): scala.Boolean = js.native
  def isValid(): scala.Boolean = js.native
  def isValidField(columnName: java.lang.String): scala.Boolean = js.native
  def isValidRecord(): scala.Boolean = js.native
  def newRecord(): scala.Unit = js.native
  def next(): scala.Boolean = js.native
  def operation(): GlideRecordOperation = js.native
  def orderBy(name: java.lang.String): scala.Unit = js.native
  def orderByDesc(name: java.lang.String): scala.Unit = js.native
  def query(): scala.Unit = js.native
  def query(field: java.lang.String): scala.Unit = js.native
  def query(field: java.lang.String, value: js.Object): scala.Unit = js.native
  def setAbortAction(b: scala.Boolean): scala.Unit = js.native
  def setLimit(limit: scala.Double): scala.Unit = js.native
  def setNewGuidValue(guid: java.lang.String): scala.Unit = js.native
  def setValue(name: java.lang.String, value: js.Object): scala.Unit = js.native
  def setWorkflow(enable: scala.Boolean): scala.Unit = js.native
  def update(): java.lang.String = js.native
  def update(reason: java.lang.String): java.lang.String = js.native
  def updateMultiple(): scala.Unit = js.native
}

