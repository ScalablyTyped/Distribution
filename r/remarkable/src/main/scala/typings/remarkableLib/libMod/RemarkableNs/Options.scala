package typings
package remarkableLib.libMod.RemarkableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Convert "\n" in paragraphs into <br>.
    */
  var breaks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Highlighter function. Should return escaped HTML, or "" if the source
    * string is not changed.
    */
  var highlight: js.UndefOr[
    js.Function2[/* str */ java.lang.String, /* lang */ java.lang.String, java.lang.String]
  ] = js.undefined
  /**
    * Enable HTML tags in source.
    */
  var html: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * CSS language prefix for fenced blocks.
    */
  var langPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Autoconvert URL-like text to links.
    */
  var linkify: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Double + single quotes replacement pairs, when typographer enabled,
    * and smartquotes on. Set doubles to "«»" for Russian, "„“" for German.
    */
  var quotes: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable some language-neutral replacement + quotes beautification.
    */
  var typographer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Use "/" to close single tags (<br />).
    */
  var xhtmlOut: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    breaks: js.UndefOr[scala.Boolean] = js.undefined,
    highlight: js.Function2[/* str */ java.lang.String, /* lang */ java.lang.String, java.lang.String] = null,
    html: js.UndefOr[scala.Boolean] = js.undefined,
    langPrefix: java.lang.String = null,
    linkify: js.UndefOr[scala.Boolean] = js.undefined,
    quotes: java.lang.String = null,
    typographer: js.UndefOr[scala.Boolean] = js.undefined,
    xhtmlOut: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(breaks)) __obj.updateDynamic("breaks")(breaks)
    if (highlight != null) __obj.updateDynamic("highlight")(highlight)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    if (langPrefix != null) __obj.updateDynamic("langPrefix")(langPrefix)
    if (!js.isUndefined(linkify)) __obj.updateDynamic("linkify")(linkify)
    if (quotes != null) __obj.updateDynamic("quotes")(quotes)
    if (!js.isUndefined(typographer)) __obj.updateDynamic("typographer")(typographer)
    if (!js.isUndefined(xhtmlOut)) __obj.updateDynamic("xhtmlOut")(xhtmlOut)
    __obj.asInstanceOf[Options]
  }
}

