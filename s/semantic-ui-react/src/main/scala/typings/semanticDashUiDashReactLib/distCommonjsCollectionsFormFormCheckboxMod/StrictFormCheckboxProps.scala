package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsFormFormCheckboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- semanticDashUiDashReactLib.distCommonjsModulesCheckboxCheckboxMod.StrictCheckboxProps because var conflicts: as, className, disabled, label, `type`. Inlined checked, defaultChecked, defaultIndeterminate, fitted, id, indeterminate, name, onChange, onClick, onMouseDown, onMouseUp, radio, readOnly, slider, tabIndex, toggle, value */ trait StrictFormCheckboxProps
  extends semanticDashUiDashReactLib.distCommonjsCollectionsFormFormFieldMod.StrictFormFieldProps {
  /** Whether or not checkbox is checked. */
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  /** The initial value of checked. */
  var defaultChecked: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not checkbox is indeterminate. */
  var defaultIndeterminate: js.UndefOr[scala.Boolean] = js.undefined
  /** Removes padding for a label. Auto applied when there is no label. */
  var fitted: js.UndefOr[scala.Boolean] = js.undefined
  /** A unique identifier. */
  var id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Whether or not checkbox is indeterminate. */
  var indeterminate: js.UndefOr[scala.Boolean] = js.undefined
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
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLInputElement], 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesCheckboxCheckboxMod.CheckboxProps, 
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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesCheckboxCheckboxMod.CheckboxProps, 
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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesCheckboxCheckboxMod.CheckboxProps, 
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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsModulesCheckboxCheckboxMod.CheckboxProps, 
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
  @JSName("type")
  var type_StrictFormCheckboxProps: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.checkbox | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.radio
  ] = js.undefined
  /** The HTML input value. */
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object StrictFormCheckboxProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    control: js.Any = null,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    defaultIndeterminate: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    fitted: js.UndefOr[scala.Boolean] = js.undefined,
    id: scala.Double | java.lang.String = null,
    indeterminate: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
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
    required: js.Any = null,
    slider: js.UndefOr[scala.Boolean] = js.undefined,
    tabIndex: scala.Double | java.lang.String = null,
    toggle: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.checkbox | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.radio = null,
    value: scala.Double | java.lang.String = null,
    width: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null
  ): StrictFormCheckboxProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(defaultIndeterminate)) __obj.updateDynamic("defaultIndeterminate")(defaultIndeterminate)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(fitted)) __obj.updateDynamic("fitted")(fitted)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (!js.isUndefined(radio)) __obj.updateDynamic("radio")(radio)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (required != null) __obj.updateDynamic("required")(required)
    if (!js.isUndefined(slider)) __obj.updateDynamic("slider")(slider)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[StrictFormCheckboxProps]
  }
}

