package typings.reactAvatarEditor

import typings.react.mod.Component
import typings.std.Event
import typings.std.File
import typings.std.HTMLCanvasElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-avatar-editor", JSImport.Default)
  @js.native
  open class default () extends AvatarEditor
  
  @js.native
  trait AvatarEditor extends Component[AvatarEditorProps, Any, Any] {
    
    def getCroppingRect(): CroppedRect = js.native
    
    def getImage(): HTMLCanvasElement = js.native
    
    def getImageScaledToCanvas(): HTMLCanvasElement = js.native
  }
  
  trait AvatarEditorProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var border: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var borderRadius: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[js.Array[Double]] = js.undefined
    
    var crossOrigin: js.UndefOr[String] = js.undefined
    
    var disableBoundaryChecks: js.UndefOr[Boolean] = js.undefined
    
    var disableCanvasRotation: js.UndefOr[Boolean] = js.undefined
    
    var disableHiDPIScaling: js.UndefOr[Boolean] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var image: String | File
    
    var onImageChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onImageReady: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onLoadFailure: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onLoadSuccess: js.UndefOr[js.Function1[/* imgInfo */ ImageState, Unit]] = js.undefined
    
    var onMouseMove: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onMouseUp: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPositionChange: js.UndefOr[js.Function1[/* position */ Position, Unit]] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object AvatarEditorProps {
    
    inline def apply(image: String | File): AvatarEditorProps = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarEditorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarEditorProps] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorder(value: Double | js.Array[Double]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
      
      inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderVarargs(value: Double*): Self = StObject.set(x, "border", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setDisableBoundaryChecks(value: Boolean): Self = StObject.set(x, "disableBoundaryChecks", value.asInstanceOf[js.Any])
      
      inline def setDisableBoundaryChecksUndefined: Self = StObject.set(x, "disableBoundaryChecks", js.undefined)
      
      inline def setDisableCanvasRotation(value: Boolean): Self = StObject.set(x, "disableCanvasRotation", value.asInstanceOf[js.Any])
      
      inline def setDisableCanvasRotationUndefined: Self = StObject.set(x, "disableCanvasRotation", js.undefined)
      
      inline def setDisableHiDPIScaling(value: Boolean): Self = StObject.set(x, "disableHiDPIScaling", value.asInstanceOf[js.Any])
      
      inline def setDisableHiDPIScalingUndefined: Self = StObject.set(x, "disableHiDPIScaling", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setImage(value: String | File): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setOnImageChange(value: () => Unit): Self = StObject.set(x, "onImageChange", js.Any.fromFunction0(value))
      
      inline def setOnImageChangeUndefined: Self = StObject.set(x, "onImageChange", js.undefined)
      
      inline def setOnImageReady(value: /* event */ Event => Unit): Self = StObject.set(x, "onImageReady", js.Any.fromFunction1(value))
      
      inline def setOnImageReadyUndefined: Self = StObject.set(x, "onImageReady", js.undefined)
      
      inline def setOnLoadFailure(value: /* event */ Event => Unit): Self = StObject.set(x, "onLoadFailure", js.Any.fromFunction1(value))
      
      inline def setOnLoadFailureUndefined: Self = StObject.set(x, "onLoadFailure", js.undefined)
      
      inline def setOnLoadSuccess(value: /* imgInfo */ ImageState => Unit): Self = StObject.set(x, "onLoadSuccess", js.Any.fromFunction1(value))
      
      inline def setOnLoadSuccessUndefined: Self = StObject.set(x, "onLoadSuccess", js.undefined)
      
      inline def setOnMouseMove(value: /* event */ Event => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setOnMouseUp(value: () => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction0(value))
      
      inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      inline def setOnPositionChange(value: /* position */ Position => Unit): Self = StObject.set(x, "onPositionChange", js.Any.fromFunction1(value))
      
      inline def setOnPositionChangeUndefined: Self = StObject.set(x, "onPositionChange", js.undefined)
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait CroppedRect
    extends StObject
       with Position {
    
    var height: Double
    
    var width: Double
  }
  object CroppedRect {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): CroppedRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CroppedRect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CroppedRect] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageState
    extends StObject
       with CroppedRect {
    
    var resource: ImageData
  }
  object ImageState {
    
    inline def apply(height: Double, resource: ImageData, width: Double, x: Double, y: Double): ImageState = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImageState] (val x: Self) extends AnyVal {
      
      inline def setResource(value: ImageData): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    }
  }
  
  trait Position extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Position {
    
    inline def apply(x: Double, y: Double): Position = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
