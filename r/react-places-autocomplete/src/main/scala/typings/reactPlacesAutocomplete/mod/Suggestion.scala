package typings.reactPlacesAutocomplete.mod

import typings.googlemaps.google.maps.places.PredictionSubstring
import typings.googlemaps.google.maps.places.PredictionTerm
import typings.reactPlacesAutocomplete.anon.MainText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Suggestion extends js.Object {
  var active: Boolean = js.native
  var description: String = js.native
  var formattedSuggestion: MainText = js.native
  var id: String = js.native
  var index: Double = js.native
  var matchedSubstrings: js.Array[PredictionSubstring] = js.native
  var placeId: String = js.native
  var terms: js.Array[PredictionTerm] = js.native
  var types: js.Array[String] = js.native
}

object Suggestion {
  @scala.inline
  def apply(
    active: Boolean,
    description: String,
    formattedSuggestion: MainText,
    id: String,
    index: Double,
    matchedSubstrings: js.Array[PredictionSubstring],
    placeId: String,
    terms: js.Array[PredictionTerm],
    types: js.Array[String]
  ): Suggestion = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formattedSuggestion = formattedSuggestion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], matchedSubstrings = matchedSubstrings.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suggestion]
  }
  @scala.inline
  implicit class SuggestionOps[Self <: Suggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedSuggestion(value: MainText): Self = this.set("formattedSuggestion", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatchedSubstringsVarargs(value: PredictionSubstring*): Self = this.set("matchedSubstrings", js.Array(value :_*))
    @scala.inline
    def setMatchedSubstrings(value: js.Array[PredictionSubstring]): Self = this.set("matchedSubstrings", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTermsVarargs(value: PredictionTerm*): Self = this.set("terms", js.Array(value :_*))
    @scala.inline
    def setTerms(value: js.Array[PredictionTerm]): Self = this.set("terms", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}

