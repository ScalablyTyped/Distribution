package typings.sbd.mod

import typings.sbd.sbdBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var abbreviations: js.UndefOr[js.Array[String]] = js.undefined
  var allowed_tags: js.UndefOr[`false` | js.Array[String]] = js.undefined
  var html_boundaries: js.UndefOr[Boolean] = js.undefined
  var html_boundaries_tags: js.UndefOr[js.Array[String]] = js.undefined
  var newline_boundaries: js.UndefOr[Boolean] = js.undefined
  var preserve_whitespace: js.UndefOr[Boolean] = js.undefined
  var sanitize: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    abbreviations: js.Array[String] = null,
    allowed_tags: `false` | js.Array[String] = null,
    html_boundaries: js.UndefOr[Boolean] = js.undefined,
    html_boundaries_tags: js.Array[String] = null,
    newline_boundaries: js.UndefOr[Boolean] = js.undefined,
    preserve_whitespace: js.UndefOr[Boolean] = js.undefined,
    sanitize: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (abbreviations != null) __obj.updateDynamic("abbreviations")(abbreviations.asInstanceOf[js.Any])
    if (allowed_tags != null) __obj.updateDynamic("allowed_tags")(allowed_tags.asInstanceOf[js.Any])
    if (!js.isUndefined(html_boundaries)) __obj.updateDynamic("html_boundaries")(html_boundaries.asInstanceOf[js.Any])
    if (html_boundaries_tags != null) __obj.updateDynamic("html_boundaries_tags")(html_boundaries_tags.asInstanceOf[js.Any])
    if (!js.isUndefined(newline_boundaries)) __obj.updateDynamic("newline_boundaries")(newline_boundaries.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve_whitespace)) __obj.updateDynamic("preserve_whitespace")(preserve_whitespace.asInstanceOf[js.Any])
    if (!js.isUndefined(sanitize)) __obj.updateDynamic("sanitize")(sanitize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

