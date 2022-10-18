package typings.reactGeosuggest

import typings.googleMaps.google.maps.GeocoderResult
import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.places.AutocompletePrediction
import typings.react.mod.Component
import typings.reactGeosuggest.anon.Lat
import typings.reactGeosuggest.anon.Typeofmaps
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-geosuggest", JSImport.Default)
  @js.native
  open class default () extends Geosuggest
  
  trait Fixture extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var label: String
    
    var location: js.UndefOr[LatLng] = js.undefined
  }
  object Fixture {
    
    inline def apply(label: String): Fixture = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fixture]
    }
    
    extension [Self <: Fixture](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  @js.native
  trait Geosuggest
    extends Component[GeosuggestProps, js.Object, Any] {
    
    def blur(): Unit = js.native
    
    def clear(): Unit = js.native
    
    def focus(): Unit = js.native
    
    def selectSuggest(): Unit = js.native
    def selectSuggest(value: Suggest): Unit = js.native
    
    def update(value: String): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<std.HTMLInputElement> ]: P} & {[ P in 'style' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<std.HTMLInputElement>] ]: react.react.InputHTMLAttributes<std.HTMLInputElement>[P]} */ trait GeosuggestProps extends StObject {
    
    var autoActivateFirstSuggest: js.UndefOr[Boolean] = js.undefined
    
    var autoComplete: js.UndefOr[String] = js.undefined
    
    var bounds: js.UndefOr[LatLngBounds] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var country: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fixtures: js.UndefOr[js.Array[Fixture]] = js.undefined
    
    var getSuggestLabel: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, String]] = js.undefined
    
    var googleMaps: js.UndefOr[Typeofmaps] = js.undefined
    
    var highlightMatch: js.UndefOr[Boolean] = js.undefined
    
    var ignoreEnter: js.UndefOr[Boolean] = js.undefined
    
    var ignoreTab: js.UndefOr[Boolean] = js.undefined
    
    var initialValue: js.UndefOr[String] = js.undefined
    
    var inputClassName: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[LatLng] = js.undefined
    
    var maxFixtures: js.UndefOr[Double] = js.undefined
    
    var minLength: js.UndefOr[Double] = js.undefined
    
    var onActivateSuggest: js.UndefOr[js.Function1[/* suggest */ Suggest, Unit]] = js.undefined
    
    var onBlur: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var onKeyPress: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var onSuggestNoResults: js.UndefOr[js.Function1[/* userInput */ String, Unit]] = js.undefined
    
    var onSuggestSelect: js.UndefOr[js.Function1[/* suggest */ Suggest, Unit]] = js.undefined
    
    var onUpdateSuggests: js.UndefOr[js.Function2[/* suggests */ Any, /* activeSuggest */ Any, Unit]] = js.undefined
    
    var placeDetailFields: js.UndefOr[js.Array[String]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var queryDelay: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var renderSuggestItem: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, Any]] = js.undefined
    
    var skipSuggest: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, Boolean]] = js.undefined
    
    var style: js.UndefOr[Styles] = js.undefined
    
    var suggestItemActiveClassName: js.UndefOr[String] = js.undefined
    
    var suggestItemClassName: js.UndefOr[String] = js.undefined
    
    var suggestsClassName: js.UndefOr[String] = js.undefined
    
    var suggestsHiddenClassName: js.UndefOr[String] = js.undefined
    
    var types: js.UndefOr[js.Array[QueryType]] = js.undefined
  }
  object GeosuggestProps {
    
    inline def apply(): GeosuggestProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeosuggestProps]
    }
    
    extension [Self <: GeosuggestProps](x: Self) {
      
      inline def setAutoActivateFirstSuggest(value: Boolean): Self = StObject.set(x, "autoActivateFirstSuggest", value.asInstanceOf[js.Any])
      
      inline def setAutoActivateFirstSuggestUndefined: Self = StObject.set(x, "autoActivateFirstSuggest", js.undefined)
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      inline def setBounds(value: LatLngBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCountry(value: String | js.Array[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setCountryVarargs(value: String*): Self = StObject.set(x, "country", js.Array(value*))
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFixtures(value: js.Array[Fixture]): Self = StObject.set(x, "fixtures", value.asInstanceOf[js.Any])
      
      inline def setFixturesUndefined: Self = StObject.set(x, "fixtures", js.undefined)
      
      inline def setFixturesVarargs(value: Fixture*): Self = StObject.set(x, "fixtures", js.Array(value*))
      
      inline def setGetSuggestLabel(value: /* googleSuggest */ AutocompletePrediction => String): Self = StObject.set(x, "getSuggestLabel", js.Any.fromFunction1(value))
      
      inline def setGetSuggestLabelUndefined: Self = StObject.set(x, "getSuggestLabel", js.undefined)
      
      inline def setGoogleMaps(value: Typeofmaps): Self = StObject.set(x, "googleMaps", value.asInstanceOf[js.Any])
      
      inline def setGoogleMapsUndefined: Self = StObject.set(x, "googleMaps", js.undefined)
      
      inline def setHighlightMatch(value: Boolean): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
      
      inline def setHighlightMatchUndefined: Self = StObject.set(x, "highlightMatch", js.undefined)
      
      inline def setIgnoreEnter(value: Boolean): Self = StObject.set(x, "ignoreEnter", value.asInstanceOf[js.Any])
      
      inline def setIgnoreEnterUndefined: Self = StObject.set(x, "ignoreEnter", js.undefined)
      
      inline def setIgnoreTab(value: Boolean): Self = StObject.set(x, "ignoreTab", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTabUndefined: Self = StObject.set(x, "ignoreTab", js.undefined)
      
      inline def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      inline def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setMaxFixtures(value: Double): Self = StObject.set(x, "maxFixtures", value.asInstanceOf[js.Any])
      
      inline def setMaxFixturesUndefined: Self = StObject.set(x, "maxFixtures", js.undefined)
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setOnActivateSuggest(value: /* suggest */ Suggest => Unit): Self = StObject.set(x, "onActivateSuggest", js.Any.fromFunction1(value))
      
      inline def setOnActivateSuggestUndefined: Self = StObject.set(x, "onActivateSuggest", js.undefined)
      
      inline def setOnBlur(value: /* value */ Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: /* value */ Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ Any => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyPress(value: /* event */ Any => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      inline def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      inline def setOnSuggestNoResults(value: /* userInput */ String => Unit): Self = StObject.set(x, "onSuggestNoResults", js.Any.fromFunction1(value))
      
      inline def setOnSuggestNoResultsUndefined: Self = StObject.set(x, "onSuggestNoResults", js.undefined)
      
      inline def setOnSuggestSelect(value: /* suggest */ Suggest => Unit): Self = StObject.set(x, "onSuggestSelect", js.Any.fromFunction1(value))
      
      inline def setOnSuggestSelectUndefined: Self = StObject.set(x, "onSuggestSelect", js.undefined)
      
      inline def setOnUpdateSuggests(value: (/* suggests */ Any, /* activeSuggest */ Any) => Unit): Self = StObject.set(x, "onUpdateSuggests", js.Any.fromFunction2(value))
      
      inline def setOnUpdateSuggestsUndefined: Self = StObject.set(x, "onUpdateSuggests", js.undefined)
      
      inline def setPlaceDetailFields(value: js.Array[String]): Self = StObject.set(x, "placeDetailFields", value.asInstanceOf[js.Any])
      
      inline def setPlaceDetailFieldsUndefined: Self = StObject.set(x, "placeDetailFields", js.undefined)
      
      inline def setPlaceDetailFieldsVarargs(value: String*): Self = StObject.set(x, "placeDetailFields", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setQueryDelay(value: Double): Self = StObject.set(x, "queryDelay", value.asInstanceOf[js.Any])
      
      inline def setQueryDelayUndefined: Self = StObject.set(x, "queryDelay", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRenderSuggestItem(value: /* googleSuggest */ AutocompletePrediction => Any): Self = StObject.set(x, "renderSuggestItem", js.Any.fromFunction1(value))
      
      inline def setRenderSuggestItemUndefined: Self = StObject.set(x, "renderSuggestItem", js.undefined)
      
      inline def setSkipSuggest(value: /* googleSuggest */ AutocompletePrediction => Boolean): Self = StObject.set(x, "skipSuggest", js.Any.fromFunction1(value))
      
      inline def setSkipSuggestUndefined: Self = StObject.set(x, "skipSuggest", js.undefined)
      
      inline def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuggestItemActiveClassName(value: String): Self = StObject.set(x, "suggestItemActiveClassName", value.asInstanceOf[js.Any])
      
      inline def setSuggestItemActiveClassNameUndefined: Self = StObject.set(x, "suggestItemActiveClassName", js.undefined)
      
      inline def setSuggestItemClassName(value: String): Self = StObject.set(x, "suggestItemClassName", value.asInstanceOf[js.Any])
      
      inline def setSuggestItemClassNameUndefined: Self = StObject.set(x, "suggestItemClassName", js.undefined)
      
      inline def setSuggestsClassName(value: String): Self = StObject.set(x, "suggestsClassName", value.asInstanceOf[js.Any])
      
      inline def setSuggestsClassNameUndefined: Self = StObject.set(x, "suggestsClassName", js.undefined)
      
      inline def setSuggestsHiddenClassName(value: String): Self = StObject.set(x, "suggestsHiddenClassName", value.asInstanceOf[js.Any])
      
      inline def setSuggestsHiddenClassNameUndefined: Self = StObject.set(x, "suggestsHiddenClassName", js.undefined)
      
      inline def setTypes(value: js.Array[QueryType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      inline def setTypesVarargs(value: QueryType*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  
  object QueryType {
    
    inline def LeftparenthesiscitiesRightparenthesis: /* (cities) */ String = "(cities)".asInstanceOf[/* (cities) */ String]
    
    inline def LeftparenthesisregionsRightparenthesis: /* (regions) */ String = "(regions)".asInstanceOf[/* (regions) */ String]
    
    inline def address: typings.reactGeosuggest.reactGeosuggestStrings.address = "address".asInstanceOf[typings.reactGeosuggest.reactGeosuggestStrings.address]
    
    inline def establishment: typings.reactGeosuggest.reactGeosuggestStrings.establishment = "establishment".asInstanceOf[typings.reactGeosuggest.reactGeosuggestStrings.establishment]
    
    inline def geocode: typings.reactGeosuggest.reactGeosuggestStrings.geocode = "geocode".asInstanceOf[typings.reactGeosuggest.reactGeosuggestStrings.geocode]
  }
  /* Rewritten from type alias, can be one of: 
    - typings.reactGeosuggest.reactGeosuggestStrings.address
    - typings.reactGeosuggest.reactGeosuggestStrings.establishment
    - typings.reactGeosuggest.reactGeosuggestStrings.geocode
    - / * (cities) * / java.lang.String
  */
  type QueryType = _QueryType | (/* (cities) */ String)
  
  trait Styles extends StObject {
    
    var input: js.UndefOr[Record[String, Any]] = js.undefined
    
    var suggestItem: js.UndefOr[Record[String, Any]] = js.undefined
    
    var suggests: js.UndefOr[Record[String, Any]] = js.undefined
  }
  object Styles {
    
    inline def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    extension [Self <: Styles](x: Self) {
      
      inline def setInput(value: Record[String, Any]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setSuggestItem(value: Record[String, Any]): Self = StObject.set(x, "suggestItem", value.asInstanceOf[js.Any])
      
      inline def setSuggestItemUndefined: Self = StObject.set(x, "suggestItem", js.undefined)
      
      inline def setSuggests(value: Record[String, Any]): Self = StObject.set(x, "suggests", value.asInstanceOf[js.Any])
      
      inline def setSuggestsUndefined: Self = StObject.set(x, "suggests", js.undefined)
    }
  }
  
  trait Suggest extends StObject {
    
    var gmaps: js.UndefOr[GeocoderResult] = js.undefined
    
    var label: String
    
    var location: Lat
    
    var placeId: String
  }
  object Suggest {
    
    inline def apply(label: String, location: Lat, placeId: String): Suggest = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suggest]
    }
    
    extension [Self <: Suggest](x: Self) {
      
      inline def setGmaps(value: GeocoderResult): Self = StObject.set(x, "gmaps", value.asInstanceOf[js.Any])
      
      inline def setGmapsUndefined: Self = StObject.set(x, "gmaps", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Lat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    }
  }
  
  trait _QueryType extends StObject
}
