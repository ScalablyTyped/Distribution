package typings.sketchapp

import typings.sketchapp.sketchappStrings.assetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchMSDocumentAssets extends StObject {
  
  var _class: assetCollection = js.native
  
  var colors: js.Array[_] = js.native
  
  var gradients: js.Array[_] = js.native
  
  var imageCollection: SketchMSImageCollection = js.native
  
  var images: js.Array[_] = js.native
}
object SketchMSDocumentAssets {
  
  @scala.inline
  def apply(
    _class: assetCollection,
    colors: js.Array[_],
    gradients: js.Array[_],
    imageCollection: SketchMSImageCollection,
    images: js.Array[_]
  ): SketchMSDocumentAssets = {
    val __obj = js.Dynamic.literal(_class = _class.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], gradients = gradients.asInstanceOf[js.Any], imageCollection = imageCollection.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSDocumentAssets]
  }
  
  @scala.inline
  implicit class SketchMSDocumentAssetsMutableBuilder[Self <: SketchMSDocumentAssets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[_]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: js.Any*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setGradients(value: js.Array[_]): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientsVarargs(value: js.Any*): Self = StObject.set(x, "gradients", js.Array(value :_*))
    
    @scala.inline
    def setImageCollection(value: SketchMSImageCollection): Self = StObject.set(x, "imageCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: js.Array[_]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: js.Any*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def set_class(value: assetCollection): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
