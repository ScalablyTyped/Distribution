package typings
package showdownLib.showdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterOptions extends ShowdownOptions {
  /**
    * Add extensions to the new converter can be showdown extensions or "global" extensions name.
    */
  var extensions: js.UndefOr[
    js.Array[
      (js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]) | js.Array[ShowdownExtension] | ShowdownExtension | java.lang.String
    ]
  ] = js.undefined
}

object ConverterOptions {
  @scala.inline
  def apply(
    backslashEscapesHTMLTags: js.UndefOr[scala.Boolean] = js.undefined,
    completeHTMLDocument: js.UndefOr[scala.Boolean] = js.undefined,
    customizedHeaderId: js.UndefOr[scala.Boolean] = js.undefined,
    disableForced4SpacesIndentedSublists: js.UndefOr[scala.Boolean] = js.undefined,
    emoji: js.UndefOr[scala.Boolean] = js.undefined,
    encodeEmails: js.UndefOr[scala.Boolean] = js.undefined,
    excludeTrailingPunctuationFromURLs: js.UndefOr[scala.Boolean] = js.undefined,
    extensions: js.Array[
      (js.Function0[js.Array[ShowdownExtension] | ShowdownExtension]) | js.Array[ShowdownExtension] | ShowdownExtension | java.lang.String
    ] = null,
    ghCodeBlocks: js.UndefOr[scala.Boolean] = js.undefined,
    ghCompatibleHeaderId: js.UndefOr[scala.Boolean] = js.undefined,
    ghMentions: js.UndefOr[scala.Boolean] = js.undefined,
    ghMentionsLink: java.lang.String = null,
    headerLevelStart: scala.Int | scala.Double = null,
    literalMidWordUnderscores: js.UndefOr[scala.Boolean] = js.undefined,
    metadata: js.UndefOr[scala.Boolean] = js.undefined,
    noHeaderId: js.UndefOr[scala.Boolean] = js.undefined,
    omitExtraWLInCodeBlocks: js.UndefOr[scala.Boolean] = js.undefined,
    openLinksInNewWindow: js.UndefOr[scala.Boolean] = js.undefined,
    parseImgDimensions: js.UndefOr[scala.Boolean] = js.undefined,
    prefixHeaderId: java.lang.String | scala.Boolean = null,
    rawHeaderId: js.UndefOr[scala.Boolean] = js.undefined,
    rawPrefixHeaderId: js.UndefOr[scala.Boolean] = js.undefined,
    requireSpaceBeforeHeadingText: js.UndefOr[scala.Boolean] = js.undefined,
    simpleLineBreaks: js.UndefOr[scala.Boolean] = js.undefined,
    simplifiedAutoLink: js.UndefOr[scala.Boolean] = js.undefined,
    smartIndentationFix: js.UndefOr[scala.Boolean] = js.undefined,
    smoothLivePreview: js.UndefOr[scala.Boolean] = js.undefined,
    splitAdjacentBlockquotes: js.UndefOr[scala.Boolean] = js.undefined,
    strikethrough: js.UndefOr[scala.Boolean] = js.undefined,
    tables: js.UndefOr[scala.Boolean] = js.undefined,
    tablesHeaderId: js.UndefOr[scala.Boolean] = js.undefined,
    tasklists: js.UndefOr[scala.Boolean] = js.undefined,
    underline: js.UndefOr[scala.Boolean] = js.undefined
  ): ConverterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backslashEscapesHTMLTags)) __obj.updateDynamic("backslashEscapesHTMLTags")(backslashEscapesHTMLTags)
    if (!js.isUndefined(completeHTMLDocument)) __obj.updateDynamic("completeHTMLDocument")(completeHTMLDocument)
    if (!js.isUndefined(customizedHeaderId)) __obj.updateDynamic("customizedHeaderId")(customizedHeaderId)
    if (!js.isUndefined(disableForced4SpacesIndentedSublists)) __obj.updateDynamic("disableForced4SpacesIndentedSublists")(disableForced4SpacesIndentedSublists)
    if (!js.isUndefined(emoji)) __obj.updateDynamic("emoji")(emoji)
    if (!js.isUndefined(encodeEmails)) __obj.updateDynamic("encodeEmails")(encodeEmails)
    if (!js.isUndefined(excludeTrailingPunctuationFromURLs)) __obj.updateDynamic("excludeTrailingPunctuationFromURLs")(excludeTrailingPunctuationFromURLs)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (!js.isUndefined(ghCodeBlocks)) __obj.updateDynamic("ghCodeBlocks")(ghCodeBlocks)
    if (!js.isUndefined(ghCompatibleHeaderId)) __obj.updateDynamic("ghCompatibleHeaderId")(ghCompatibleHeaderId)
    if (!js.isUndefined(ghMentions)) __obj.updateDynamic("ghMentions")(ghMentions)
    if (ghMentionsLink != null) __obj.updateDynamic("ghMentionsLink")(ghMentionsLink)
    if (headerLevelStart != null) __obj.updateDynamic("headerLevelStart")(headerLevelStart.asInstanceOf[js.Any])
    if (!js.isUndefined(literalMidWordUnderscores)) __obj.updateDynamic("literalMidWordUnderscores")(literalMidWordUnderscores)
    if (!js.isUndefined(metadata)) __obj.updateDynamic("metadata")(metadata)
    if (!js.isUndefined(noHeaderId)) __obj.updateDynamic("noHeaderId")(noHeaderId)
    if (!js.isUndefined(omitExtraWLInCodeBlocks)) __obj.updateDynamic("omitExtraWLInCodeBlocks")(omitExtraWLInCodeBlocks)
    if (!js.isUndefined(openLinksInNewWindow)) __obj.updateDynamic("openLinksInNewWindow")(openLinksInNewWindow)
    if (!js.isUndefined(parseImgDimensions)) __obj.updateDynamic("parseImgDimensions")(parseImgDimensions)
    if (prefixHeaderId != null) __obj.updateDynamic("prefixHeaderId")(prefixHeaderId.asInstanceOf[js.Any])
    if (!js.isUndefined(rawHeaderId)) __obj.updateDynamic("rawHeaderId")(rawHeaderId)
    if (!js.isUndefined(rawPrefixHeaderId)) __obj.updateDynamic("rawPrefixHeaderId")(rawPrefixHeaderId)
    if (!js.isUndefined(requireSpaceBeforeHeadingText)) __obj.updateDynamic("requireSpaceBeforeHeadingText")(requireSpaceBeforeHeadingText)
    if (!js.isUndefined(simpleLineBreaks)) __obj.updateDynamic("simpleLineBreaks")(simpleLineBreaks)
    if (!js.isUndefined(simplifiedAutoLink)) __obj.updateDynamic("simplifiedAutoLink")(simplifiedAutoLink)
    if (!js.isUndefined(smartIndentationFix)) __obj.updateDynamic("smartIndentationFix")(smartIndentationFix)
    if (!js.isUndefined(smoothLivePreview)) __obj.updateDynamic("smoothLivePreview")(smoothLivePreview)
    if (!js.isUndefined(splitAdjacentBlockquotes)) __obj.updateDynamic("splitAdjacentBlockquotes")(splitAdjacentBlockquotes)
    if (!js.isUndefined(strikethrough)) __obj.updateDynamic("strikethrough")(strikethrough)
    if (!js.isUndefined(tables)) __obj.updateDynamic("tables")(tables)
    if (!js.isUndefined(tablesHeaderId)) __obj.updateDynamic("tablesHeaderId")(tablesHeaderId)
    if (!js.isUndefined(tasklists)) __obj.updateDynamic("tasklists")(tasklists)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[ConverterOptions]
  }
}

