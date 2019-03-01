package typings
package semanticDashUiDashReactLib.distCommonjsViewsFeedFeedContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictFeedContentProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** An event can contain a date. */
  var date: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsFeedFeedDateMod.FeedDateProps]
  ] = js.undefined
  /** Shorthand for FeedExtra with images. */
  var extraImages: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsFeedFeedExtraMod.FeedExtraProps]
  ] = js.undefined
  /** Shorthand for FeedExtra with text. */
  var extraText: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsFeedFeedExtraMod.FeedExtraProps]
  ] = js.undefined
  /** Shorthand for FeedMeta. */
  var meta: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsFeedFeedMetaMod.FeedMetaProps]
  ] = js.undefined
  /** Shorthand for FeedSummary. */
  var summary: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsFeedFeedSummaryMod.FeedSummaryProps]
  ] = js.undefined
}

object StrictFeedContentProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    date: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsFeedFeedDateMod.FeedDateProps] = null,
    extraImages: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsFeedFeedExtraMod.FeedExtraProps] = null,
    extraText: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsFeedFeedExtraMod.FeedExtraProps] = null,
    meta: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsFeedFeedMetaMod.FeedMetaProps] = null,
    summary: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandItem[semanticDashUiDashReactLib.distCommonjsViewsFeedFeedSummaryMod.FeedSummaryProps] = null
  ): StrictFeedContentProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (extraImages != null) __obj.updateDynamic("extraImages")(extraImages.asInstanceOf[js.Any])
    if (extraText != null) __obj.updateDynamic("extraText")(extraText.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictFeedContentProps]
  }
}

