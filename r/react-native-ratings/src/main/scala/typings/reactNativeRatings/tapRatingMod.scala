package typings.reactNativeRatings

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tapRatingMod extends Shortcut {
  
  @JSImport("react-native-ratings/dist/TapRating", JSImport.Default)
  @js.native
  val default: FunctionComponent[TapRatingProps] = js.native
  
  trait TapRatingProps extends StObject {
    
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
    var onFinishRating: js.UndefOr[js.Function1[/* number */ Any, Unit]] = js.undefined
    
    /**
      * Style for rating container
      *
      * Default is none
      */
    var ratingContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Color value for review.
      *
      * Default is #f1c40f
      */
    var reviewColor: js.UndefOr[String] = js.undefined
    
    /**
      * Size value for review.
      *
      * Default is 40
      */
    var reviewSize: js.UndefOr[Double] = js.undefined
    
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
      * Style for star container
      *
      * Default is none
      */
    var starContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Pass in a custom base image source
      */
    var starImage: js.UndefOr[String] = js.undefined
  }
  object TapRatingProps {
    
    inline def apply(): TapRatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TapRatingProps]
    }
    
    extension [Self <: TapRatingProps](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDefaultRating(value: Double): Self = StObject.set(x, "defaultRating", value.asInstanceOf[js.Any])
      
      inline def setDefaultRatingUndefined: Self = StObject.set(x, "defaultRating", js.undefined)
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setOnFinishRating(value: /* number */ Any => Unit): Self = StObject.set(x, "onFinishRating", js.Any.fromFunction1(value))
      
      inline def setOnFinishRatingUndefined: Self = StObject.set(x, "onFinishRating", js.undefined)
      
      inline def setRatingContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "ratingContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setRatingContainerStyleNull: Self = StObject.set(x, "ratingContainerStyle", null)
      
      inline def setRatingContainerStyleUndefined: Self = StObject.set(x, "ratingContainerStyle", js.undefined)
      
      inline def setReviewColor(value: String): Self = StObject.set(x, "reviewColor", value.asInstanceOf[js.Any])
      
      inline def setReviewColorUndefined: Self = StObject.set(x, "reviewColor", js.undefined)
      
      inline def setReviewSize(value: Double): Self = StObject.set(x, "reviewSize", value.asInstanceOf[js.Any])
      
      inline def setReviewSizeUndefined: Self = StObject.set(x, "reviewSize", js.undefined)
      
      inline def setReviews(value: js.Array[String]): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
      
      inline def setReviewsUndefined: Self = StObject.set(x, "reviews", js.undefined)
      
      inline def setReviewsVarargs(value: String*): Self = StObject.set(x, "reviews", js.Array(value*))
      
      inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
      
      inline def setShowRating(value: Boolean): Self = StObject.set(x, "showRating", value.asInstanceOf[js.Any])
      
      inline def setShowRatingUndefined: Self = StObject.set(x, "showRating", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStarContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "starContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setStarContainerStyleNull: Self = StObject.set(x, "starContainerStyle", null)
      
      inline def setStarContainerStyleUndefined: Self = StObject.set(x, "starContainerStyle", js.undefined)
      
      inline def setStarImage(value: String): Self = StObject.set(x, "starImage", value.asInstanceOf[js.Any])
      
      inline def setStarImageUndefined: Self = StObject.set(x, "starImage", js.undefined)
    }
  }
  
  type _To = FunctionComponent[TapRatingProps]
  
  /* This means you don't have to write `default`, but can instead just say `tapRatingMod.foo` */
  override def _to: FunctionComponent[TapRatingProps] = default
}
