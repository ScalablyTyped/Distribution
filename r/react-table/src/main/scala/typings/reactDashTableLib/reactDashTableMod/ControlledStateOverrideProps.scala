package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlledStateOverrideProps extends js.Object {
  /** Sub component */
  @JSName("SubComponent")
  var SubComponent_Original: SubComponentFunction = js.native
  /** Default: [] */
  var filtered: js.Array[Filter] = js.native
  /** Default: undefined */
  var page: js.UndefOr[scala.Double] = js.native
  /** Default: undefined */
  var pageSize: js.UndefOr[scala.Double] = js.native
  /** Default: undefined */
  var pages: js.UndefOr[scala.Double] = js.native
  /** Default: [] */
  var resized: js.Array[Resize] = js.native
  /** Default: [] */
  var sorted: js.Array[SortingRule] = js.native
  /** Default: undefined */
  var sorting: scala.Double = js.native
  /** Sub component */
  def SubComponent(rowInfo: RowInfo): reactLib.reactMod.ReactNode = js.native
}

