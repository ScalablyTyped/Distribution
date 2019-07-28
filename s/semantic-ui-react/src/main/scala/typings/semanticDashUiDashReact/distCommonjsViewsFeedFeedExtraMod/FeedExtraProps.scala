package typings.semanticDashUiDashReact.distCommonjsViewsFeedFeedExtraMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.HtmlImageProps
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandCollection
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedExtraProps
  extends StrictFeedExtraProps
     with /* key */ StringDictionary[js.Any]

object FeedExtraProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    images: Boolean | js.Array[SemanticShorthandCollection[HtmlImageProps]] = null,
    text: js.UndefOr[Boolean] = js.undefined
  ): FeedExtraProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (!js.isUndefined(text)) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[FeedExtraProps]
  }
}

