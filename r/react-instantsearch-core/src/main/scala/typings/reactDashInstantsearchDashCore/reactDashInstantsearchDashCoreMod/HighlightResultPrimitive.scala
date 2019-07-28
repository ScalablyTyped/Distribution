package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreStrings.full
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreStrings.none
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreStrings.partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightResultPrimitive extends js.Object {
  var fullyHighlighted: js.UndefOr[Boolean] = js.undefined
  /** full, partial or none depending on how the query terms match */
  var matchLevel: none | partial | full
  var matchedWords: js.Array[String]
  /** the value of the facet highlighted (html) */
  var value: String
}

object HighlightResultPrimitive {
  @scala.inline
  def apply(
    matchLevel: none | partial | full,
    matchedWords: js.Array[String],
    value: String,
    fullyHighlighted: js.UndefOr[Boolean] = js.undefined
  ): HighlightResultPrimitive = {
    val __obj = js.Dynamic.literal(matchLevel = matchLevel.asInstanceOf[js.Any], matchedWords = matchedWords, value = value)
    if (!js.isUndefined(fullyHighlighted)) __obj.updateDynamic("fullyHighlighted")(fullyHighlighted)
    __obj.asInstanceOf[HighlightResultPrimitive]
  }
}

