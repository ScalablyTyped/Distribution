package typings
package semanticDashUiDashReactLib.distCommonjsAddonsRadioRadioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioProps
  extends StrictRadioProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object RadioProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    defaultIndeterminate: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    fitted: js.UndefOr[scala.Boolean] = js.undefined,
    id: scala.Double | java.lang.String = null,
    indeterminate: js.UndefOr[scala.Boolean] = js.undefined,
    label: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlLabelProps] = null,
    name: java.lang.String = null,
    onChange: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLInputElement], 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesCheckboxCheckboxMod.CheckboxProps, 
      scala.Unit
    ] = null,
    onClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesCheckboxCheckboxMod.CheckboxProps, 
      scala.Unit
    ] = null,
    onMouseDown: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesCheckboxCheckboxMod.CheckboxProps, 
      scala.Unit
    ] = null,
    onMouseUp: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesCheckboxCheckboxMod.CheckboxProps, 
      scala.Unit
    ] = null,
    radio: js.UndefOr[scala.Boolean] = js.undefined,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    slider: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Double | java.lang.String = null,
    toggle: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.checkbox | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.radio = null,
    value: scala.Double | java.lang.String = null
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
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
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

