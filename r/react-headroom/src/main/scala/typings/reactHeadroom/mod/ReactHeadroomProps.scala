package typings.reactHeadroom.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
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
    calcHeightOnResize: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    disable: js.UndefOr[Boolean] = js.undefined,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    downTolerance: js.UndefOr[Double] = js.undefined,
    onPin: () => Unit = null,
    onUnfix: () => Unit = null,
    onUnpin: () => Unit = null,
    parent: () => _ = null,
    pinStart: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    upTolerance: js.UndefOr[Double] = js.undefined,
    wrapperStyle: CSSProperties = null
  ): ReactHeadroomProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(calcHeightOnResize)) __obj.updateDynamic("calcHeightOnResize")(calcHeightOnResize.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(downTolerance)) __obj.updateDynamic("downTolerance")(downTolerance.get.asInstanceOf[js.Any])
    if (onPin != null) __obj.updateDynamic("onPin")(js.Any.fromFunction0(onPin))
    if (onUnfix != null) __obj.updateDynamic("onUnfix")(js.Any.fromFunction0(onUnfix))
    if (onUnpin != null) __obj.updateDynamic("onUnpin")(js.Any.fromFunction0(onUnpin))
    if (parent != null) __obj.updateDynamic("parent")(js.Any.fromFunction0(parent))
    if (!js.isUndefined(pinStart)) __obj.updateDynamic("pinStart")(pinStart.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(upTolerance)) __obj.updateDynamic("upTolerance")(upTolerance.get.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactHeadroomProps]
  }
}

