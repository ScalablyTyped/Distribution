package typings
package semanticDashUiDashReactLib.distCommonjsViewsFeedFeedExtraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedExtraProps
  extends StrictFeedExtraProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object FeedExtraProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    images: scala.Boolean | (js.Array[
      semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[semanticDashUiDashReactLib.distCommonjsGenericMod.HtmlImageProps]
    ]) = null,
    text: js.UndefOr[scala.Boolean] = js.undefined
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

