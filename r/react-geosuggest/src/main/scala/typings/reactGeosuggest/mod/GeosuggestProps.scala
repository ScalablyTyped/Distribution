package typings.reactGeosuggest.mod

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.places.AutocompletePrediction
import typings.reactGeosuggest.anon.Typeofmaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<std.HTMLInputElement> ]: P} & {[ P in 'style' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<std.HTMLInputElement>] ]: react.react.InputHTMLAttributes<std.HTMLInputElement>[P]} */ @js.native
trait GeosuggestProps extends js.Object {
  
  var autoActivateFirstSuggest: js.UndefOr[Boolean] = js.native
  
  var autoComplete: js.UndefOr[String] = js.native
  
  var bounds: js.UndefOr[LatLngBounds] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var country: js.UndefOr[String | js.Array[String]] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var fixtures: js.UndefOr[js.Array[Fixture]] = js.native
  
  var getSuggestLabel: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, String]] = js.native
  
  var googleMaps: js.UndefOr[Typeofmaps] = js.native
  
  var highlightMatch: js.UndefOr[Boolean] = js.native
  
  var ignoreEnter: js.UndefOr[Boolean] = js.native
  
  var ignoreTab: js.UndefOr[Boolean] = js.native
  
  var initialValue: js.UndefOr[String] = js.native
  
  var inputClassName: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[LatLng] = js.native
  
  var maxFixtures: js.UndefOr[Double] = js.native
  
  var minLength: js.UndefOr[Double] = js.native
  
  var onActivateSuggest: js.UndefOr[js.Function1[/* suggest */ Suggest, Unit]] = js.native
  
  var onBlur: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  
  var onFocus: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  
  var onKeyDown: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var onKeyPress: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.native
  
  var onSuggestNoResults: js.UndefOr[js.Function1[/* userInput */ String, Unit]] = js.native
  
  var onSuggestSelect: js.UndefOr[js.Function1[/* suggest */ Suggest, Unit]] = js.native
  
  var onUpdateSuggests: js.UndefOr[js.Function2[/* suggests */ js.Any, /* activeSuggest */ js.Any, Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var queryDelay: js.UndefOr[Double] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var renderSuggestItem: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, _]] = js.native
  
  var skipSuggest: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, Boolean]] = js.native
  
  var style: js.UndefOr[Styles] = js.native
  
  var suggestItemActiveClassName: js.UndefOr[String] = js.native
  
  var suggestItemClassName: js.UndefOr[String] = js.native
  
  var suggestsClassName: js.UndefOr[String] = js.native
  
  var suggestsHiddenClassName: js.UndefOr[String] = js.native
  
  var types: js.UndefOr[js.Array[QueryType]] = js.native
}
object GeosuggestProps {
  
  @scala.inline
  def apply(): GeosuggestProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeosuggestProps]
  }
  
  @scala.inline
  implicit class GeosuggestPropsOps[Self <: GeosuggestProps] (val x: Self) extends AnyVal {
    
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
    def setAutoActivateFirstSuggest(value: Boolean): Self = this.set("autoActivateFirstSuggest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoActivateFirstSuggest: Self = this.set("autoActivateFirstSuggest", js.undefined)
    
    @scala.inline
    def setAutoComplete(value: String): Self = this.set("autoComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoComplete: Self = this.set("autoComplete", js.undefined)
    
    @scala.inline
    def setBounds(value: LatLngBounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCountryVarargs(value: String*): Self = this.set("country", js.Array(value :_*))
    
    @scala.inline
    def setCountry(value: String | js.Array[String]): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setFixturesVarargs(value: Fixture*): Self = this.set("fixtures", js.Array(value :_*))
    
    @scala.inline
    def setFixtures(value: js.Array[Fixture]): Self = this.set("fixtures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixtures: Self = this.set("fixtures", js.undefined)
    
    @scala.inline
    def setGetSuggestLabel(value: /* googleSuggest */ AutocompletePrediction => String): Self = this.set("getSuggestLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetSuggestLabel: Self = this.set("getSuggestLabel", js.undefined)
    
    @scala.inline
    def setGoogleMaps(value: Typeofmaps): Self = this.set("googleMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleMaps: Self = this.set("googleMaps", js.undefined)
    
    @scala.inline
    def setHighlightMatch(value: Boolean): Self = this.set("highlightMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightMatch: Self = this.set("highlightMatch", js.undefined)
    
    @scala.inline
    def setIgnoreEnter(value: Boolean): Self = this.set("ignoreEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEnter: Self = this.set("ignoreEnter", js.undefined)
    
    @scala.inline
    def setIgnoreTab(value: Boolean): Self = this.set("ignoreTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreTab: Self = this.set("ignoreTab", js.undefined)
    
    @scala.inline
    def setInitialValue(value: String): Self = this.set("initialValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialValue: Self = this.set("initialValue", js.undefined)
    
    @scala.inline
    def setInputClassName(value: String): Self = this.set("inputClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputClassName: Self = this.set("inputClassName", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLocation(value: LatLng): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMaxFixtures(value: Double): Self = this.set("maxFixtures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFixtures: Self = this.set("maxFixtures", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setOnActivateSuggest(value: /* suggest */ Suggest => Unit): Self = this.set("onActivateSuggest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnActivateSuggest: Self = this.set("onActivateSuggest", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* value */ js.Any => Unit): Self = this.set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* value */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* value */ js.Any => Unit): Self = this.set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* event */ js.Any => Unit): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: /* event */ js.Any => Unit): Self = this.set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setOnSuggestNoResults(value: /* userInput */ String => Unit): Self = this.set("onSuggestNoResults", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSuggestNoResults: Self = this.set("onSuggestNoResults", js.undefined)
    
    @scala.inline
    def setOnSuggestSelect(value: /* suggest */ Suggest => Unit): Self = this.set("onSuggestSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSuggestSelect: Self = this.set("onSuggestSelect", js.undefined)
    
    @scala.inline
    def setOnUpdateSuggests(value: (/* suggests */ js.Any, /* activeSuggest */ js.Any) => Unit): Self = this.set("onUpdateSuggests", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUpdateSuggests: Self = this.set("onUpdateSuggests", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setQueryDelay(value: Double): Self = this.set("queryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryDelay: Self = this.set("queryDelay", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRenderSuggestItem(value: /* googleSuggest */ AutocompletePrediction => _): Self = this.set("renderSuggestItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderSuggestItem: Self = this.set("renderSuggestItem", js.undefined)
    
    @scala.inline
    def setSkipSuggest(value: /* googleSuggest */ AutocompletePrediction => Boolean): Self = this.set("skipSuggest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSkipSuggest: Self = this.set("skipSuggest", js.undefined)
    
    @scala.inline
    def setStyle(value: Styles): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSuggestItemActiveClassName(value: String): Self = this.set("suggestItemActiveClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestItemActiveClassName: Self = this.set("suggestItemActiveClassName", js.undefined)
    
    @scala.inline
    def setSuggestItemClassName(value: String): Self = this.set("suggestItemClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestItemClassName: Self = this.set("suggestItemClassName", js.undefined)
    
    @scala.inline
    def setSuggestsClassName(value: String): Self = this.set("suggestsClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestsClassName: Self = this.set("suggestsClassName", js.undefined)
    
    @scala.inline
    def setSuggestsHiddenClassName(value: String): Self = this.set("suggestsHiddenClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestsHiddenClassName: Self = this.set("suggestsHiddenClassName", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: QueryType*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[QueryType]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
