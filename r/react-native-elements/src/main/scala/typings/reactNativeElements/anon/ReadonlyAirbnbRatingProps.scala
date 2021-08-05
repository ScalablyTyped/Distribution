package typings.reactNativeElements.anon

import typings.reactNative.mod.ImageStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native-ratings.react-native-ratings.AirbnbRatingProps> */
trait ReadonlyAirbnbRatingProps extends StObject {
  
  val count: js.UndefOr[Double] = js.undefined
  
  val defaultRating: js.UndefOr[Double] = js.undefined
  
  val isDisabled: js.UndefOr[Boolean] = js.undefined
  
  val onFinishRating: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  val reviews: js.UndefOr[js.Array[String]] = js.undefined
  
  val selectedColor: js.UndefOr[String] = js.undefined
  
  val showRating: js.UndefOr[Boolean] = js.undefined
  
  val size: js.UndefOr[Double] = js.undefined
  
  val starStyle: js.UndefOr[ImageStyle] = js.undefined
}
object ReadonlyAirbnbRatingProps {
  
  inline def apply(): ReadonlyAirbnbRatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyAirbnbRatingProps]
  }
  
  extension [Self <: ReadonlyAirbnbRatingProps](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setDefaultRating(value: Double): Self = StObject.set(x, "defaultRating", value.asInstanceOf[js.Any])
    
    inline def setDefaultRatingUndefined: Self = StObject.set(x, "defaultRating", js.undefined)
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setOnFinishRating(value: /* value */ Double => Unit): Self = StObject.set(x, "onFinishRating", js.Any.fromFunction1(value))
    
    inline def setOnFinishRatingUndefined: Self = StObject.set(x, "onFinishRating", js.undefined)
    
    inline def setReviews(value: js.Array[String]): Self = StObject.set(x, "reviews", value.asInstanceOf[js.Any])
    
    inline def setReviewsUndefined: Self = StObject.set(x, "reviews", js.undefined)
    
    inline def setReviewsVarargs(value: String*): Self = StObject.set(x, "reviews", js.Array(value :_*))
    
    inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
    
    inline def setSelectedColorUndefined: Self = StObject.set(x, "selectedColor", js.undefined)
    
    inline def setShowRating(value: Boolean): Self = StObject.set(x, "showRating", value.asInstanceOf[js.Any])
    
    inline def setShowRatingUndefined: Self = StObject.set(x, "showRating", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStarStyle(value: ImageStyle): Self = StObject.set(x, "starStyle", value.asInstanceOf[js.Any])
    
    inline def setStarStyleUndefined: Self = StObject.set(x, "starStyle", js.undefined)
  }
}
