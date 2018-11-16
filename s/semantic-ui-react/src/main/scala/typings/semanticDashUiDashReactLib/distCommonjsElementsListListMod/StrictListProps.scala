package typings
package semanticDashUiDashReactLib.distCommonjsElementsListListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictListProps extends js.Object {
  /** A list can animate to set the current item apart from the list. */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A list can mark items with a bullet. */
  var bulleted: js.UndefOr[scala.Boolean] = js.undefined
  /** A list can divide its items into cells. */
  var celled: js.UndefOr[scala.Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A list can show divisions between content. */
  var divided: js.UndefOr[scala.Boolean] = js.undefined
  /** An list can be floated left or right. */
  var floated: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticFLOATS] = js.undefined
  /** A list can be formatted to have items appear horizontally. */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /** A list can be inverted to appear on a dark background. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand array of props for ListItem. */
  var items: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[semanticDashUiDashReactLib.distCommonjsElementsListListItemMod.ListItemProps]
  ] = js.undefined
  /** A list can be specially formatted for navigation links. */
  var link: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * onClick handler for ListItem. Mutually exclusive with children.
     *
     * @param {SyntheticEvent} event - React's original SyntheticEvent.
     * @param {object} data - All item props.
     */
  var onItemClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLAnchorElement], 
      /* data */ semanticDashUiDashReactLib.distCommonjsElementsListListItemMod.ListItemProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A list can be ordered numerically. */
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  /** A list can relax its padding to provide more negative space. */
  var relaxed: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very
  ] = js.undefined
  /** A selection list formats list items as possible choices. */
  var selection: js.UndefOr[scala.Boolean] = js.undefined
  /** A list can vary in size. */
  var size: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES] = js.undefined
  /** An element inside a list can be vertically aligned. */
  var verticalAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS] = js.undefined
}

