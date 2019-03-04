package typings
package semanticDashUiDashReactLib.distCommonjsElementsInputInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputOnChangeData extends InputProps {
  var value: java.lang.String
}

object InputOnChangeData {
  @scala.inline
  def apply(
    value: java.lang.String,
    action: js.Any | scala.Boolean = null,
    actionPosition: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    icon: js.Any | semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[InputProps] = null,
    iconPosition: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left = null,
    input: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlInputrops] = null,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    label: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps] = null,
    labelPosition: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`left corner`) | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`right corner`) = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement], 
      /* data */ InputOnChangeData, 
      scala.Unit
    ] = null,
    size: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES = null,
    tabIndex: scala.Double | java.lang.String = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): InputOnChangeData = {
    val __obj = js.Dynamic.literal(value = value)
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
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InputOnChangeData]
  }
}

