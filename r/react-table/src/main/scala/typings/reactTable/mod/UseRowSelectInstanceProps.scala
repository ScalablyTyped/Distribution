package typings.reactTable.mod

import typings.reactTable.anon.PartialTableToggleAllRows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseRowSelectInstanceProps[D /* <: js.Object */] extends js.Object {
  
  def getToggleAllPageRowsSelectedProps(): TableToggleAllRowsSelectedProps = js.native
  def getToggleAllPageRowsSelectedProps(props: PartialTableToggleAllRows): TableToggleAllRowsSelectedProps = js.native
  
  def getToggleAllRowsSelectedProps(): TableToggleAllRowsSelectedProps = js.native
  def getToggleAllRowsSelectedProps(props: PartialTableToggleAllRows): TableToggleAllRowsSelectedProps = js.native
  
  var isAllRowsSelected: Boolean = js.native
  
  var selectedFlatRows: js.Array[Row[D]] = js.native
  
  def toggleAllRowsSelected(): Unit = js.native
  def toggleAllRowsSelected(value: Boolean): Unit = js.native
  
  def toggleRowSelected(rowId: IdType[D]): Unit = js.native
  def toggleRowSelected(rowId: IdType[D], set: Boolean): Unit = js.native
}
