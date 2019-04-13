package typings
package reactDashResizeDashDetectorLib.reactDashResizeDashDetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactResizeDetectorProps
  extends reactLib.reactMod.Props[ReactResizeDetector] {
  /**
    * Trigger onResize on height change.
    * Default: false
    */
  var handleHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Trigger onResize on width change.
    * Default: false
    */
  var handleWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Valid only for a callback-pattern.
    * Ignored for other render types.
    * Set resize-detector's node type.
    * You can pass any valid React node: string with node's name or element.
    * Can be useful when you need to handle table's or paragraph's resizes.
    * Default: "div"
    */
  var nodeType: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 114 */ js.Any
  ] = js.undefined
  /**
    * Function that will be invoked with width and height arguments.
    * Default: undefined
    */
  var onResize: js.UndefOr[js.Function2[/* width */ scala.Double, /* height */ scala.Double, scala.Unit]] = js.undefined
  /**
    * A selector of an element to observe.
    * You can use this property to attach resize-observer to any DOM element.
    * Please refer to the querySelector docs.
    * Default: undefined
    */
  var querySelector: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Possible values: "throttle" and "debounce".
    * See lodash docs for more information.
    * undefined - callback will be fired for every frame.
    * Default: undefined
    */
  var refreshMode: js.UndefOr[
    reactDashResizeDashDetectorLib.reactDashResizeDashDetectorLibStrings.throttle | reactDashResizeDashDetectorLib.reactDashResizeDashDetectorLibStrings.debounce
  ] = js.undefined
  /**
    * Use this in conjunction with refreshMode. An object in shape of { leading: bool, trailing: bool }.
    * Please refer to lodash's docs for more info.
    * Default: undefined
    */
  var refreshOptions: js.UndefOr[reactDashResizeDashDetectorLib.Anon_Leading] = js.undefined
  /**
    * Use this in conjunction with refreshMode.
    * Important! It's a numeric prop so set it accordingly, e.g. refreshRate={500}.
    * efault: 1000.
    */
  var refreshRate: js.UndefOr[scala.Double] = js.undefined
   // will be passed to React.createElement()
  var render: js.UndefOr[
    js.Function1[/* props */ ReactResizeDetectorDimensions, reactLib.reactMod.ReactNode]
  ] = js.undefined
  /**
    * Do not trigger onResize when a component mounts.
    * Default: false
    */
  var skipOnMount: js.UndefOr[scala.Boolean] = js.undefined
}

object ReactResizeDetectorProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    handleHeight: js.UndefOr[scala.Boolean] = js.undefined,
    handleWidth: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.Key = null,
    nodeType: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 114 */ js.Any = null,
    onResize: (/* width */ scala.Double, /* height */ scala.Double) => scala.Unit = null,
    querySelector: java.lang.String = null,
    ref: reactLib.reactMod.LegacyRef[ReactResizeDetector] = null,
    refreshMode: reactDashResizeDashDetectorLib.reactDashResizeDashDetectorLibStrings.throttle | reactDashResizeDashDetectorLib.reactDashResizeDashDetectorLibStrings.debounce = null,
    refreshOptions: reactDashResizeDashDetectorLib.Anon_Leading = null,
    refreshRate: scala.Int | scala.Double = null,
    render: /* props */ ReactResizeDetectorDimensions => reactLib.reactMod.ReactNode = null,
    skipOnMount: js.UndefOr[scala.Boolean] = js.undefined
  ): ReactResizeDetectorProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(handleHeight)) __obj.updateDynamic("handleHeight")(handleHeight)
    if (!js.isUndefined(handleWidth)) __obj.updateDynamic("handleWidth")(handleWidth)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType)
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction2(onResize))
    if (querySelector != null) __obj.updateDynamic("querySelector")(querySelector)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (refreshOptions != null) __obj.updateDynamic("refreshOptions")(refreshOptions)
    if (refreshRate != null) __obj.updateDynamic("refreshRate")(refreshRate.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(skipOnMount)) __obj.updateDynamic("skipOnMount")(skipOnMount)
    __obj.asInstanceOf[ReactResizeDetectorProps]
  }
}

