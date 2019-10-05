package typings.reactDashPlacesDashAutocomplete.reactDashPlacesDashAutocompleteMod

import typings.googlemaps.google.maps.places.PredictionSubstring
import typings.googlemaps.google.maps.places.PredictionTerm
import typings.reactDashPlacesDashAutocomplete.Anon_MainText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggestion extends js.Object {
  var active: Boolean
  var description: String
  var formattedSuggestion: Anon_MainText
  var id: String
  var index: Double
  var matchedSubstrings: js.Array[PredictionSubstring]
  var placeId: String
  var terms: js.Array[PredictionTerm]
  var types: js.Array[String]
}

object Suggestion {
  @scala.inline
  def apply(
    active: Boolean,
    description: String,
    formattedSuggestion: Anon_MainText,
    id: String,
    index: Double,
    matchedSubstrings: js.Array[PredictionSubstring],
    placeId: String,
    terms: js.Array[PredictionTerm],
    types: js.Array[String]
  ): Suggestion = {
    val __obj = js.Dynamic.literal(active = active, description = description, formattedSuggestion = formattedSuggestion, id = id, index = index, matchedSubstrings = matchedSubstrings, placeId = placeId, terms = terms, types = types)
  
    __obj.asInstanceOf[Suggestion]
  }
}

