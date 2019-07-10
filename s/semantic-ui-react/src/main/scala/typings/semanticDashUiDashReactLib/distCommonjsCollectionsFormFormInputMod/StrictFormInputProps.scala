package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsFormFormInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- semanticDashUiDashReactLib.distCommonjsElementsInputInputMod.StrictInputProps because var conflicts: as, children, className, disabled, error, label, `type`. Inlined action, actionPosition, fluid, focus, icon, iconPosition, input, inverted, labelPosition, loading, onChange, size, tabIndex, transparent */ trait StrictFormInputProps
  extends semanticDashUiDashReactLib.distCommonjsCollectionsFormFormFieldMod.StrictFormFieldProps {
  /** An Input can be formatted to alert the user to an action they may perform. */
  var action: js.UndefOr[js.Any | scala.Boolean] = js.undefined
  /** An action can appear along side an Input on the left or right. */
  var actionPosition: js.UndefOr[semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left] = js.undefined
  /** Individual fields may display an error state along with a message. */
  @JSName("error")
  var error_StrictFormInputProps: js.UndefOr[js.Any] = js.undefined
  /** Take on the size of its container. */
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  /** An Input field can show a user is currently interacting with it. */
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional Icon to display inside the Input. */
  var icon: js.UndefOr[
    js.Any | semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsInputInputMod.InputProps]
  ] = js.undefined
  /** An Icon can appear inside an Input on the left. */
  var iconPosition: js.UndefOr[semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left] = js.undefined
  /** Shorthand for creating the HTML Input. */
  var input: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlInputrops]
  ] = js.undefined
  /** Format to appear on dark backgrounds. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** A Label can appear outside an Input on the left or right. */
  var labelPosition: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`left corner`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`right corner`)
  ] = js.undefined
  /** Shorthand for a Label. */
  @JSName("label")
  var label_StrictFormInputProps: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps]
  ] = js.undefined
  /** An Icon Input field can show that it is currently loading data. */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called on change.
    *
    * @param {ChangeEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and a proposed value.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement], 
      /* data */ semanticDashUiDashReactLib.distCommonjsElementsInputInputMod.InputOnChangeData, 
      scala.Unit
    ]
  ] = js.undefined
  /** An Input can vary in size. */
  var size: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.big | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.massive
  ] = js.undefined
  /** An Input can receive focus. */
  var tabIndex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Transparent Input has no background. */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictFormInputProps {
  @scala.inline
  def apply(
    action: js.Any | scala.Boolean = null,
    actionPosition: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    control: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.Any = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    icon: js.Any | semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsInputInputMod.InputProps] = null,
    iconPosition: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    input: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlInputrops] = null,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    label: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps] = null,
    labelPosition: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`left corner`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`right corner`) = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: (/* event */ reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement], /* data */ semanticDashUiDashReactLib.distCommonjsElementsInputInputMod.InputOnChangeData) => scala.Unit = null,
    required: js.Any = null,
    size: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.big | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.massive = null,
    tabIndex: scala.Double | java.lang.String = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    width: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null
  ): StrictFormInputProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconPosition != null) __obj.updateDynamic("iconPosition")(iconPosition)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (required != null) __obj.updateDynamic("required")(required)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[StrictFormInputProps]
  }
}

