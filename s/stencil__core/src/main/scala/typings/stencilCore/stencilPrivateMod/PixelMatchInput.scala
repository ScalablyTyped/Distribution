package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelMatchInput extends StObject {
  
  var height: Double
  
  var imageAPath: String
  
  var imageBPath: String
  
  var pixelmatchThreshold: Double
  
  var width: Double
}
object PixelMatchInput {
  
  inline def apply(height: Double, imageAPath: String, imageBPath: String, pixelmatchThreshold: Double, width: Double): PixelMatchInput = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], imageAPath = imageAPath.asInstanceOf[js.Any], imageBPath = imageBPath.asInstanceOf[js.Any], pixelmatchThreshold = pixelmatchThreshold.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelMatchInput]
  }
  
  extension [Self <: PixelMatchInput](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setImageAPath(value: String): Self = StObject.set(x, "imageAPath", value.asInstanceOf[js.Any])
    
    inline def setImageBPath(value: String): Self = StObject.set(x, "imageBPath", value.asInstanceOf[js.Any])
    
    inline def setPixelmatchThreshold(value: Double): Self = StObject.set(x, "pixelmatchThreshold", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
