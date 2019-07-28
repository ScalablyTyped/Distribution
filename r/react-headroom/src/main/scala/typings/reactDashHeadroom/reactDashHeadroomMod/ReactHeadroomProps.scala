package typings.reactDashHeadroom.reactDashHeadroomMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactHeadroomProps extends js.Object {
  var calcHeightOnResize: js.UndefOr[Boolean] = js.undefined
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var disable: js.UndefOr[Boolean] = js.undefined
  var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
  var downTolerance: js.UndefOr[Double] = js.undefined
  var onPin: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onUnfix: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onUnpin: js.UndefOr[js.Function0[Unit]] = js.undefined
  var parent: js.UndefOr[js.Function0[_]] = js.undefined
  var pinStart: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var upTolerance: js.UndefOr[Double] = js.undefined
  var wrapperStyle: js.UndefOr[CSSProperties] = js.undefined
}

object ReactHeadroomProps {
  @scala.inline
  def apply(
    children: ReactNode,
    calcHeightOnResize: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    downTolerance: Int | Double = null,
    onPin: () => Unit = null,
    onUnfix: () => Unit = null,
    onUnpin: () => Unit = null,
    parent: () => _ = null,
    pinStart: Int | Double = null,
    style: CSSProperties = null,
    upTolerance: Int | Double = null,
    wrapperStyle: CSSProperties = null
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

