package typings.signaturePad

import typings.signaturePad.anon.Height
import typings.signaturePad.pointMod.BasicPoint
import typings.std.Event
import typings.std.HTMLCanvasElement
import typings.std.MouseEvent
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("signature_pad", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with SignaturePad {
    def this(canvas: HTMLCanvasElement) = this()
    def this(canvas: HTMLCanvasElement, options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var dotSize: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minDistance: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var onBegin: js.UndefOr[js.Function1[/* event */ MouseEvent | Touch, Unit]] = js.undefined
    
    var onEnd: js.UndefOr[js.Function1[/* event */ MouseEvent | Touch, Unit]] = js.undefined
    
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
      
      inline def setDotSize(value: Double | js.Function0[Double]): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      inline def setDotSizeFunction0(value: () => Double): Self = StObject.set(x, "dotSize", js.Any.fromFunction0(value))
      
      inline def setDotSizeUndefined: Self = StObject.set(x, "dotSize", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
      
      inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOnBegin(value: /* event */ MouseEvent | Touch => Unit): Self = StObject.set(x, "onBegin", js.Any.fromFunction1(value))
      
      inline def setOnBeginUndefined: Self = StObject.set(x, "onBegin", js.undefined)
      
      inline def setOnEnd(value: /* event */ MouseEvent | Touch => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setPenColor(value: String): Self = StObject.set(x, "penColor", value.asInstanceOf[js.Any])
      
      inline def setPenColorUndefined: Self = StObject.set(x, "penColor", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      inline def setVelocityFilterWeight(value: Double): Self = StObject.set(x, "velocityFilterWeight", value.asInstanceOf[js.Any])
      
      inline def setVelocityFilterWeightUndefined: Self = StObject.set(x, "velocityFilterWeight", js.undefined)
    }
  }
  
  trait PointGroup extends StObject {
    
    var color: String
    
    var points: js.Array[BasicPoint]
  }
  object PointGroup {
    
    inline def apply(color: String, points: js.Array[BasicPoint]): PointGroup = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointGroup]
    }
    
    extension [Self <: PointGroup](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[BasicPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: BasicPoint*): Self = StObject.set(x, "points", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SignaturePad extends StObject {
    
    /* private */ var _addPoint: js.Any = js.native
    
    /* private */ var _calculateCurveWidths: js.Any = js.native
    
    /* private */ var _createPoint: js.Any = js.native
    
    /* private */ var _ctx: js.Any = js.native
    
    /* private */ var _data: js.Any = js.native
    
    /* private */ var _drawCurve: js.Any = js.native
    
    /* private */ var _drawCurveSegment: js.Any = js.native
    
    /* private */ var _drawDot: js.Any = js.native
    
    /* private */ var _fromData: js.Any = js.native
    
    /* private */ var _handleMouseDown: js.Any = js.native
    
    /* private */ var _handleMouseEvents: js.Any = js.native
    
    /* private */ var _handleMouseMove: js.Any = js.native
    
    /* private */ var _handleMouseUp: js.Any = js.native
    
    /* private */ var _handlePointerEvents: js.Any = js.native
    
    /* private */ var _handleTouchEnd: js.Any = js.native
    
    /* private */ var _handleTouchEvents: js.Any = js.native
    
    /* private */ var _handleTouchMove: js.Any = js.native
    
    /* private */ var _handleTouchStart: js.Any = js.native
    
    /* private */ var _isEmpty: js.Any = js.native
    
    /* private */ var _lastPoints: js.Any = js.native
    
    /* private */ var _lastVelocity: js.Any = js.native
    
    /* private */ var _lastWidth: js.Any = js.native
    
    /* private */ var _mouseButtonDown: js.Any = js.native
    
    /* private */ var _reset: js.Any = js.native
    
    /* private */ var _strokeBegin: js.Any = js.native
    
    /* private */ var _strokeEnd: js.Any = js.native
    
    /* private */ var _strokeMoveUpdate: js.Any = js.native
    
    /* private */ var _strokeUpdate: js.Any = js.native
    
    /* private */ var _strokeWidth: js.Any = js.native
    
    /* private */ var _toSVG: js.Any = js.native
    
    var backgroundColor: String = js.native
    
    /* private */ var canvas: js.Any = js.native
    
    def clear(): Unit = js.native
    
    var dotSize: Double | js.Function0[Double] = js.native
    
    def fromData(pointGroups: js.Array[PointGroup]): Unit = js.native
    
    def fromDataURL(dataUrl: String): Unit = js.native
    def fromDataURL(
      dataUrl: String,
      options: Unit,
      callback: js.Function1[/* error */ js.UndefOr[String | Event], Unit]
    ): Unit = js.native
    def fromDataURL(dataUrl: String, options: Height): Unit = js.native
    def fromDataURL(
      dataUrl: String,
      options: Height,
      callback: js.Function1[/* error */ js.UndefOr[String | Event], Unit]
    ): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    var maxWidth: Double = js.native
    
    var minDistance: Double = js.native
    
    var minWidth: Double = js.native
    
    def off(): Unit = js.native
    
    def on(): Unit = js.native
    
    var onBegin: js.UndefOr[js.Function1[/* event */ MouseEvent | Touch, Unit]] = js.native
    
    var onEnd: js.UndefOr[js.Function1[/* event */ MouseEvent | Touch, Unit]] = js.native
    
    /* private */ var options: js.Any = js.native
    
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
      
      var msTouchAction: String
    }
    object CSSStyleDeclaration {
      
      inline def apply(msTouchAction: String): CSSStyleDeclaration = {
        val __obj = js.Dynamic.literal(msTouchAction = msTouchAction.asInstanceOf[js.Any])
        __obj.asInstanceOf[CSSStyleDeclaration]
      }
      
      extension [Self <: CSSStyleDeclaration](x: Self) {
        
        inline def setMsTouchAction(value: String): Self = StObject.set(x, "msTouchAction", value.asInstanceOf[js.Any])
      }
    }
  }
}
