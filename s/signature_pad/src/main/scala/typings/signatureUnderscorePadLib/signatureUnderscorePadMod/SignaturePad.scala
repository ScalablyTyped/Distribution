package typings
package signatureUnderscorePadLib.signatureUnderscorePadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignaturePad extends js.Object {
  var _ctx: stdLib.CanvasRenderingContext2D = js.native
  var _data: js.Array[signatureUnderscorePadLib.Anon_Points] = js.native
  var _isEmpty: scala.Boolean = js.native
  var _lastVelocity: scala.Double = js.native
  var _lastWidth: scala.Double = js.native
  var _mouseButtonDown: scala.Boolean = js.native
  var _points: js.Array[signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point] = js.native
  var backgroundColor: java.lang.String = js.native
  var canvas: stdLib.HTMLCanvasElement = js.native
  var dotSize: scala.Double | js.Function0[scala.Double] = js.native
  var maxWidth: scala.Double = js.native
  var minDistance: scala.Double = js.native
  var minWidth: scala.Double = js.native
  var options: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.SignaturePadOptions = js.native
  var penColor: java.lang.String = js.native
  var throttle: scala.Double = js.native
  var velocityFilterWeight: scala.Double = js.native
  def _addPoint(point: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point): signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Bezier | scala.Null = js.native
  def _calculateCurveWidths(
    startPoint: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point,
    endPoint: signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point
  ): signatureUnderscorePadLib.Anon_End = js.native
  def _createPoint(x: scala.Double, y: scala.Double): signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point = js.native
  def _drawCurve(_a: signatureUnderscorePadLib.Anon_ColorCurve): scala.Unit = js.native
  def _drawCurveSegment(x: scala.Double, y: scala.Double, width: scala.Double): scala.Unit = js.native
  def _drawDot(_a: signatureUnderscorePadLib.Anon_Color): scala.Unit = js.native
  def _fromData(
    pointGroups: js.Array[
      js.Array[signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point]
    ],
    drawCurve: js.Function1[/* _a */ signatureUnderscorePadLib.Anon_ColorCurve, scala.Unit],
    drawDot: js.Function1[/* _a */ signatureUnderscorePadLib.Anon_Color, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Privates
    */
  def _handleMouseDown(event: stdLib.MouseEvent): scala.Unit = js.native
  def _handleMouseEvents(event: stdLib.MouseEvent): scala.Unit = js.native
  def _handleMouseMove(event: stdLib.MouseEvent): scala.Unit = js.native
  def _handleMouseUp(event: stdLib.MouseEvent): scala.Unit = js.native
  def _handleTouchEnd(event: stdLib.MouseEvent): scala.Unit = js.native
  def _handleTouchEvents(event: stdLib.TouchEvent): scala.Unit = js.native
  def _handleTouchMove(event: stdLib.MouseEvent): scala.Unit = js.native
  def _handleTouchStart(event: stdLib.MouseEvent): scala.Unit = js.native
  def _reset(): scala.Unit = js.native
  def _strokeBegin(event: stdLib.MouseEvent): scala.Unit = js.native
  def _strokeEnd(event: stdLib.MouseEvent): scala.Unit = js.native
  def _strokeMoveUpdate(): scala.Unit = js.native
  def _strokeUpdate(event: stdLib.MouseEvent): scala.Unit = js.native
  def _strokeWidth(velocity: scala.Double): scala.Double = js.native
  def _toSVG(): java.lang.String = js.native
  /**
    *   Clears the canvas
    */
  def clear(): scala.Unit = js.native
  /**
    *   Draws signature image from array of signature point groups
    */
  def fromData(
    pointGroups: js.Array[
      js.Array[signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point]
    ]
  ): scala.Unit = js.native
  /**
    *   Draws signature image from data URL
    */
  def fromDataURL(dataUrl: java.lang.String): scala.Unit = js.native
  def fromDataURL(dataUrl: java.lang.String, options: signatureUnderscorePadLib.Anon_Callback): scala.Unit = js.native
  /**
    *   Returns true if canvas is empty, otherwise returns false
    */
  def isEmpty(): scala.Boolean = js.native
  /**
    *   Unbinds all event handlers
    */
  def off(): scala.Unit = js.native
  /**
    *   Rebinds all event handlers
    */
  def on(): scala.Unit = js.native
  /**
    * Callback when stroke begin
    */
  def onBegin(event: stdLib.MouseEvent): scala.Unit = js.native
  /**
    * Callback when stroke end.
    */
  def onEnd(event: stdLib.MouseEvent): scala.Unit = js.native
  /**
    *   Returns array of signature point groups
    */
  def toData(): js.Array[
    js.Array[signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs.Point]
  ] = js.native
  /**
    *   Returns signature image as data URL.
    *   If 'type' parameter is ommitted, PNG dataUrl is returned.
    */
  def toDataURL(): java.lang.String = js.native
  def toDataURL(`type`: java.lang.String): java.lang.String = js.native
  def toDataURL(`type`: java.lang.String, encoderOptions: js.Any): java.lang.String = js.native
}

