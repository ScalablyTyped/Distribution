package typings.showdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterOptions extends ShowdownOptions {
  /**
    * Add extensions to the new converter can be showdown extensions or "global" extensions name.
    */
  var extensions: js.UndefOr[
    js.Array[
      (js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]) | js.Array[ShowdownExtension] | ShowdownExtension | String
    ]
  ] = js.undefined
}

object ConverterOptions {
  @scala.inline
  def apply(
    backslashEscapesHTMLTags: js.UndefOr[Boolean] = js.undefined,
    completeHTMLDocument: js.UndefOr[Boolean] = js.undefined,
    customizedHeaderId: js.UndefOr[Boolean] = js.undefined,
    disableForced4SpacesIndentedSublists: js.UndefOr[Boolean] = js.undefined,
    emoji: js.UndefOr[Boolean] = js.undefined,
    encodeEmails: js.UndefOr[Boolean] = js.undefined,
    excludeTrailingPunctuationFromURLs: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[
      (js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]) | js.Array[ShowdownExtension] | ShowdownExtension | String
    ] = null,
    ghCodeBlocks: js.UndefOr[Boolean] = js.undefined,
    ghCompatibleHeaderId: js.UndefOr[Boolean] = js.undefined,
    ghMentions: js.UndefOr[Boolean] = js.undefined,
    ghMentionsLink: String = null,
    headerLevelStart: Int | Double = null,
    literalMidWordUnderscores: js.UndefOr[Boolean] = js.undefined,
    metadata: js.UndefOr[Boolean] = js.undefined,
    noHeaderId: js.UndefOr[Boolean] = js.undefined,
    omitExtraWLInCodeBlocks: js.UndefOr[Boolean] = js.undefined,
    openLinksInNewWindow: js.UndefOr[Boolean] = js.undefined,
    parseImgDimensions: js.UndefOr[Boolean] = js.undefined,
    prefixHeaderId: String | Boolean = null,
    rawHeaderId: js.UndefOr[Boolean] = js.undefined,
    rawPrefixHeaderId: js.UndefOr[Boolean] = js.undefined,
    requireSpaceBeforeHeadingText: js.UndefOr[Boolean] = js.undefined,
    simpleLineBreaks: js.UndefOr[Boolean] = js.undefined,
    simplifiedAutoLink: js.UndefOr[Boolean] = js.undefined,
    smartIndentationFix: js.UndefOr[Boolean] = js.undefined,
    smoothLivePreview: js.UndefOr[Boolean] = js.undefined,
    splitAdjacentBlockquotes: js.UndefOr[Boolean] = js.undefined,
    strikethrough: js.UndefOr[Boolean] = js.undefined,
    tables: js.UndefOr[Boolean] = js.undefined,
    tablesHeaderId: js.UndefOr[Boolean] = js.undefined,
    tasklists: js.UndefOr[Boolean] = js.undefined,
    underline: js.UndefOr[Boolean] = js.undefined
  ): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backslashEscapesHTMLTags)) __obj.updateDynamic("backslashEscapesHTMLTags")(backslashEscapesHTMLTags.asInstanceOf[js.Any])
    if (!js.isUndefined(completeHTMLDocument)) __obj.updateDynamic("completeHTMLDocument")(completeHTMLDocument.asInstanceOf[js.Any])
    if (!js.isUndefined(customizedHeaderId)) __obj.updateDynamic("customizedHeaderId")(customizedHeaderId.asInstanceOf[js.Any])
    if (!js.isUndefined(disableForced4SpacesIndentedSublists)) __obj.updateDynamic("disableForced4SpacesIndentedSublists")(disableForced4SpacesIndentedSublists.asInstanceOf[js.Any])
    if (!js.isUndefined(emoji)) __obj.updateDynamic("emoji")(emoji.asInstanceOf[js.Any])
    if (!js.isUndefined(encodeEmails)) __obj.updateDynamic("encodeEmails")(encodeEmails.asInstanceOf[js.Any])
    if (!js.isUndefined(excludeTrailingPunctuationFromURLs)) __obj.updateDynamic("excludeTrailingPunctuationFromURLs")(excludeTrailingPunctuationFromURLs.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(ghCodeBlocks)) __obj.updateDynamic("ghCodeBlocks")(ghCodeBlocks.asInstanceOf[js.Any])
    if (!js.isUndefined(ghCompatibleHeaderId)) __obj.updateDynamic("ghCompatibleHeaderId")(ghCompatibleHeaderId.asInstanceOf[js.Any])
    if (!js.isUndefined(ghMentions)) __obj.updateDynamic("ghMentions")(ghMentions.asInstanceOf[js.Any])
    if (ghMentionsLink != null) __obj.updateDynamic("ghMentionsLink")(ghMentionsLink.asInstanceOf[js.Any])
    if (headerLevelStart != null) __obj.updateDynamic("headerLevelStart")(headerLevelStart.asInstanceOf[js.Any])
    if (!js.isUndefined(literalMidWordUnderscores)) __obj.updateDynamic("literalMidWordUnderscores")(literalMidWordUnderscores.asInstanceOf[js.Any])
    if (!js.isUndefined(metadata)) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (!js.isUndefined(noHeaderId)) __obj.updateDynamic("noHeaderId")(noHeaderId.asInstanceOf[js.Any])
    if (!js.isUndefined(omitExtraWLInCodeBlocks)) __obj.updateDynamic("omitExtraWLInCodeBlocks")(omitExtraWLInCodeBlocks.asInstanceOf[js.Any])
    if (!js.isUndefined(openLinksInNewWindow)) __obj.updateDynamic("openLinksInNewWindow")(openLinksInNewWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(parseImgDimensions)) __obj.updateDynamic("parseImgDimensions")(parseImgDimensions.asInstanceOf[js.Any])
    if (prefixHeaderId != null) __obj.updateDynamic("prefixHeaderId")(prefixHeaderId.asInstanceOf[js.Any])
    if (!js.isUndefined(rawHeaderId)) __obj.updateDynamic("rawHeaderId")(rawHeaderId.asInstanceOf[js.Any])
    if (!js.isUndefined(rawPrefixHeaderId)) __obj.updateDynamic("rawPrefixHeaderId")(rawPrefixHeaderId.asInstanceOf[js.Any])
    if (!js.isUndefined(requireSpaceBeforeHeadingText)) __obj.updateDynamic("requireSpaceBeforeHeadingText")(requireSpaceBeforeHeadingText.asInstanceOf[js.Any])
    if (!js.isUndefined(simpleLineBreaks)) __obj.updateDynamic("simpleLineBreaks")(simpleLineBreaks.asInstanceOf[js.Any])
    if (!js.isUndefined(simplifiedAutoLink)) __obj.updateDynamic("simplifiedAutoLink")(simplifiedAutoLink.asInstanceOf[js.Any])
    if (!js.isUndefined(smartIndentationFix)) __obj.updateDynamic("smartIndentationFix")(smartIndentationFix.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothLivePreview)) __obj.updateDynamic("smoothLivePreview")(smoothLivePreview.asInstanceOf[js.Any])
    if (!js.isUndefined(splitAdjacentBlockquotes)) __obj.updateDynamic("splitAdjacentBlockquotes")(splitAdjacentBlockquotes.asInstanceOf[js.Any])
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough.asInstanceOf[js.Any])
    if (!js.isUndefined(tables)) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    if (!js.isUndefined(tablesHeaderId)) __obj.updateDynamic("tablesHeaderId")(tablesHeaderId.asInstanceOf[js.Any])
    if (!js.isUndefined(tasklists)) __obj.updateDynamic("tasklists")(tasklists.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterOptions]
  }
}

