package typings
package semanticDashUiDashReactLib.distCommonjsViewsItemItemGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictItemGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** Items can be divided to better distinguish between grouped content. */
  var divided: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand array of props for Item. */
  var items: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[semanticDashUiDashReactLib.distCommonjsViewsItemItemMod.ItemProps]
  ] = js.undefined
  /** An item can be formatted so that the entire contents link to another page. */
  var link: js.UndefOr[scala.Boolean] = js.undefined
  /** A group of items can relax its padding to provide more negative space. */
  var relaxed: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very
  ] = js.undefined
  /** Prevent items from stacking on mobile. */
  var unstackable: js.UndefOr[scala.Boolean] = js.undefined
}

