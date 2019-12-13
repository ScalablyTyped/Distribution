package typings.reactstrap.libButtonToggleMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.ButtonHTMLAttributes<std.HTMLButtonElement>, 'defaultValue'> ]: react.react.ButtonHTMLAttributes<std.HTMLButtonElement>[P]} */ trait ButtonToggleProps
  extends /* key */ StringDictionary[js.Any] {
  var defaultValue: js.UndefOr[Boolean] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[_]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[_]] = js.undefined
}

object ButtonToggleProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    defaultValue: js.UndefOr[Boolean] = js.undefined,
    onBlur: FocusEvent[_] => Unit = null,
    onClick: MouseEvent[_, NativeMouseEvent] => Unit = null,
    onFocus: FocusEvent[_] => Unit = null
  ): ButtonToggleProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    __obj.asInstanceOf[ButtonToggleProps]
  }
}

