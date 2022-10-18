package typings.signaturePad

import typings.signaturePad.anon.Height
import typings.signaturePad.distTypesPointMod.BasicPoint
import typings.signaturePad.distTypesSignatureEventTargetMod.SignatureEventTarget
import typings.std.HTMLCanvasElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("signature_pad", JSImport.Default)
  @js.native
  open class default protected () extends SignaturePad {
    def this(canvas: HTMLCanvasElement) = this()
    def this(canvas: HTMLCanvasElement, options: Options) = this()
  }
  
  trait FromDataOptions extends StObject {
    
    var clear: js.UndefOr[Boolean] = js.undefined
  }
  object FromDataOptions {
    
    inline def apply(): FromDataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromDataOptions]
    }
    
    extension [Self <: FromDataOptions](x: Self) {
      
      inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<signature_pad.signature_pad.PointGroupOptions> */
  trait Options extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var dotSize: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minDistance: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var penColor: js.UndefOr[String] = js.undefined
    
    var throttle: js.UndefOr[Double] = js.undefined
    
    var velocityFilterWeight: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setDotSize(value: Double): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      inline def setDotSizeUndefined: Self = StObject.set(x, "dotSize", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
      
      inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setPenColor(value: String): Self = StObject.set(x, "penColor", value.asInstanceOf[js.Any])
      
      inline def setPenColorUndefined: Self = StObject.set(x, "penColor", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      inline def setVelocityFilterWeight(value: Double): Self = StObject.set(x, "velocityFilterWeight", value.asInstanceOf[js.Any])
      
      inline def setVelocityFilterWeightUndefined: Self = StObject.set(x, "velocityFilterWeight", js.undefined)
    }
  }
  
  trait PointGroup
    extends StObject
       with PointGroupOptions {
    
    var points: js.Array[BasicPoint]
  }
  object PointGroup {
    
    inline def apply(
      dotSize: Double,
      maxWidth: Double,
      minWidth: Double,
      penColor: String,
      points: js.Array[BasicPoint]
    ): PointGroup = {
      val __obj = js.Dynamic.literal(dotSize = dotSize.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], penColor = penColor.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointGroup]
    }
    
    extension [Self <: PointGroup](x: Self) {
      
      inline def setPoints(value: js.Array[BasicPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: BasicPoint*): Self = StObject.set(x, "points", js.Array(value*))
    }
  }
  
  trait PointGroupOptions extends StObject {
    
    var dotSize: Double
    
    var maxWidth: Double
    
    var minWidth: Double
    
    var penColor: String
  }
  object PointGroupOptions {
    
    inline def apply(dotSize: Double, maxWidth: Double, minWidth: Double, penColor: String): PointGroupOptions = {
      val __obj = js.Dynamic.literal(dotSize = dotSize.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], penColor = penColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointGroupOptions]
    }
    
    extension [Self <: PointGroupOptions](x: Self) {
      
      inline def setDotSize(value: Double): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setPenColor(value: String): Self = StObject.set(x, "penColor", value.asInstanceOf[js.Any])
    }
  }
  
  type SignatureEvent = MouseEvent | Touch | PointerEvent
  
  @js.native
  trait SignaturePad extends SignatureEventTarget {
    
    /* private */ var _addPoint: Any = js.native
    
    /* private */ var _calculateCurveWidths: Any = js.native
    
    /* private */ var _createPoint: Any = js.native
    
    /* private */ var _ctx: Any = js.native
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _drawCurve: Any = js.native
    
    /* private */ var _drawCurveSegment: Any = js.native
    
    /* private */ var _drawDot: Any = js.native
    
    /* private */ var _drawningStroke: Any = js.native
    
    /* private */ var _fromData: Any = js.native
    
    /* private */ var _handleMouseDown: Any = js.native
    
    /* private */ var _handleMouseEvents: Any = js.native
    
    /* private */ var _handleMouseMove: Any = js.native
    
    /* private */ var _handleMouseUp: Any = js.native
    
    /* private */ var _handlePointerEnd: Any = js.native
    
    /* private */ var _handlePointerEvents: Any = js.native
    
    /* private */ var _handlePointerMove: Any = js.native
    
    /* private */ var _handlePointerStart: Any = js.native
    
    /* private */ var _handleTouchEnd: Any = js.native
    
    /* private */ var _handleTouchEvents: Any = js.native
    
    /* private */ var _handleTouchMove: Any = js.native
    
    /* private */ var _handleTouchStart: Any = js.native
    
    /* private */ var _isEmpty: Any = js.native
    
    /* private */ var _lastPoints: Any = js.native
    
    /* private */ var _lastVelocity: Any = js.native
    
    /* private */ var _lastWidth: Any = js.native
    
    /* private */ var _reset: Any = js.native
    
    /* private */ var _strokeBegin: Any = js.native
    
    /* private */ var _strokeEnd: Any = js.native
    
    /* private */ var _strokeMoveUpdate: Any = js.native
    
    /* private */ var _strokeUpdate: Any = js.native
    
    /* private */ var _strokeWidth: Any = js.native
    
    /* private */ var _toSVG: Any = js.native
    
    var backgroundColor: String = js.native
    
    /* private */ var canvas: Any = js.native
    
    def clear(): Unit = js.native
    
    var dotSize: Double = js.native
    
    def fromData(pointGroups: js.Array[PointGroup]): Unit = js.native
    def fromData(pointGroups: js.Array[PointGroup], hasClear: FromDataOptions): Unit = js.native
    
    def fromDataURL(dataUrl: String): js.Promise[Unit] = js.native
    def fromDataURL(dataUrl: String, options: Height): js.Promise[Unit] = js.native
    
    def isEmpty(): Boolean = js.native
    
    var maxWidth: Double = js.native
    
    var minDistance: Double = js.native
    
    var minWidth: Double = js.native
    
    def off(): Unit = js.native
    
    def on(): Unit = js.native
    
    var penColor: String = js.native
    
    var throttle: Double = js.native
    
    def toData(): js.Array[PointGroup] = js.native
    
    def toDataURL(): String = js.native
    def toDataURL(`type`: String): String = js.native
    def toDataURL(`type`: String, encoderOptions: Double): String = js.native
    def toDataURL(`type`: Unit, encoderOptions: Double): String = js.native
    
    var velocityFilterWeight: Double = js.native
  }
  
  object global {
    
    trait CSSStyleDeclaration extends StObject {
      
      var msTouchAction: String | Null
    }
    object CSSStyleDeclaration {
      
      inline def apply(): CSSStyleDeclaration = {
        val __obj = js.Dynamic.literal(msTouchAction = null)
        __obj.asInstanceOf[CSSStyleDeclaration]
      }
      
      extension [Self <: CSSStyleDeclaration](x: Self) {
        
        inline def setMsTouchAction(value: String): Self = StObject.set(x, "msTouchAction", value.asInstanceOf[js.Any])
        
        inline def setMsTouchActionNull: Self = StObject.set(x, "msTouchAction", null)
      }
    }
  }
}
