package typings.rcDashTable

import typings.rcDashTable.rcDashTableStrings.RC_TABLE_INTERNAL_COL_DEFINE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  val INTERNAL_COL_DEFINE: RC_TABLE_INTERNAL_COL_DEFINE = js.native
  def debounce(func: js.Function, wait: Double): Anon_Args = js.native
  def debounce(func: js.Function, wait: Double, immediate: Boolean): Anon_Args = js.native
  def getDataAndAriaProps(props: js.Object): js.Object = js.native
  def measureScrollbar(hasDirectionPrefixCls: Anon_Direction): Double = js.native
  def remove[T](array: js.Array[T], item: T): js.Array[T] = js.native
}

