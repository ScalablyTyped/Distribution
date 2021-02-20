package typings.reactTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsePaginationInstanceProps[D /* <: js.Object */] extends StObject {
  
  var canNextPage: Boolean = js.native
  
  var canPreviousPage: Boolean = js.native
  
  def gotoPage(updater: js.Function1[/* pageIndex */ Double, Double]): Unit = js.native
  def gotoPage(updater: Double): Unit = js.native
  
  def nextPage(): Unit = js.native
  
  var page: js.Array[Row[D]] = js.native
  
  var pageCount: Double = js.native
  
  var pageOptions: js.Array[Double] = js.native
  
  def previousPage(): Unit = js.native
  
  def setPageSize(pageSize: Double): Unit = js.native
}
