package typings.reactPlacesAutocomplete

import typings.reactPlacesAutocomplete.mod.Suggestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetInputProps extends js.Object {
  var loading: Boolean = js.native
  var suggestions: js.Array[Suggestion] = js.native
  def getInputProps[InputProps /* <: js.Object */](): AnonAriaactivedescendant with InputProps = js.native
  def getInputProps[InputProps /* <: js.Object */](options: InputProps): AnonAriaactivedescendant with InputProps = js.native
  def getSuggestionItemProps[SuggestionProps /* <: js.Object */](suggestion: Suggestion): AnonId with SuggestionProps = js.native
  def getSuggestionItemProps[SuggestionProps /* <: js.Object */](suggestion: Suggestion, options: SuggestionProps): AnonId with SuggestionProps = js.native
}

