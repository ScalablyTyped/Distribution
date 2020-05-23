package typings.reactBootstrapTableNext.mod

import typings.react.mod.ReactElement
import typings.react.mod.SyntheticEvent
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.left
import typings.reactBootstrapTableNext.reactBootstrapTableNextStrings.right
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandRowProps[T] extends js.Object {
  var className: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])
  var expandByColumnOnly: js.UndefOr[Boolean] = js.undefined
  var expandColumnPosition: left | right
  var expandColumnRenderer: ReactElement
  var expandHeaderColumnRenderer: ReactElement
  var expanded: js.UndefOr[js.Array[Double]] = js.undefined
  var nonExpandable: js.Array[Double]
  var onExpand: js.UndefOr[
    js.Function4[
      /* row */ T, 
      /* isExpand */ Boolean, 
      /* rowIndex */ Double, 
      /* e */ SyntheticEvent[Element, Event], 
      Unit
    ]
  ] = js.undefined
  var onlyOneExpanding: js.UndefOr[Boolean] = js.undefined
  var showExpandColumn: js.UndefOr[Boolean] = js.undefined
  def onExpandAll(isExpandAll: Boolean, results: js.Array[Double], e: SyntheticEvent[Element, Event]): Unit
  def renderer(row: T, rowIndex: Double): typings.react.mod.global.JSX.Element
}

object ExpandRowProps {
  @scala.inline
  def apply[T](
    className: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String]),
    expandColumnPosition: left | right,
    expandColumnRenderer: ReactElement,
    expandHeaderColumnRenderer: ReactElement,
    nonExpandable: js.Array[Double],
    onExpandAll: (Boolean, js.Array[Double], SyntheticEvent[Element, Event]) => Unit,
    renderer: (T, Double) => typings.react.mod.global.JSX.Element,
    expandByColumnOnly: js.UndefOr[Boolean] = js.undefined,
    expanded: js.Array[Double] = null,
    onExpand: (/* row */ T, /* isExpand */ Boolean, /* rowIndex */ Double, /* e */ SyntheticEvent[Element, Event]) => Unit = null,
    onlyOneExpanding: js.UndefOr[Boolean] = js.undefined,
    showExpandColumn: js.UndefOr[Boolean] = js.undefined
  ): ExpandRowProps[T] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], expandColumnPosition = expandColumnPosition.asInstanceOf[js.Any], expandColumnRenderer = expandColumnRenderer.asInstanceOf[js.Any], expandHeaderColumnRenderer = expandHeaderColumnRenderer.asInstanceOf[js.Any], nonExpandable = nonExpandable.asInstanceOf[js.Any], onExpandAll = js.Any.fromFunction3(onExpandAll), renderer = js.Any.fromFunction2(renderer))
    if (!js.isUndefined(expandByColumnOnly)) __obj.updateDynamic("expandByColumnOnly")(expandByColumnOnly.get.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction4(onExpand))
    if (!js.isUndefined(onlyOneExpanding)) __obj.updateDynamic("onlyOneExpanding")(onlyOneExpanding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showExpandColumn)) __obj.updateDynamic("showExpandColumn")(showExpandColumn.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandRowProps[T]]
  }
}

