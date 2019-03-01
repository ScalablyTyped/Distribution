package typings
package semanticDashUiDashReactLib.distCommonjsElementsButtonButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps
  extends StrictButtonProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object ButtonProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    animated: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.fade | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vertical = null,
    as: js.Any = null,
    attached: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom = null,
    basic: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    circular: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.facebook | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`google plus`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vk | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.twitter | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.linkedin | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.instagram | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.youtube = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    floated: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticFLOATS = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    icon: scala.Boolean | semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconProps] = null,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    label: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps] = null,
    labelPosition: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left = null,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    negative: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLButtonElement, reactLib.NativeMouseEvent], 
      /* data */ ButtonProps, 
      scala.Unit
    ] = null,
    positive: js.UndefOr[scala.Boolean] = js.undefined,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    size: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES = null,
    tabIndex: scala.Double | java.lang.String = null,
    toggle: js.UndefOr[scala.Boolean] = js.undefined
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (animated != null) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(circular)) __obj.updateDynamic("circular")(circular)
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (floated != null) __obj.updateDynamic("floated")(floated)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelPosition != null) __obj.updateDynamic("labelPosition")(labelPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (role != null) __obj.updateDynamic("role")(role)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[ButtonProps]
  }
}

