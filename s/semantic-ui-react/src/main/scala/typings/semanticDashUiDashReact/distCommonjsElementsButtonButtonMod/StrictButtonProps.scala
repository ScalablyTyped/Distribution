package typings.semanticDashUiDashReact.distCommonjsElementsButtonButtonMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsElementsIconIconMod.IconProps
import typings.semanticDashUiDashReact.distCommonjsElementsLabelLabelMod.LabelProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticSIZES
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.`google plus`
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.facebook
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.fade
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.instagram
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.linkedin
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.twitter
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.vertical
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.vk
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.youtube
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictButtonProps extends js.Object {
  /** A button can show it is currently the active user selection. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** A button can animate to show hidden content. */
  var animated: js.UndefOr[Boolean | fade | vertical] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A button can be attached to other content. */
  var attached: js.UndefOr[Boolean | left | right | top | bottom] = js.undefined
  /** A basic button is less pronounced. */
  var basic: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** A button can be circular. */
  var circular: js.UndefOr[Boolean] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** A button can have different colors. */
  var color: js.UndefOr[
    SemanticCOLORS | facebook | (`google plus`) | vk | twitter | linkedin | instagram | youtube
  ] = js.undefined
  /** A button can reduce its padding to fit into tighter spaces. */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** A button can show it is currently unable to be interacted with. */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** A button can be aligned to the left or right of its container. */
  var floated: js.UndefOr[SemanticFLOATS] = js.undefined
  /** A button can take the width of its container. */
  var fluid: js.UndefOr[Boolean] = js.undefined
  /** Add an Icon by name, props object, or pass an <Icon />. */
  var icon: js.UndefOr[Boolean | SemanticShorthandItem[IconProps]] = js.undefined
  /** A button can be formatted to appear on dark backgrounds. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Add a Label by text, props object, or pass a <Label />. */
  var label: js.UndefOr[SemanticShorthandItem[LabelProps]] = js.undefined
  /** A labeled button can format a Label or Icon to appear on the left or right. */
  var labelPosition: js.UndefOr[right | left] = js.undefined
  /** A button can show a loading indicator. */
  var loading: js.UndefOr[Boolean] = js.undefined
  /** A button can hint towards a negative consequence. */
  var negative: js.UndefOr[Boolean] = js.undefined
  /**
    * Called after user's click.
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], 
      /* data */ ButtonProps, 
      Unit
    ]
  ] = js.undefined
  /** A button can hint towards a positive consequence. */
  var positive: js.UndefOr[Boolean] = js.undefined
  /** A button can be formatted to show different levels of emphasis. */
  var primary: js.UndefOr[Boolean] = js.undefined
  /** The role of the HTML element. */
  var role: js.UndefOr[String] = js.undefined
  /** A button can be formatted to show different levels of emphasis. */
  var secondary: js.UndefOr[Boolean] = js.undefined
  /** A button can have different sizes. */
  var size: js.UndefOr[SemanticSIZES] = js.undefined
  /** A button can receive focus. */
  var tabIndex: js.UndefOr[Double | String] = js.undefined
  /** A button can be formatted to toggle on and off. */
  var toggle: js.UndefOr[Boolean] = js.undefined
}

object StrictButtonProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    animated: Boolean | fade | vertical = null,
    as: js.Any = null,
    attached: Boolean | left | right | top | bottom = null,
    basic: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    circular: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: SemanticCOLORS | facebook | (`google plus`) | vk | twitter | linkedin | instagram | youtube = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    floated: SemanticFLOATS = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    icon: Boolean | SemanticShorthandItem[IconProps] = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    label: SemanticShorthandItem[LabelProps] = null,
    labelPosition: right | left = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    negative: js.UndefOr[Boolean] = js.undefined,
    onClick: (/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], /* data */ ButtonProps) => Unit = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[Boolean] = js.undefined,
    role: String = null,
    secondary: js.UndefOr[Boolean] = js.undefined,
    size: SemanticSIZES = null,
    tabIndex: Double | String = null,
    toggle: js.UndefOr[Boolean] = js.undefined
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

