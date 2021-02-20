package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseFiltersColumnProps[D /* <: js.Object */] extends StObject {
  
  var canFilter: Boolean = js.native
  
  var filterValue: FilterValue = js.native
  
  var filteredRows: js.Array[Row[D]] = js.native
  
  var preFilteredRows: js.Array[Row[D]] = js.native
  
  def setFilter(updater: js.Function1[/* filterValue */ FilterValue, FilterValue]): Unit = js.native
  def setFilter(updater: FilterValue): Unit = js.native
}
