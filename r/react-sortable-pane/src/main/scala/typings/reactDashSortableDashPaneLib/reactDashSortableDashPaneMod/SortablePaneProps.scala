package typings
package reactDashSortableDashPaneLib.reactDashSortableDashPaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortablePaneProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var direction: js.UndefOr[
    reactDashSortableDashPaneLib.reactDashSortableDashPaneLibStrings.horizontal | reactDashSortableDashPaneLib.reactDashSortableDashPaneLibStrings.vertical
  ] = js.undefined
  var disableEffect: js.UndefOr[scala.Boolean] = js.undefined
  var dragHandleClassName: js.UndefOr[java.lang.String] = js.undefined
  var grid: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var isSortable: js.UndefOr[scala.Boolean] = js.undefined
  var margin: js.UndefOr[scala.Double] = js.undefined
  var onDragStart: js.UndefOr[
    js.Function3[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      scala.Unit
    ]
  ] = js.undefined
  var onDragStop: js.UndefOr[
    js.Function3[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      scala.Unit
    ]
  ] = js.undefined
  var onOrderChange: js.UndefOr[
    js.Function2[
      /* oldPanes */ js.Array[PaneProperty], 
      /* newPanes */ js.Array[PaneProperty], 
      scala.Unit
    ]
  ] = js.undefined
  var onResize: js.UndefOr[
    js.Function4[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      /* data */ PaneResizeData, 
      scala.Unit
    ]
  ] = js.undefined
  var onResizeStart: js.UndefOr[
    js.Function3[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      scala.Unit
    ]
  ] = js.undefined
  var onResizeStop: js.UndefOr[
    js.Function4[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      /* data */ PaneResizeData, 
      scala.Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement]] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

