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
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement], 
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

