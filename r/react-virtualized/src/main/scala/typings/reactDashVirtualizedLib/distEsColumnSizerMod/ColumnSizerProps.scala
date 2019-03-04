package typings
package reactDashVirtualizedLib.distEsColumnSizerMod

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
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** Number of columns in Grid or Table child */
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  /** Optional maximum allowed column width */
  var columnMaxWidth: js.UndefOr[scala.Double] = js.undefined
  /** Optional minimum allowed column width */
  var columnMinWidth: js.UndefOr[scala.Double] = js.undefined
  /** Width of Grid or Table child */
  var width: scala.Double
  /**
    * Function responsible for rendering a virtualized Grid.
    * This function should implement the following signature:
    * ({ adjustedWidth, getColumnWidth, registerChild }) => PropTypes.element
    *
    * The specified :getColumnWidth function should be passed to the Grid's :columnWidth property.
    * The :registerChild should be passed to the Grid's :ref property.
    * The :adjustedWidth property is optional; it reflects the lesser of the overall width or the width of all columns.
    */
  def children(props: SizedColumnProps): reactLib.reactMod.ReactNs.ReactNode
}

object ColumnSizerProps {
  @scala.inline
  def apply(
    children: js.Function1[SizedColumnProps, reactLib.reactMod.ReactNs.ReactNode],
    width: scala.Double,
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    columnCount: scala.Int | scala.Double = null,
    columnMaxWidth: scala.Int | scala.Double = null,
    columnMinWidth: scala.Int | scala.Double = null
  ): ColumnSizerProps = {
    val __obj = js.Dynamic.literal(children = children, width = width)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnMaxWidth != null) __obj.updateDynamic("columnMaxWidth")(columnMaxWidth.asInstanceOf[js.Any])
    if (columnMinWidth != null) __obj.updateDynamic("columnMinWidth")(columnMinWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSizerProps]
  }
}

