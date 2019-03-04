package typings
package reactDashPlacesDashAutocompleteLib.reactDashPlacesDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suggestion extends js.Object {
  var active: scala.Boolean
  var description: java.lang.String
  var formattedSuggestion: reactDashPlacesDashAutocompleteLib.Anon_MainText
  var id: java.lang.String
  var index: scala.Double
  var matchedSubstrings: js.Array[googlemapsLib.googleNs.mapsNs.placesNs.PredictionSubstring]
  var placeId: java.lang.String
  var terms: js.Array[googlemapsLib.googleNs.mapsNs.placesNs.PredictionTerm]
  var types: js.Array[java.lang.String]
}

object Suggestion {
  @scala.inline
  def apply(
    active: scala.Boolean,
    description: java.lang.String,
    formattedSuggestion: reactDashPlacesDashAutocompleteLib.Anon_MainText,
    id: java.lang.String,
    index: scala.Double,
    matchedSubstrings: js.Array[googlemapsLib.googleNs.mapsNs.placesNs.PredictionSubstring],
    placeId: java.lang.String,
    terms: js.Array[googlemapsLib.googleNs.mapsNs.placesNs.PredictionTerm],
    types: js.Array[java.lang.String]
  ): Suggestion = {
    val __obj = js.Dynamic.literal(active = active, description = description, formattedSuggestion = formattedSuggestion, id = id, index = index, matchedSubstrings = matchedSubstrings, placeId = placeId, terms = terms, types = types)
  
    __obj.asInstanceOf[Suggestion]
  }
}

