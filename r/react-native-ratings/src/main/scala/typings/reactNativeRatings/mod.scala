package typings.reactNativeRatings

import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.ImageURISource
import typings.reactNativeRatings.reactNativeRatingsStrings.bell
import typings.reactNativeRatings.reactNativeRatingsStrings.custom
import typings.reactNativeRatings.reactNativeRatingsStrings.heart
import typings.reactNativeRatings.reactNativeRatingsStrings.rocket
import typings.reactNativeRatings.reactNativeRatingsStrings.star
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-ratings", "AirbnbRating")
  @js.native
  class AirbnbRating protected ()
    extends Component[AirbnbRatingProps, js.Object, js.Any] {
    def this(props: AirbnbRatingProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AirbnbRatingProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-ratings", "Rating")
  @js.native
  class Rating protected ()
    extends Component[RatingProps, js.Object, js.Any] {
    def this(props: RatingProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RatingProps, context: js.Any) = this()
  }
  
  trait AirbnbRatingProps extends StObject {
    
    /**
      * Total number of ratings to display
      *
      * Default is 5
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * Initial value for the rating
      *
      * Default is 3
      */
    var defaultRating: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether the rating can be modiefied by the user
      *
      * Default is false
      */
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback method when the user finishes rating. Gives you the final rating value as a whole number
      */
    var onFinishRating: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    /**
      * Labels to show when each value is tapped
      *
      * e.g. If the first star is tapped, then value in index 0 will be used as the label
      *
      * Default is ['Terrible', 'Bad', 'Okay', 'Good', 'Great']
      */
    var reviews: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Color value for filled stars.
      *
      * Default is #004666
      */
    var selectedColor: js.UndefOr[String] = js.undefined
    
    /**
      * Determines if to show the reviews above the rating
      *
      * Default is true
      */
    var showRating: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Size of rating image
      *
      * Default is 40
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * Style for star image component
      *
      * Default is true
      */
    var starStyle: js.UndefOr[ImageStyle] = js.undefined
  }
  object AirbnbRatingProps {
    
    @scala.inline
    def apply(): AirbnbRatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AirbnbRatingProps]
    }
    
    @scala.inline
    implicit class AirbnbRatingPropsMutableBuilder[Self <: AirbnbRatingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDefaultRating(value: Double): Self = StObject.set(x, "defaultRating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRatingUndefined: Self = StObject.set(x, "defaultRating", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setOnFinishRating(value: /* value */ Double => Unit): Self = StObject.set(x, "onFinishRating", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFinishRatingUndefined: Self = StObject.set(x, "onFinishRating", js.undefined)
      
      @scala.inline
      def setReviews(value: js.Array[String]): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReviewsUndefined: Self = StObject.set(x, "reviews", js.undefined)
      
      @scala.inline
      def setReviewsVarargs(value: String*): Self = StObject.set(x, "reviews", js.Array(value :_*))
      
      @scala.inline
      def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
      
      @scala.inline
      def setShowRating(value: Boolean): Self = StObject.set(x, "showRating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRatingUndefined: Self = StObject.set(x, "showRating", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStarStyle(value: ImageStyle): Self = StObject.set(x, "starStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarStyleUndefined: Self = StObject.set(x, "starStyle", js.undefined)
    }
  }
  
  trait RatingProps extends StObject {
    
    /**
      * The number of decimal places for the rating value; must be between 0 and 20
      */
    var fractions: js.UndefOr[Double] = js.undefined
    
    /**
      * The size of each rating image
      *
      * Default is 50
      */
    var imageSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum value the user can select
      *
      * Default is 0
      */
    var minValue: js.UndefOr[Double] = js.undefined
    
    /**
      * Callback method when the user finishes rating. Gives you the final rating value as a whole number
      */
    var onFinishRating: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.undefined
    
    /**
      * Callback method when the user starts rating.
      */
    var onStartRating: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Pass in a custom background-fill-color for the rating icon; use this along with type='custom' prop above
      *
      * Default is 'white'
      */
    var ratingBackgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * Pass in a custom fill-color for the rating icon; use this along with type='custom' prop above
      *
      * Default is '#f1c40f'
      */
    var ratingColor: js.UndefOr[String] = js.undefined
    
    /**
      * Number of rating images to display
      *
      * Default is 5
      */
    var ratingCount: js.UndefOr[Double] = js.undefined
    
    /**
      * Pass in a custom image source; use this along with type='custom' prop above
      */
    var ratingImage: js.UndefOr[ImageURISource] = js.undefined
    
    /**
      * Color used for the text labels
      */
    var ratingTextColor: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the rating can be modiefied by the user
      *
      * Default is false
      */
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Displays the Built-in Rating UI to show the rating value in real-time
      *
      * Default is false
      */
    var showRating: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The initial rating to render
      *
      * Default is ratingCount/2
      */
    var startingValue: js.UndefOr[Double] = js.undefined
    
    /**
      * Exposes style prop to add additonal styling to the container view
      */
    var style: js.UndefOr[Requireable[js.Object]] = js.undefined
    
    /**
      * Color used for the background
      */
    var tintColor: js.UndefOr[String] = js.undefined
    
    /**
      * Graphic used for represent a rating
      *
      * Default is 'star'
      */
    var `type`: js.UndefOr[star | rocket | bell | heart | custom] = js.undefined
  }
  object RatingProps {
    
    @scala.inline
    def apply(): RatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingProps]
    }
    
    @scala.inline
    implicit class RatingPropsMutableBuilder[Self <: RatingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFractions(value: Double): Self = StObject.set(x, "fractions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFractionsUndefined: Self = StObject.set(x, "fractions", js.undefined)
      
      @scala.inline
      def setImageSize(value: Double): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      @scala.inline
      def setOnFinishRating(value: /* rating */ Double => Unit): Self = StObject.set(x, "onFinishRating", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFinishRatingUndefined: Self = StObject.set(x, "onFinishRating", js.undefined)
      
      @scala.inline
      def setOnStartRating(value: () => Unit): Self = StObject.set(x, "onStartRating", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnStartRatingUndefined: Self = StObject.set(x, "onStartRating", js.undefined)
      
      @scala.inline
      def setRatingBackgroundColor(value: String): Self = StObject.set(x, "ratingBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingBackgroundColorUndefined: Self = StObject.set(x, "ratingBackgroundColor", js.undefined)
      
      @scala.inline
      def setRatingColor(value: String): Self = StObject.set(x, "ratingColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingColorUndefined: Self = StObject.set(x, "ratingColor", js.undefined)
      
      @scala.inline
      def setRatingCount(value: Double): Self = StObject.set(x, "ratingCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingCountUndefined: Self = StObject.set(x, "ratingCount", js.undefined)
      
      @scala.inline
      def setRatingImage(value: ImageURISource): Self = StObject.set(x, "ratingImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingImageUndefined: Self = StObject.set(x, "ratingImage", js.undefined)
      
      @scala.inline
      def setRatingTextColor(value: String): Self = StObject.set(x, "ratingTextColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatingTextColorUndefined: Self = StObject.set(x, "ratingTextColor", js.undefined)
      
      @scala.inline
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      @scala.inline
      def setShowRating(value: Boolean): Self = StObject.set(x, "showRating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRatingUndefined: Self = StObject.set(x, "showRating", js.undefined)
      
      @scala.inline
      def setStartingValue(value: Double): Self = StObject.set(x, "startingValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingValueUndefined: Self = StObject.set(x, "startingValue", js.undefined)
      
      @scala.inline
      def setStyle(value: Requireable[js.Object]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      @scala.inline
      def setType(value: star | rocket | bell | heart | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
