package typings
package rcDashDrawerLib.libIDrawerPropTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDrawerProps extends IProps {
  var forceRender: js.UndefOr[scala.Boolean] = js.undefined
  var getContainer: js.UndefOr[
    IStringOrHtmlElement | js.Function0[IStringOrHtmlElement] | scala.Null | rcDashDrawerLib.rcDashDrawerLibNumbers.`false`
  ] = js.undefined
  var wrapperClassName: js.UndefOr[java.lang.String] = js.undefined
}

object IDrawerProps {
  @scala.inline
  def apply(
    afterVisibleChange: /* open */ scala.Boolean => scala.Unit = null,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    duration: java.lang.String = null,
    ease: java.lang.String = null,
    forceRender: js.UndefOr[scala.Boolean] = js.undefined,
    getContainer: IStringOrHtmlElement | js.Function0[IStringOrHtmlElement] | rcDashDrawerLib.rcDashDrawerLibNumbers.`false` = null,
    handler: reactLib.reactMod.ReactElement | rcDashDrawerLib.rcDashDrawerLibNumbers.`false` = null,
    height: java.lang.String | scala.Double = null,
    keyboard: js.UndefOr[scala.Boolean] = js.undefined,
    level: java.lang.String | js.Array[java.lang.String] = null,
    levelMove: ILevelMove | (js.Function1[/* e */ rcDashDrawerLib.Anon_OpenTarget, ILevelMove]) = null,
    maskClosable: js.UndefOr[scala.Boolean] = js.undefined,
    maskStyle: reactLib.reactMod.CSSProperties = null,
    onChange: /* open */ js.UndefOr[scala.Boolean] => scala.Unit = null,
    onClose: /* e */ (reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent]) | reactLib.reactMod.KeyboardEvent[reactLib.Element] => scala.Unit = null,
    onHandleClick: /* e */ (reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent]) | reactLib.reactMod.KeyboardEvent[reactLib.Element] => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    placement: IPlacement = null,
    prefixCls: java.lang.String = null,
    showMask: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String | scala.Double = null,
    wrapperClassName: java.lang.String = null
  ): IDrawerProps = {
    val __obj = js.Dynamic.literal()
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(js.Any.fromFunction1(afterVisibleChange))
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (ease != null) __obj.updateDynamic("ease")(ease)
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelMove != null) __obj.updateDynamic("levelMove")(levelMove.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onHandleClick != null) __obj.updateDynamic("onHandleClick")(js.Any.fromFunction1(onHandleClick))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(showMask)) __obj.updateDynamic("showMask")(showMask)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName)
    __obj.asInstanceOf[IDrawerProps]
  }
}

