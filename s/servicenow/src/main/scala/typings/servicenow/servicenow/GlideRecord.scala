package typings.servicenow.servicenow

import org.scalablytyped.runtime.Instantiable1
import typings.servicenow.GlideDateTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideRecord extends Instantiable1[/* type */ String, GlideRecord] {
  val sys_created_by: String with GlideElement = js.native
  val sys_created_on: GlideDateTime with GlideElement = js.native
  val sys_id: String = js.native
  val sys_mod_count: Double with GlideElement = js.native
  val sys_updated_by: String with GlideElement = js.native
  val sys_updated_on: GlideDateTime with GlideElement = js.native
  def _next(): Boolean = js.native
  def _query(): Unit = js.native
  def _query(field: String): Unit = js.native
  def _query(field: String, value: js.Object): Unit = js.native
  def addActiveQuery(): GlideQueryCondition = js.native
  def addEncodedQuery(query: String): Unit = js.native
  def addJoinQuery(joinTable: String): GlideQueryCondition = js.native
  def addJoinQuery(joinTable: String, primaryField: String): GlideQueryCondition = js.native
  def addJoinQuery(joinTable: String, primaryField: String, joinTableField: String): GlideQueryCondition = js.native
  def addNotNullQuery(fieldName: String): GlideQueryCondition = js.native
  def addNullQuery(fieldName: String): GlideQueryCondition = js.native
  def addQuery(fieldName: String): GlideQueryCondition = js.native
  def addQuery(fieldName: String, operator: QueryOperator, value: String): GlideQueryCondition = js.native
  def addQuery(fieldName: String, operator: QueryOperator, value: js.Object): GlideQueryCondition = js.native
  def addQuery(fieldName: String, operator: QueryOperator, value: Double): GlideQueryCondition = js.native
  def addQuery(fieldName: String, value: String): GlideQueryCondition = js.native
  def addQuery(fieldName: String, value: js.Object): GlideQueryCondition = js.native
  def addQuery(fieldName: String, value: Double): GlideQueryCondition = js.native
  def canCreate(): Boolean = js.native
  def canDelete(): Boolean = js.native
  def canRead(): Boolean = js.native
  def canWrite(): Boolean = js.native
  def chooseWindow(firstRow: Double, lastRow: Double): Unit = js.native
  def chooseWindow(firstRow: Double, lastRow: Double, forceCount: Boolean): Unit = js.native
  def deleteMultiple(): Unit = js.native
  def deleteRecord(): Boolean = js.native
  def get(name: String): Boolean = js.native
  def get(name: String, value: String): Boolean = js.native
  def getAttribute(fieldName: String): String = js.native
  def getClassDisplayValue(): String = js.native
  def getDisplayValue(): String = js.native
  def getDisplayValue(field: String): String = js.native
  def getED(): GlideElementDescriptor = js.native
  def getElement(columnName: String): GlideElement = js.native
  def getEncodedQuery(): String = js.native
  def getLabel(): String = js.native
  def getLastErrorMessage(): String = js.native
  def getLink(noStack: Boolean): String = js.native
  def getRecordClassName(): String = js.native
  def getRowCount(): Double = js.native
  def getTableName(): String = js.native
  def getUniqueValue(): String = js.native
  def getValue(name: String): String = js.native
  def hasNext(): Boolean = js.native
  def initialize(): Unit = js.native
  def insert(): String = js.native
  def isActionAborted(): Boolean = js.native
  def isNewRecord(): Boolean = js.native
  def isValid(): Boolean = js.native
  def isValidField(columnName: String): Boolean = js.native
  def isValidRecord(): Boolean = js.native
  def newRecord(): Unit = js.native
  def next(): Boolean = js.native
  def operation(): GlideRecordOperation = js.native
  def orderBy(name: String): Unit = js.native
  def orderByDesc(name: String): Unit = js.native
  def query(): Unit = js.native
  def query(field: String): Unit = js.native
  def query(field: String, value: js.Object): Unit = js.native
  def setAbortAction(b: Boolean): Unit = js.native
  def setLimit(limit: Double): Unit = js.native
  def setNewGuidValue(guid: String): Unit = js.native
  def setValue(name: String, value: js.Object): Unit = js.native
  def setWorkflow(enable: Boolean): Unit = js.native
  def update(): String = js.native
  def update(reason: String): String = js.native
  def updateMultiple(): Unit = js.native
}

