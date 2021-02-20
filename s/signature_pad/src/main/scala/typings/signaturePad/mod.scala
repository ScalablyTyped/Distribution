package typings.signaturePad

import typings.signaturePad.anon.Height
import typings.signaturePad.pointMod.BasicPoint
import typings.std.Event
import typings.std.HTMLCanvasElement
import typings.std.MouseEvent
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("signature_pad", JSImport.Default)
  @js.native
  class default protected () extends SignaturePad {
    def this(canvas: HTMLCanvasElement) = this()
    def this(canvas: HTMLCanvasElement, options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var dotSize: js.UndefOr[Double | js.Function0[Double]] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var minDistance: js.UndefOr[Double] = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var onBegin: js.UndefOr[js.Function1[/* event */ MouseEvent | Touch, Unit]] = js.native
    
    var onEnd: js.UndefOr[js.Function1[/* event */ MouseEvent | Touch, Unit]] = js.native
    
    var penColor: js.UndefOr[String] = js.native
    
    var throttle: js.UndefOr[Double] = js.native
    
    var velocityFilterWeight: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setDotSize(value: Double | js.Function0[Double]): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotSizeFunction0(value: () => Double): Self = StObject.set(x, "dotSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDotSizeUndefined: Self = StObject.set(x, "dotSize", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOnBegin(value: /* event */ MouseEvent | Touch => Unit): Self = StObject.set(x, "onBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeginUndefined: Self = StObject.set(x, "onBegin", js.undefined)
      
      @scala.inline
      def setOnEnd(value: /* event */ MouseEvent | Touch => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      @scala.inline
      def setPenColor(value: String): Self = StObject.set(x, "penColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPenColorUndefined: Self = StObject.set(x, "penColor", js.undefined)
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      @scala.inline
      def setVelocityFilterWeight(value: Double): Self = StObject.set(x, "velocityFilterWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVelocityFilterWeightUndefined: Self = StObject.set(x, "velocityFilterWeight", js.undefined)
    }
  }
  
  @js.native
  trait PointGroup extends StObject {
    
    var color: String = js.native
    
    var points: js.Array[BasicPoint] = js.native
  }
  object PointGroup {
    
    @scala.inline
    def apply(color: String, points: js.Array[BasicPoint]): PointGroup = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointGroup]
    }
    
    @scala.inline
    implicit class PointGroupMutableBuilder[Self <: PointGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoints(value: js.Array[BasicPoint]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsVarargs(value: BasicPoint*): Self = StObject.set(x, "points", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SignaturePad extends StObject {
    
    var _addPoint: js.Any = js.native
    
    var _calculateCurveWidths: js.Any = js.native
    
    var _createPoint: js.Any = js.native
    
    var _ctx: js.Any = js.native
    
    var _data: js.Any = js.native
    
    var _drawCurve: js.Any = js.native
    
    var _drawCurveSegment: js.Any = js.native
    
    var _drawDot: js.Any = js.native
    
    var _fromData: js.Any = js.native
    
    var _handleMouseDown: js.Any = js.native
    
    var _handleMouseEvents: js.Any = js.native
    
    var _handleMouseMove: js.Any = js.native
    
    var _handleMouseUp: js.Any = js.native
    
    var _handlePointerEvents: js.Any = js.native
    
    var _handleTouchEnd: js.Any = js.native
    
    var _handleTouchEvents: js.Any = js.native
    
    var _handleTouchMove: js.Any = js.native
    
    var _handleTouchStart: js.Any = js.native
    
    var _isEmpty: js.Any = js.native
    
    var _lastPoints: js.Any = js.native
    
    var _lastVelocity: js.Any = js.native
    
    var _lastWidth: js.Any = js.native
    
    var _mouseButtonDown: js.Any = js.native
    
    var _reset: js.Any = js.native
    
    var _strokeBegin: js.Any = js.native
    
    var _strokeEnd: js.Any = js.native
    
    var _strokeMoveUpdate: js.Any = js.native
    
    var _strokeUpdate: js.Any = js.native
    
    var _strokeWidth: js.Any = js.native
    
    var _toSVG: js.Any = js.native
    
    var backgroundColor: String = js.native
    
    var canvas: js.Any = js.native
    
    def clear(): Unit = js.native
    
    var dotSize: Double | js.Function0[Double] = js.native
    
    def fromData(pointGroups: js.Array[PointGroup]): Unit = js.native
    
    def fromDataURL(dataUrl: String): Unit = js.native
    def fromDataURL(
      dataUrl: String,
      options: js.UndefOr[scala.Nothing],
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
    
    var options: js.Any = js.native
    
    var penColor: String = js.native
    
    var throttle: Double = js.native
    
    def toData(): js.Array[PointGroup] = js.native
    
    def toDataURL(): String = js.native
    def toDataURL(`type`: js.UndefOr[scala.Nothing], encoderOptions: Double): String = js.native
    def toDataURL(`type`: String): String = js.native
    def toDataURL(`type`: String, encoderOptions: Double): String = js.native
    
    var velocityFilterWeight: Double = js.native
  }
  
  object global {
    
    @js.native
    trait CSSStyleDeclaration extends StObject {
      
      var msTouchAction: String = js.native
    }
    object CSSStyleDeclaration {
      
      @scala.inline
      def apply(msTouchAction: String): CSSStyleDeclaration = {
        val __obj = js.Dynamic.literal(msTouchAction = msTouchAction.asInstanceOf[js.Any])
        __obj.asInstanceOf[CSSStyleDeclaration]
      }
      
      @scala.inline
      implicit class CSSStyleDeclarationMutableBuilder[Self <: CSSStyleDeclaration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMsTouchAction(value: String): Self = StObject.set(x, "msTouchAction", value.asInstanceOf[js.Any])
      }
    }
  }
}
