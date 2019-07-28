package typings.semanticDashUiDashReact.distCommonjsViewsCardCardGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticWIDTHS
import typings.semanticDashUiDashReact.distCommonjsViewsCardCardMod.CardProps
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.center
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.left
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardGroupProps
  extends StrictCardGroupProps
     with /* key */ StringDictionary[js.Any]

object CardGroupProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    doubling: js.UndefOr[Boolean] = js.undefined,
    items: SemanticShorthandCollection[CardProps] = null,
    itemsPerRow: SemanticWIDTHS = null,
    stackable: js.UndefOr[Boolean] = js.undefined,
    textAlign: center | left | right = null
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

