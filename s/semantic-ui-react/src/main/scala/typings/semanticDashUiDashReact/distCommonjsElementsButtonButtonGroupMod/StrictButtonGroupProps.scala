package typings.semanticDashUiDashReact.distCommonjsElementsButtonButtonGroupMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsElementsButtonButtonMod.ButtonProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticCOLORS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticFLOATS
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticSIZES
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.bottom
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictButtonGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Groups can be attached to other content. */
  var attached: js.UndefOr[Boolean | left | right | top | bottom] = js.undefined
  /** Groups can be less pronounced. */
  var basic: js.UndefOr[Boolean] = js.undefined
  /** Array of shorthand Button values. */
  var buttons: js.UndefOr[SemanticShorthandCollection[ButtonProps]] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Groups can have a shared color. */
  var color: js.UndefOr[SemanticCOLORS] = js.undefined
  /** Groups can reduce their padding to fit into tighter spaces. */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Groups can be aligned to the left or right of its container. */
  var floated: js.UndefOr[SemanticFLOATS] = js.undefined
  /** Groups can take the width of their container. */
  var fluid: js.UndefOr[Boolean] = js.undefined
  /** Groups can be formatted as icons. */
  var icon: js.UndefOr[Boolean] = js.undefined
  /** Groups can be formatted to appear on dark backgrounds. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Groups can be formatted as labeled icon buttons. */
  var labeled: js.UndefOr[Boolean] = js.undefined
  /** Groups can hint towards a negative consequence. */
  var negative: js.UndefOr[Boolean] = js.undefined
  /** Groups can hint towards a positive consequence. */
  var positive: js.UndefOr[Boolean] = js.undefined
  /** Groups can be formatted to show different levels of emphasis. */
  var primary: js.UndefOr[Boolean] = js.undefined
  /** Groups can be formatted to show different levels of emphasis. */
  var secondary: js.UndefOr[Boolean] = js.undefined
  /** Groups can have different sizes. */
  var size: js.UndefOr[SemanticSIZES] = js.undefined
  /** Groups can be formatted to toggle on and off. */
  var toggle: js.UndefOr[Boolean] = js.undefined
  /** Groups can be formatted to appear vertically. */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /** Groups can have their widths divided evenly. */
  var widths: js.UndefOr[SemanticWIDTHS] = js.undefined
}

object StrictButtonGroupProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    attached: Boolean | left | right | top | bottom = null,
    basic: js.UndefOr[Boolean] = js.undefined,
    buttons: SemanticShorthandCollection[ButtonProps] = null,
    children: ReactNode = null,
    className: String = null,
    color: SemanticCOLORS = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    content: SemanticShorthandContent = null,
    floated: SemanticFLOATS = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[Boolean] = js.undefined,
    inverted: js.UndefOr[Boolean] = js.undefined,
    labeled: js.UndefOr[Boolean] = js.undefined,
    negative: js.UndefOr[Boolean] = js.undefined,
    positive: js.UndefOr[Boolean] = js.undefined,
    primary: js.UndefOr[Boolean] = js.undefined,
    secondary: js.UndefOr[Boolean] = js.undefined,
    size: SemanticSIZES = null,
    toggle: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    widths: SemanticWIDTHS = null
  ): StrictButtonGroupProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic)
    if (buttons != null) __obj.updateDynamic("buttons")(buttons)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated)
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (!js.isUndefined(labeled)) __obj.updateDynamic("labeled")(labeled)
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative)
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[StrictButtonGroupProps]
  }
}

