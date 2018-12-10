package typings
package reactDashSplitDashPaneLib.reactDashSplitDashPaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Props extends js.Object {
  var allowResize: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultSize: js.UndefOr[Size] = js.undefined
  var maxSize: js.UndefOr[Size] = js.undefined
  var minSize: js.UndefOr[Size] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* newSize */ scala.Double, scala.Unit]] = js.undefined
  var onDragFinished: js.UndefOr[js.Function1[/* newSize */ scala.Double, scala.Unit]] = js.undefined
  var onDragStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onResizerClick: js.UndefOr[js.Function1[/* event */ reactLib.MouseEvent, scala.Unit]] = js.undefined
  var onResizerDoubleClick: js.UndefOr[js.Function1[/* event */ reactLib.MouseEvent, scala.Unit]] = js.undefined
  var pane1Style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var pane2Style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var paneStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var primary: js.UndefOr[
    reactDashSplitDashPaneLib.reactDashSplitDashPaneLibStrings.first | reactDashSplitDashPaneLib.reactDashSplitDashPaneLibStrings.second
  ] = js.undefined
  var resizerClassName: js.UndefOr[java.lang.String] = js.undefined
  var resizerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var split: js.UndefOr[
    reactDashSplitDashPaneLib.reactDashSplitDashPaneLibStrings.vertical | reactDashSplitDashPaneLib.reactDashSplitDashPaneLibStrings.horizontal
  ] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

