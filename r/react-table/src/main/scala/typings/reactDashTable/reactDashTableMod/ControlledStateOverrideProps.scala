package typings.reactDashTable.reactDashTableMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlledStateOverrideProps extends js.Object {
  /** Sub component */
  var SubComponent: SubComponentFunction
  /** Default: [] */
  var filtered: js.Array[Filter]
  /** Default: undefined */
  var page: js.UndefOr[Double] = js.undefined
  /** Default: undefined */
  var pageSize: js.UndefOr[Double] = js.undefined
  /** Default: undefined */
  var pages: js.UndefOr[Double] = js.undefined
  /** Default: [] */
  var resized: js.Array[Resize]
  /** Default: [] */
  var sorted: js.Array[SortingRule]
  /** Default: undefined */
  var sorting: Double
}

object ControlledStateOverrideProps {
  @scala.inline
  def apply(
    SubComponent: /* rowInfo */ RowInfo => ReactNode,
    filtered: js.Array[Filter],
    resized: js.Array[Resize],
    sorted: js.Array[SortingRule],
    sorting: Double,
    page: Int | Double = null,
    pageSize: Int | Double = null,
    pages: Int | Double = null
  ): ControlledStateOverrideProps = {
    val __obj = js.Dynamic.literal(SubComponent = js.Any.fromFunction1(SubComponent), filtered = filtered, resized = resized, sorted = sorted, sorting = sorting)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pages != null) __obj.updateDynamic("pages")(pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlledStateOverrideProps]
  }
}

