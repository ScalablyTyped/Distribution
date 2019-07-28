package typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormCheckboxMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.FormEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormFieldMod.StrictFormFieldProps
import typings.semanticDashUiDashReact.distCommonjsElementsLabelLabelMod.LabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.HtmlLabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.semanticDashUiDashReact.distCommonjsModulesCheckboxCheckboxMod.CheckboxProps
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.checkbox
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.radio
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.semanticDashUiDashReact.distCommonjsModulesCheckboxCheckboxMod.StrictCheckboxProps because var conflicts: as, className, disabled, label, `type`. Inlined checked, defaultChecked, defaultIndeterminate, fitted, id, indeterminate, name, onChange, onClick, onMouseDown, onMouseUp, radio, readOnly, slider, tabIndex, toggle, value */ trait StrictFormCheckboxProps extends StrictFormFieldProps {
  /** Whether or not checkbox is checked. */
  var checked: js.UndefOr[Boolean] = js.undefined
  /** The initial value of checked. */
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  /** Whether or not checkbox is indeterminate. */
  var defaultIndeterminate: js.UndefOr[Boolean] = js.undefined
  /** Removes padding for a label. Auto applied when there is no label. */
  var fitted: js.UndefOr[Boolean] = js.undefined
  /** A unique identifier. */
  var id: js.UndefOr[Double | String] = js.undefined
  /** Whether or not checkbox is indeterminate. */
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  /** The HTML input name. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Called when the user attempts to change the checked state.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and proposed checked/indeterminate state.
    */
  var onChange: js.UndefOr[
    js.Function2[/* event */ FormEvent[HTMLInputElement], /* data */ CheckboxProps, Unit]
  ] = js.undefined
  /**
    * Called when the checkbox or label is clicked.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and current checked/indeterminate state.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], 
      /* data */ CheckboxProps, 
      Unit
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
      /* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], 
      /* data */ CheckboxProps, 
      Unit
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
      /* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], 
      /* data */ CheckboxProps, 
      Unit
    ]
  ] = js.undefined
  /** Format as a radio element. This means it is an exclusive option. */
  var radio: js.UndefOr[Boolean] = js.undefined
  /** A checkbox can be read-only and unable to change states. */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Format to emphasize the current selection state. */
  var slider: js.UndefOr[Boolean] = js.undefined
  /** A checkbox can receive focus. */
  var tabIndex: js.UndefOr[Double | String] = js.undefined
  /** Format to show an on or off choice. */
  var toggle: js.UndefOr[Boolean] = js.undefined
  /** HTML input type, either checkbox or radio. */
  @JSName("type")
  var type_StrictFormCheckboxProps: js.UndefOr[checkbox | radio] = js.undefined
  /** The HTML input value. */
  var value: js.UndefOr[Double | String] = js.undefined
}

object StrictFormCheckboxProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    control: js.Any = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultIndeterminate: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: Boolean | SemanticShorthandItem[LabelProps] = null,
    fitted: js.UndefOr[Boolean] = js.undefined,
    id: Double | String = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    label: SemanticShorthandItem[HtmlLabelProps] = null,
    name: String = null,
    onChange: (/* event */ FormEvent[HTMLInputElement], /* data */ CheckboxProps) => Unit = null,
    onClick: (/* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], /* data */ CheckboxProps) => Unit = null,
    onMouseDown: (/* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], /* data */ CheckboxProps) => Unit = null,
    onMouseUp: (/* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], /* data */ CheckboxProps) => Unit = null,
    radio: js.UndefOr[Boolean] = js.undefined,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    required: js.Any = null,
    slider: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Double | String = null,
    toggle: js.UndefOr[Boolean] = js.undefined,
    `type`: checkbox | radio = null,
    value: Double | String = null,
    width: SemanticWIDTHS = null
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
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(fitted)) __obj.updateDynamic("fitted")(fitted)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction2(onMouseUp))
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

