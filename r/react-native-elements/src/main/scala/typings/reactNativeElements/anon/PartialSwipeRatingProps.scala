package typings.reactNativeElements.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-ratings.react-native-ratings.SwipeRatingProps> */
trait PartialSwipeRatingProps extends StObject {
  
  var fractions: js.UndefOr[Any] = js.undefined
  
  var imageSize: js.UndefOr[Double] = js.undefined
  
  var jumpValue: js.UndefOr[Double] = js.undefined
  
  var minValue: js.UndefOr[Double] = js.undefined
  
  var onFinishRating: js.UndefOr[js.Function] = js.undefined
  
  var onStartRating: js.UndefOr[js.Function] = js.undefined
  
  var onSwipeRating: js.UndefOr[js.Function1[/* number */ Any, Unit]] = js.undefined
  
  var ratingBackgroundColor: js.UndefOr[String] = js.undefined
  
  var ratingColor: js.UndefOr[String] = js.undefined
  
  var ratingCount: js.UndefOr[Double] = js.undefined
  
  var ratingImage: js.UndefOr[ReactNode] = js.undefined
  
  var ratingTextColor: js.UndefOr[String] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var showRating: js.UndefOr[Boolean] = js.undefined
  
  var showReadOnlyText: js.UndefOr[Boolean] = js.undefined
  
  var startingValue: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var tintColor: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PartialSwipeRatingProps {
  
  inline def apply(): PartialSwipeRatingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSwipeRatingProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSwipeRatingProps] (val x: Self) extends AnyVal {
    
    inline def setFractions(value: Any): Self = StObject.set(x, "fractions", value.asInstanceOf[js.Any])
    
    inline def setFractionsUndefined: Self = StObject.set(x, "fractions", js.undefined)
    
    inline def setImageSize(value: Double): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
    
    inline def setJumpValue(value: Double): Self = StObject.set(x, "jumpValue", value.asInstanceOf[js.Any])
    
    inline def setJumpValueUndefined: Self = StObject.set(x, "jumpValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setOnFinishRating(value: js.Function): Self = StObject.set(x, "onFinishRating", value.asInstanceOf[js.Any])
    
    inline def setOnFinishRatingUndefined: Self = StObject.set(x, "onFinishRating", js.undefined)
    
    inline def setOnStartRating(value: js.Function): Self = StObject.set(x, "onStartRating", value.asInstanceOf[js.Any])
    
    inline def setOnStartRatingUndefined: Self = StObject.set(x, "onStartRating", js.undefined)
    
    inline def setOnSwipeRating(value: /* number */ Any => Unit): Self = StObject.set(x, "onSwipeRating", js.Any.fromFunction1(value))
    
    inline def setOnSwipeRatingUndefined: Self = StObject.set(x, "onSwipeRating", js.undefined)
    
    inline def setRatingBackgroundColor(value: String): Self = StObject.set(x, "ratingBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setRatingBackgroundColorUndefined: Self = StObject.set(x, "ratingBackgroundColor", js.undefined)
    
    inline def setRatingColor(value: String): Self = StObject.set(x, "ratingColor", value.asInstanceOf[js.Any])
    
    inline def setRatingColorUndefined: Self = StObject.set(x, "ratingColor", js.undefined)
    
    inline def setRatingCount(value: Double): Self = StObject.set(x, "ratingCount", value.asInstanceOf[js.Any])
    
    inline def setRatingCountUndefined: Self = StObject.set(x, "ratingCount", js.undefined)
    
    inline def setRatingImage(value: ReactNode): Self = StObject.set(x, "ratingImage", value.asInstanceOf[js.Any])
    
    inline def setRatingImageUndefined: Self = StObject.set(x, "ratingImage", js.undefined)
    
    inline def setRatingTextColor(value: String): Self = StObject.set(x, "ratingTextColor", value.asInstanceOf[js.Any])
    
    inline def setRatingTextColorUndefined: Self = StObject.set(x, "ratingTextColor", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setShowRating(value: Boolean): Self = StObject.set(x, "showRating", value.asInstanceOf[js.Any])
    
    inline def setShowRatingUndefined: Self = StObject.set(x, "showRating", js.undefined)
    
    inline def setShowReadOnlyText(value: Boolean): Self = StObject.set(x, "showReadOnlyText", value.asInstanceOf[js.Any])
    
    inline def setShowReadOnlyTextUndefined: Self = StObject.set(x, "showReadOnlyText", js.undefined)
    
    inline def setStartingValue(value: Double): Self = StObject.set(x, "startingValue", value.asInstanceOf[js.Any])
    
    inline def setStartingValueUndefined: Self = StObject.set(x, "startingValue", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
