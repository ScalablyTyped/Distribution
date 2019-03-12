package typings
package semanticDashUiDashReactLib.distCommonjsModulesCheckboxCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictCheckboxProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Whether or not checkbox is checked. */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** The initial value of checked. */
  var defaultChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not checkbox is indeterminate. */
  var defaultIndeterminate: js.UndefOr[scala.Boolean] = js.undefined
  /** A checkbox can appear disabled and be unable to change states */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Removes padding for a label. Auto applied when there is no label. */
  var fitted: js.UndefOr[scala.Boolean] = js.undefined
  /** A unique identifier. */
  var id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Whether or not checkbox is indeterminate. */
  var indeterminate: js.UndefOr[scala.Boolean] = js.undefined
  /** The text of the associated label element. */
  var label: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlLabelProps]
  ] = js.undefined
  /** The HTML input name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Called when the user attempts to change the checked state.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed checked/indeterminate state.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[stdLib.HTMLInputElement], 
      /* data */ CheckboxProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when the checkbox or label is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and current checked/indeterminate state.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      /* data */ CheckboxProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when the user presses down on the mouse.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and current checked/indeterminate state.
    */
  var onMouseDown: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      /* data */ CheckboxProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called when the user releases the mouse.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and current checked/indeterminate state.
    */
  var onMouseUp: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      /* data */ CheckboxProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** Format as a radio element. This means it is an exclusive option. */
  var radio: js.UndefOr[scala.Boolean] = js.undefined
  /** A checkbox can be read-only and unable to change states. */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Format to emphasize the current selection state. */
  var slider: js.UndefOr[scala.Boolean] = js.undefined
  /** A checkbox can receive focus. */
  var tabIndex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Format to show an on or off choice. */
  var toggle: js.UndefOr[scala.Boolean] = js.undefined
  /** HTML input type, either checkbox or radio. */
  var `type`: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.checkbox | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.radio
  ] = js.undefined
  /** The HTML input value. */
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object StrictCheckboxProps {
  @scala.inline
  def apply(
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
    onChange: (/* event */ reactLib.reactMod.ReactNs.FormEvent[stdLib.HTMLInputElement], /* data */ CheckboxProps) => scala.Unit = null,
    onClick: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLInputElement, reactLib.NativeMouseEvent], /* data */ CheckboxProps) => scala.Unit = null,
    onMouseDown: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLInputElement, reactLib.NativeMouseEvent], /* data */ CheckboxProps) => scala.Unit = null,
    onMouseUp: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLInputElement, reactLib.NativeMouseEvent], /* data */ CheckboxProps) => scala.Unit = null,
    radio: js.UndefOr[scala.Boolean] = js.undefined,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    slider: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Double | java.lang.String = null,
    toggle: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.checkbox | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.radio = null,
    value: scala.Double | java.lang.String = null
  ): StrictCheckboxProps = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[StrictCheckboxProps]
  }
}

