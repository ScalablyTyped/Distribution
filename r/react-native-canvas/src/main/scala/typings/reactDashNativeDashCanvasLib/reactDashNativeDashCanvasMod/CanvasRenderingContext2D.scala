package typings
package reactDashNativeDashCanvasLib.reactDashNativeDashCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasRenderingContext2D extends js.Object {
  var fillStyle: java.lang.String = js.native
  var font: java.lang.String = js.native
  var globalAlpha: scala.Double = js.native
  var globalCompositionOperation: java.lang.String = js.native
  var lineDashOffset: scala.Double = js.native
  var lineJoin: java.lang.String = js.native
  var lineWidth: scala.Double = js.native
  var linecap: java.lang.String = js.native
  var miterLimit: scala.Double = js.native
  var shadowBlur: scala.Double = js.native
  var shadowColor: java.lang.String = js.native
  var shadowOffsetX: scala.Double = js.native
  var shadowOffsetY: scala.Double = js.native
  var strokeStyle: java.lang.String = js.native
  var textAlign: java.lang.String = js.native
  def arc(x: scala.Double, y: scala.Double, r: scala.Double, sAngle: scala.Double, eAngle: scala.Double): scala.Unit = js.native
  def arc(
    x: scala.Double,
    y: scala.Double,
    r: scala.Double,
    sAngle: scala.Double,
    eAngle: scala.Double,
    counterClockwise: scala.Double
  ): scala.Unit = js.native
  def arcTo(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, r: scala.Double): scala.Unit = js.native
  def beginPath(): scala.Unit = js.native
  def bezierCurveTo(
    cp1x: scala.Double,
    cp1y: scala.Double,
    cp2x: scala.Double,
    cp2y: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): scala.Unit = js.native
  def clearRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def clip(): scala.Unit = js.native
  def closePath(): scala.Unit = js.native
  def createImageData(//
  width: scala.Double, height: scala.Double, imageData: ImageData): scala.Unit = js.native
  def createLinearGradient(x0: scala.Double, yo: scala.Double, x1: scala.Double, y1: scala.Double): scala.Unit = js.native
  def createPattern(): scala.Unit = js.native
  def createRadialGradient(
    x0: scala.Double,
    y0: scala.Double,
    r0: scala.Double,
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double
  ): scala.Unit = js.native
  def drawFocusIfNeeded(html: stdLib.HTMLElement): scala.Unit = js.native
  def drawImage(
    image: Image,
    dx: scala.Double,
    dy: scala.Double,
    sx: js.UndefOr[scala.Double],
    sy: js.UndefOr[scala.Double],
    sWidth: js.UndefOr[scala.Double],
    sHeight: js.UndefOr[scala.Double],
    dWidth: js.UndefOr[scala.Double],
    dHeight: js.UndefOr[scala.Double]
  ): scala.Unit = js.native
  def drawWidgetAsOnScreen(window: js.Any): scala.Unit = js.native
  def drawWindow(
    window: js.Any,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    bgColor: java.lang.String
  ): scala.Unit = js.native
  def drawWindow(
    window: js.Any,
    x: scala.Double,
    y: scala.Double,
    w: scala.Double,
    h: scala.Double,
    bgColor: java.lang.String,
    flags: js.Any
  ): scala.Unit = js.native
  def ellipse(
    x: scala.Double,
    y: scala.Double,
    radiusX: scala.Double,
    radiusY: scala.Double,
    rotation: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double
  ): scala.Unit = js.native
  def ellipse(
    x: scala.Double,
    y: scala.Double,
    radiusX: scala.Double,
    radiusY: scala.Double,
    rotation: scala.Double,
    startAngle: scala.Double,
    endAngle: scala.Double,
    anticlockwise: scala.Boolean
  ): scala.Unit = js.native
   //
  def fill(Path2D: Path2D): scala.Unit = js.native
  def fill(Path2D: Path2D, fillRule: js.Any): scala.Unit = js.native
  def fillRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def fillText(text: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def fillText(text: java.lang.String, x: scala.Double, y: scala.Double, maxWidth: scala.Double): scala.Unit = js.native
  def getImageData(sx: scala.Double, sy: scala.Double, sw: scala.Double, sh: scala.Double): ImageData = js.native
  def getLineDash(): js.Array[scala.Double] = js.native
  def isPointInPath(x: scala.Double, y: scala.Double, fillRule: js.Any, path: Path2D): scala.Boolean = js.native
  def isPointInStroke(x: scala.Double, y: scala.Double, path: Path2D): scala.Boolean = js.native
  def lineTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def measureText(text: java.lang.String): js.Any = js.native
  def moveTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def putImageData(imageData: ImageData, dx: scala.Double, dy: scala.Double): scala.Unit = js.native
  def putImageData(imageData: ImageData, dx: scala.Double, dy: scala.Double, dirtyX: scala.Double): scala.Unit = js.native
  def putImageData(
    imageData: ImageData,
    dx: scala.Double,
    dy: scala.Double,
    dirtyX: scala.Double,
    dirtyY: scala.Double
  ): scala.Unit = js.native
  def putImageData(
    imageData: ImageData,
    dx: scala.Double,
    dy: scala.Double,
    dirtyX: scala.Double,
    dirtyY: scala.Double,
    dirtyWidth: scala.Double
  ): scala.Unit = js.native
  def putImageData(
    imageData: ImageData,
    dx: scala.Double,
    dy: scala.Double,
    dirtyX: scala.Double,
    dirtyY: scala.Double,
    dirtyWidth: scala.Double,
    dirtyHeight: scala.Double
  ): scala.Unit = js.native
  def quadraticCurveTo(cpx: scala.Double, cpy: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def rect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def restore(): scala.Unit = js.native
  def rotate(angle: scala.Double): scala.Unit = js.native
  def save(): scala.Unit = js.native
  def scale(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def setLineDash(segments: js.Array[scala.Double]): scala.Unit = js.native
  def setTransform(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double
  ): scala.Unit = js.native
  def stroke(path: Path2D): scala.Unit = js.native
  def strokeRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): scala.Unit = js.native
  def strokeText(text: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def strokeText(text: java.lang.String, x: scala.Double, y: scala.Double, maxWidth: scala.Double): scala.Unit = js.native
  def transform(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double
  ): scala.Unit = js.native
  def translate(x: scala.Double, y: scala.Double): scala.Unit = js.native
}

