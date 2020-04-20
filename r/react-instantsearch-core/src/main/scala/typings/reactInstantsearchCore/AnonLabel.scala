package typings.reactInstantsearchCore

import typings.reactInstantsearchCore.mod.RefinementValue
import typings.reactInstantsearchCore.mod.SearchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLabel extends js.Object {
  var label: String
  var value: RefinementValue
}

object AnonLabel {
  @scala.inline
  def apply(label: String, value: /* searchState */ SearchState => SearchState): AnonLabel = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[AnonLabel]
  }
}

