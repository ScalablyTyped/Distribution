package typings.semanticDashUiDashReact.distCommonjsElementsInputInputMod

import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsElementsLabelLabelMod.LabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.HtmlInputrops
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`left corner`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`right corner`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.big
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.huge
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.large
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.massive
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.mini
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.small
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictInputProps extends js.Object {
  /** An Input can be formatted to alert the user to an action they may perform. */
  var action: js.UndefOr[js.Any | Boolean] = js.undefined
  /** An action can appear along side an Input on the left or right. */
  var actionPosition: js.UndefOr[left] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** An Input field can show that it is disabled. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** An Input field can show the data contains errors. */
  var error: js.UndefOr[Boolean] = js.undefined
  /** Take on the size of its container. */
  var fluid: js.UndefOr[Boolean] = js.undefined
  /** An Input field can show a user is currently interacting with it. */
  var focus: js.UndefOr[Boolean] = js.undefined
  /** Optional Icon to display inside the Input. */
  var icon: js.UndefOr[js.Any | SemanticShorthandItem[InputProps]] = js.undefined
  /** An Icon can appear inside an Input on the left. */
  var iconPosition: js.UndefOr[left] = js.undefined
  /** Shorthand for creating the HTML Input. */
  var input: js.UndefOr[SemanticShorthandItem[HtmlInputrops]] = js.undefined
  /** Format to appear on dark backgrounds. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Optional Label to display along side the Input. */
  var label: js.UndefOr[SemanticShorthandItem[LabelProps]] = js.undefined
  /** A Label can appear outside an Input on the left or right. */
  var labelPosition: js.UndefOr[left | right | (`left corner`) | (`right corner`)] = js.undefined
  /** An Icon Input field can show that it is currently loading data. */
  var loading: js.UndefOr[Boolean] = js.undefined
  /**
    * Called on change.
    *
    * @param {ChangeEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props and a proposed value.
    */
  var onChange: js.UndefOr[
    js.Function2[/* event */ ChangeEvent[HTMLInputElement], /* data */ InputOnChangeData, Unit]
  ] = js.undefined
  /** An Input can vary in size. */
  var size: js.UndefOr[mini | small | large | big | huge | massive] = js.undefined
  /** An Input can receive focus. */
  var tabIndex: js.UndefOr[Double | String] = js.undefined
  /** Transparent Input has no background. */
  var transparent: js.UndefOr[Boolean] = js.undefined
  /** The HTML input type. */
  var `type`: js.UndefOr[String] = js.undefined
}

object StrictInputProps {
  @scala.inline
  def apply(
    action: js.Any | Boolean = null,
    actionPosition: left = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    fluid: js.UndefOr[Boolean] = js.undefined,
    focus: js.UndefOr[Boolean] = js.undefined,
    icon: js.Any | SemanticShorthandItem[InputProps] = null,
    iconPosition: left = null,
    input: SemanticShorthandItem[HtmlInputrops] = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: SemanticShorthandItem[LabelProps] = null,
    labelPosition: left | right | (`left corner`) | (`right corner`) = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* event */ ChangeEvent[HTMLInputElement], /* data */ InputOnChangeData) => Unit = null,
    size: mini | small | large | big | huge | massive = null,
    tabIndex: Double | String = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): StrictInputProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconPosition != null) __obj.updateDynamic("iconPosition")(iconPosition)
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[StrictInputProps]
  }
}

