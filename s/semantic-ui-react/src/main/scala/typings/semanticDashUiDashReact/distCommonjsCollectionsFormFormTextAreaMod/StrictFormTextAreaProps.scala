package typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormTextAreaMod

import typings.react.reactMod.FormEvent
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsAddonsTextAreaTextAreaMod.TextAreaProps
import typings.semanticDashUiDashReact.distCommonjsCollectionsFormFormFieldMod.StrictFormFieldProps
import typings.semanticDashUiDashReact.distCommonjsElementsLabelLabelMod.LabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.HtmlLabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.semanticDashUiDashReact.distCommonjsAddonsTextAreaTextAreaMod.StrictTextAreaProps because var conflicts: as. Inlined onChange, onInput, rows, value */ trait StrictFormTextAreaProps extends StrictFormFieldProps {
  /**
    * Called on change.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  var onChange: js.UndefOr[
    js.Function2[/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps, Unit]
  ] = js.undefined
  /**
    * Called on input.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  var onInput: js.UndefOr[
    js.Function2[/* event */ FormEvent[HTMLTextAreaElement], /* data */ TextAreaProps, Unit]
  ] = js.undefined
  /** Indicates row count for a TextArea. */
  var rows: js.UndefOr[Double | String] = js.undefined
  /** The value of the textarea. */
  var value: js.UndefOr[Double | String] = js.undefined
}

object StrictFormTextAreaProps {
  @scala.inline
  def apply(
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
  ): StrictFormTextAreaProps = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[StrictFormTextAreaProps]
  }
}

