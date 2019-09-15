package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.reactMod.ChangeEvent
import typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormInputMod.FormInputProps
import typings.semanticDashUiDashReact.distCommonjsElementsInputInputMod.InputOnChangeData
import typings.semanticDashUiDashReact.distCommonjsElementsInputInputMod.InputProps
import typings.semanticDashUiDashReact.distCommonjsElementsLabelLabelMod.LabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.HtmlInputrops
import typings.semanticDashUiDashReact.distCommonjsGenericMod.HtmlLabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
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

/* The following DOM/SVG props were specified: children, className, disabled, type */
object FormInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormInputMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    action: js.Any | Boolean = null,
    actionPosition: left = null,
    as: js.Any = null,
    content: SemanticShorthandContent = null,
    control: js.Any = null,
    error: Boolean | SemanticShorthandItem[LabelProps] = null,
    error_StrictFormInputProps: js.Any = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    focus: js.UndefOr[Boolean] = js.undefined,
    icon: js.Any | SemanticShorthandItem[InputProps] = null,
    iconPosition: left = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    input: SemanticShorthandItem[HtmlInputrops] = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: SemanticShorthandItem[HtmlLabelProps] = null,
    labelPosition: left | right | (`left corner`) | (`right corner`) = null,
    label_StrictFormInputProps: SemanticShorthandItem[LabelProps] = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* event */ ChangeEvent[HTMLInputElement], /* data */ InputOnChangeData) => Unit = null,
    required: js.Any = null,
    size: mini | small | large | big | huge | massive = null,
    tabIndex: Double | String = null,
    transparent: js.UndefOr[Boolean] = js.undefined,
    width: SemanticWIDTHS = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (actionPosition != null) __obj.updateDynamic("actionPosition")(actionPosition)
    if (as != null) __obj.updateDynamic("as")(as)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (error_StrictFormInputProps != null) __obj.updateDynamic("error")(error_StrictFormInputProps)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconPosition != null) __obj.updateDynamic("iconPosition")(iconPosition)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (label_StrictFormInputProps != null) __obj.updateDynamic("label")(label_StrictFormInputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (required != null) __obj.updateDynamic("required")(required)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (width != null) __obj.updateDynamic("width")(width)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FormInputProps
}

