package typings.reactGeosuggest

import typings.googlemaps.google.maps.GeocoderResult
import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.places.AutocompletePrediction
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
  class default () extends Geosuggest
  
  trait Fixture extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var label: String
    
    var location: js.UndefOr[LatLng] = js.undefined
  }
  object Fixture {
    
    @scala.inline
    def apply(label: String): Fixture = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fixture]
    }
    
    @scala.inline
    implicit class FixtureMutableBuilder[Self <: Fixture] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  @js.native
  trait Geosuggest
    extends Component[GeosuggestProps, js.Object, js.Any] {
    
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
    
    var onBlur: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
    
    var onKeyPress: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
    
    var onSuggestNoResults: js.UndefOr[js.Function1[/* userInput */ String, Unit]] = js.undefined
    
    var onSuggestSelect: js.UndefOr[js.Function1[/* suggest */ Suggest, Unit]] = js.undefined
    
    var onUpdateSuggests: js.UndefOr[js.Function2[/* suggests */ js.Any, /* activeSuggest */ js.Any, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var queryDelay: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var renderSuggestItem: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, js.Any]] = js.undefined
    
    var skipSuggest: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, Boolean]] = js.undefined
    
    var style: js.UndefOr[Styles] = js.undefined
    
    var suggestItemActiveClassName: js.UndefOr[String] = js.undefined
    
    var suggestItemClassName: js.UndefOr[String] = js.undefined
    
    var suggestsClassName: js.UndefOr[String] = js.undefined
    
    var suggestsHiddenClassName: js.UndefOr[String] = js.undefined
    
    var types: js.UndefOr[js.Array[QueryType]] = js.undefined
  }
  object GeosuggestProps {
    
    @scala.inline
    def apply(): GeosuggestProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GeosuggestProps]
    }
    
    @scala.inline
    implicit class GeosuggestPropsMutableBuilder[Self <: GeosuggestProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoActivateFirstSuggest(value: Boolean): Self = StObject.set(x, "autoActivateFirstSuggest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoActivateFirstSuggestUndefined: Self = StObject.set(x, "autoActivateFirstSuggest", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setBounds(value: LatLngBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCountry(value: String | js.Array[String]): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setCountryVarargs(value: String*): Self = StObject.set(x, "country", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFixtures(value: js.Array[Fixture]): Self = StObject.set(x, "fixtures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixturesUndefined: Self = StObject.set(x, "fixtures", js.undefined)
      
      @scala.inline
      def setFixturesVarargs(value: Fixture*): Self = StObject.set(x, "fixtures", js.Array(value :_*))
      
      @scala.inline
      def setGetSuggestLabel(value: /* googleSuggest */ AutocompletePrediction => String): Self = StObject.set(x, "getSuggestLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSuggestLabelUndefined: Self = StObject.set(x, "getSuggestLabel", js.undefined)
      
      @scala.inline
      def setGoogleMaps(value: Typeofmaps): Self = StObject.set(x, "googleMaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoogleMapsUndefined: Self = StObject.set(x, "googleMaps", js.undefined)
      
      @scala.inline
      def setHighlightMatch(value: Boolean): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightMatchUndefined: Self = StObject.set(x, "highlightMatch", js.undefined)
      
      @scala.inline
      def setIgnoreEnter(value: Boolean): Self = StObject.set(x, "ignoreEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreEnterUndefined: Self = StObject.set(x, "ignoreEnter", js.undefined)
      
      @scala.inline
      def setIgnoreTab(value: Boolean): Self = StObject.set(x, "ignoreTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTabUndefined: Self = StObject.set(x, "ignoreTab", js.undefined)
      
      @scala.inline
      def setInitialValue(value: String): Self = StObject.set(x, "initialValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialValueUndefined: Self = StObject.set(x, "initialValue", js.undefined)
      
      @scala.inline
      def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setMaxFixtures(value: Double): Self = StObject.set(x, "maxFixtures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFixturesUndefined: Self = StObject.set(x, "maxFixtures", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setOnActivateSuggest(value: /* suggest */ Suggest => Unit): Self = StObject.set(x, "onActivateSuggest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActivateSuggestUndefined: Self = StObject.set(x, "onActivateSuggest", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* value */ js.Any => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: /* event */ js.Any => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnSuggestNoResults(value: /* userInput */ String => Unit): Self = StObject.set(x, "onSuggestNoResults", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuggestNoResultsUndefined: Self = StObject.set(x, "onSuggestNoResults", js.undefined)
      
      @scala.inline
      def setOnSuggestSelect(value: /* suggest */ Suggest => Unit): Self = StObject.set(x, "onSuggestSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuggestSelectUndefined: Self = StObject.set(x, "onSuggestSelect", js.undefined)
      
      @scala.inline
      def setOnUpdateSuggests(value: (/* suggests */ js.Any, /* activeSuggest */ js.Any) => Unit): Self = StObject.set(x, "onUpdateSuggests", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUpdateSuggestsUndefined: Self = StObject.set(x, "onUpdateSuggests", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setQueryDelay(value: Double): Self = StObject.set(x, "queryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryDelayUndefined: Self = StObject.set(x, "queryDelay", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRenderSuggestItem(value: /* googleSuggest */ AutocompletePrediction => js.Any): Self = StObject.set(x, "renderSuggestItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderSuggestItemUndefined: Self = StObject.set(x, "renderSuggestItem", js.undefined)
      
      @scala.inline
      def setSkipSuggest(value: /* googleSuggest */ AutocompletePrediction => Boolean): Self = StObject.set(x, "skipSuggest", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSkipSuggestUndefined: Self = StObject.set(x, "skipSuggest", js.undefined)
      
      @scala.inline
      def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuggestItemActiveClassName(value: String): Self = StObject.set(x, "suggestItemActiveClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestItemActiveClassNameUndefined: Self = StObject.set(x, "suggestItemActiveClassName", js.undefined)
      
      @scala.inline
      def setSuggestItemClassName(value: String): Self = StObject.set(x, "suggestItemClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestItemClassNameUndefined: Self = StObject.set(x, "suggestItemClassName", js.undefined)
      
      @scala.inline
      def setSuggestsClassName(value: String): Self = StObject.set(x, "suggestsClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestsClassNameUndefined: Self = StObject.set(x, "suggestsClassName", js.undefined)
      
      @scala.inline
      def setSuggestsHiddenClassName(value: String): Self = StObject.set(x, "suggestsHiddenClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestsHiddenClassNameUndefined: Self = StObject.set(x, "suggestsHiddenClassName", js.undefined)
      
      @scala.inline
      def setTypes(value: js.Array[QueryType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: QueryType*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[
    T, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: P} & {[ P in K ]: never} & {[x: string] : never, [x: number] : never}[keyof T] */ js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactGeosuggest.reactGeosuggestStrings.address
    - typings.reactGeosuggest.reactGeosuggestStrings.establishment
    - typings.reactGeosuggest.reactGeosuggestStrings.geocode
    - typings.reactGeosuggest.reactGeosuggestStrings.LeftparenthesiscitiesRightparenthesis
    - typings.reactGeosuggest.reactGeosuggestStrings.LeftparenthesisregionsRightparenthesis
  */
  trait QueryType extends StObject
  object QueryType {
    
    @scala.inline
    def LeftparenthesiscitiesRightparenthesis: typings.reactGeosuggest.reactGeosuggestStrings.LeftparenthesiscitiesRightparenthesis = "(cities)".asInstanceOf[typings.reactGeosuggest.reactGeosuggestStrings.LeftparenthesiscitiesRightparenthesis]
    
    @scala.inline
    def LeftparenthesisregionsRightparenthesis: typings.reactGeosuggest.reactGeosuggestStrings.LeftparenthesisregionsRightparenthesis = "(regions)".asInstanceOf[typings.reactGeosuggest.reactGeosuggestStrings.LeftparenthesisregionsRightparenthesis]
    
    @scala.inline
    def address: typings.reactGeosuggest.reactGeosuggestStrings.address = "address".asInstanceOf[typings.reactGeosuggest.reactGeosuggestStrings.address]
    
    @scala.inline
    def establishment: typings.reactGeosuggest.reactGeosuggestStrings.establishment = "establishment".asInstanceOf[typings.reactGeosuggest.reactGeosuggestStrings.establishment]
    
    @scala.inline
    def geocode: typings.reactGeosuggest.reactGeosuggestStrings.geocode = "geocode".asInstanceOf[typings.reactGeosuggest.reactGeosuggestStrings.geocode]
  }
  
  trait Styles extends StObject {
    
    var input: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var suggestItem: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var suggests: js.UndefOr[Record[String, js.Any]] = js.undefined
  }
  object Styles {
    
    @scala.inline
    def apply(): Styles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Styles]
    }
    
    @scala.inline
    implicit class StylesMutableBuilder[Self <: Styles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: Record[String, js.Any]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setSuggestItem(value: Record[String, js.Any]): Self = StObject.set(x, "suggestItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestItemUndefined: Self = StObject.set(x, "suggestItem", js.undefined)
      
      @scala.inline
      def setSuggests(value: Record[String, js.Any]): Self = StObject.set(x, "suggests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestsUndefined: Self = StObject.set(x, "suggests", js.undefined)
    }
  }
  
  trait Suggest extends StObject {
    
    var gmaps: js.UndefOr[GeocoderResult] = js.undefined
    
    var label: String
    
    var location: Lat
    
    var placeId: String
  }
  object Suggest {
    
    @scala.inline
    def apply(label: String, location: Lat, placeId: String): Suggest = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], placeId = placeId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Suggest]
    }
    
    @scala.inline
    implicit class SuggestMutableBuilder[Self <: Suggest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGmaps(value: GeocoderResult): Self = StObject.set(x, "gmaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGmapsUndefined: Self = StObject.set(x, "gmaps", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Lat): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    }
  }
}
