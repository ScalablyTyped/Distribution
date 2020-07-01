package typings.splitJs.mod

import typings.splitJs.splitJsStrings.height
import typings.splitJs.splitJsStrings.horizontal
import typings.splitJs.splitJsStrings.vertical
import typings.splitJs.splitJsStrings.width
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // Cursor to display while dragging.
  var cursor: js.UndefOr[String] = js.undefined
  // Direction to split: horizontal or vertical.
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  var dragInterval: js.UndefOr[Double] = js.undefined
  // Called to set the style of each element.
  var elementStyle: js.UndefOr[
    js.Function4[
      /* dimension */ width | height, 
      /* elementSize */ Double, 
      /* gutterSize */ Double, 
      /* index */ Double, 
      CSSStyleDeclarationPartial
    ]
  ] = js.undefined
  var expandToMin: js.UndefOr[Boolean] = js.undefined
  // Called to create each gutter element
  var gutter: js.UndefOr[
    js.Function2[/* index */ Double, /* direction */ horizontal | vertical, HTMLElement]
  ] = js.undefined
  var gutterAlign: js.UndefOr[String] = js.undefined
  // Gutter size in pixels.
  var gutterSize: js.UndefOr[Double] = js.undefined
  // Called to set the style of the gutter.
  var gutterStyle: js.UndefOr[
    js.Function3[
      /* dimension */ width | height, 
      /* gutterSize */ Double, 
      /* index */ Double, 
      CSSStyleDeclarationPartial
    ]
  ] = js.undefined
  // Minimum size of each element.
  var minSize: js.UndefOr[Double | js.Array[Double]] = js.undefined
  // Callback on drag.
  var onDrag: js.UndefOr[js.Function0[Unit]] = js.undefined
  // Callback on drag end.
  var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  // Callback on drag start.
  var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  // Initial sizes of each element in percents or CSS values.
  var sizes: js.UndefOr[js.Array[Double]] = js.undefined
  // Snap to minimum size offset in pixels.
  var snapOffset: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cursor: String = null,
    direction: horizontal | vertical = null,
    dragInterval: js.UndefOr[Double] = js.undefined,
    elementStyle: (/* dimension */ width | height, /* elementSize */ Double, /* gutterSize */ Double, /* index */ Double) => CSSStyleDeclarationPartial = null,
    expandToMin: js.UndefOr[Boolean] = js.undefined,
    gutter: (/* index */ Double, /* direction */ horizontal | vertical) => HTMLElement = null,
    gutterAlign: String = null,
    gutterSize: js.UndefOr[Double] = js.undefined,
    gutterStyle: (/* dimension */ width | height, /* gutterSize */ Double, /* index */ Double) => CSSStyleDeclarationPartial = null,
    minSize: Double | js.Array[Double] = null,
    onDrag: () => Unit = null,
    onDragEnd: () => Unit = null,
    onDragStart: () => Unit = null,
    sizes: js.Array[Double] = null,
    snapOffset: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(dragInterval)) __obj.updateDynamic("dragInterval")(dragInterval.get.asInstanceOf[js.Any])
    if (elementStyle != null) __obj.updateDynamic("elementStyle")(js.Any.fromFunction4(elementStyle))
    if (!js.isUndefined(expandToMin)) __obj.updateDynamic("expandToMin")(expandToMin.get.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(js.Any.fromFunction2(gutter))
    if (gutterAlign != null) __obj.updateDynamic("gutterAlign")(gutterAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(gutterSize)) __obj.updateDynamic("gutterSize")(gutterSize.get.asInstanceOf[js.Any])
    if (gutterStyle != null) __obj.updateDynamic("gutterStyle")(js.Any.fromFunction3(gutterStyle))
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction0(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction0(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (!js.isUndefined(snapOffset)) __obj.updateDynamic("snapOffset")(snapOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

