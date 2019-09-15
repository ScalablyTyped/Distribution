package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.NativeMouseEvent
import typings.react.reactMod.FormEvent
import typings.react.reactMod.MouseEvent
import typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormRadioMod.FormRadioProps
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

/* The following DOM/SVG props were specified: name, readOnly, checked, className, disabled, defaultChecked, value, children */
object FormRadio
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormRadioMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    content: SemanticShorthandContent = null,
    control: js.Any = null,
    defaultIndeterminate: js.UndefOr[Boolean] = js.undefined,
    error: Boolean | SemanticShorthandItem[LabelProps] = null,
    fitted: js.UndefOr[Boolean] = js.undefined,
    id: Double | String = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    label: SemanticShorthandItem[HtmlLabelProps] = null,
    onChange: (/* event */ FormEvent[HTMLInputElement], /* data */ CheckboxProps) => Unit = null,
    onClick: (/* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], /* data */ CheckboxProps) => Unit = null,
    onMouseDown: (/* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], /* data */ CheckboxProps) => Unit = null,
    onMouseUp: (/* event */ MouseEvent[HTMLInputElement, NativeMouseEvent], /* data */ CheckboxProps) => Unit = null,
    radio: js.UndefOr[Boolean] = js.undefined,
    required: js.Any = null,
    slider: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Double | String = null,
    toggle: js.UndefOr[Boolean] = js.undefined,
    `type`: checkbox | radio = null,
    width: SemanticWIDTHS = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control)
    if (!js.isUndefined(defaultIndeterminate)) __obj.updateDynamic("defaultIndeterminate")(defaultIndeterminate)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(fitted)) __obj.updateDynamic("fitted")(fitted)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction2(onMouseDown))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction2(onMouseUp))
    if (!js.isUndefined(radio)) __obj.updateDynamic("radio")(radio)
    if (required != null) __obj.updateDynamic("required")(required)
    if (!js.isUndefined(slider)) __obj.updateDynamic("slider")(slider)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FormRadioProps
}

