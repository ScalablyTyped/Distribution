package typings.sketchapp

import typings.sketchapp.sketchappStrings.imageCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSImageCollection extends StObject {
  
  var _class: imageCollection
  
  var images: js.Array[Any]
}
object SketchMSImageCollection {
  
  inline def apply(images: js.Array[Any]): SketchMSImageCollection = {
    val __obj = js.Dynamic.literal(_class = "imageCollection", images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImageCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSImageCollection] (val x: Self) extends AnyVal {
    
    inline def setImages(value: js.Array[Any]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: Any*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def set_class(value: imageCollection): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
