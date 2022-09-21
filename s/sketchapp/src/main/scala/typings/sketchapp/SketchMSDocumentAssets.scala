package typings.sketchapp

import typings.sketchapp.sketchappStrings.assetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSDocumentAssets extends StObject {
  
  var _class: assetCollection
  
  var colors: js.Array[Any]
  
  var gradients: js.Array[Any]
  
  var imageCollection: SketchMSImageCollection
  
  var images: js.Array[Any]
}
object SketchMSDocumentAssets {
  
  inline def apply(
    colors: js.Array[Any],
    gradients: js.Array[Any],
    imageCollection: SketchMSImageCollection,
    images: js.Array[Any]
  ): SketchMSDocumentAssets = {
    val __obj = js.Dynamic.literal(_class = "assetCollection", colors = colors.asInstanceOf[js.Any], gradients = gradients.asInstanceOf[js.Any], imageCollection = imageCollection.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSDocumentAssets]
  }
  
  extension [Self <: SketchMSDocumentAssets](x: Self) {
    
    inline def setColors(value: js.Array[Any]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Any*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setGradients(value: js.Array[Any]): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
    
    inline def setGradientsVarargs(value: Any*): Self = StObject.set(x, "gradients", js.Array(value*))
    
    inline def setImageCollection(value: SketchMSImageCollection): Self = StObject.set(x, "imageCollection", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[Any]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: Any*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def set_class(value: assetCollection): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
