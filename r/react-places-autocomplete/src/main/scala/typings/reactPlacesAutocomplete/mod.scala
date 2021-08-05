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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-places-autocomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-places-autocomplete", JSImport.Default)
  @js.native
  class default ()
    extends Component[PropTypes, js.Object, js.Any]
  
  inline def geocodeByAddress(address: String): js.Promise[js.Array[GeocoderResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("geocodeByAddress")(address.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[GeocoderResult]]]
  
  inline def geocodeByPlaceId(placeId: String): js.Promise[js.Array[GeocoderResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("geocodeByPlaceId")(placeId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[GeocoderResult]]]
  
  inline def getLatLng(results: GeocoderResult): js.Promise[LatLngLiteral] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLatLng")(results.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LatLngLiteral]]
  
  type AutocompletePrediction = typings.googlemaps.google.maps.places.AutocompletePrediction
  
  type PlacesAutocomplete = Component[PropTypes, js.Object, js.Any]
  
  trait PropTypes extends StObject {
    
    def children(opts: Readonlyloadingbooleansug): ReactNode
    
    var debounce: js.UndefOr[Double] = js.undefined
    
    var googleCallbackName: js.UndefOr[String] = js.undefined
    
    var highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onError: js.UndefOr[
        js.Function2[/* status */ String, /* clearSuggestion */ js.Function0[Unit], Unit]
      ] = js.undefined
    
    var onSelect: js.UndefOr[js.Function2[/* address */ String, /* placeID */ String, Unit]] = js.undefined
    
    var searchOptions: js.UndefOr[Bounds] = js.undefined
    
    var shouldFetchSuggestions: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object PropTypes {
    
    inline def apply(children: Readonlyloadingbooleansug => ReactNode): PropTypes = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[PropTypes]
    }
    
    extension [Self <: PropTypes](x: Self) {
      
      inline def setChildren(value: Readonlyloadingbooleansug => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      inline def setGoogleCallbackName(value: String): Self = StObject.set(x, "googleCallbackName", value.asInstanceOf[js.Any])
      
      inline def setGoogleCallbackNameUndefined: Self = StObject.set(x, "googleCallbackName", js.undefined)
      
      inline def setHighlightFirstSuggestion(value: Boolean): Self = StObject.set(x, "highlightFirstSuggestion", value.asInstanceOf[js.Any])
      
      inline def setHighlightFirstSuggestionUndefined: Self = StObject.set(x, "highlightFirstSuggestion", js.undefined)
      
      inline def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnError(value: (/* status */ String, /* clearSuggestion */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnSelect(value: (/* address */ String, /* placeID */ String) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setSearchOptions(value: Bounds): Self = StObject.set(x, "searchOptions", value.asInstanceOf[js.Any])
      
      inline def setSearchOptionsUndefined: Self = StObject.set(x, "searchOptions", js.undefined)
      
      inline def setShouldFetchSuggestions(value: Boolean): Self = StObject.set(x, "shouldFetchSuggestions", value.asInstanceOf[js.Any])
      
      inline def setShouldFetchSuggestionsUndefined: Self = StObject.set(x, "shouldFetchSuggestions", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Suggestion extends StObject {
    
    var active: Boolean
    
    var description: String
    
    var formattedSuggestion: MainText
    
    var id: String
    
    var index: Double
    
    var matchedSubstrings: js.Array[PredictionSubstring]
    
    var placeId: String
    
    var terms: js.Array[PredictionTerm]
    
    var types: js.Array[String]
  }
  object Suggestion {
    
    inline def apply(
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
    
    extension [Self <: Suggestion](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFormattedSuggestion(value: MainText): Self = StObject.set(x, "formattedSuggestion", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setMatchedSubstrings(value: js.Array[PredictionSubstring]): Self = StObject.set(x, "matchedSubstrings", value.asInstanceOf[js.Any])
      
      inline def setMatchedSubstringsVarargs(value: PredictionSubstring*): Self = StObject.set(x, "matchedSubstrings", js.Array(value :_*))
      
      inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
      
      inline def setTerms(value: js.Array[PredictionTerm]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
      
      inline def setTermsVarargs(value: PredictionTerm*): Self = StObject.set(x, "terms", js.Array(value :_*))
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
}
