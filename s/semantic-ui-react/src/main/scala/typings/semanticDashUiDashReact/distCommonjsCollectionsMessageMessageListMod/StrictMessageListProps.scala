package typings.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageListMod

import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageItemMod.MessageItemProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictMessageListProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[String] = js.undefined
  /** Shorthand Message.Items. */
  var items: js.UndefOr[SemanticShorthandCollection[MessageItemProps]] = js.undefined
}

object StrictMessageListProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    items: SemanticShorthandCollection[MessageItemProps] = null
  ): StrictMessageListProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[StrictMessageListProps]
  }
}

