package typings
package reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Refinement extends js.Object {
  var attribute: java.lang.String
  var currentRefinement: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var id: java.lang.String
  var index: java.lang.String
  var items: js.UndefOr[js.Array[reactDashInstantsearchDashCoreLib.Anon_Label]] = js.undefined
  var label: java.lang.String
  var value: RefinementValue
}

object Refinement {
  @scala.inline
  def apply(
    attribute: java.lang.String,
    id: java.lang.String,
    index: java.lang.String,
    label: java.lang.String,
    value: RefinementValue,
    currentRefinement: java.lang.String = null,
    items: js.Array[reactDashInstantsearchDashCoreLib.Anon_Label] = null
  ): Refinement = {
    val __obj = js.Dynamic.literal(attribute = attribute, id = id, index = index, label = label, value = value)
    if (currentRefinement != null) __obj.updateDynamic("currentRefinement")(currentRefinement)
    if (items != null) __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[Refinement]
  }
}

