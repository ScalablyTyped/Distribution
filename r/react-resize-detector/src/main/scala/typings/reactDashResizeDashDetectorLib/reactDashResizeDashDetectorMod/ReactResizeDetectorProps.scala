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

object ReactResizeDetectorProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    handleHeight: js.UndefOr[scala.Boolean] = js.undefined,
    handleWidth: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.ReactNs.Key = null,
    onResize: (/* width */ scala.Double, /* height */ scala.Double) => scala.Unit = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[ReactResizeDetector] = null,
    refreshMode: reactDashResizeDashDetectorLib.reactDashResizeDashDetectorLibStrings.throttle | reactDashResizeDashDetectorLib.reactDashResizeDashDetectorLibStrings.debounce = null,
    refreshRate: scala.Int | scala.Double = null,
    render: /* props */ js.Any => reactLib.reactMod.ReactNs.ReactNode = null,
    resizableElementId: java.lang.String = null,
    skipOnMount: js.UndefOr[scala.Boolean] = js.undefined
  ): ReactResizeDetectorProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(handleHeight)) __obj.updateDynamic("handleHeight")(handleHeight)
    if (!js.isUndefined(handleWidth)) __obj.updateDynamic("handleWidth")(handleWidth)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction2(onResize))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (resizableElementId != null) __obj.updateDynamic("resizableElementId")(resizableElementId)
    if (!js.isUndefined(skipOnMount)) __obj.updateDynamic("skipOnMount")(skipOnMount)
    __obj.asInstanceOf[ReactResizeDetectorProps]
  }
}

