package typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod

import typings.reactDashInstantsearchDashCore.Anon_Label
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Refinement extends js.Object {
  var attribute: String
  var currentRefinement: js.UndefOr[js.Array[String] | String] = js.undefined
  var id: String
  var index: String
  var items: js.UndefOr[js.Array[Anon_Label]] = js.undefined
  var label: String
  var value: RefinementValue
}

object Refinement {
  @scala.inline
  def apply(
    attribute: String,
    id: String,
    index: String,
    label: String,
    value: /* searchState */ SearchState => SearchState,
    currentRefinement: String = null,
    items: js.Array[Anon_Label] = null
  ): Refinement = {
    val __obj = js.Dynamic.literal(attribute = attribute, id = id, index = index, label = label, value = js.Any.fromFunction1(value))
    if (currentRefinement != null) __obj.updateDynamic("currentRefinement")(currentRefinement)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Refinement]
  }
}

