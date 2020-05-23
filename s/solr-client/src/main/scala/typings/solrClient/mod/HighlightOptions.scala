package typings.solrClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightOptions extends js.Object {
  var alternateField: js.UndefOr[String] = js.undefined
  var fl: js.UndefOr[String | js.Array[String]] = js.undefined
  var formatter: js.UndefOr[String] = js.undefined
  var fragmenter: js.UndefOr[String] = js.undefined
  var fragsize: js.UndefOr[Double] = js.undefined
  var highlightMultiTerm: js.UndefOr[Boolean] = js.undefined
  var maxAlternateFieldLength: js.UndefOr[Double] = js.undefined
  var maxAnalyzedChars: js.UndefOr[Double] = js.undefined
  var maxMultiValuedToExamine: js.UndefOr[Double] = js.undefined
  var maxMultiValuedToMatch: js.UndefOr[Double] = js.undefined
  var mergeContiguous: js.UndefOr[Boolean] = js.undefined
  var on: Boolean
  var payloads: js.UndefOr[Boolean] = js.undefined
  var preserveMulti: js.UndefOr[Boolean] = js.undefined
  var q: js.UndefOr[String | js.Array[String]] = js.undefined
  var qparser: js.UndefOr[String] = js.undefined
  var regexMaxAnalyzedChars: js.UndefOr[Double] = js.undefined
  var regexPattern: js.UndefOr[String] = js.undefined
  var regexSlop: js.UndefOr[Double] = js.undefined
  var requireFieldMatch: js.UndefOr[Boolean] = js.undefined
  var simplePost: js.UndefOr[String] = js.undefined
  var simplePre: js.UndefOr[String] = js.undefined
  var snippets: js.UndefOr[Double] = js.undefined
  var usePhraseHighlighter: js.UndefOr[Boolean] = js.undefined
}

object HighlightOptions {
  @scala.inline
  def apply(
    on: Boolean,
    alternateField: String = null,
    fl: String | js.Array[String] = null,
    formatter: String = null,
    fragmenter: String = null,
    fragsize: js.UndefOr[Double] = js.undefined,
    highlightMultiTerm: js.UndefOr[Boolean] = js.undefined,
    maxAlternateFieldLength: js.UndefOr[Double] = js.undefined,
    maxAnalyzedChars: js.UndefOr[Double] = js.undefined,
    maxMultiValuedToExamine: js.UndefOr[Double] = js.undefined,
    maxMultiValuedToMatch: js.UndefOr[Double] = js.undefined,
    mergeContiguous: js.UndefOr[Boolean] = js.undefined,
    payloads: js.UndefOr[Boolean] = js.undefined,
    preserveMulti: js.UndefOr[Boolean] = js.undefined,
    q: String | js.Array[String] = null,
    qparser: String = null,
    regexMaxAnalyzedChars: js.UndefOr[Double] = js.undefined,
    regexPattern: String = null,
    regexSlop: js.UndefOr[Double] = js.undefined,
    requireFieldMatch: js.UndefOr[Boolean] = js.undefined,
    simplePost: String = null,
    simplePre: String = null,
    snippets: js.UndefOr[Double] = js.undefined,
    usePhraseHighlighter: js.UndefOr[Boolean] = js.undefined
  ): HighlightOptions = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    if (alternateField != null) __obj.updateDynamic("alternateField")(alternateField.asInstanceOf[js.Any])
    if (fl != null) __obj.updateDynamic("fl")(fl.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (fragmenter != null) __obj.updateDynamic("fragmenter")(fragmenter.asInstanceOf[js.Any])
    if (!js.isUndefined(fragsize)) __obj.updateDynamic("fragsize")(fragsize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightMultiTerm)) __obj.updateDynamic("highlightMultiTerm")(highlightMultiTerm.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAlternateFieldLength)) __obj.updateDynamic("maxAlternateFieldLength")(maxAlternateFieldLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAnalyzedChars)) __obj.updateDynamic("maxAnalyzedChars")(maxAnalyzedChars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMultiValuedToExamine)) __obj.updateDynamic("maxMultiValuedToExamine")(maxMultiValuedToExamine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMultiValuedToMatch)) __obj.updateDynamic("maxMultiValuedToMatch")(maxMultiValuedToMatch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeContiguous)) __obj.updateDynamic("mergeContiguous")(mergeContiguous.get.asInstanceOf[js.Any])
    if (!js.isUndefined(payloads)) __obj.updateDynamic("payloads")(payloads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveMulti)) __obj.updateDynamic("preserveMulti")(preserveMulti.get.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (qparser != null) __obj.updateDynamic("qparser")(qparser.asInstanceOf[js.Any])
    if (!js.isUndefined(regexMaxAnalyzedChars)) __obj.updateDynamic("regexMaxAnalyzedChars")(regexMaxAnalyzedChars.get.asInstanceOf[js.Any])
    if (regexPattern != null) __obj.updateDynamic("regexPattern")(regexPattern.asInstanceOf[js.Any])
    if (!js.isUndefined(regexSlop)) __obj.updateDynamic("regexSlop")(regexSlop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requireFieldMatch)) __obj.updateDynamic("requireFieldMatch")(requireFieldMatch.get.asInstanceOf[js.Any])
    if (simplePost != null) __obj.updateDynamic("simplePost")(simplePost.asInstanceOf[js.Any])
    if (simplePre != null) __obj.updateDynamic("simplePre")(simplePre.asInstanceOf[js.Any])
    if (!js.isUndefined(snippets)) __obj.updateDynamic("snippets")(snippets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePhraseHighlighter)) __obj.updateDynamic("usePhraseHighlighter")(usePhraseHighlighter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightOptions]
  }
}

