package typings.reactDashInstantsearchDashCore

import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.RefinementValue
import typings.reactDashInstantsearchDashCore.reactDashInstantsearchDashCoreMod.SearchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attribute extends js.Object {
  var attribute: String
  var id: String
  var index: String
  var label: String
  var value: RefinementValue
}

object Anon_Attribute {
  @scala.inline
  def apply(
    attribute: String,
    id: String,
    index: String,
    label: String,
    value: /* searchState */ SearchState => SearchState
  ): Anon_Attribute = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
  
    __obj.asInstanceOf[Anon_Attribute]
  }
}

