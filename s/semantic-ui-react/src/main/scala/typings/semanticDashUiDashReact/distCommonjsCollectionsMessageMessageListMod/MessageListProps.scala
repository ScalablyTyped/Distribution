package typings.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageListMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsCollectionsMessageMessageItemMod.MessageItemProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageListProps
  extends StrictMessageListProps
     with /* key */ StringDictionary[js.Any]

object MessageListProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    items: SemanticShorthandCollection[MessageItemProps] = null
  ): MessageListProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[MessageListProps]
  }
}

