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
  
  @scala.inline
  def apply(): FaceDetectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceDetectionParams]
  }
  
  @scala.inline
  implicit class FaceDetectionParamsMutableBuilder[Self <: FaceDetectionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFaceindex(value: ImgixParamType): Self = StObject.set(x, "faceindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceindexUndefined: Self = StObject.set(x, "faceindex", js.undefined)
    
    @scala.inline
    def setFacepad(value: ImgixParamType): Self = StObject.set(x, "facepad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacepadUndefined: Self = StObject.set(x, "facepad", js.undefined)
    
    @scala.inline
    def setFaces(value: ImgixParamType): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacesUndefined: Self = StObject.set(x, "faces", js.undefined)
  }
}
