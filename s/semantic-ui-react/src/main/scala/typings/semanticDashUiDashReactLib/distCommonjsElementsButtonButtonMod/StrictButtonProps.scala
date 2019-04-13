package typings
package semanticDashUiDashReactLib.distCommonjsElementsButtonButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictButtonProps extends js.Object {
  /** A button can show it is currently the active user selection. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** A button can animate to show hidden content. */
  var animated: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.fade | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vertical
  ] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A button can be attached to other content. */
  var attached: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom
  ] = js.undefined
  /** A basic button is less pronounced. */
  var basic: js.UndefOr[scala.Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** A button can be circular. */
  var circular: js.UndefOr[scala.Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A button can have different colors. */
  var color: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.facebook | (semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.`google plus`) | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vk | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.twitter | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.linkedin | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.instagram | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.youtube
  ] = js.undefined
  /** A button can reduce its padding to fit into tighter spaces. */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A button can show it is currently unable to be interacted with. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** A button can be aligned to the left or right of its container. */
  var floated: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticFLOATS] = js.undefined
  /** A button can take the width of its container. */
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  /** Add an Icon by name, props object, or pass an <Icon />. */
  var icon: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsIconIconMod.IconProps]
  ] = js.undefined
  /** A button can be formatted to appear on dark backgrounds. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** Add a Label by text, props object, or pass a <Label />. */
  var label: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsElementsLabelLabelMod.LabelProps]
  ] = js.undefined
  /** A labeled button can format a Label or Icon to appear on the left or right. */
  var labelPosition: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left
  ] = js.undefined
  /** A button can show a loading indicator. */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /** A button can hint towards a negative consequence. */
  var negative: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called after user's click.
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, reactLib.NativeMouseEvent], 
      /* data */ ButtonProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A button can hint towards a positive consequence. */
  var positive: js.UndefOr[scala.Boolean] = js.undefined
  /** A button can be formatted to show different levels of emphasis. */
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  /** The role of the HTML element. */
  var role: js.UndefOr[java.lang.String] = js.undefined
  /** A button can be formatted to show different levels of emphasis. */
  var secondary: js.UndefOr[scala.Boolean] = js.undefined
  /** A button can have different sizes. */
  var size: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES] = js.undefined
  /** A button can receive focus. */
  var tabIndex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** A button can be formatted to toggle on and off. */
  var toggle: js.UndefOr[scala.Boolean] = js.undefined
}

object StrictButtonProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    animated: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.fade | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.vertical = null,
    as: js.Any = null,
    attached: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom = null,
    basic: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
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
    onClick: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, reactLib.NativeMouseEvent], /* data */ ButtonProps) => scala.Unit = null,
    positive: js.UndefOr[scala.Boolean] = js.undefined,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    size: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES = null,
    tabIndex: scala.Double | java.lang.String = null,
    toggle: js.UndefOr[scala.Boolean] = js.undefined
  ): StrictButtonProps = {
    val __obj = js.Dynamic.literal()
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
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (role != null) __obj.updateDynamic("role")(role)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (size != null) __obj.updateDynamic("size")(size)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[StrictButtonProps]
  }
}

