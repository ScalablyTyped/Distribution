package typings
package semanticDashUiDashReactLib.distCommonjsCollectionsMessageMessageListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageListProps
  extends StrictMessageListProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object MessageListProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    items: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[
      semanticDashUiDashReactLib.distCommonjsCollectionsMessageMessageItemMod.MessageItemProps
    ] = null
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

