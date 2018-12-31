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
  /**
    * Function responsible for rendering a virtualized Grid.
    * This function should implement the following signature:
    * ({ adjustedWidth, getColumnWidth, registerChild }) => PropTypes.element
    *
    * The specified :getColumnWidth function should be passed to the Grid's :columnWidth property.
    * The :registerChild should be passed to the Grid's :ref property.
    * The :adjustedWidth property is optional; it reflects the lesser of the overall width or the width of all columns.
    */
  var children: js.Function1[/* props */ SizedColumnProps, reactLib.reactMod.ReactNs.ReactNode]
  /** Number of columns in Grid or Table child */
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  /** Optional maximum allowed column width */
  var columnMaxWidth: js.UndefOr[scala.Double] = js.undefined
  /** Optional minimum allowed column width */
  var columnMinWidth: js.UndefOr[scala.Double] = js.undefined
  /** Width of Grid or Table child */
  var width: scala.Double
}

