package typings.reactGooglePlacesSuggest

import typings.googlemaps.google.maps.GeocoderResult
import typings.googlemaps.google.maps.places.AutocompletePrediction
import typings.googlemaps.google.maps.places.AutocompletionRequest
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactGooglePlacesSuggest.anon.Typeofmaps
import typings.reactGooglePlacesSuggest.mod.ReactGooglePlacesSuggest.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-google-places-suggest", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props, js.Object, js.Any]
  
  object ReactGooglePlacesSuggest {
    
    type GeocodedPrediction = GeocoderResult
    
    type Prediction = AutocompletePrediction
    
    @js.native
    trait Props extends StObject {
      
      var autocompletionRequest: AutocompletionRequest = js.native
      
      var children: js.UndefOr[ReactNode] = js.native
      
      var customContainerRender: js.UndefOr[js.Function1[/* predictions */ js.Array[Prediction], Element | String]] = js.native
      
      var customRender: js.UndefOr[js.Function1[/* prediction */ js.UndefOr[Prediction], Element | String]] = js.native
      
      var googleMaps: Typeofmaps = js.native
      
      var onSelectSuggest: js.UndefOr[
            js.Function2[/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction, _]
          ] = js.native
      
      var textNoResults: js.UndefOr[String | Null] = js.native
    }
    object Props {
      
      @scala.inline
      def apply(autocompletionRequest: AutocompletionRequest, googleMaps: Typeofmaps): Props = {
        val __obj = js.Dynamic.literal(autocompletionRequest = autocompletionRequest.asInstanceOf[js.Any], googleMaps = googleMaps.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAutocompletionRequest(value: AutocompletionRequest): Self = StObject.set(x, "autocompletionRequest", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        @scala.inline
        def setCustomContainerRender(value: /* predictions */ js.Array[Prediction] => Element | String): Self = StObject.set(x, "customContainerRender", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCustomContainerRenderUndefined: Self = StObject.set(x, "customContainerRender", js.undefined)
        
        @scala.inline
        def setCustomRender(value: /* prediction */ js.UndefOr[Prediction] => Element | String): Self = StObject.set(x, "customRender", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCustomRenderUndefined: Self = StObject.set(x, "customRender", js.undefined)
        
        @scala.inline
        def setGoogleMaps(value: Typeofmaps): Self = StObject.set(x, "googleMaps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnSelectSuggest(value: (/* geocodedPrediction */ GeocodedPrediction, /* originalPrediction */ Prediction) => _): Self = StObject.set(x, "onSelectSuggest", js.Any.fromFunction2(value))
        
        @scala.inline
        def setOnSelectSuggestUndefined: Self = StObject.set(x, "onSelectSuggest", js.undefined)
        
        @scala.inline
        def setTextNoResults(value: String): Self = StObject.set(x, "textNoResults", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTextNoResultsNull: Self = StObject.set(x, "textNoResults", null)
        
        @scala.inline
        def setTextNoResultsUndefined: Self = StObject.set(x, "textNoResults", js.undefined)
      }
    }
  }
  type ReactGooglePlacesSuggest = Component[Props, js.Object, js.Any]
}
