package typings.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest

import typings.googlemaps.google.maps.places.AutocompletionRequest
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactGooglePlacesSuggest.anon.Typeofmaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var autocompletionRequest: AutocompletionRequest
  var children: js.UndefOr[ReactNode] = js.undefined
  var customContainerRender: js.UndefOr[js.Function1[/* predictions */ js.Array[Prediction], Element | String]] = js.undefined
  var customRender: js.UndefOr[js.Function1[/* prediction */ js.UndefOr[Prediction], Element | String]] = js.undefined
  var googleMaps: Typeofmaps
  var onSelectSuggest: js.UndefOr[
    js.Function2[/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction, _]
  ] = js.undefined
  var textNoResults: js.UndefOr[String | Null] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    autocompletionRequest: AutocompletionRequest,
    googleMaps: Typeofmaps,
    children: ReactNode = null,
    customContainerRender: /* predictions */ js.Array[Prediction] => Element | String = null,
    customRender: /* prediction */ js.UndefOr[Prediction] => Element | String = null,
    onSelectSuggest: (/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction) => _ = null,
    textNoResults: js.UndefOr[Null | String] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(autocompletionRequest = autocompletionRequest.asInstanceOf[js.Any], googleMaps = googleMaps.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (customContainerRender != null) __obj.updateDynamic("customContainerRender")(js.Any.fromFunction1(customContainerRender))
    if (customRender != null) __obj.updateDynamic("customRender")(js.Any.fromFunction1(customRender))
    if (onSelectSuggest != null) __obj.updateDynamic("onSelectSuggest")(js.Any.fromFunction2(onSelectSuggest))
    if (!js.isUndefined(textNoResults)) __obj.updateDynamic("textNoResults")(textNoResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

