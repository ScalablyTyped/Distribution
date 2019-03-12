package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightResultPrimitive extends js.Object {
  var fullyHighlighted: js.UndefOr[scala.Boolean] = js.undefined
  /** full, partial or none depending on how the query terms match */
  var matchLevel: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibStrings.none | reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibStrings.partial | reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibStrings.full
  var matchedWords: js.Array[java.lang.String]
  /** the value of the facet highlighted (html) */
  var value: java.lang.String
}

object HighlightResultPrimitive {
  @scala.inline
  def apply(
    matchLevel: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibStrings.none | reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibStrings.partial | reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreLibStrings.full,
    matchedWords: js.Array[java.lang.String],
    value: java.lang.String,
    fullyHighlighted: js.UndefOr[scala.Boolean] = js.undefined
  ): HighlightResultPrimitive = {
    val __obj = js.Dynamic.literal(matchLevel = matchLevel.asInstanceOf[js.Any], matchedWords = matchedWords, value = value)
    if (!js.isUndefined(fullyHighlighted)) __obj.updateDynamic("fullyHighlighted")(fullyHighlighted)
    __obj.asInstanceOf[HighlightResultPrimitive]
  }
}

