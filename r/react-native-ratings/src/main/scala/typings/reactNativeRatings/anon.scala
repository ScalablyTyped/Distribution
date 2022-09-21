package typings.reactNativeRatings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BackgroundColor extends StObject {
    
    var backgroundColor: Any
    
    var height: Double
    
    var width: Any
  }
  object BackgroundColor {
    
    inline def apply(backgroundColor: Any, height: Double, width: Any): BackgroundColor = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackgroundColor]
    }
    
    extension [Self <: BackgroundColor](x: Self) {
      
      inline def setBackgroundColor(value: Any): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageSize extends StObject {
    
    var imageSize: Double
    
    var jumpValue: Double
    
    var minValue: Double
    
    var ratingBackgroundColor: String
    
    var ratingColor: String
    
    var ratingCount: Double
    
    var ratingImage: Any
    
    var showReadOnlyText: Boolean
    
    var `type`: String
  }
  object ImageSize {
    
    inline def apply(
      imageSize: Double,
      jumpValue: Double,
      minValue: Double,
      ratingBackgroundColor: String,
      ratingColor: String,
      ratingCount: Double,
      ratingImage: Any,
      showReadOnlyText: Boolean,
      `type`: String
    ): ImageSize = {
      val __obj = js.Dynamic.literal(imageSize = imageSize.asInstanceOf[js.Any], jumpValue = jumpValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], ratingBackgroundColor = ratingBackgroundColor.asInstanceOf[js.Any], ratingColor = ratingColor.asInstanceOf[js.Any], ratingCount = ratingCount.asInstanceOf[js.Any], ratingImage = ratingImage.asInstanceOf[js.Any], showReadOnlyText = showReadOnlyText.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageSize]
    }
    
    extension [Self <: ImageSize](x: Self) {
      
      inline def setImageSize(value: Double): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      inline def setJumpValue(value: Double): Self = StObject.set(x, "jumpValue", value.asInstanceOf[js.Any])
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setRatingBackgroundColor(value: String): Self = StObject.set(x, "ratingBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setRatingColor(value: String): Self = StObject.set(x, "ratingColor", value.asInstanceOf[js.Any])
      
      inline def setRatingCount(value: Double): Self = StObject.set(x, "ratingCount", value.asInstanceOf[js.Any])
      
      inline def setRatingImage(value: Any): Self = StObject.set(x, "ratingImage", value.asInstanceOf[js.Any])
      
      inline def setShowReadOnlyText(value: Boolean): Self = StObject.set(x, "showReadOnlyText", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
