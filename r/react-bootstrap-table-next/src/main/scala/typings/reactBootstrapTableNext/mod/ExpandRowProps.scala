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
  var className: js.UndefOr[
    String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String])
  ] = js.undefined
  var expandByColumnOnly: js.UndefOr[Boolean] = js.undefined
  var expandColumnPosition: js.UndefOr[left | right] = js.undefined
  var expandColumnRenderer: js.UndefOr[ReactElement] = js.undefined
  var expandHeaderColumnRenderer: js.UndefOr[ReactElement] = js.undefined
  var expanded: js.UndefOr[js.Array[_]] = js.undefined
  var nonExpandable: js.UndefOr[js.Array[Double]] = js.undefined
  var onExpand: js.UndefOr[
    js.Function4[
      /* row */ T, 
      /* isExpand */ Boolean, 
      /* rowIndex */ Double, 
      /* e */ SyntheticEvent[Element, Event], 
      Unit
    ]
  ] = js.undefined
  var onExpandAll: js.UndefOr[
    js.Function3[
      /* isExpandAll */ Boolean, 
      /* results */ js.Array[Double], 
      /* e */ SyntheticEvent[Element, Event], 
      Unit
    ]
  ] = js.undefined
  var onlyOneExpanding: js.UndefOr[Boolean] = js.undefined
  var showExpandColumn: js.UndefOr[Boolean] = js.undefined
  def renderer(row: T, rowIndex: Double): typings.react.mod.global.JSX.Element
}

object ExpandRowProps {
  @scala.inline
  def apply[T](
    renderer: (T, Double) => typings.react.mod.global.JSX.Element,
    className: String | (js.Function3[/* isExpand */ Boolean, /* row */ T, /* rowIndex */ Double, String]) = null,
    expandByColumnOnly: js.UndefOr[Boolean] = js.undefined,
    expandColumnPosition: left | right = null,
    expandColumnRenderer: ReactElement = null,
    expandHeaderColumnRenderer: ReactElement = null,
    expanded: js.Array[_] = null,
    nonExpandable: js.Array[Double] = null,
    onExpand: (/* row */ T, /* isExpand */ Boolean, /* rowIndex */ Double, /* e */ SyntheticEvent[Element, Event]) => Unit = null,
    onExpandAll: (/* isExpandAll */ Boolean, /* results */ js.Array[Double], /* e */ SyntheticEvent[Element, Event]) => Unit = null,
    onlyOneExpanding: js.UndefOr[Boolean] = js.undefined,
    showExpandColumn: js.UndefOr[Boolean] = js.undefined
  ): ExpandRowProps[T] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction2(renderer))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(expandByColumnOnly)) __obj.updateDynamic("expandByColumnOnly")(expandByColumnOnly.get.asInstanceOf[js.Any])
    if (expandColumnPosition != null) __obj.updateDynamic("expandColumnPosition")(expandColumnPosition.asInstanceOf[js.Any])
    if (expandColumnRenderer != null) __obj.updateDynamic("expandColumnRenderer")(expandColumnRenderer.asInstanceOf[js.Any])
    if (expandHeaderColumnRenderer != null) __obj.updateDynamic("expandHeaderColumnRenderer")(expandHeaderColumnRenderer.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (nonExpandable != null) __obj.updateDynamic("nonExpandable")(nonExpandable.asInstanceOf[js.Any])
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction4(onExpand))
    if (onExpandAll != null) __obj.updateDynamic("onExpandAll")(js.Any.fromFunction3(onExpandAll))
    if (!js.isUndefined(onlyOneExpanding)) __obj.updateDynamic("onlyOneExpanding")(onlyOneExpanding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showExpandColumn)) __obj.updateDynamic("showExpandColumn")(showExpandColumn.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandRowProps[T]]
  }
}

