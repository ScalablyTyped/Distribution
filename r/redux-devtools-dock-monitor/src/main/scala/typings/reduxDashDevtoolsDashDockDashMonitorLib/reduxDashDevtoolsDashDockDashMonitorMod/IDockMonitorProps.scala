package typings
package reduxDashDevtoolsDashDockDashMonitorLib.reduxDashDevtoolsDashDockDashMonitorMod

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
  var changeMonitorKey: js.UndefOr[java.lang.String] = js.undefined
  /**
       * A key or a key combination that toggles the dock position.
       * Must be recognizable by parse-key (for example, 'ctrl-w')
       */
  var changePositionKey: java.lang.String
  /**
       * Any valid Redux DevTools monitor.
       */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
       * @default true
       */
  var defaultIsVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Where the dock appears on the screen.
       * Valid values: 'left', 'top', 'right', 'bottom'
       *
       * @default 'right'
       */
  var defaultPosition: js.UndefOr[reduxDashDevtoolsDashDockDashMonitorLib.DockPosition] = js.undefined
  /**
       * Size of the dock. When fluid is true, a float (0.5 means half the window size).
       * When fluid is false, a width in pixels
       *
       * @default 0.3 (3/10th of the window size)
       */
  var defaultSize: js.UndefOr[scala.Double] = js.undefined
  /**
       * When true, the dock size is a fraction of the window size, fixed otherwise.
       *
       * @default true
       */
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * A key or a key combination that toggles the dock visibility.
       * Must be recognizable by parse-key (for example, 'ctrl-h')
       */
  var toggleVisibilityKey: java.lang.String
}

