package typings.reactDashGeosuggest.reactDashGeosuggestMod

import typings.googlemaps.googleNs.mapsNs.LatLng
import typings.googlemaps.googleNs.mapsNs.LatLngBounds
import typings.googlemaps.googleNs.mapsNs.placesNs.AutocompletePrediction
import typings.reactDashGeosuggest.Typeofmaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<std.HTMLInputElement> ]: P} & {[ P in 'style' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<std.HTMLInputElement>] ]: react.react.InputHTMLAttributes<std.HTMLInputElement>[P]} */ trait GeosuggestProps extends js.Object {
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
  var renderSuggestItem: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, _]] = js.undefined
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
  def apply(
    autoActivateFirstSuggest: js.UndefOr[Boolean] = js.undefined,
    autoComplete: String = null,
    bounds: LatLngBounds = null,
    className: String = null,
    country: String | js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fixtures: js.Array[Fixture] = null,
    getSuggestLabel: /* googleSuggest */ AutocompletePrediction => String = null,
    googleMaps: Typeofmaps = null,
    highlightMatch: js.UndefOr[Boolean] = js.undefined,
    ignoreTab: js.UndefOr[Boolean] = js.undefined,
    initialValue: String = null,
    inputClassName: String = null,
    label: String = null,
    location: LatLng = null,
    maxFixtures: Int | Double = null,
    minLength: Int | Double = null,
    onActivateSuggest: /* suggest */ Suggest => Unit = null,
    onBlur: /* value */ js.Any => Unit = null,
    onChange: /* value */ js.Any => Unit = null,
    onFocus: /* value */ js.Any => Unit = null,
    onKeyDown: /* event */ js.Any => Unit = null,
    onKeyPress: /* event */ js.Any => Unit = null,
    onSuggestNoResults: /* userInput */ String => Unit = null,
    onSuggestSelect: /* suggest */ Suggest => Unit = null,
    onUpdateSuggests: (/* suggests */ js.Any, /* activeSuggest */ js.Any) => Unit = null,
    placeholder: String = null,
    queryDelay: Int | Double = null,
    radius: Int | Double = null,
    renderSuggestItem: /* googleSuggest */ AutocompletePrediction => _ = null,
    skipSuggest: /* googleSuggest */ AutocompletePrediction => Boolean = null,
    style: Styles = null,
    suggestItemActiveClassName: String = null,
    suggestItemClassName: String = null,
    suggestsClassName: String = null,
    suggestsHiddenClassName: String = null,
    types: js.Array[QueryType] = null
  ): GeosuggestProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoActivateFirstSuggest)) __obj.updateDynamic("autoActivateFirstSuggest")(autoActivateFirstSuggest)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (className != null) __obj.updateDynamic("className")(className)
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (fixtures != null) __obj.updateDynamic("fixtures")(fixtures)
    if (getSuggestLabel != null) __obj.updateDynamic("getSuggestLabel")(js.Any.fromFunction1(getSuggestLabel))
    if (googleMaps != null) __obj.updateDynamic("googleMaps")(googleMaps)
    if (!js.isUndefined(highlightMatch)) __obj.updateDynamic("highlightMatch")(highlightMatch)
    if (!js.isUndefined(ignoreTab)) __obj.updateDynamic("ignoreTab")(ignoreTab)
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue)
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName)
    if (label != null) __obj.updateDynamic("label")(label)
    if (location != null) __obj.updateDynamic("location")(location)
    if (maxFixtures != null) __obj.updateDynamic("maxFixtures")(maxFixtures.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (onActivateSuggest != null) __obj.updateDynamic("onActivateSuggest")(js.Any.fromFunction1(onActivateSuggest))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onSuggestNoResults != null) __obj.updateDynamic("onSuggestNoResults")(js.Any.fromFunction1(onSuggestNoResults))
    if (onSuggestSelect != null) __obj.updateDynamic("onSuggestSelect")(js.Any.fromFunction1(onSuggestSelect))
    if (onUpdateSuggests != null) __obj.updateDynamic("onUpdateSuggests")(js.Any.fromFunction2(onUpdateSuggests))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (queryDelay != null) __obj.updateDynamic("queryDelay")(queryDelay.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (renderSuggestItem != null) __obj.updateDynamic("renderSuggestItem")(js.Any.fromFunction1(renderSuggestItem))
    if (skipSuggest != null) __obj.updateDynamic("skipSuggest")(js.Any.fromFunction1(skipSuggest))
    if (style != null) __obj.updateDynamic("style")(style)
    if (suggestItemActiveClassName != null) __obj.updateDynamic("suggestItemActiveClassName")(suggestItemActiveClassName)
    if (suggestItemClassName != null) __obj.updateDynamic("suggestItemClassName")(suggestItemClassName)
    if (suggestsClassName != null) __obj.updateDynamic("suggestsClassName")(suggestsClassName)
    if (suggestsHiddenClassName != null) __obj.updateDynamic("suggestsHiddenClassName")(suggestsHiddenClassName)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[GeosuggestProps]
  }
}

