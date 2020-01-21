package typings.semanticUiReact.menuMenuMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.menuItemMod.MenuItemProps
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.labeled
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictMenuProps extends js.Object {
  /** Index of the currently active item. */
  var activeIndex: js.UndefOr[Double | String] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A menu may be attached to other content segments. */
  var attached: js.UndefOr[Boolean | bottom | top] = js.undefined
  /** A menu item or menu can have no borders. */
  var borderless: js.UndefOr[Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Additional colors can be specified. */
  var color: js.UndefOr[SemanticCOLORS] = js.undefined
  /** A menu can take up only the space necessary to fit its content. */
  var compact: js.UndefOr[Boolean] = js.undefined
  /** Initial activeIndex value. */
  var defaultActiveIndex: js.UndefOr[Double | String] = js.undefined
  /** A menu can be fixed to a side of its context. */
  var fixed: js.UndefOr[left | right | bottom | top] = js.undefined
  /** A menu can be floated. */
  var floated: js.UndefOr[Boolean | right] = js.undefined
  /** A vertical menu may take the size of its container. */
  var fluid: js.UndefOr[Boolean] = js.undefined
  /** A menu may have labeled icons. */
  var icon: js.UndefOr[Boolean | labeled] = js.undefined
  /** A menu may have its colors inverted to show greater contrast. */
  var inverted: js.UndefOr[Boolean] = js.undefined
  /** Shorthand array of props for Menu. */
  var items: js.UndefOr[SemanticShorthandCollection[MenuItemProps]] = js.undefined
  /**
    * onClick handler for MenuItem. Mutually exclusive with children.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All item props.
    */
  var onItemClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
      /* data */ MenuItemProps, 
      Unit
    ]
  ] = js.undefined
  /** A pagination menu is specially formatted to present links to pages of content. */
  var pagination: js.UndefOr[Boolean] = js.undefined
  /** A menu can point to show its relationship to nearby content. */
  var pointing: js.UndefOr[Boolean] = js.undefined
  /** A menu can adjust its appearance to de-emphasize its contents. */
  var secondary: js.UndefOr[Boolean] = js.undefined
  /** A menu can vary in size. */
  var size: js.UndefOr[mini | tiny | small | large | huge | massive] = js.undefined
  /** A menu can stack at mobile resolutions. */
  var stackable: js.UndefOr[Boolean] = js.undefined
  /** A menu can be formatted to show tabs of information. */
  var tabular: js.UndefOr[Boolean | right] = js.undefined
  /** A menu can be formatted for text content. */
  var text: js.UndefOr[Boolean] = js.undefined
  /** A vertical menu displays elements vertically. */
  var vertical: js.UndefOr[Boolean] = js.undefined
  /** A menu can have its items divided evenly. */
  var widths: js.UndefOr[SemanticWIDTHS] = js.undefined
}

object StrictMenuProps {
  @scala.inline
  def apply(
    activeIndex: Double | String = null,
    as: js.Any = null,
    attached: Boolean | bottom | top = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    color: SemanticCOLORS = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    defaultActiveIndex: Double | String = null,
    fixed: left | right | bottom | top = null,
    floated: Boolean | right = null,
    fluid: js.UndefOr[Boolean] = js.undefined,
    icon: Boolean | labeled = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[MenuItemProps] = null,
    onItemClick: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ MenuItemProps) => Unit = null,
    pagination: js.UndefOr[Boolean] = js.undefined,
    pointing: js.UndefOr[Boolean] = js.undefined,
    secondary: js.UndefOr[Boolean] = js.undefined,
    size: mini | tiny | small | large | huge | massive = null,
    stackable: js.UndefOr[Boolean] = js.undefined,
    tabular: Boolean | right = null,
    text: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    widths: SemanticWIDTHS = null
  ): StrictMenuProps = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (!js.isUndefined(pointing)) __obj.updateDynamic("pointing")(pointing.asInstanceOf[js.Any])
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(stackable)) __obj.updateDynamic("stackable")(stackable.asInstanceOf[js.Any])
    if (tabular != null) __obj.updateDynamic("tabular")(tabular.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictMenuProps]
  }
}

