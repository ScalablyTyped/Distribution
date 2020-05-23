package typings.rcRate.starMod

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarProps extends js.Object {
  var allowHalf: js.UndefOr[Boolean] = js.undefined
  var character: js.UndefOr[ReactNode] = js.undefined
  var characterRender: js.UndefOr[js.Function2[/* origin */ ReactElement, /* props */ StarProps, ReactNode]] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var focused: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[
      /* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement], 
      /* index */ Double, 
      Unit
    ]
  ] = js.undefined
  var onHover: js.UndefOr[
    js.Function2[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* index */ Double, Unit]
  ] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object StarProps {
  @scala.inline
  def apply(
    allowHalf: js.UndefOr[Boolean] = js.undefined,
    character: ReactNode = null,
    characterRender: (/* origin */ ReactElement, /* props */ StarProps) => ReactNode = null,
    count: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    onClick: (/* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | KeyboardEvent[HTMLDivElement], /* index */ Double) => Unit = null,
    onHover: (/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* index */ Double) => Unit = null,
    prefixCls: String = null,
    value: js.UndefOr[Double] = js.undefined
  ): StarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalf)) __obj.updateDynamic("allowHalf")(allowHalf.get.asInstanceOf[js.Any])
    if (character != null) __obj.updateDynamic("character")(character.asInstanceOf[js.Any])
    if (characterRender != null) __obj.updateDynamic("characterRender")(js.Any.fromFunction2(characterRender))
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onHover != null) __obj.updateDynamic("onHover")(js.Any.fromFunction2(onHover))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarProps]
  }
}

