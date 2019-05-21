package typings
package reactDashTableLib.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlledStateOverrideProps extends js.Object {
  /** Sub component */
  var SubComponent: SubComponentFunction
  /** Default: [] */
  var filtered: js.Array[Filter]
  /** Default: undefined */
  var page: js.UndefOr[scala.Double] = js.undefined
  /** Default: undefined */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /** Default: undefined */
  var pages: js.UndefOr[scala.Double] = js.undefined
  /** Default: [] */
  var resized: js.Array[Resize]
  /** Default: [] */
  var sorted: js.Array[SortingRule]
  /** Default: undefined */
  var sorting: scala.Double
}

object ControlledStateOverrideProps {
  @scala.inline
  def apply(
    SubComponent: SubComponentFunction,
    filtered: js.Array[Filter],
    resized: js.Array[Resize],
    sorted: js.Array[SortingRule],
    sorting: scala.Double,
    page: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null,
    pages: scala.Int | scala.Double = null
  ): ControlledStateOverrideProps = {
    val __obj = js.Dynamic.literal(SubComponent = SubComponent, filtered = filtered, resized = resized, sorted = sorted, sorting = sorting)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlledStateOverrideProps]
  }
}

