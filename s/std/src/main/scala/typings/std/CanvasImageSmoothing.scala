package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasImageSmoothing extends StObject {
  
  var imageSmoothingEnabled: scala.Boolean = js.native
  
  var imageSmoothingQuality: ImageSmoothingQuality = js.native
}
object CanvasImageSmoothing {
  
  @scala.inline
  def apply(imageSmoothingEnabled: scala.Boolean, imageSmoothingQuality: ImageSmoothingQuality): CanvasImageSmoothing = {
    val __obj = js.Dynamic.literal(imageSmoothingEnabled = imageSmoothingEnabled.asInstanceOf[js.Any], imageSmoothingQuality = imageSmoothingQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasImageSmoothing]
  }
  
  @scala.inline
  implicit class CanvasImageSmoothingMutableBuilder[Self <: CanvasImageSmoothing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageSmoothingEnabled(value: scala.Boolean): Self = StObject.set(x, "imageSmoothingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSmoothingQuality(value: ImageSmoothingQuality): Self = StObject.set(x, "imageSmoothingQuality", value.asInstanceOf[js.Any])
  }
}
