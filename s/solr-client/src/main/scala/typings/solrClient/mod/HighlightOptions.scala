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
    fragsize: Int | Double = null,
    highlightMultiTerm: js.UndefOr[Boolean] = js.undefined,
    maxAlternateFieldLength: Int | Double = null,
    maxAnalyzedChars: Int | Double = null,
    maxMultiValuedToExamine: Int | Double = null,
    maxMultiValuedToMatch: Int | Double = null,
    mergeContiguous: js.UndefOr[Boolean] = js.undefined,
    payloads: js.UndefOr[Boolean] = js.undefined,
    preserveMulti: js.UndefOr[Boolean] = js.undefined,
    q: String | js.Array[String] = null,
    qparser: String = null,
    regexMaxAnalyzedChars: Int | Double = null,
    regexPattern: String = null,
    regexSlop: Int | Double = null,
    requireFieldMatch: js.UndefOr[Boolean] = js.undefined,
    simplePost: String = null,
    simplePre: String = null,
    snippets: Int | Double = null,
    usePhraseHighlighter: js.UndefOr[Boolean] = js.undefined
  ): HighlightOptions = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    if (alternateField != null) __obj.updateDynamic("alternateField")(alternateField.asInstanceOf[js.Any])
    if (fl != null) __obj.updateDynamic("fl")(fl.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (fragmenter != null) __obj.updateDynamic("fragmenter")(fragmenter.asInstanceOf[js.Any])
    if (fragsize != null) __obj.updateDynamic("fragsize")(fragsize.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightMultiTerm)) __obj.updateDynamic("highlightMultiTerm")(highlightMultiTerm.asInstanceOf[js.Any])
    if (maxAlternateFieldLength != null) __obj.updateDynamic("maxAlternateFieldLength")(maxAlternateFieldLength.asInstanceOf[js.Any])
    if (maxAnalyzedChars != null) __obj.updateDynamic("maxAnalyzedChars")(maxAnalyzedChars.asInstanceOf[js.Any])
    if (maxMultiValuedToExamine != null) __obj.updateDynamic("maxMultiValuedToExamine")(maxMultiValuedToExamine.asInstanceOf[js.Any])
    if (maxMultiValuedToMatch != null) __obj.updateDynamic("maxMultiValuedToMatch")(maxMultiValuedToMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeContiguous)) __obj.updateDynamic("mergeContiguous")(mergeContiguous.asInstanceOf[js.Any])
    if (!js.isUndefined(payloads)) __obj.updateDynamic("payloads")(payloads.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveMulti)) __obj.updateDynamic("preserveMulti")(preserveMulti.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (qparser != null) __obj.updateDynamic("qparser")(qparser.asInstanceOf[js.Any])
    if (regexMaxAnalyzedChars != null) __obj.updateDynamic("regexMaxAnalyzedChars")(regexMaxAnalyzedChars.asInstanceOf[js.Any])
    if (regexPattern != null) __obj.updateDynamic("regexPattern")(regexPattern.asInstanceOf[js.Any])
    if (regexSlop != null) __obj.updateDynamic("regexSlop")(regexSlop.asInstanceOf[js.Any])
    if (!js.isUndefined(requireFieldMatch)) __obj.updateDynamic("requireFieldMatch")(requireFieldMatch.asInstanceOf[js.Any])
    if (simplePost != null) __obj.updateDynamic("simplePost")(simplePost.asInstanceOf[js.Any])
    if (simplePre != null) __obj.updateDynamic("simplePre")(simplePre.asInstanceOf[js.Any])
    if (snippets != null) __obj.updateDynamic("snippets")(snippets.asInstanceOf[js.Any])
    if (!js.isUndefined(usePhraseHighlighter)) __obj.updateDynamic("usePhraseHighlighter")(usePhraseHighlighter.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightOptions]
  }
}

