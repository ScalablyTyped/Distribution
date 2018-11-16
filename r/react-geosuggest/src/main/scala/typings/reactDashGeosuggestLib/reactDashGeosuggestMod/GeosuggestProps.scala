package typings
package reactDashGeosuggestLib.reactDashGeosuggestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Pick) */ 
trait GeosuggestProps extends js.Object {
  var autoActivateFirstSuggest: js.UndefOr[scala.Boolean] = js.undefined
  var autoComplete: js.UndefOr[java.lang.String] = js.undefined
  var bounds: js.UndefOr[googlemapsLib.googleNs.mapsNs.LatLngBounds] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var fixtures: js.UndefOr[js.Array[Fixture]] = js.undefined
  var getSuggestLabel: js.UndefOr[
    js.Function1[
      /* googleSuggest */ googlemapsLib.googleNs.mapsNs.placesNs.AutocompletePrediction, 
      java.lang.String
    ]
  ] = js.undefined
  var googleMaps: js.UndefOr[reactDashGeosuggestLib.Anon_LatLng] = js.undefined
  var highlightMatch: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreTab: js.UndefOr[scala.Boolean] = js.undefined
  var initialValue: js.UndefOr[java.lang.String] = js.undefined
  var inputClassName: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[googlemapsLib.googleNs.mapsNs.LatLng] = js.undefined
  var maxFixtures: js.UndefOr[scala.Double] = js.undefined
  var minLength: js.UndefOr[scala.Double] = js.undefined
  var onActivateSuggest: js.UndefOr[js.Function1[/* suggest */ Suggest, scala.Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* value */ js.Any, scala.Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  var onSuggestNoResults: js.UndefOr[js.Function1[/* userInput */ java.lang.String, scala.Unit]] = js.undefined
  var onSuggestSelect: js.UndefOr[js.Function1[/* suggest */ Suggest, scala.Unit]] = js.undefined
  var onUpdateSuggests: js.UndefOr[js.Function2[/* suggests */ js.Any, /* activeSuggest */ js.Any, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var queryDelay: js.UndefOr[scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var renderSuggestItem: js.UndefOr[
    js.Function1[
      /* googleSuggest */ googlemapsLib.googleNs.mapsNs.placesNs.AutocompletePrediction, 
      _
    ]
  ] = js.undefined
  var skipSuggest: js.UndefOr[
    js.Function1[
      /* googleSuggest */ googlemapsLib.googleNs.mapsNs.placesNs.AutocompletePrediction, 
      scala.Boolean
    ]
  ] = js.undefined
  var style: js.UndefOr[Styles] = js.undefined
  var suggestItemActiveClassName: js.UndefOr[java.lang.String] = js.undefined
  var suggestItemClassName: js.UndefOr[java.lang.String] = js.undefined
  var suggestsClassName: js.UndefOr[java.lang.String] = js.undefined
  var suggestsHiddenClassName: js.UndefOr[java.lang.String] = js.undefined
  var types: js.UndefOr[js.Array[QueryType]] = js.undefined
}

