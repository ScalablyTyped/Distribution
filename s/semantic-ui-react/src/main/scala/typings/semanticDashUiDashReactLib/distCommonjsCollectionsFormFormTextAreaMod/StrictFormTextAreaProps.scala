package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsFormFormTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- semanticDashUiDashReactLib.distCommonjsAddonsTextAreaTextAreaMod.StrictTextAreaProps because var conflicts: as. Inlined autoHeight, onChange, onInput, rows, style, value */ trait StrictFormTextAreaProps
  extends semanticDashUiDashReactLib.distCommonjsCollectionsFormFormFieldMod.StrictFormFieldProps {
  /** Indicates whether height of the textarea fits the content or not. */
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called on change.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLTextAreaElement], 
      /* data */ semanticDashUiDashReactLib.distCommonjsAddonsTextAreaTextAreaMod.TextAreaProps, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Called on input.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  var onInput: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLTextAreaElement], 
      /* data */ semanticDashUiDashReactLib.distCommonjsAddonsTextAreaTextAreaMod.TextAreaProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** Indicates row count for a TextArea. */
  var rows: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Custom TextArea style. */
  var style: js.UndefOr[js.Object] = js.undefined
  /** The value of the textarea. */
  var value: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object StrictFormTextAreaProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    control: js.Any = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    label: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlLabelProps] = null,
    onChange: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLTextAreaElement], 
      /* data */ semanticDashUiDashReactLib.distCommonjsAddonsTextAreaTextAreaMod.TextAreaProps, 
      scala.Unit
    ] = null,
    onInput: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLTextAreaElement], 
      /* data */ semanticDashUiDashReactLib.distCommonjsAddonsTextAreaTextAreaMod.TextAreaProps, 
      scala.Unit
    ] = null,
    required: js.Any = null,
    rows: scala.Double | java.lang.String = null,
    style: js.Object = null,
    `type`: java.lang.String = null,
    value: scala.Double | java.lang.String = null,
    width: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null
  ): StrictFormTextAreaProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (control != null) __obj.updateDynamic("control")(control)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onInput != null) __obj.updateDynamic("onInput")(onInput)
    if (required != null) __obj.updateDynamic("required")(required)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[StrictFormTextAreaProps]
  }
}

