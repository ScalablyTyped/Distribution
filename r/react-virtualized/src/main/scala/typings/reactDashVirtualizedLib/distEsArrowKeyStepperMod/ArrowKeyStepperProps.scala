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
  def children(props: ChildProps): reactLib.reactMod.ReactNode
}

object ArrowKeyStepperProps {
  @scala.inline
  def apply(
    children: ChildProps => reactLib.reactMod.ReactNode,
    columnCount: scala.Double,
    rowCount: scala.Double,
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    isControlled: js.UndefOr[scala.Boolean] = js.undefined,
    mode: reactDashVirtualizedLib.reactDashVirtualizedLibStrings.edges | reactDashVirtualizedLib.reactDashVirtualizedLibStrings.cells = null,
    onScrollToChange: /* params */ ScrollIndices => scala.Unit = null,
    scrollToColumn: scala.Int | scala.Double = null,
    scrollToRow: scala.Int | scala.Double = null
  ): ArrowKeyStepperProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), columnCount = columnCount, rowCount = rowCount)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(isControlled)) __obj.updateDynamic("isControlled")(isControlled)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onScrollToChange != null) __obj.updateDynamic("onScrollToChange")(js.Any.fromFunction1(onScrollToChange))
    if (scrollToColumn != null) __obj.updateDynamic("scrollToColumn")(scrollToColumn.asInstanceOf[js.Any])
    if (scrollToRow != null) __obj.updateDynamic("scrollToRow")(scrollToRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowKeyStepperProps]
  }
}

