package typings.rcImage

import typings.rcImage.anon.DispatchZoomChange
import typings.react.mod.MutableRefObject
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseImageTransformMod {
  
  @JSImport("rc-image/lib/hooks/useImageTransform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(imgRef: MutableRefObject[HTMLImageElement]): DispatchZoomChange = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(imgRef.asInstanceOf[js.Any]).asInstanceOf[DispatchZoomChange]
  
  trait TransformType extends StObject {
    
    var flipX: Boolean
    
    var flipY: Boolean
    
    var rotate: Double
    
    var scale: Double
    
    var x: Double
    
    var y: Double
  }
  object TransformType {
    
    inline def apply(flipX: Boolean, flipY: Boolean, rotate: Double, scale: Double, x: Double, y: Double): TransformType = {
      val __obj = js.Dynamic.literal(flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformType] (val x: Self) extends AnyVal {
      
      inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
