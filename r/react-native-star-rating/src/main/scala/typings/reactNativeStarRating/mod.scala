package typings.reactNativeStarRating

import typings.react.mod.Component
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeStarRating.reactNativeStarRatingStrings.bounce
import typings.reactNativeStarRating.reactNativeStarRatingStrings.flash
import typings.reactNativeStarRating.reactNativeStarRatingStrings.jello
import typings.reactNativeStarRating.reactNativeStarRatingStrings.pulse
import typings.reactNativeStarRating.reactNativeStarRatingStrings.rotate
import typings.reactNativeStarRating.reactNativeStarRatingStrings.rubberBand
import typings.reactNativeStarRating.reactNativeStarRatingStrings.shake
import typings.reactNativeStarRating.reactNativeStarRatingStrings.swing
import typings.reactNativeStarRating.reactNativeStarRatingStrings.tada
import typings.reactNativeStarRating.reactNativeStarRatingStrings.wobble
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-star-rating", JSImport.Default)
  @js.native
  open class default ()
    extends Component[StarRatingProps, js.Object, Any]
  
  type StarRating = Component[StarRatingProps, js.Object, Any]
  
  trait StarRatingProps extends StObject {
    
    /**
      * Number between 0 to 1 to determine the opacity of the button.
      * Default is 0.2
      */
    var activeOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Add an animation to the stars upon selection.
      */
    var animation: js.UndefOr[
        bounce | flash | jello | pulse | rotate | rubberBand | shake | swing | tada | wobble
      ] = js.undefined
    
    /**
      * Style of the button containing the star.
      */
    var buttonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Style of the element containing the star rating component.
      */
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Sets the interactivity of the star buttons.
      *
      * Default is false
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the icon to represent an empty star.
      * Refer to react-native-vector-icons.
      * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx').
      *
      * Default is "star-o"
      */
    var emptyStar: js.UndefOr[String | ImageURISource] = js.undefined
    
    /**
      * Color of an empty star.
      *
      * Default is gray
      */
    var emptyStarColor: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the icon to represent a full star.
      * Refer to react-native-vector-icons.
      * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx')
      *
      * Default is "star"
      */
    var fullStar: js.UndefOr[String | ImageURISource] = js.undefined
    
    /**
      * Color of a filled star.
      *
      * Default is black
      */
    var fullStarColor: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the icon to represent an half star.
      * Refer to react-native-vector-icons.
      * Also can be a image object, both {uri:xxx.xxx} and require('xx/xx/xx.xxx').
      *
      * Default is "star-half-o"
      */
    var halfStar: js.UndefOr[String | ImageURISource] = js.undefined
    
    /**
      * Color of a half-filled star.
      *
      * Defaults to fullStarColor.
      */
    var halfStarColor: js.UndefOr[String] = js.undefined
    
    /**
      * Sets ability to select half stars
      *
      * Default is false
      */
    var halfStarEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the icon set the star image belongs to.
      * Refer to react-native-vector-icons.
      *
      * Default is "FontAwesome"
      */
    var iconSet: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum number of stars possible.
      *
      * Default is 5
      */
    var maxStars: js.UndefOr[Double] = js.undefined
    
    /**
      * The current rating to show.
      *
      * Default is 0
      */
    var rating: js.UndefOr[Double] = js.undefined
    
    /**
      * Renders stars from right to left
      *
      * Default is false
      */
    var reversed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function to handle star button presses.
      */
    var selectedStar: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.undefined
    
    /**
      * Size of the star.
      *
      * Default is 40
      */
    var starSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Style to apply to the star.
      */
    var starStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object StarRatingProps {
    
    inline def apply(): StarRatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarRatingProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StarRatingProps] (val x: Self) extends AnyVal {
      
      inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      inline def setAnimation(value: bounce | flash | jello | pulse | rotate | rubberBand | shake | swing | tada | wobble): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setButtonStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "buttonStyle", value.asInstanceOf[js.Any])
      
      inline def setButtonStyleNull: Self = StObject.set(x, "buttonStyle", null)
      
      inline def setButtonStyleUndefined: Self = StObject.set(x, "buttonStyle", js.undefined)
      
      inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEmptyStar(value: String | ImageURISource): Self = StObject.set(x, "emptyStar", value.asInstanceOf[js.Any])
      
      inline def setEmptyStarColor(value: String): Self = StObject.set(x, "emptyStarColor", value.asInstanceOf[js.Any])
      
      inline def setEmptyStarColorUndefined: Self = StObject.set(x, "emptyStarColor", js.undefined)
      
      inline def setEmptyStarUndefined: Self = StObject.set(x, "emptyStar", js.undefined)
      
      inline def setFullStar(value: String | ImageURISource): Self = StObject.set(x, "fullStar", value.asInstanceOf[js.Any])
      
      inline def setFullStarColor(value: String): Self = StObject.set(x, "fullStarColor", value.asInstanceOf[js.Any])
      
      inline def setFullStarColorUndefined: Self = StObject.set(x, "fullStarColor", js.undefined)
      
      inline def setFullStarUndefined: Self = StObject.set(x, "fullStar", js.undefined)
      
      inline def setHalfStar(value: String | ImageURISource): Self = StObject.set(x, "halfStar", value.asInstanceOf[js.Any])
      
      inline def setHalfStarColor(value: String): Self = StObject.set(x, "halfStarColor", value.asInstanceOf[js.Any])
      
      inline def setHalfStarColorUndefined: Self = StObject.set(x, "halfStarColor", js.undefined)
      
      inline def setHalfStarEnabled(value: Boolean): Self = StObject.set(x, "halfStarEnabled", value.asInstanceOf[js.Any])
      
      inline def setHalfStarEnabledUndefined: Self = StObject.set(x, "halfStarEnabled", js.undefined)
      
      inline def setHalfStarUndefined: Self = StObject.set(x, "halfStar", js.undefined)
      
      inline def setIconSet(value: String): Self = StObject.set(x, "iconSet", value.asInstanceOf[js.Any])
      
      inline def setIconSetUndefined: Self = StObject.set(x, "iconSet", js.undefined)
      
      inline def setMaxStars(value: Double): Self = StObject.set(x, "maxStars", value.asInstanceOf[js.Any])
      
      inline def setMaxStarsUndefined: Self = StObject.set(x, "maxStars", js.undefined)
      
      inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setSelectedStar(value: /* rating */ Double => Unit): Self = StObject.set(x, "selectedStar", js.Any.fromFunction1(value))
      
      inline def setSelectedStarUndefined: Self = StObject.set(x, "selectedStar", js.undefined)
      
      inline def setStarSize(value: Double): Self = StObject.set(x, "starSize", value.asInstanceOf[js.Any])
      
      inline def setStarSizeUndefined: Self = StObject.set(x, "starSize", js.undefined)
      
      inline def setStarStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "starStyle", value.asInstanceOf[js.Any])
      
      inline def setStarStyleNull: Self = StObject.set(x, "starStyle", null)
      
      inline def setStarStyleUndefined: Self = StObject.set(x, "starStyle", js.undefined)
    }
  }
}
