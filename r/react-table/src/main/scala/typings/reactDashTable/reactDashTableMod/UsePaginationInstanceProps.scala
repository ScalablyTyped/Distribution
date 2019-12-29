package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsePaginationInstanceProps[D /* <: js.Object */] extends js.Object {
  var canNextPage: Boolean = js.native
  var canPreviousPage: Boolean = js.native
  var page: js.Array[Row[D]] = js.native
  var pageCount: Double = js.native
  var pageOptions: js.Array[Double] = js.native
  def gotoPage(updater: js.Function1[/* pageIndex */ Double, Double]): Unit = js.native
  def gotoPage(updater: Double): Unit = js.native
  def nextPage(): Unit = js.native
  def previousPage(): Unit = js.native
  def setPageSize(pageSize: Double): Unit = js.native
}

