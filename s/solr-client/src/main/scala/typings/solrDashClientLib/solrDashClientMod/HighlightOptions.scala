package typings
package solrDashClientLib.solrDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightOptions extends js.Object {
  var alternateField: js.UndefOr[java.lang.String] = js.undefined
  var fl: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var formatter: js.UndefOr[java.lang.String] = js.undefined
  var fragmenter: js.UndefOr[java.lang.String] = js.undefined
  var fragsize: js.UndefOr[scala.Double] = js.undefined
  var highlightMultiTerm: js.UndefOr[scala.Boolean] = js.undefined
  var maxAlternateFieldLength: js.UndefOr[scala.Double] = js.undefined
  var maxAnalyzedChars: js.UndefOr[scala.Double] = js.undefined
  var maxMultiValuedToExamine: js.UndefOr[scala.Double] = js.undefined
  var maxMultiValuedToMatch: js.UndefOr[scala.Double] = js.undefined
  var mergeContiguous: js.UndefOr[scala.Boolean] = js.undefined
  var on: scala.Boolean
  var payloads: js.UndefOr[scala.Boolean] = js.undefined
  var preserveMulti: js.UndefOr[scala.Boolean] = js.undefined
  var q: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var qparser: js.UndefOr[java.lang.String] = js.undefined
  var regexMaxAnalyzedChars: js.UndefOr[scala.Double] = js.undefined
  var regexPattern: js.UndefOr[java.lang.String] = js.undefined
  var regexSlop: js.UndefOr[scala.Double] = js.undefined
  var requireFieldMatch: js.UndefOr[scala.Boolean] = js.undefined
  var simplePost: js.UndefOr[java.lang.String] = js.undefined
  var simplePre: js.UndefOr[java.lang.String] = js.undefined
  var snippets: js.UndefOr[scala.Double] = js.undefined
  var usePhraseHighlighter: js.UndefOr[scala.Boolean] = js.undefined
}

object HighlightOptions {
  @scala.inline
  def apply(
    on: scala.Boolean,
    alternateField: java.lang.String = null,
    fl: java.lang.String | js.Array[java.lang.String] = null,
    formatter: java.lang.String = null,
    fragmenter: java.lang.String = null,
    fragsize: scala.Int | scala.Double = null,
    highlightMultiTerm: js.UndefOr[scala.Boolean] = js.undefined,
    maxAlternateFieldLength: scala.Int | scala.Double = null,
    maxAnalyzedChars: scala.Int | scala.Double = null,
    maxMultiValuedToExamine: scala.Int | scala.Double = null,
    maxMultiValuedToMatch: scala.Int | scala.Double = null,
    mergeContiguous: js.UndefOr[scala.Boolean] = js.undefined,
    payloads: js.UndefOr[scala.Boolean] = js.undefined,
    preserveMulti: js.UndefOr[scala.Boolean] = js.undefined,
    q: java.lang.String | js.Array[java.lang.String] = null,
    qparser: java.lang.String = null,
    regexMaxAnalyzedChars: scala.Int | scala.Double = null,
    regexPattern: java.lang.String = null,
    regexSlop: scala.Int | scala.Double = null,
    requireFieldMatch: js.UndefOr[scala.Boolean] = js.undefined,
    simplePost: java.lang.String = null,
    simplePre: java.lang.String = null,
    snippets: scala.Int | scala.Double = null,
    usePhraseHighlighter: js.UndefOr[scala.Boolean] = js.undefined
  ): HighlightOptions = {
    val __obj = js.Dynamic.literal(on = on)
    if (alternateField != null) __obj.updateDynamic("alternateField")(alternateField)
    if (fl != null) __obj.updateDynamic("fl")(fl.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (fragmenter != null) __obj.updateDynamic("fragmenter")(fragmenter)
    if (fragsize != null) __obj.updateDynamic("fragsize")(fragsize.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightMultiTerm)) __obj.updateDynamic("highlightMultiTerm")(highlightMultiTerm)
    if (maxAlternateFieldLength != null) __obj.updateDynamic("maxAlternateFieldLength")(maxAlternateFieldLength.asInstanceOf[js.Any])
    if (maxAnalyzedChars != null) __obj.updateDynamic("maxAnalyzedChars")(maxAnalyzedChars.asInstanceOf[js.Any])
    if (maxMultiValuedToExamine != null) __obj.updateDynamic("maxMultiValuedToExamine")(maxMultiValuedToExamine.asInstanceOf[js.Any])
    if (maxMultiValuedToMatch != null) __obj.updateDynamic("maxMultiValuedToMatch")(maxMultiValuedToMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(mergeContiguous)) __obj.updateDynamic("mergeContiguous")(mergeContiguous)
    if (!js.isUndefined(payloads)) __obj.updateDynamic("payloads")(payloads)
    if (!js.isUndefined(preserveMulti)) __obj.updateDynamic("preserveMulti")(preserveMulti)
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (qparser != null) __obj.updateDynamic("qparser")(qparser)
    if (regexMaxAnalyzedChars != null) __obj.updateDynamic("regexMaxAnalyzedChars")(regexMaxAnalyzedChars.asInstanceOf[js.Any])
    if (regexPattern != null) __obj.updateDynamic("regexPattern")(regexPattern)
    if (regexSlop != null) __obj.updateDynamic("regexSlop")(regexSlop.asInstanceOf[js.Any])
    if (!js.isUndefined(requireFieldMatch)) __obj.updateDynamic("requireFieldMatch")(requireFieldMatch)
    if (simplePost != null) __obj.updateDynamic("simplePost")(simplePost)
    if (simplePre != null) __obj.updateDynamic("simplePre")(simplePre)
    if (snippets != null) __obj.updateDynamic("snippets")(snippets.asInstanceOf[js.Any])
    if (!js.isUndefined(usePhraseHighlighter)) __obj.updateDynamic("usePhraseHighlighter")(usePhraseHighlighter)
    __obj.asInstanceOf[HighlightOptions]
  }
}

