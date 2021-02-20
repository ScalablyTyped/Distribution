package typings.reactPlacesAutocomplete

import typings.googlemaps.google.maps.GeocoderResult
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.places.PredictionSubstring
import typings.googlemaps.google.maps.places.PredictionTerm
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactPlacesAutocomplete.anon.Bounds
import typings.reactPlacesAutocomplete.anon.MainText
import typings.reactPlacesAutocomplete.anon.Readonlyloadingbooleansug
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-places-autocomplete", JSImport.Default)
  @js.native
  class default ()
    extends Component[PropTypes, js.Object, js.Any]
  
  @JSImport("react-places-autocomplete", "geocodeByAddress")
  @js.native
  def geocodeByAddress(address: String): js.Promise[js.Array[GeocoderResult]] = js.native
  
  @JSImport("react-places-autocomplete", "geocodeByPlaceId")
  @js.native
  def geocodeByPlaceId(placeId: String): js.Promise[js.Array[GeocoderResult]] = js.native
  
  @JSImport("react-places-autocomplete", "getLatLng")
  @js.native
  def getLatLng(results: GeocoderResult): js.Promise[LatLngLiteral] = js.native
  
  type AutocompletePrediction = typings.googlemaps.google.maps.places.AutocompletePrediction
  
  type PlacesAutocomplete = Component[PropTypes, js.Object, js.Any]
  
  @js.native
  trait PropTypes extends StObject {
    
    def children(opts: Readonlyloadingbooleansug): ReactNode = js.native
    
    var debounce: js.UndefOr[Double] = js.native
    
    var googleCallbackName: js.UndefOr[String] = js.native
    
    var highlightFirstSuggestion: js.UndefOr[Boolean] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var onError: js.UndefOr[
        js.Function2[/* status */ String, /* clearSuggestion */ js.Function0[Unit], Unit]
      ] = js.native
    
    var onSelect: js.UndefOr[js.Function2[/* address */ String, /* placeID */ String, Unit]] = js.native
    
    var searchOptions: js.UndefOr[Bounds] = js.native
    
    var shouldFetchSuggestions: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object PropTypes {
    
    @scala.inline
    def apply(children: Readonlyloadingbooleansug => ReactNode): PropTypes = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[PropTypes]
    }
    
    @scala.inline
    implicit class PropTypesMutableBuilder[Self <: PropTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: Readonlyloadingbooleansug => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      @scala.inline
      def setGoogleCallbackName(value: String): Self = StObject.set(x, "googleCallbackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleCallbackNameUndefined: Self = StObject.set(x, "googleCallbackName", js.undefined)
      
      @scala.inline
      def setHighlightFirstSuggestion(value: Boolean): Self = StObject.set(x, "highlightFirstSuggestion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightFirstSuggestionUndefined: Self = StObject.set(x, "highlightFirstSuggestion", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnError(value: (/* status */ String, /* clearSuggestion */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (/* address */ String, /* placeID */ String) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setSearchOptions(value: Bounds): Self = StObject.set(x, "searchOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchOptionsUndefined: Self = StObject.set(x, "searchOptions", js.undefined)
      
      @scala.inline
      def setShouldFetchSuggestions(value: Boolean): Self = StObject.set(x, "shouldFetchSuggestions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldFetchSuggestionsUndefined: Self = StObject.set(x, "shouldFetchSuggestions", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Suggestion extends StObject {
    
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
    implicit class SuggestionMutableBuilder[Self <: Suggestion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormattedSuggestion(value: MainText): Self = StObject.set(x, "formattedSuggestion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchedSubstrings(value: js.Array[PredictionSubstring]): Self = StObject.set(x, "matchedSubstrings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchedSubstringsVarargs(value: PredictionSubstring*): Self = StObject.set(x, "matchedSubstrings", js.Array(value :_*))
      
      @scala.inline
      def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerms(value: js.Array[PredictionTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTermsVarargs(value: PredictionTerm*): Self = StObject.set(x, "terms", js.Array(value :_*))
      
      @scala.inline
      def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
}
