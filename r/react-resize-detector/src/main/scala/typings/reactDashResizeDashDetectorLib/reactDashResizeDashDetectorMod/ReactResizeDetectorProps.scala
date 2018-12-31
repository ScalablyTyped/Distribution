package typings
package reactDashResizeDashDetectorLib.reactDashResizeDashDetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactResizeDetectorProps
  extends reactLib.reactMod.ReactNs.Props[ReactResizeDetector] {
  /** Trigger onResize on height change. Default: false */
  var handleHeight: js.UndefOr[scala.Boolean] = js.undefined
  /** Trigger onResize on width change. Default: false */
  var handleWidth: js.UndefOr[scala.Boolean] = js.undefined
  /** Function that will be invoked with width and height arguments */
  var onResize: js.UndefOr[js.Function2[/* width */ scala.Double, /* height */ scala.Double, scala.Unit]] = js.undefined
  /** Possible values: throttle and debounce */
  var refreshMode: js.UndefOr[
    reactDashResizeDashDetectorLib.reactDashResizeDashDetectorLibStrings.throttle | reactDashResizeDashDetectorLib.reactDashResizeDashDetectorLibStrings.debounce
  ] = js.undefined
  /** Makes sense only when refreshMode is set. Default: 1000. */
  var refreshRate: js.UndefOr[scala.Double] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ js.Any, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  /** Id of the element we want to observe. If none provided, parentElement of the component will be used. Default: "" */
  var resizableElementId: js.UndefOr[java.lang.String] = js.undefined
  /** Do not trigger onResize when a component mounts. Default: false */
  var skipOnMount: js.UndefOr[scala.Boolean] = js.undefined
}

