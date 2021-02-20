package typings.sketchapp

import typings.sketchapp.sketchappStrings.imageCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSImageCollection extends StObject {
  
  var _class: imageCollection = js.native
  
  var images: js.Array[_] = js.native
}
object SketchMSImageCollection {
  
  @scala.inline
  def apply(_class: imageCollection, images: js.Array[_]): SketchMSImageCollection = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSImageCollection]
  }
  
  @scala.inline
  implicit class SketchMSImageCollectionMutableBuilder[Self <: SketchMSImageCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImages(value: js.Array[_]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: js.Any*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def set_class(value: imageCollection): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
