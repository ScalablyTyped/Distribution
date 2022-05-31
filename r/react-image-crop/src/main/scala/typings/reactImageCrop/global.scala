package typings.reactImageCrop

import typings.reactImageCrop.mod.Crop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ReactCrop {
    
    @JSGlobal("ReactCrop")
    @js.native
    class ^ ()
      extends typings.reactImageCrop.mod.^
    
    @JSGlobal("ReactCrop")
    @js.native
    val ^ : js.Any = js.native
    
    inline def containCrop(prevCrop: Crop, crop: Crop, imageWidth: Double, imageHeight: Double): Crop = (^.asInstanceOf[js.Dynamic].applyDynamic("containCrop")(prevCrop.asInstanceOf[js.Any], crop.asInstanceOf[js.Any], imageWidth.asInstanceOf[js.Any], imageHeight.asInstanceOf[js.Any])).asInstanceOf[Crop]
    
    inline def makeAspectCrop(crop: Crop, imageWidth: Double, imageHeight: Double): Crop = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAspectCrop")(crop.asInstanceOf[js.Any], imageWidth.asInstanceOf[js.Any], imageHeight.asInstanceOf[js.Any])).asInstanceOf[Crop]
  }
}
