package typings.ractive.ractiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseParseOpts extends js.Object {
  /** The number of lines of template above and below a line with an error to include in the error message. */
  var contextLines: js.UndefOr[Double] = js.undefined
  /** Whether or not to produce a map of expression string -> function when parsing the template. */
  var csp: js.UndefOr[Boolean] = js.undefined
  /** The regular mustach delimiters - defaults to {{ }}. */
  var delimiters: js.UndefOr[ParseDelimiters] = js.undefined
  /** Whether or not to collapse consective whitespace into a single space. */
  var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
  /** Whether or not to remove certain elements and event attributes from the parsed template. */
  var sanitize: js.UndefOr[Boolean | SanitizeOpts] = js.undefined
  /** The static mustache delimiters - defaults to [[ ]]. */
  var staticDelimiters: js.UndefOr[ParseDelimiters] = js.undefined
  /** The static triple mustache delimiters - defaults to [[[ ]]]. */
  var staticTripleDelimiters: js.UndefOr[ParseDelimiters] = js.undefined
  /** Whether or not to remove HTML comments from the template. Defaults to true. */
  var stripComments: js.UndefOr[Boolean] = js.undefined
  /** The triple mustache delimiters - defaults to {{{ }}}. */
  var tripleDelimiters: js.UndefOr[ParseDelimiters] = js.undefined
}

object BaseParseOpts {
  @scala.inline
  def apply(
    contextLines: Int | Double = null,
    csp: js.UndefOr[Boolean] = js.undefined,
    delimiters: ParseDelimiters = null,
    preserveWhitespace: js.UndefOr[Boolean] = js.undefined,
    sanitize: Boolean | SanitizeOpts = null,
    staticDelimiters: ParseDelimiters = null,
    staticTripleDelimiters: ParseDelimiters = null,
    stripComments: js.UndefOr[Boolean] = js.undefined,
    tripleDelimiters: ParseDelimiters = null
  ): BaseParseOpts = {
    val __obj = js.Dynamic.literal()
    if (contextLines != null) __obj.updateDynamic("contextLines")(contextLines.asInstanceOf[js.Any])
    if (!js.isUndefined(csp)) __obj.updateDynamic("csp")(csp)
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters)
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace)
    if (sanitize != null) __obj.updateDynamic("sanitize")(sanitize.asInstanceOf[js.Any])
    if (staticDelimiters != null) __obj.updateDynamic("staticDelimiters")(staticDelimiters)
    if (staticTripleDelimiters != null) __obj.updateDynamic("staticTripleDelimiters")(staticTripleDelimiters)
    if (!js.isUndefined(stripComments)) __obj.updateDynamic("stripComments")(stripComments)
    if (tripleDelimiters != null) __obj.updateDynamic("tripleDelimiters")(tripleDelimiters)
    __obj.asInstanceOf[BaseParseOpts]
  }
}

