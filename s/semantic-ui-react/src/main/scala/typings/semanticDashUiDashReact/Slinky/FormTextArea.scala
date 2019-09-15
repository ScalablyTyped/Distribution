package typings.semanticDashUiDashReact.Slinky

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.react.reactMod.FormEvent
import typings.semanticDashUiDashReact.distCommonjsAddonsTextAreaTextAreaMod.TextAreaProps
import typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormTextAreaMod.FormTextAreaProps
import typings.semanticDashUiDashReact.distCommonjsElementsLabelLabelMod.LabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.HtmlLabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: children, className, disabled, type, value */
object FormTextArea
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  override val component: String | js.Object = typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormTextAreaMod.^.default.asInstanceOf[String | js.Object]
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    content: SemanticShorthandContent = null,
    control: js.Any = null,
    error: Boolean | SemanticShorthandItem[LabelProps] = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    label: SemanticShorthandItem[HtmlLabelProps] = null,
    onChange: (/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps) => Unit = null,
    onInput: (/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps) => Unit = null,
    required: js.Any = null,
    rows: Double | String = null,
    width: SemanticWIDTHS = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction2(onInput))
    if (required != null) __obj.updateDynamic("required")(required)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FormTextAreaProps
}

