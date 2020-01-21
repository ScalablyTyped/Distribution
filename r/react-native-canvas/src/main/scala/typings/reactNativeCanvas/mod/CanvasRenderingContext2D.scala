package typings.reactNativeCanvas.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasRenderingContext2D extends js.Object {
  var fillStyle: String | CanvasGradient | CanvasPattern = js.native
  var font: String = js.native
  var globalAlpha: Double = js.native
  var globalCompositionOperation: String = js.native
  var lineDashOffset: Double = js.native
  var lineJoin: String = js.native
  var lineWidth: Double = js.native
  var linecap: String = js.native
  var miterLimit: Double = js.native
  var shadowBlur: Double = js.native
  var shadowColor: String = js.native
  var shadowOffsetX: Double = js.native
  var shadowOffsetY: Double = js.native
  var strokeStyle: String = js.native
  var textAlign: String = js.native
  def arc(x: Double, y: Double, r: Double, sAngle: Double, eAngle: Double): Unit = js.native
  def arc(x: Double, y: Double, r: Double, sAngle: Double, eAngle: Double, counterClockwise: Boolean): Unit = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, r: Double): Unit = js.native
  def beginPath(): Unit = js.native
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  def clearRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def clip(): Unit = js.native
  def closePath(): Unit = js.native
  def createImageData(//
  width: Double, height: Double, imageData: ImageData): Unit = js.native
  def createLinearGradient(x0: Double, yo: Double, x1: Double, y1: Double): CanvasGradient = js.native
  def createPattern(): Unit = js.native
  def createRadialGradient(x0: Double, y0: Double, r0: Double, x1: Double, y1: Double, r1: Double): Unit = js.native
  def drawFocusIfNeeded(html: HTMLElement): Unit = js.native
  def drawImage(
    image: Image,
    dx: Double,
    dy: Double,
    sx: js.UndefOr[Double],
    sy: js.UndefOr[Double],
    sWidth: js.UndefOr[Double],
    sHeight: js.UndefOr[Double],
    dWidth: js.UndefOr[Double],
    dHeight: js.UndefOr[Double]
  ): Unit = js.native
  def drawWidgetAsOnScreen(window: js.Any): Unit = js.native
  def drawWindow(window: js.Any, x: Double, y: Double, w: Double, h: Double, bgColor: String): Unit = js.native
  def drawWindow(window: js.Any, x: Double, y: Double, w: Double, h: Double, bgColor: String, flags: js.Any): Unit = js.native
  def ellipse(
    x: Double,
    y: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double,
    startAngle: Double,
    endAngle: Double
  ): Unit = js.native
  def ellipse(
    x: Double,
    y: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean
  ): Unit = js.native
   //
  def fill(): Unit = js.native
  def fill(Path2D: Path2D): Unit = js.native
  def fill(Path2D: Path2D, fillRule: js.Any): Unit = js.native
  def fillRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def fillText(text: String, x: Double, y: Double): Unit = js.native
  def fillText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
  def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageData] = js.native
  def getLineDash(): js.Array[Double] = js.native
  def isPointInPath(x: Double, y: Double, fillRule: js.Any, path: Path2D): Boolean = js.native
  def isPointInStroke(x: Double, y: Double, path: Path2D): Boolean = js.native
  def lineTo(x: Double, y: Double): Unit = js.native
  def measureText(text: String): js.Any = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def putImageData(imageData: ImageData, dx: Double, dy: Double): Unit = js.native
  def putImageData(imageData: ImageData, dx: Double, dy: Double, dirtyX: Double): Unit = js.native
  def putImageData(imageData: ImageData, dx: Double, dy: Double, dirtyX: Double, dirtyY: Double): Unit = js.native
  def putImageData(imageData: ImageData, dx: Double, dy: Double, dirtyX: Double, dirtyY: Double, dirtyWidth: Double): Unit = js.native
  def putImageData(
    imageData: ImageData,
    dx: Double,
    dy: Double,
    dirtyX: Double,
    dirtyY: Double,
    dirtyWidth: Double,
    dirtyHeight: Double
  ): Unit = js.native
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def restore(): Unit = js.native
  def rotate(angle: Double): Unit = js.native
  def save(): Unit = js.native
  def scale(x: Double, y: Double): Unit = js.native
  def setLineDash(segments: js.Array[Double]): Unit = js.native
  def setTransform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  def stroke(path: Path2D): Unit = js.native
  def strokeRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def strokeText(text: String, x: Double, y: Double): Unit = js.native
  def strokeText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
  def transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
  def translate(x: Double, y: Double): Unit = js.native
}

