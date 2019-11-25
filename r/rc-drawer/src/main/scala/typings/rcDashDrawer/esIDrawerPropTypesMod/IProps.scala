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

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<any>, 'onChange'> ]: react.react.HTMLAttributes<any>[P]} */ trait IProps extends js.Object {
  var afterVisibleChange: js.UndefOr[js.Function1[/* open */ Boolean, Unit]] = js.undefined
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[String] = js.undefined
  var ease: js.UndefOr[String] = js.undefined
  var handler: js.UndefOr[ReactElement | Null | `false`] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var keyboard: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[Null | String | js.Array[String]] = js.undefined
  var levelMove: js.UndefOr[ILevelMove | (js.Function1[/* e */ Anon_OpenTarget, ILevelMove])] = js.undefined
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskStyle: js.UndefOr[CSSProperties] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* open */ js.UndefOr[Boolean], Unit]] = js.undefined
  var onClose: js.UndefOr[
    js.Function1[/* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], Unit]
  ] = js.undefined
  var onHandleClick: js.UndefOr[
    js.Function1[/* e */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], Unit]
  ] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var placement: js.UndefOr[IPlacement] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showMask: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object IProps {
  @scala.inline
  def apply(
    afterVisibleChange: /* open */ Boolean => Unit = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    duration: String = null,
    ease: String = null,
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
    width: String | Double = null
  ): IProps = {
    val __obj = js.Dynamic.literal()
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(js.Any.fromFunction1(afterVisibleChange))
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(ease.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelMove != null) __obj.updateDynamic("levelMove")(levelMove.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onHandleClick != null) __obj.updateDynamic("onHandleClick")(js.Any.fromFunction1(onHandleClick))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showMask)) __obj.updateDynamic("showMask")(showMask.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
}

