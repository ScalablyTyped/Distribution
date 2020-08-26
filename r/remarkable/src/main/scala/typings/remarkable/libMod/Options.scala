package typings.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Convert "\n" in paragraphs into <br>.
    */
  var breaks: js.UndefOr[Boolean] = js.native
  /**
    * Highlighter function. Should return escaped HTML, or "" if the source
    * string is not changed.
    */
  var highlight: js.UndefOr[js.Function2[/* str */ String, /* lang */ String, String]] = js.native
  /**
    * Enable HTML tags in source.
    */
  var html: js.UndefOr[Boolean] = js.native
  /**
    * CSS language prefix for fenced blocks.
    */
  var langPrefix: js.UndefOr[String] = js.native
  /**
    * Set target to open link in
    */
  var linkTarget: js.UndefOr[String] = js.native
  /**
    * Autoconvert URL-like text to links.
    */
  var linkify: js.UndefOr[Boolean] = js.native
  /**
    * Double + single quotes replacement pairs, when typographer enabled,
    * and smartquotes on. Set doubles to "«»" for Russian, "„“" for German.
    */
  var quotes: js.UndefOr[String] = js.native
  /**
    * Enable some language-neutral replacement + quotes beautification.
    */
  var typographer: js.UndefOr[Boolean] = js.native
  /**
    * Use "/" to close single tags (<br />).
    */
  var xhtmlOut: js.UndefOr[Boolean] = js.native
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
    def setBreaks(value: Boolean): Self = this.set("breaks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreaks: Self = this.set("breaks", js.undefined)
    @scala.inline
    def setHighlight(value: (/* str */ String, /* lang */ String) => String): Self = this.set("highlight", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setLangPrefix(value: String): Self = this.set("langPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLangPrefix: Self = this.set("langPrefix", js.undefined)
    @scala.inline
    def setLinkTarget(value: String): Self = this.set("linkTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkTarget: Self = this.set("linkTarget", js.undefined)
    @scala.inline
    def setLinkify(value: Boolean): Self = this.set("linkify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkify: Self = this.set("linkify", js.undefined)
    @scala.inline
    def setQuotes(value: String): Self = this.set("quotes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotes: Self = this.set("quotes", js.undefined)
    @scala.inline
    def setTypographer(value: Boolean): Self = this.set("typographer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypographer: Self = this.set("typographer", js.undefined)
    @scala.inline
    def setXhtmlOut(value: Boolean): Self = this.set("xhtmlOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhtmlOut: Self = this.set("xhtmlOut", js.undefined)
  }
  
}

