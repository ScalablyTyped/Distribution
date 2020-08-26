package typings.sbd.mod

import typings.sbd.sbdBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var abbreviations: js.UndefOr[js.Array[String]] = js.native
  var allowed_tags: js.UndefOr[`false` | js.Array[String]] = js.native
  var html_boundaries: js.UndefOr[Boolean] = js.native
  var html_boundaries_tags: js.UndefOr[js.Array[String]] = js.native
  var newline_boundaries: js.UndefOr[Boolean] = js.native
  var preserve_whitespace: js.UndefOr[Boolean] = js.native
  var sanitize: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAbbreviationsVarargs(value: String*): Self = this.set("abbreviations", js.Array(value :_*))
    @scala.inline
    def setAbbreviations(value: js.Array[String]): Self = this.set("abbreviations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbbreviations: Self = this.set("abbreviations", js.undefined)
    @scala.inline
    def setAllowed_tagsVarargs(value: String*): Self = this.set("allowed_tags", js.Array(value :_*))
    @scala.inline
    def setAllowed_tags(value: `false` | js.Array[String]): Self = this.set("allowed_tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowed_tags: Self = this.set("allowed_tags", js.undefined)
    @scala.inline
    def setHtml_boundaries(value: Boolean): Self = this.set("html_boundaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml_boundaries: Self = this.set("html_boundaries", js.undefined)
    @scala.inline
    def setHtml_boundaries_tagsVarargs(value: String*): Self = this.set("html_boundaries_tags", js.Array(value :_*))
    @scala.inline
    def setHtml_boundaries_tags(value: js.Array[String]): Self = this.set("html_boundaries_tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml_boundaries_tags: Self = this.set("html_boundaries_tags", js.undefined)
    @scala.inline
    def setNewline_boundaries(value: Boolean): Self = this.set("newline_boundaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewline_boundaries: Self = this.set("newline_boundaries", js.undefined)
    @scala.inline
    def setPreserve_whitespace(value: Boolean): Self = this.set("preserve_whitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserve_whitespace: Self = this.set("preserve_whitespace", js.undefined)
    @scala.inline
    def setSanitize(value: Boolean): Self = this.set("sanitize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSanitize: Self = this.set("sanitize", js.undefined)
  }
  
}

