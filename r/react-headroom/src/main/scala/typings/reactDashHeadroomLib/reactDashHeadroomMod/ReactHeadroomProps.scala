package typings
package reactDashHeadroomLib.reactDashHeadroomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactHeadroomProps extends js.Object {
  var calcHeightOnResize: js.UndefOr[scala.Boolean] = js.undefined
  var children: reactLib.reactMod.ReactNs.ReactNode
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  var disableInlineStyles: js.UndefOr[scala.Boolean] = js.undefined
  var downTolerance: js.UndefOr[scala.Double] = js.undefined
  var onPin: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onUnfix: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onUnpin: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var parent: js.UndefOr[js.Function0[_]] = js.undefined
  var pinStart: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var upTolerance: js.UndefOr[scala.Double] = js.undefined
  var wrapperStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object ReactHeadroomProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    calcHeightOnResize: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    disable: js.UndefOr[scala.Boolean] = js.undefined,
    disableInlineStyles: js.UndefOr[scala.Boolean] = js.undefined,
    downTolerance: scala.Int | scala.Double = null,
    onPin: () => scala.Unit = null,
    onUnfix: () => scala.Unit = null,
    onUnpin: () => scala.Unit = null,
    parent: () => _ = null,
    pinStart: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    upTolerance: scala.Int | scala.Double = null,
    wrapperStyle: reactLib.reactMod.ReactNs.CSSProperties = null
  ): ReactHeadroomProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(calcHeightOnResize)) __obj.updateDynamic("calcHeightOnResize")(calcHeightOnResize)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles)
    if (downTolerance != null) __obj.updateDynamic("downTolerance")(downTolerance.asInstanceOf[js.Any])
    if (onPin != null) __obj.updateDynamic("onPin")(js.Any.fromFunction0(onPin))
    if (onUnfix != null) __obj.updateDynamic("onUnfix")(js.Any.fromFunction0(onUnfix))
    if (onUnpin != null) __obj.updateDynamic("onUnpin")(js.Any.fromFunction0(onUnpin))
    if (parent != null) __obj.updateDynamic("parent")(js.Any.fromFunction0(parent))
    if (pinStart != null) __obj.updateDynamic("pinStart")(pinStart.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (upTolerance != null) __obj.updateDynamic("upTolerance")(upTolerance.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle)
    __obj.asInstanceOf[ReactHeadroomProps]
  }
}

