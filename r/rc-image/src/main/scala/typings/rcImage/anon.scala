package typings.rcImage

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Close extends StObject {
    
    var close: js.UndefOr[ReactNode] = js.undefined
    
    var flipX: js.UndefOr[ReactNode] = js.undefined
    
    var flipY: js.UndefOr[ReactNode] = js.undefined
    
    var left: js.UndefOr[ReactNode] = js.undefined
    
    var right: js.UndefOr[ReactNode] = js.undefined
    
    var rotateLeft: js.UndefOr[ReactNode] = js.undefined
    
    var rotateRight: js.UndefOr[ReactNode] = js.undefined
    
    var zoomIn: js.UndefOr[ReactNode] = js.undefined
    
    var zoomOut: js.UndefOr[ReactNode] = js.undefined
  }
  object Close {
    
    inline def apply(): Close = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      inline def setClose(value: ReactNode): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setFlipX(value: ReactNode): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      inline def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
      
      inline def setFlipY(value: ReactNode): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
      
      inline def setLeft(value: ReactNode): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: ReactNode): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRotateLeft(value: ReactNode): Self = StObject.set(x, "rotateLeft", value.asInstanceOf[js.Any])
      
      inline def setRotateLeftUndefined: Self = StObject.set(x, "rotateLeft", js.undefined)
      
      inline def setRotateRight(value: ReactNode): Self = StObject.set(x, "rotateRight", value.asInstanceOf[js.Any])
      
      inline def setRotateRightUndefined: Self = StObject.set(x, "rotateRight", js.undefined)
      
      inline def setZoomIn(value: ReactNode): Self = StObject.set(x, "zoomIn", value.asInstanceOf[js.Any])
      
      inline def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
      
      inline def setZoomOut(value: ReactNode): Self = StObject.set(x, "zoomOut", value.asInstanceOf[js.Any])
      
      inline def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
    }
  }
  
  @js.native
  trait DispatchZoomChange extends StObject {
    
    def dispatchZoomChange(ratio: Double): Unit = js.native
    def dispatchZoomChange(ratio: Double, clientX: Double): Unit = js.native
    def dispatchZoomChange(ratio: Double, clientX: Double, clientY: Double): Unit = js.native
    def dispatchZoomChange(ratio: Double, clientX: Unit, clientY: Double): Unit = js.native
    
    def resetTransform(): Unit = js.native
    
    var transform: FlipX = js.native
    
    def updateTransform(newTransform: PartialTransformType): Unit = js.native
  }
  
  trait FlipX extends StObject {
    
    var flipX: Boolean
    
    var flipY: Boolean
    
    var rotate: Double
    
    var scale: Double
    
    var x: Double
    
    var y: Double
  }
  object FlipX {
    
    inline def apply(flipX: Boolean, flipY: Boolean, rotate: Double, scale: Double, x: Double, y: Double): FlipX = {
      val __obj = js.Dynamic.literal(flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlipX]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlipX] (val x: Self) extends AnyVal {
      
      inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<rc-image.rc-image/lib/hooks/useImageTransform.TransformType> */
  trait PartialTransformType extends StObject {
    
    var flipX: js.UndefOr[Boolean] = js.undefined
    
    var flipY: js.UndefOr[Boolean] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PartialTransformType {
    
    inline def apply(): PartialTransformType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTransformType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialTransformType] (val x: Self) extends AnyVal {
      
      inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      inline def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
      
      inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
