package typings.rcRate.rateMod

import typings.rcRate.starMod.StarProps
import typings.react.mod.CSSProperties
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateProps extends js.Object {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var allowHalf: js.UndefOr[Boolean] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var character: js.UndefOr[js.Function1[/* props */ StarProps, ReactNode]] = js.undefined
  var characterRender: js.UndefOr[js.Function2[/* origin */ ReactElement, /* props */ StarProps, ReactNode]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var defaultValue: js.UndefOr[Double] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHoverChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLUListElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object RateProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    allowHalf: js.UndefOr[Boolean] = js.undefined,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    character: /* props */ StarProps => ReactNode = null,
    characterRender: (/* origin */ ReactElement, /* props */ StarProps) => ReactNode = null,
    className: String = null,
    count: js.UndefOr[Double] = js.undefined,
    defaultValue: js.UndefOr[Double] = js.undefined,
    direction: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onBlur: () => Unit = null,
    onChange: /* value */ Double => Unit = null,
    onFocus: () => Unit = null,
    onHoverChange: /* value */ Double => Unit = null,
    onKeyDown: KeyboardEvent[HTMLUListElement] => Unit = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): RateProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHalf)) __obj.updateDynamic("allowHalf")(allowHalf.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.get.asInstanceOf[js.Any])
    if (character != null) __obj.updateDynamic("character")(js.Any.fromFunction1(character))
    if (characterRender != null) __obj.updateDynamic("characterRender")(js.Any.fromFunction2(characterRender))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction0(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction0(onFocus))
    if (onHoverChange != null) __obj.updateDynamic("onHoverChange")(js.Any.fromFunction1(onHoverChange))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateProps]
  }
}

