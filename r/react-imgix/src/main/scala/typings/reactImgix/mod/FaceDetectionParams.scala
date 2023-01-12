package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceDetectionParams extends StObject {
  
  var faceindex: js.UndefOr[ImgixParamType] = js.undefined
  
  var facepad: js.UndefOr[ImgixParamType] = js.undefined
  
  var faces: js.UndefOr[ImgixParamType] = js.undefined
}
object FaceDetectionParams {
  
  inline def apply(): FaceDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceDetectionParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FaceDetectionParams] (val x: Self) extends AnyVal {
    
    inline def setFaceindex(value: ImgixParamType): Self = StObject.set(x, "faceindex", value.asInstanceOf[js.Any])
    
    inline def setFaceindexUndefined: Self = StObject.set(x, "faceindex", js.undefined)
    
    inline def setFacepad(value: ImgixParamType): Self = StObject.set(x, "facepad", value.asInstanceOf[js.Any])
    
    inline def setFacepadUndefined: Self = StObject.set(x, "facepad", js.undefined)
    
    inline def setFaces(value: ImgixParamType): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
    
    inline def setFacesUndefined: Self = StObject.set(x, "faces", js.undefined)
  }
}
