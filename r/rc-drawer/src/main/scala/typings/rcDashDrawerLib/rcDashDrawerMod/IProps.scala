package typings
package rcDashDrawerLib.rcDashDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.HTMLAttributes<react.react.HTMLAttributes<react.react.HTMLAttributes<react.react.HTMLAttributes<T>>>>, 'onChange'> ]: react.react.HTMLAttributes<react.react.HTMLAttributes<react.react.HTMLAttributes<react.react.HTMLAttributes<T>>>>[P]} */ trait IProps[T] extends js.Object {
  var afterVisibleChange: js.UndefOr[js.Function1[/* open */ scala.Boolean, scala.Unit]] = js.undefined
  var defaultOpen: js.UndefOr[scala.Boolean] = js.undefined
  var duration: js.UndefOr[java.lang.String] = js.undefined
  var ease: js.UndefOr[java.lang.String] = js.undefined
  var getContainer: js.UndefOr[IStringOrHtmlElement | js.Function0[IStringOrHtmlElement]] = js.undefined
  var handler: js.UndefOr[scala.Boolean | reactLib.reactMod.ReactNode] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var level: js.UndefOr[scala.Null | java.lang.String | js.Array[java.lang.String]] = js.undefined
  var levelMove: js.UndefOr[ILevelMove | (js.Function1[/* e */ rcDashDrawerLib.Anon_Open, ILevelMove])] = js.undefined
  var maskStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* open */ scala.Boolean, scala.Unit]] = js.undefined
  var onHandleClick: js.UndefOr[js.Function1[/* e */ stdLib.MouseEvent | stdLib.KeyboardEvent, scala.Unit]] = js.undefined
  var onMaskClick: js.UndefOr[js.Function1[/* e */ stdLib.MouseEvent | stdLib.KeyboardEvent, scala.Unit]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var placement: js.UndefOr[IPlacement] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showMask: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var wrapperClassName: js.UndefOr[java.lang.String] = js.undefined
}

object IProps {
  @scala.inline
  def apply[T](
    afterVisibleChange: /* open */ scala.Boolean => scala.Unit = null,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    duration: java.lang.String = null,
    ease: java.lang.String = null,
    getContainer: IStringOrHtmlElement | js.Function0[IStringOrHtmlElement] = null,
    handler: scala.Boolean | reactLib.reactMod.ReactNode = null,
    height: java.lang.String | scala.Double = null,
    level: java.lang.String | js.Array[java.lang.String] = null,
    levelMove: ILevelMove | (js.Function1[/* e */ rcDashDrawerLib.Anon_Open, ILevelMove]) = null,
    maskStyle: reactLib.reactMod.CSSProperties = null,
    onChange: /* open */ scala.Boolean => scala.Unit = null,
    onHandleClick: /* e */ stdLib.MouseEvent | stdLib.KeyboardEvent => scala.Unit = null,
    onMaskClick: /* e */ stdLib.MouseEvent | stdLib.KeyboardEvent => scala.Unit = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    placement: IPlacement = null,
    prefixCls: java.lang.String = null,
    showMask: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String | scala.Double = null,
    wrapperClassName: java.lang.String = null
  ): IProps[T] = {
    val __obj = js.Dynamic.literal()
    if (afterVisibleChange != null) __obj.updateDynamic("afterVisibleChange")(js.Any.fromFunction1(afterVisibleChange))
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (ease != null) __obj.updateDynamic("ease")(ease)
    if (getContainer != null) __obj.updateDynamic("getContainer")(getContainer.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelMove != null) __obj.updateDynamic("levelMove")(levelMove.asInstanceOf[js.Any])
    if (maskStyle != null) __obj.updateDynamic("maskStyle")(maskStyle)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onHandleClick != null) __obj.updateDynamic("onHandleClick")(js.Any.fromFunction1(onHandleClick))
    if (onMaskClick != null) __obj.updateDynamic("onMaskClick")(js.Any.fromFunction1(onMaskClick))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(showMask)) __obj.updateDynamic("showMask")(showMask)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName)
    __obj.asInstanceOf[IProps[T]]
  }
}

