package typings
package reactDashVirtualizedLib.distEsArrowKeyStepperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ArrowKeyStepperProps
  extends /**
     * PLEASE NOTE
     * The [key: string]: any; line is here on purpose
     * This is due to the need of force re-render of PureComponent
     * Check the following link if you want to know more
     * https://github.com/bvaughn/react-virtualized#pass-thru-props
     */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var children: js.Function1[/* props */ ChildProps, reactLib.reactMod.ReactNs.ReactNode]
  var className: js.UndefOr[java.lang.String] = js.undefined
  var columnCount: scala.Double
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var isControlled: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[
    reactDashVirtualizedLib.reactDashVirtualizedLibStrings.edges | reactDashVirtualizedLib.reactDashVirtualizedLibStrings.cells
  ] = js.undefined
  var onScrollToChange: js.UndefOr[js.Function1[/* params */ ScrollIndices, scala.Unit]] = js.undefined
  var rowCount: scala.Double
  var scrollToColumn: js.UndefOr[scala.Double] = js.undefined
  var scrollToRow: js.UndefOr[scala.Double] = js.undefined
}

