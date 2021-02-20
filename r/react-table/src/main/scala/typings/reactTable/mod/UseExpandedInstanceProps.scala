package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseExpandedInstanceProps[D /* <: js.Object */] extends StObject {
  
  var expandedDepth: Double = js.native
  
  var expandedRows: js.Array[Row[D]] = js.native
  
  var isAllRowsExpanded: Boolean = js.native
  
  var preExpandedRows: js.Array[Row[D]] = js.native
  
  var rows: js.Array[Row[D]] = js.native
  
  def toggleAllRowsExpanded(): Unit = js.native
  def toggleAllRowsExpanded(value: Boolean): Unit = js.native
  
  def toggleRowExpanded(id: js.Array[IdType[D]]): Unit = js.native
  def toggleRowExpanded(id: js.Array[IdType[D]], value: Boolean): Unit = js.native
}
