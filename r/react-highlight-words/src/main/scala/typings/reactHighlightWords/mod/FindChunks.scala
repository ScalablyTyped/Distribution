package typings.reactHighlightWords.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindChunks extends js.Object {
  var autoEscape: js.UndefOr[Boolean] = js.undefined
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var sanitize: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
  var searchWords: js.Array[String]
  var textToHighlight: String
}

object FindChunks {
  @scala.inline
  def apply(
    searchWords: js.Array[String],
    textToHighlight: String,
    autoEscape: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    sanitize: /* text */ String => String = null
  ): FindChunks = {
    val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
    if (!js.isUndefined(autoEscape)) __obj.updateDynamic("autoEscape")(autoEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (sanitize != null) __obj.updateDynamic("sanitize")(js.Any.fromFunction1(sanitize))
    __obj.asInstanceOf[FindChunks]
  }
}

