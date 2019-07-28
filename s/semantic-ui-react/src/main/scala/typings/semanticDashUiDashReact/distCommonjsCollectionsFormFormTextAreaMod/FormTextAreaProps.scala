package typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormTextAreaMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.FormEvent
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsAddonsTextAreaTextAreaMod.TextAreaProps
import typings.semanticDashUiDashReact.distCommonjsElementsLabelLabelMod.LabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.HtmlLabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormTextAreaProps
  extends StrictFormTextAreaProps
     with /* key */ StringDictionary[js.Any]

object FormTextAreaProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    control: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: Boolean | SemanticShorthandItem[LabelProps] = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    label: SemanticShorthandItem[HtmlLabelProps] = null,
    onChange: (/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps) => Unit = null,
    onInput: (/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps) => Unit = null,
    required: js.Any = null,
    rows: Double | String = null,
    `type`: String = null,
    value: Double | String = null,
    width: SemanticWIDTHS = null
  ): FormTextAreaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction2(onInput))
    if (required != null) __obj.updateDynamic("required")(required)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[FormTextAreaProps]
  }
}

