package typings.rcDashDrawer.esIDrawerPropTypesMod

import typings.rcDashDrawer.Anon_OpenTarget
import typings.rcDashDrawer.rcDashDrawerNumbers.`false`
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactElement
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDrawerProps extends IProps {
  var forceRender: js.UndefOr[Boolean] = js.undefined
  var getContainer: js.UndefOr[IStringOrHtmlElement | js.Function0[IStringOrHtmlElement] | Null | `false`] = js.undefined
  var wrapperClassName: js.UndefOr[String] = js.undefined
}

object IDrawerProps {
  @scala.inline
  def apply(
    afterVisibleChange: /* open */ Boolean => Unit = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    duration: String = null,
    ease: String = null,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    getContainer: IStringOrHtmlElement | js.Function0[IStringOrHtmlElement] | `false` = null,
    handler: ReactElement | `false` = null,
    height: String | Double = null,
    keyboard: js.UndefOr[Boolean] = js.undefined,
    level: String | js.Array[String] = null,
    levelMove: ILevelMove | (js.Function1[/* e */ Anon_OpenTarget, ILevelMove]) = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskStyle: CSSProperties = null,
    onChange: /* open */ js.UndefOr[Boolean] => Unit = null,
    onClose: /* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit = null,
    onHandleClick: /* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placement: IPlacement = null,
    prefixCls: String = null,
    showMask: js.UndefOr[Boolean] = js.undefined,
    width: String | Double = null,
    wrapperClassName: String = null
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

