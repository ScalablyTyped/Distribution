package typings
package splitDotJsLib.splitDotJsMod.SplitNs

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

