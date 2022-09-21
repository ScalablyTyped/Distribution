package typings.reactTable.mod

import typings.reactTable.anon.PartialTableSortByToggleP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseSortByColumnProps[D /* <: js.Object */] extends StObject {
  
  var canSort: Boolean = js.native
  
  def clearSortBy(): Unit = js.native
  
  def getSortByToggleProps(): TableSortByToggleProps = js.native
  def getSortByToggleProps(props: PartialTableSortByToggleP): TableSortByToggleProps = js.native
  
  var isSorted: Boolean = js.native
  
  var isSortedDesc: js.UndefOr[Boolean] = js.native
  
  var sortedIndex: Double = js.native
  
  def toggleSortBy(): Unit = js.native
  def toggleSortBy(descending: Boolean): Unit = js.native
  def toggleSortBy(descending: Boolean, multi: Boolean): Unit = js.native
  def toggleSortBy(descending: Unit, multi: Boolean): Unit = js.native
}
