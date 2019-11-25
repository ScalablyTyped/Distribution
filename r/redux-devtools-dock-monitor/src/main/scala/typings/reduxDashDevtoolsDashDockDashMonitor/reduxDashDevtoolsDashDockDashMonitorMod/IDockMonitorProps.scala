package typings.reduxDashDevtoolsDashDockDashMonitor.reduxDashDevtoolsDashDockDashMonitorMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDockMonitorProps extends js.Object {
  /**
    * A key or a key combination that switches the currently visible monitor.
    * Must be recognizable by parse-key (for example, 'ctrl-m')
    * Required if you use more than one monitor.
    *
    * @default undefined
    */
  var changeMonitorKey: js.UndefOr[String] = js.undefined
  /**
    * A key or a key combination that toggles the dock position.
    * Must be recognizable by parse-key (for example, 'ctrl-w')
    */
  var changePositionKey: String
  /**
    * Any valid Redux DevTools monitor.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * @default true
    */
  var defaultIsVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Where the dock appears on the screen.
    * Valid values: 'left', 'top', 'right', 'bottom'
    *
    * @default 'right'
    */
  var defaultPosition: js.UndefOr[DockPosition] = js.undefined
  /**
    * Size of the dock. When fluid is true, a float (0.5 means half the window size).
    * When fluid is false, a width in pixels
    *
    * @default 0.3 (3/10th of the window size)
    */
  var defaultSize: js.UndefOr[Double] = js.undefined
  /**
    * When true, the dock size is a fraction of the window size, fixed otherwise.
    *
    * @default true
    */
  var fluid: js.UndefOr[Boolean] = js.undefined
  /**
    * A key or a key combination that toggles the dock visibility.
    * Must be recognizable by parse-key (for example, 'ctrl-h')
    */
  var toggleVisibilityKey: String
}

object IDockMonitorProps {
  @scala.inline
  def apply(
    changePositionKey: String,
    toggleVisibilityKey: String,
    changeMonitorKey: String = null,
    children: ReactNode = null,
    defaultIsVisible: js.UndefOr[Boolean] = js.undefined,
    defaultPosition: DockPosition = null,
    defaultSize: Int | Double = null,
    fluid: js.UndefOr[Boolean] = js.undefined
  ): IDockMonitorProps = {
    val __obj = js.Dynamic.literal(changePositionKey = changePositionKey.asInstanceOf[js.Any], toggleVisibilityKey = toggleVisibilityKey.asInstanceOf[js.Any])
    if (changeMonitorKey != null) __obj.updateDynamic("changeMonitorKey")(changeMonitorKey.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultIsVisible)) __obj.updateDynamic("defaultIsVisible")(defaultIsVisible.asInstanceOf[js.Any])
    if (defaultPosition != null) __obj.updateDynamic("defaultPosition")(defaultPosition.asInstanceOf[js.Any])
    if (defaultSize != null) __obj.updateDynamic("defaultSize")(defaultSize.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDockMonitorProps]
  }
}

