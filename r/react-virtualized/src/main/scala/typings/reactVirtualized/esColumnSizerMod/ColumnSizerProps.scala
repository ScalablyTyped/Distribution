package typings.reactVirtualized.esColumnSizerMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSizerProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  /** Number of columns in Grid or Table child */
  var columnCount: js.UndefOr[Double] = js.undefined
  /** Optional maximum allowed column width */
  var columnMaxWidth: js.UndefOr[Double] = js.undefined
  /** Optional minimum allowed column width */
  var columnMinWidth: js.UndefOr[Double] = js.undefined
  /** Width of Grid or Table child */
  var width: Double
  /**
    * Function responsible for rendering a virtualized Grid.
    * This function should implement the following signature:
    * ({ adjustedWidth, getColumnWidth, registerChild }) => PropTypes.element
    *
    * The specified :getColumnWidth function should be passed to the Grid's :columnWidth property.
    * The :registerChild should be passed to the Grid's :ref property.
    * The :adjustedWidth property is optional; it reflects the lesser of the overall width or the width of all columns.
    */
  def children(props: SizedColumnProps): ReactNode
}

object ColumnSizerProps {
  @scala.inline
  def apply(
    children: SizedColumnProps => ReactNode,
    width: Double,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    columnCount: js.UndefOr[Double] = js.undefined,
    columnMaxWidth: js.UndefOr[Double] = js.undefined,
    columnMinWidth: js.UndefOr[Double] = js.undefined
  ): ColumnSizerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), width = width.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(columnCount)) __obj.updateDynamic("columnCount")(columnCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnMaxWidth)) __obj.updateDynamic("columnMaxWidth")(columnMaxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnMinWidth)) __obj.updateDynamic("columnMinWidth")(columnMinWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSizerProps]
  }
}

