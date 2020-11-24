package typings.signaturePad.mod

import typings.signaturePad.anon.Height
import typings.std.Event
import typings.std.MouseEvent
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignaturePad extends js.Object {
  
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
