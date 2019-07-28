package typings.semanticDashUiDashReact.distCommonjsAddonsRadioRadioMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.FormEvent
import typings.react.reactMod.MouseEvent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.HtmlLabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsModulesCheckboxCheckboxMod.CheckboxProps
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.checkbox
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.radio
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps
  extends StrictRadioProps
     with /* key */ StringDictionary[js.Any]

object RadioProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultIndeterminate: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fitted: js.UndefOr[Boolean] = js.undefined,
    id: Double | String = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    label: SemanticShorthandItem[HtmlLabelProps] = null,
    name: String = null,
    onChange: (/* event */ FormEvent[HTMLInputElement], /* data */ CheckboxProps) => Unit = null,
    onClick: (/* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], /* data */ CheckboxProps) => Unit = null,
    onMouseDown: (/* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], /* data */ CheckboxProps) => Unit = null,
    onMouseUp: (/* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], /* data */ CheckboxProps) => Unit = null,
    radio: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    slider: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Double | String = null,
    toggle: js.UndefOr[Boolean] = js.undefined,
    `type`: checkbox | radio = null,
    value: Double | String = null
  ): RadioProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(defaultIndeterminate)) __obj.updateDynamic("defaultIndeterminate")(defaultIndeterminate)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(fitted)) __obj.updateDynamic("fitted")(fitted)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction2(onMouseUp))
    if (!js.isUndefined(radio)) __obj.updateDynamic("radio")(radio)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(slider)) __obj.updateDynamic("slider")(slider)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioProps]
  }
}

