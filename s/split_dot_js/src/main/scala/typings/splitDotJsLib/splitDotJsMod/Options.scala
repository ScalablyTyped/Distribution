package typings
package splitDotJsLib.splitDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // Cursor to display while dragging.
  var cursor: js.UndefOr[
    splitDotJsLib.splitDotJsLibStrings.`col-resize` | splitDotJsLib.splitDotJsLibStrings.`row-resize`
  ] = js.undefined
  // Direction to split: horizontal or vertical.
  var direction: js.UndefOr[
    splitDotJsLib.splitDotJsLibStrings.horizontal | splitDotJsLib.splitDotJsLibStrings.vertical
  ] = js.undefined
  // Called to set the style of each element.
  var elementStyle: js.UndefOr[
    js.Function3[
      /* dimension */ splitDotJsLib.splitDotJsLibStrings.width | splitDotJsLib.splitDotJsLibStrings.height, 
      /* elementSize */ scala.Double, 
      /* gutterSize */ scala.Double, 
      CSSStyleDeclarationPartial
    ]
  ] = js.undefined
  // Called to create each gutter element
  var gutter: js.UndefOr[
    js.Function2[
      /* index */ scala.Double, 
      /* direction */ splitDotJsLib.splitDotJsLibStrings.horizontal | splitDotJsLib.splitDotJsLibStrings.vertical, 
      stdLib.HTMLElement
    ]
  ] = js.undefined
  // Gutter size in pixels.
  var gutterSize: js.UndefOr[scala.Double] = js.undefined
  // Called to set the style of the gutter.
  var gutterStyle: js.UndefOr[
    js.Function2[
      /* dimension */ splitDotJsLib.splitDotJsLibStrings.width | splitDotJsLib.splitDotJsLibStrings.height, 
      /* gutterSize */ scala.Double, 
      CSSStyleDeclarationPartial
    ]
  ] = js.undefined
  // Minimum size of each element.
  var minSize: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  // Callback on drag.
  var onDrag: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  // Callback on drag end.
  var onDragEnd: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  // Callback on drag start.
  var onDragStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  // Initial sizes of each element in percents or CSS values.
  var sizes: js.UndefOr[js.Array[scala.Double]] = js.undefined
  // Snap to minimum size offset in pixels.
  var snapOffset: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cursor: splitDotJsLib.splitDotJsLibStrings.`col-resize` | splitDotJsLib.splitDotJsLibStrings.`row-resize` = null,
    direction: splitDotJsLib.splitDotJsLibStrings.horizontal | splitDotJsLib.splitDotJsLibStrings.vertical = null,
    elementStyle: (/* dimension */ splitDotJsLib.splitDotJsLibStrings.width | splitDotJsLib.splitDotJsLibStrings.height, /* elementSize */ scala.Double, /* gutterSize */ scala.Double) => CSSStyleDeclarationPartial = null,
    gutter: (/* index */ scala.Double, /* direction */ splitDotJsLib.splitDotJsLibStrings.horizontal | splitDotJsLib.splitDotJsLibStrings.vertical) => stdLib.HTMLElement = null,
    gutterSize: scala.Int | scala.Double = null,
    gutterStyle: (/* dimension */ splitDotJsLib.splitDotJsLibStrings.width | splitDotJsLib.splitDotJsLibStrings.height, /* gutterSize */ scala.Double) => CSSStyleDeclarationPartial = null,
    minSize: scala.Double | js.Array[scala.Double] = null,
    onDrag: () => scala.Unit = null,
    onDragEnd: () => scala.Unit = null,
    onDragStart: () => scala.Unit = null,
    sizes: js.Array[scala.Double] = null,
    snapOffset: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (elementStyle != null) __obj.updateDynamic("elementStyle")(js.Any.fromFunction3(elementStyle))
    if (gutter != null) __obj.updateDynamic("gutter")(js.Any.fromFunction2(gutter))
    if (gutterSize != null) __obj.updateDynamic("gutterSize")(gutterSize.asInstanceOf[js.Any])
    if (gutterStyle != null) __obj.updateDynamic("gutterStyle")(js.Any.fromFunction2(gutterStyle))
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction0(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction0(onDragEnd))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction0(onDragStart))
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (snapOffset != null) __obj.updateDynamic("snapOffset")(snapOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

