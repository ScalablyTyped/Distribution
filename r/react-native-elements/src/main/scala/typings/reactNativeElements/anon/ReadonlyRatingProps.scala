package typings.reactNativeElements.anon

import typings.propTypes.mod.Requireable
import typings.reactNative.mod.ImageURISource
import typings.reactNativeElements.reactNativeElementsStrings.bell
import typings.reactNativeElements.reactNativeElementsStrings.custom
import typings.reactNativeElements.reactNativeElementsStrings.heart
import typings.reactNativeElements.reactNativeElementsStrings.rocket
import typings.reactNativeElements.reactNativeElementsStrings.star
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native-ratings.react-native-ratings.RatingProps> */
trait ReadonlyRatingProps extends StObject {
  
  val fractions: js.UndefOr[Double] = js.undefined
  
  val imageSize: js.UndefOr[Double] = js.undefined
  
  val minValue: js.UndefOr[Double] = js.undefined
  
  val onFinishRating: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.undefined
  
  val onStartRating: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  val ratingBackgroundColor: js.UndefOr[String] = js.undefined
  
  val ratingColor: js.UndefOr[String] = js.undefined
  
  val ratingCount: js.UndefOr[Double] = js.undefined
  
  val ratingImage: js.UndefOr[ImageURISource] = js.undefined
  
  val ratingTextColor: js.UndefOr[String] = js.undefined
  
  val readonly: js.UndefOr[Boolean] = js.undefined
  
  val showRating: js.UndefOr[Boolean] = js.undefined
  
  val startingValue: js.UndefOr[Double] = js.undefined
  
  val style: js.UndefOr[Requireable[js.Object]] = js.undefined
  
  val tintColor: js.UndefOr[String] = js.undefined
  
  val `type`: js.UndefOr[star | rocket | bell | heart | custom] = js.undefined
}
object ReadonlyRatingProps {
  
  inline def apply(): ReadonlyRatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyRatingProps]
  }
  
  extension [Self <: ReadonlyRatingProps](x: Self) {
    
    inline def setFractions(value: Double): Self = StObject.set(x, "fractions", value.asInstanceOf[js.Any])
    
    inline def setFractionsUndefined: Self = StObject.set(x, "fractions", js.undefined)
    
    inline def setImageSize(value: Double): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setOnFinishRating(value: /* rating */ Double => Unit): Self = StObject.set(x, "onFinishRating", js.Any.fromFunction1(value))
    
    inline def setOnFinishRatingUndefined: Self = StObject.set(x, "onFinishRating", js.undefined)
    
    inline def setOnStartRating(value: () => Unit): Self = StObject.set(x, "onStartRating", js.Any.fromFunction0(value))
    
    inline def setOnStartRatingUndefined: Self = StObject.set(x, "onStartRating", js.undefined)
    
    inline def setRatingBackgroundColor(value: String): Self = StObject.set(x, "ratingBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setRatingBackgroundColorUndefined: Self = StObject.set(x, "ratingBackgroundColor", js.undefined)
    
    inline def setRatingColor(value: String): Self = StObject.set(x, "ratingColor", value.asInstanceOf[js.Any])
    
    inline def setRatingColorUndefined: Self = StObject.set(x, "ratingColor", js.undefined)
    
    inline def setRatingCount(value: Double): Self = StObject.set(x, "ratingCount", value.asInstanceOf[js.Any])
    
    inline def setRatingCountUndefined: Self = StObject.set(x, "ratingCount", js.undefined)
    
    inline def setRatingImage(value: ImageURISource): Self = StObject.set(x, "ratingImage", value.asInstanceOf[js.Any])
    
    inline def setRatingImageUndefined: Self = StObject.set(x, "ratingImage", js.undefined)
    
    inline def setRatingTextColor(value: String): Self = StObject.set(x, "ratingTextColor", value.asInstanceOf[js.Any])
    
    inline def setRatingTextColorUndefined: Self = StObject.set(x, "ratingTextColor", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setShowRating(value: Boolean): Self = StObject.set(x, "showRating", value.asInstanceOf[js.Any])
    
    inline def setShowRatingUndefined: Self = StObject.set(x, "showRating", js.undefined)
    
    inline def setStartingValue(value: Double): Self = StObject.set(x, "startingValue", value.asInstanceOf[js.Any])
    
    inline def setStartingValueUndefined: Self = StObject.set(x, "startingValue", js.undefined)
    
    inline def setStyle(value: Requireable[js.Object]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setType(value: star | rocket | bell | heart | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
