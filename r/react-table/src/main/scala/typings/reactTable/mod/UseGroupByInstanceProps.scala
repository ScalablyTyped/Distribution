package typings.reactTable.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseGroupByInstanceProps[D /* <: js.Object */] extends StObject {
  
  var flatRows: js.Array[Row[D]] = js.native
  
  var groupedFlatRows: js.Array[Row[D]] = js.native
  
  var groupedRows: js.Array[Row[D]] = js.native
  
  var groupedRowsById: Record[String, Row[D]] = js.native
  
  var nonGroupedFlatRows: js.Array[Row[D]] = js.native
  
  var nonGroupedRowsById: Record[String, Row[D]] = js.native
  
  var onlyGroupedFlatRows: js.Array[Row[D]] = js.native
  
  var onlyGroupedRowsById: Record[String, Row[D]] = js.native
  
  var preGroupedFlatRows: js.Array[Row[D]] = js.native
  
  var preGroupedRows: js.Array[Row[D]] = js.native
  
  var preGroupedRowsById: Record[String, Row[D]] = js.native
  
  var rows: js.Array[Row[D]] = js.native
  
  var rowsById: Record[String, Row[D]] = js.native
  
  def toggleGroupBy(columnId: IdType[D]): Unit = js.native
  def toggleGroupBy(columnId: IdType[D], value: Boolean): Unit = js.native
}
