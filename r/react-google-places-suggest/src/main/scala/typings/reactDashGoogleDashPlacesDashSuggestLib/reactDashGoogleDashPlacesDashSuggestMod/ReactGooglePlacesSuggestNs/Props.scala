package typings
package reactDashGoogleDashPlacesDashSuggestLib.reactDashGoogleDashPlacesDashSuggestMod.ReactGooglePlacesSuggestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var autocompletionRequest: googlemapsLib.googleNs.mapsNs.placesNs.AutocompletionRequest
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var customContainerRender: js.UndefOr[
    js.Function1[
      /* predictions */ js.Array[Prediction], 
      reactLib.reactMod.Global.JSXNs.Element | java.lang.String
    ]
  ] = js.undefined
  var customRender: js.UndefOr[
    js.Function1[
      /* prediction */ js.UndefOr[Prediction], 
      reactLib.reactMod.Global.JSXNs.Element | java.lang.String
    ]
  ] = js.undefined
  var googleMaps: reactDashGoogleDashPlacesDashSuggestLib.Anon_LatLng
  var onSelectSuggest: js.UndefOr[
    js.Function2[/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction, _]
  ] = js.undefined
  var textNoResults: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

