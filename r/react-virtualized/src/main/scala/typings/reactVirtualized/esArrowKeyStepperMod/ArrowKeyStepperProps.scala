package typings.reactVirtualized.esArrowKeyStepperMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactVirtualized.reactVirtualizedStrings.cells
import typings.reactVirtualized.reactVirtualizedStrings.edges
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
/* key */ StringDictionary[js.Any] {
  var className: js.UndefOr[String] = js.undefined
  var columnCount: Double
  var disabled: js.UndefOr[Boolean] = js.undefined
  var isControlled: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[edges | cells] = js.undefined
  var onScrollToChange: js.UndefOr[js.Function1[/* params */ ScrollIndices, Unit]] = js.undefined
  var rowCount: Double
  var scrollToColumn: js.UndefOr[Double] = js.undefined
  var scrollToRow: js.UndefOr[Double] = js.undefined
  def children(props: ChildProps): ReactNode
}

object ArrowKeyStepperProps {
  @scala.inline
  def apply(
    children: ChildProps => ReactNode,
    columnCount: Double,
    rowCount: Double,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    isControlled: js.UndefOr[Boolean] = js.undefined,
    mode: edges | cells = null,
    onScrollToChange: /* params */ ScrollIndices => Unit = null,
    scrollToColumn: js.UndefOr[Double] = js.undefined,
    scrollToRow: js.UndefOr[Double] = js.undefined
  ): ArrowKeyStepperProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), columnCount = columnCount.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isControlled)) __obj.updateDynamic("isControlled")(isControlled.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onScrollToChange != null) __obj.updateDynamic("onScrollToChange")(js.Any.fromFunction1(onScrollToChange))
    if (!js.isUndefined(scrollToColumn)) __obj.updateDynamic("scrollToColumn")(scrollToColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToRow)) __obj.updateDynamic("scrollToRow")(scrollToRow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowKeyStepperProps]
  }
}

