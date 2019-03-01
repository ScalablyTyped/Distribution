package typings
package semanticDashUiDashReactLib.distCommonjsViewsCardCardGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardGroupProps
  extends StrictCardGroupProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object CardGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    centered: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    doubling: js.UndefOr[scala.Boolean] = js.undefined,
    items: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[semanticDashUiDashReactLib.distCommonjsViewsCardCardMod.CardProps] = null,
    itemsPerRow: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticWIDTHS = null,
    stackable: js.UndefOr[scala.Boolean] = js.undefined,
    textAlign: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.center | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.left | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.right = null
  ): CardGroupProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(doubling)) __obj.updateDynamic("doubling")(doubling)
    if (items != null) __obj.updateDynamic("items")(items)
    if (itemsPerRow != null) __obj.updateDynamic("itemsPerRow")(itemsPerRow)
    if (!js.isUndefined(stackable)) __obj.updateDynamic("stackable")(stackable)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardGroupProps]
  }
}

