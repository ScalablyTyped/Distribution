package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.imageCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageCollection
  extends StObject
     with AnyObject {
  
  var _class: imageCollection
  
  var images: Any
}
object ImageCollection {
  
  inline def apply(images: Any): ImageCollection = {
    val __obj = js.Dynamic.literal(_class = "imageCollection", images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageCollection]
  }
  
  extension [Self <: ImageCollection](x: Self) {
    
    inline def setImages(value: Any): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def set_class(value: imageCollection): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
