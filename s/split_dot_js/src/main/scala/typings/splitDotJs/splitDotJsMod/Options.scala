package typings.splitDotJs.splitDotJsMod

import typings.splitDotJs.splitDotJsStrings.`col-resize`
import typings.splitDotJs.splitDotJsStrings.`row-resize`
import typings.splitDotJs.splitDotJsStrings.height
import typings.splitDotJs.splitDotJsStrings.horizontal
import typings.splitDotJs.splitDotJsStrings.vertical
import typings.splitDotJs.splitDotJsStrings.width
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // Cursor to display while dragging.
  var cursor: js.UndefOr[`col-resize` | `row-resize`] = js.undefined
  // Direction to split: horizontal or vertical.
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  // Called to set the style of each element.
  var elementStyle: js.UndefOr[
    js.Function3[
      /* dimension */ width | height, 
      /* elementSize */ Double, 
      /* gutterSize */ Double, 
      CSSStyleDeclarationPartial
    ]
  ] = js.undefined
  // Called to create each gutter element
  var gutter: js.UndefOr[
    js.Function2[/* index */ Double, /* direction */ horizontal | vertical, HTMLElement]
  ] = js.undefined
  // Gutter size in pixels.
  var gutterSize: js.UndefOr[Double] = js.undefined
  // Called to set the style of the gutter.
  var gutterStyle: js.UndefOr[
    js.Function2[/* dimension */ width | height, /* gutterSize */ Double, CSSStyleDeclarationPartial]
  ] = js.undefined
  // Minimum size of each element.
  var minSize: js.UndefOr[Double | js.Array[Double]] = js.undefined
  // Callback on drag.
  var onDrag: js.UndefOr[js.Function1[/* sizes */ js.Array[Double], Unit]] = js.undefined
  // Callback on drag end.
  var onDragEnd: js.UndefOr[js.Function1[/* sizes */ js.Array[Double], Unit]] = js.undefined
  // Callback on drag start.
  var onDragStart: js.UndefOr[js.Function1[/* sizes */ js.Array[Double], Unit]] = js.undefined
  // Initial sizes of each element in percents or CSS values.
  var sizes: js.UndefOr[js.Array[Double]] = js.undefined
  // Snap to minimum size offset in pixels.
  var snapOffset: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cursor: `col-resize` | `row-resize` = null,
    direction: horizontal | vertical = null,
    elementStyle: (/* dimension */ width | height, /* elementSize */ Double, /* gutterSize */ Double) => CSSStyleDeclarationPartial = null,
    gutter: (/* index */ Double, /* direction */ horizontal | vertical) => HTMLElement = null,
    gutterSize: Int | Double = null,
    gutterStyle: (/* dimension */ width | height, /* gutterSize */ Double) => CSSStyleDeclarationPartial = null,
    minSize: Double | js.Array[Double] = null,
    onDrag: /* sizes */ js.Array[Double] => Unit = null,
    onDragEnd: /* sizes */ js.Array[Double] => Unit = null,
    onDragStart: /* sizes */ js.Array[Double] => Unit = null,
    sizes: js.Array[Double] = null,
    snapOffset: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (elementStyle != null) __obj.updateDynamic("elementStyle")(js.Any.fromFunction3(elementStyle))
    if (gutter != null) __obj.updateDynamic("gutter")(js.Any.fromFunction2(gutter))
    if (gutterSize != null) __obj.updateDynamic("gutterSize")(gutterSize.asInstanceOf[js.Any])
    if (gutterStyle != null) __obj.updateDynamic("gutterStyle")(js.Any.fromFunction2(gutterStyle))
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (snapOffset != null) __obj.updateDynamic("snapOffset")(snapOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

