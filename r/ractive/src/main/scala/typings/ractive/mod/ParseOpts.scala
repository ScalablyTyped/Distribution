package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOpts extends BaseParseOpts {
  /** If true, the parser will operate as if in a tag e.g. foo="bar" is parsed as an attribute rather than a string. */
  var attributes: js.UndefOr[Boolean] = js.undefined
  /** If true, will parse elements as plain text, which allows the resulting template to be used to produce templates that are also later parsed. */
  var textOnlyMode: js.UndefOr[Boolean] = js.undefined
}

object ParseOpts {
  @scala.inline
  def apply(
    attributes: js.UndefOr[Boolean] = js.undefined,
    contextLines: js.UndefOr[Double] = js.undefined,
    csp: js.UndefOr[Boolean] = js.undefined,
    delimiters: ParseDelimiters = null,
    preserveWhitespace: js.UndefOr[Boolean] = js.undefined,
    sanitize: Boolean | SanitizeOpts = null,
    staticDelimiters: ParseDelimiters = null,
    staticTripleDelimiters: ParseDelimiters = null,
    stripComments: js.UndefOr[Boolean] = js.undefined,
    textOnlyMode: js.UndefOr[Boolean] = js.undefined,
    tripleDelimiters: ParseDelimiters = null
  ): ParseOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attributes)) __obj.updateDynamic("attributes")(attributes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(contextLines)) __obj.updateDynamic("contextLines")(contextLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(csp)) __obj.updateDynamic("csp")(csp.get.asInstanceOf[js.Any])
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.get.asInstanceOf[js.Any])
    if (sanitize != null) __obj.updateDynamic("sanitize")(sanitize.asInstanceOf[js.Any])
    if (staticDelimiters != null) __obj.updateDynamic("staticDelimiters")(staticDelimiters.asInstanceOf[js.Any])
    if (staticTripleDelimiters != null) __obj.updateDynamic("staticTripleDelimiters")(staticTripleDelimiters.asInstanceOf[js.Any])
    if (!js.isUndefined(stripComments)) __obj.updateDynamic("stripComments")(stripComments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textOnlyMode)) __obj.updateDynamic("textOnlyMode")(textOnlyMode.get.asInstanceOf[js.Any])
    if (tripleDelimiters != null) __obj.updateDynamic("tripleDelimiters")(tripleDelimiters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOpts]
  }
}

