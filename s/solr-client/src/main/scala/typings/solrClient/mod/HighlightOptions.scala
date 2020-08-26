package typings.solrClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightOptions extends js.Object {
  var alternateField: js.UndefOr[String] = js.native
  var fl: js.UndefOr[String | js.Array[String]] = js.native
  var formatter: js.UndefOr[String] = js.native
  var fragmenter: js.UndefOr[String] = js.native
  var fragsize: js.UndefOr[Double] = js.native
  var highlightMultiTerm: js.UndefOr[Boolean] = js.native
  var maxAlternateFieldLength: js.UndefOr[Double] = js.native
  var maxAnalyzedChars: js.UndefOr[Double] = js.native
  var maxMultiValuedToExamine: js.UndefOr[Double] = js.native
  var maxMultiValuedToMatch: js.UndefOr[Double] = js.native
  var mergeContiguous: js.UndefOr[Boolean] = js.native
  var on: Boolean = js.native
  var payloads: js.UndefOr[Boolean] = js.native
  var preserveMulti: js.UndefOr[Boolean] = js.native
  var q: js.UndefOr[String | js.Array[String]] = js.native
  var qparser: js.UndefOr[String] = js.native
  var regexMaxAnalyzedChars: js.UndefOr[Double] = js.native
  var regexPattern: js.UndefOr[String] = js.native
  var regexSlop: js.UndefOr[Double] = js.native
  var requireFieldMatch: js.UndefOr[Boolean] = js.native
  var simplePost: js.UndefOr[String] = js.native
  var simplePre: js.UndefOr[String] = js.native
  var snippets: js.UndefOr[Double] = js.native
  var usePhraseHighlighter: js.UndefOr[Boolean] = js.native
}

object HighlightOptions {
  @scala.inline
  def apply(on: Boolean): HighlightOptions = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightOptions]
  }
  @scala.inline
  implicit class HighlightOptionsOps[Self <: HighlightOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOn(value: Boolean): Self = this.set("on", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlternateField(value: String): Self = this.set("alternateField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateField: Self = this.set("alternateField", js.undefined)
    @scala.inline
    def setFlVarargs(value: String*): Self = this.set("fl", js.Array(value :_*))
    @scala.inline
    def setFl(value: String | js.Array[String]): Self = this.set("fl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFl: Self = this.set("fl", js.undefined)
    @scala.inline
    def setFormatter(value: String): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setFragmenter(value: String): Self = this.set("fragmenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmenter: Self = this.set("fragmenter", js.undefined)
    @scala.inline
    def setFragsize(value: Double): Self = this.set("fragsize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragsize: Self = this.set("fragsize", js.undefined)
    @scala.inline
    def setHighlightMultiTerm(value: Boolean): Self = this.set("highlightMultiTerm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightMultiTerm: Self = this.set("highlightMultiTerm", js.undefined)
    @scala.inline
    def setMaxAlternateFieldLength(value: Double): Self = this.set("maxAlternateFieldLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAlternateFieldLength: Self = this.set("maxAlternateFieldLength", js.undefined)
    @scala.inline
    def setMaxAnalyzedChars(value: Double): Self = this.set("maxAnalyzedChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAnalyzedChars: Self = this.set("maxAnalyzedChars", js.undefined)
    @scala.inline
    def setMaxMultiValuedToExamine(value: Double): Self = this.set("maxMultiValuedToExamine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMultiValuedToExamine: Self = this.set("maxMultiValuedToExamine", js.undefined)
    @scala.inline
    def setMaxMultiValuedToMatch(value: Double): Self = this.set("maxMultiValuedToMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMultiValuedToMatch: Self = this.set("maxMultiValuedToMatch", js.undefined)
    @scala.inline
    def setMergeContiguous(value: Boolean): Self = this.set("mergeContiguous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeContiguous: Self = this.set("mergeContiguous", js.undefined)
    @scala.inline
    def setPayloads(value: Boolean): Self = this.set("payloads", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloads: Self = this.set("payloads", js.undefined)
    @scala.inline
    def setPreserveMulti(value: Boolean): Self = this.set("preserveMulti", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveMulti: Self = this.set("preserveMulti", js.undefined)
    @scala.inline
    def setQVarargs(value: String*): Self = this.set("q", js.Array(value :_*))
    @scala.inline
    def setQ(value: String | js.Array[String]): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setQparser(value: String): Self = this.set("qparser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQparser: Self = this.set("qparser", js.undefined)
    @scala.inline
    def setRegexMaxAnalyzedChars(value: Double): Self = this.set("regexMaxAnalyzedChars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexMaxAnalyzedChars: Self = this.set("regexMaxAnalyzedChars", js.undefined)
    @scala.inline
    def setRegexPattern(value: String): Self = this.set("regexPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexPattern: Self = this.set("regexPattern", js.undefined)
    @scala.inline
    def setRegexSlop(value: Double): Self = this.set("regexSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexSlop: Self = this.set("regexSlop", js.undefined)
    @scala.inline
    def setRequireFieldMatch(value: Boolean): Self = this.set("requireFieldMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequireFieldMatch: Self = this.set("requireFieldMatch", js.undefined)
    @scala.inline
    def setSimplePost(value: String): Self = this.set("simplePost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimplePost: Self = this.set("simplePost", js.undefined)
    @scala.inline
    def setSimplePre(value: String): Self = this.set("simplePre", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimplePre: Self = this.set("simplePre", js.undefined)
    @scala.inline
    def setSnippets(value: Double): Self = this.set("snippets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippets: Self = this.set("snippets", js.undefined)
    @scala.inline
    def setUsePhraseHighlighter(value: Boolean): Self = this.set("usePhraseHighlighter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePhraseHighlighter: Self = this.set("usePhraseHighlighter", js.undefined)
  }
  
}

