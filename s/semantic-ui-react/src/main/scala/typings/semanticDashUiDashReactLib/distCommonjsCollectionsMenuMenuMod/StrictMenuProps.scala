package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsMenuMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictMenuProps extends js.Object {
  /** Index of the currently active item. */
  var activeIndex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A menu may be attached to other content segments. */
  var attached: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top
  ] = js.undefined
  /** A menu item or menu can have no borders. */
  var borderless: js.UndefOr[scala.Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Additional colors can be specified. */
  var color: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS] = js.undefined
  /** A menu can take up only the space necessary to fit its content. */
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  /** Initial activeIndex value. */
  var defaultActiveIndex: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** A menu can be fixed to a side of its context. */
  var fixed: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top
  ] = js.undefined
  /** A menu can be floated. */
  var floated: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right
  ] = js.undefined
  /** A vertical menu may take the size of its container. */
  var fluid: js.UndefOr[scala.Boolean] = js.undefined
  /** A menu may have labeled icons. */
  var icon: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.labeled
  ] = js.undefined
  /** A menu may have its colors inverted to show greater contrast. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand array of props for Menu. */
  var items: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[semanticDashUiDashReactLib.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps]
  ] = js.undefined
  /**
    * onClick handler for MenuItem. Mutually exclusive with children.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All item props.
    */
  var onItemClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLAnchorElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A pagination menu is specially formatted to present links to pages of content. */
  var pagination: js.UndefOr[scala.Boolean] = js.undefined
  /** A menu can point to show its relationship to nearby content. */
  var pointing: js.UndefOr[scala.Boolean] = js.undefined
  /** A menu can adjust its appearance to de-emphasize its contents. */
  var secondary: js.UndefOr[scala.Boolean] = js.undefined
  /** A menu can vary in size. */
  var size: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.massive
  ] = js.undefined
  /** A menu can stack at mobile resolutions. */
  var stackable: js.UndefOr[scala.Boolean] = js.undefined
  /** A menu can be formatted to show tabs of information. */
  var tabular: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right
  ] = js.undefined
  /** A menu can be formatted for text content. */
  var text: js.UndefOr[scala.Boolean] = js.undefined
  /** A vertical menu displays elements vertically. */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
  /** A menu can have its items divided evenly. */
  var widths: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS] = js.undefined
}

object StrictMenuProps {
  @scala.inline
  def apply(
    activeIndex: scala.Double | java.lang.String = null,
    as: js.Any = null,
    attached: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top = null,
    borderless: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    color: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticCOLORS = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    defaultActiveIndex: scala.Double | java.lang.String = null,
    fixed: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.bottom | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.top = null,
    floated: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    fluid: js.UndefOr[scala.Boolean] = js.undefined,
    icon: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.labeled = null,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    items: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[semanticDashUiDashReactLib.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps] = null,
    onItemClick: (/* event */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLAnchorElement, reactLib.NativeMouseEvent], /* data */ semanticDashUiDashReactLib.distCommonjsCollectionsMenuMenuItemMod.MenuItemProps) => scala.Unit = null,
    pagination: js.UndefOr[scala.Boolean] = js.undefined,
    pointing: js.UndefOr[scala.Boolean] = js.undefined,
    secondary: js.UndefOr[scala.Boolean] = js.undefined,
    size: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.mini | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.tiny | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.small | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.large | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.huge | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.massive = null,
    stackable: js.UndefOr[scala.Boolean] = js.undefined,
    tabular: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null,
    text: js.UndefOr[scala.Boolean] = js.undefined,
    vertical: js.UndefOr[scala.Boolean] = js.undefined,
    widths: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null
  ): StrictMenuProps = {
    val __obj = js.Dynamic.literal()
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as)
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (defaultActiveIndex != null) __obj.updateDynamic("defaultActiveIndex")(defaultActiveIndex.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (floated != null) __obj.updateDynamic("floated")(floated.asInstanceOf[js.Any])
    if (!js.isUndefined(fluid)) __obj.updateDynamic("fluid")(fluid)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (items != null) __obj.updateDynamic("items")(items)
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination)
    if (!js.isUndefined(pointing)) __obj.updateDynamic("pointing")(pointing)
    if (!js.isUndefined(secondary)) __obj.updateDynamic("secondary")(secondary)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(stackable)) __obj.updateDynamic("stackable")(stackable)
    if (tabular != null) __obj.updateDynamic("tabular")(tabular.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    if (widths != null) __obj.updateDynamic("widths")(widths)
    __obj.asInstanceOf[StrictMenuProps]
  }
}

