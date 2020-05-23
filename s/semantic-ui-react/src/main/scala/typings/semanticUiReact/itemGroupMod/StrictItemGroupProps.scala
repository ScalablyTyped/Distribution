package typings.semanticUiReact.itemGroupMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.itemItemMod.ItemProps
import typings.semanticUiReact.semanticUiReactStrings.very
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictItemGroupProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[SemanticShorthandContent] = js.undefined
  /** Items can be divided to better distinguish between grouped content. */
  var divided: js.UndefOr[Boolean] = js.undefined
  /** Shorthand array of props for Item. */
  var items: js.UndefOr[SemanticShorthandCollection[ItemProps]] = js.undefined
  /** An item can be formatted so that the entire contents link to another page. */
  var link: js.UndefOr[Boolean] = js.undefined
  /** A group of items can relax its padding to provide more negative space. */
  var relaxed: js.UndefOr[Boolean | very] = js.undefined
  /** Prevent items from stacking on mobile. */
  var unstackable: js.UndefOr[Boolean] = js.undefined
}

object StrictItemGroupProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    divided: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[ItemProps] = null,
    link: js.UndefOr[Boolean] = js.undefined,
    relaxed: Boolean | very = null,
    unstackable: js.UndefOr[Boolean] = js.undefined
  ): StrictItemGroupProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(divided)) __obj.updateDynamic("divided")(divided.get.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link.get.asInstanceOf[js.Any])
    if (relaxed != null) __obj.updateDynamic("relaxed")(relaxed.asInstanceOf[js.Any])
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictItemGroupProps]
  }
}

