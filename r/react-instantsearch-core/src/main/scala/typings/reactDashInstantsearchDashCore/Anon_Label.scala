package typings.reactDashInstantsearchDashCore

import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.RefinementValue
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.SearchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label extends js.Object {
  var label: String
  var value: RefinementValue
}

object Anon_Label {
  @scala.inline
  def apply(label: String, value: /* searchState */ SearchState => SearchState): Anon_Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
  
    __obj.asInstanceOf[Anon_Label]
  }
}

