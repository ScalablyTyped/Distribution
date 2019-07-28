package typings.semanticDashUiDashReact.distCommonjsModulesSearchSearchResultMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactElement
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultProps
  extends StrictSearchResultProps
     with /* key */ StringDictionary[js.Any]

object SearchResultProps {
  @scala.inline
  def apply(
    title: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    as: js.Any = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    description: String = null,
    id: Double | String = null,
    image: String = null,
    onClick: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ SearchResultProps) => Unit = null,
    price: String = null,
    renderer: /* props */ SearchResultProps => js.Array[ReactElement] = null
  ): SearchResultProps = {
    val __obj = js.Dynamic.literal(title = title)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (as != null) __obj.updateDynamic("as")(as)
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (price != null) __obj.updateDynamic("price")(price)
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[SearchResultProps]
  }
}

