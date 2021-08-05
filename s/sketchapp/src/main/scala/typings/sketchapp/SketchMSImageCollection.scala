package typings.sketchapp

import typings.sketchapp.sketchappStrings.imageCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSImageCollection extends StObject {
  
  var _class: imageCollection
  
  var images: js.Array[js.Any]
}
object SketchMSImageCollection {
  
  inline def apply(images: js.Array[js.Any]): SketchMSImageCollection = {
    val __obj = js.Dynamic.literal(_class = "imageCollection", images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImageCollection]
  }
  
  extension [Self <: SketchMSImageCollection](x: Self) {
    
    inline def setImages(value: js.Array[js.Any]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: js.Any*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    inline def set_class(value: imageCollection): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
