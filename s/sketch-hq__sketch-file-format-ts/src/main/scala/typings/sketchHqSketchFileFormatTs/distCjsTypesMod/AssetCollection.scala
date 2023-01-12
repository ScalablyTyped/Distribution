package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.assetCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetCollection
  extends StObject
     with AnyObject {
  
  var _class: assetCollection
  
  var colorAssets: js.Array[ColorAsset]
  
  var colors: js.Array[Color]
  
  var do_objectID: Uuid
  
  var exportPresets: js.Array[Any]
  
  var gradientAssets: js.Array[GradientAsset]
  
  var gradients: js.Array[Gradient]
  
  var imageCollection: js.UndefOr[ImageCollection] = js.undefined
  
  var images: js.Array[FileRef | DataRef]
}
object AssetCollection {
  
  inline def apply(
    colorAssets: js.Array[ColorAsset],
    colors: js.Array[Color],
    do_objectID: Uuid,
    exportPresets: js.Array[Any],
    gradientAssets: js.Array[GradientAsset],
    gradients: js.Array[Gradient],
    images: js.Array[FileRef | DataRef]
  ): AssetCollection = {
    val __obj = js.Dynamic.literal(_class = "assetCollection", colorAssets = colorAssets.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], do_objectID = do_objectID.asInstanceOf[js.Any], exportPresets = exportPresets.asInstanceOf[js.Any], gradientAssets = gradientAssets.asInstanceOf[js.Any], gradients = gradients.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetCollection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetCollection] (val x: Self) extends AnyVal {
    
    inline def setColorAssets(value: js.Array[ColorAsset]): Self = StObject.set(x, "colorAssets", value.asInstanceOf[js.Any])
    
    inline def setColorAssetsVarargs(value: ColorAsset*): Self = StObject.set(x, "colorAssets", js.Array(value*))
    
    inline def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setDo_objectID(value: Uuid): Self = StObject.set(x, "do_objectID", value.asInstanceOf[js.Any])
    
    inline def setExportPresets(value: js.Array[Any]): Self = StObject.set(x, "exportPresets", value.asInstanceOf[js.Any])
    
    inline def setExportPresetsVarargs(value: Any*): Self = StObject.set(x, "exportPresets", js.Array(value*))
    
    inline def setGradientAssets(value: js.Array[GradientAsset]): Self = StObject.set(x, "gradientAssets", value.asInstanceOf[js.Any])
    
    inline def setGradientAssetsVarargs(value: GradientAsset*): Self = StObject.set(x, "gradientAssets", js.Array(value*))
    
    inline def setGradients(value: js.Array[Gradient]): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
    
    inline def setGradientsVarargs(value: Gradient*): Self = StObject.set(x, "gradients", js.Array(value*))
    
    inline def setImageCollection(value: ImageCollection): Self = StObject.set(x, "imageCollection", value.asInstanceOf[js.Any])
    
    inline def setImageCollectionUndefined: Self = StObject.set(x, "imageCollection", js.undefined)
    
    inline def setImages(value: js.Array[FileRef | DataRef]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: (FileRef | DataRef)*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def set_class(value: assetCollection): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}
