package typings.semanticDashUiDashReact.distCommonjsViewsFeedFeedContentMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandContent
import typings.semanticDashUiDashReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.semanticDashUiDashReact.distCommonjsViewsFeedFeedDateMod.FeedDateProps
import typings.semanticDashUiDashReact.distCommonjsViewsFeedFeedExtraMod.FeedExtraProps
import typings.semanticDashUiDashReact.distCommonjsViewsFeedFeedMetaMod.FeedMetaProps
import typings.semanticDashUiDashReact.distCommonjsViewsFeedFeedSummaryMod.FeedSummaryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedContentProps
  extends StrictFeedContentProps
     with /* key */ StringDictionary[js.Any]

object FeedContentProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: ReactNode = null,
    className: String = null,
    content: SemanticShorthandContent = null,
    date: SemanticShorthandItem[FeedDateProps] = null,
    extraImages: SemanticShorthandItem[FeedExtraProps] = null,
    extraText: SemanticShorthandItem[FeedExtraProps] = null,
    meta: SemanticShorthandItem[FeedMetaProps] = null,
    summary: SemanticShorthandItem[FeedSummaryProps] = null
  ): FeedContentProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (extraImages != null) __obj.updateDynamic("extraImages")(extraImages.asInstanceOf[js.Any])
    if (extraText != null) __obj.updateDynamic("extraText")(extraText.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedContentProps]
  }
}

