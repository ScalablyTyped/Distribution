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
  var googleMaps: reactDashGoogleDashPlacesDashSuggestLib.Anon_Adsense
  var onSelectSuggest: js.UndefOr[
    js.Function2[/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction, _]
  ] = js.undefined
  var textNoResults: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    autocompletionRequest: googlemapsLib.googleNs.mapsNs.placesNs.AutocompletionRequest,
    googleMaps: reactDashGoogleDashPlacesDashSuggestLib.Anon_Adsense,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    customContainerRender: js.Function1[
      /* predictions */ js.Array[Prediction], 
      reactLib.reactMod.Global.JSXNs.Element | java.lang.String
    ] = null,
    customRender: js.Function1[
      /* prediction */ js.UndefOr[Prediction], 
      reactLib.reactMod.Global.JSXNs.Element | java.lang.String
    ] = null,
    onSelectSuggest: js.Function2[/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction, _] = null,
    textNoResults: java.lang.String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autocompletionRequest")(autocompletionRequest)
    __obj.updateDynamic("googleMaps")(googleMaps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (customContainerRender != null) __obj.updateDynamic("customContainerRender")(customContainerRender)
    if (customRender != null) __obj.updateDynamic("customRender")(customRender)
    if (onSelectSuggest != null) __obj.updateDynamic("onSelectSuggest")(onSelectSuggest)
    if (textNoResults != null) __obj.updateDynamic("textNoResults")(textNoResults)
    __obj.asInstanceOf[Props]
  }
}

