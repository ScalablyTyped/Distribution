package typings.raphael

import typings.std.HTMLElement
import typings.std.JSON
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelStatic extends js.Object {
  var easing_formulas: js.Any = js.native
  var el: js.Any = js.native
  var fn: js.Any = js.native
  @JSName("getColor")
  var getColor_Original: Anon_Reset = js.native
  var st: js.Any = js.native
  var svg: Boolean = js.native
  var `type`: String = js.native
  var vml: Boolean = js.native
  def apply(): RaphaelPaper = js.native
  def apply(all: js.Array[_]): RaphaelPaper = js.native
  def apply(all: js.Array[_], callback: js.Function): RaphaelPaper = js.native
  def apply(container: String, width: Double, height: Double): RaphaelPaper = js.native
  def apply(container: String, width: Double, height: Double, callback: js.Function): RaphaelPaper = js.native
  def apply(container: HTMLElement, width: Double, height: Double): RaphaelPaper = js.native
  def apply(container: HTMLElement, width: Double, height: Double, callback: js.Function): RaphaelPaper = js.native
  def apply(onReadyCallback: js.Function): RaphaelPaper = js.native
  def apply(x: Double, y: Double, width: Double, height: Double): RaphaelPaper = js.native
  def apply(x: Double, y: Double, width: Double, height: Double, callback: js.Function): RaphaelPaper = js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double): Double = js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double = js.native
  def animation(params: js.Any, ms: Double): RaphaelAnimation = js.native
  def animation(params: js.Any, ms: Double, easing: String): RaphaelAnimation = js.native
  def animation(params: js.Any, ms: Double, easing: String, callback: js.Function): RaphaelAnimation = js.native
  def bezierBBox(bez: js.Array[_]): Anon_Max = js.native
  def bezierBBox(
    p1x: Double,
    p1y: Double,
    c1x: Double,
    c1y: Double,
    c2x: Double,
    c2y: Double,
    p2x: Double,
    p2y: Double
  ): Anon_Max = js.native
  def color(clr: String): Anon_B = js.native
  def createUUID(): String = js.native
  def deg(deg: Double): Double = js.native
  def findDotsAtSegment(
    p1x: Double,
    p1y: Double,
    c1x: Double,
    c1y: Double,
    c2x: Double,
    c2y: Double,
    p2x: Double,
    p2y: Double,
    t: Double
  ): Anon_AlphaEnd = js.native
  def format(token: String, parameters: js.Any*): String = js.native
  def fullfill(token: String, json: JSON): String = js.native
  def getColor(): String = js.native
  def getColor(value: Double): String = js.native
  def getPointAtLength(path: String, length: Double): Anon_Alpha = js.native
  def getRGB(colour: String): Anon_BError = js.native
  def getSubpath(path: String, from: Double, to: Double): String = js.native
  def getTotalLength(path: String): Double = js.native
  def hsb(h: Double, s: Double, b: Double): String = js.native
  def hsb2rgb(h: Double, s: Double, v: Double): Anon_BG = js.native
  def hsl(h: Double, s: Double, l: Double): String = js.native
  def hsl2rgb(h: Double, s: Double, l: Double): Anon_BG = js.native
  def is(o: js.Any, `type`: String): Boolean = js.native
  def isBBoxIntersect(bbox1: String, bbox2: String): Boolean = js.native
  def isPointInsideBBox(bbox: String, x: Double, y: Double): Boolean = js.native
  def isPointInsidePath(path: String, x: Double, y: Double): Boolean = js.native
  def matrix(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): RaphaelMatrix = js.native
  def ninja(): Unit = js.native
  def parsePathString(pathString: String): js.Array[String] = js.native
  def parsePathString(pathString: js.Array[String]): js.Array[String] = js.native
  def parseTransformString(TString: String): js.Array[String] = js.native
  def parseTransformString(TString: js.Array[String]): js.Array[String] = js.native
  def path2curve(pathString: String): js.Array[String] = js.native
  def path2curve(pathString: js.Array[String]): js.Array[String] = js.native
  def pathBBox(path: String): BoundingBox = js.native
  def pathIntersection(path1: String, path2: String): js.Array[Anon_Bez1] = js.native
  def pathToRelative(pathString: String): js.Array[String] = js.native
  def pathToRelative(pathString: js.Array[String]): js.Array[String] = js.native
  def rad(deg: Double): Double = js.native
  def registerFont(font: RaphaelFont): RaphaelFont = js.native
  def rgb(r: Double, g: Double, b: Double): String = js.native
  def rgb2hsb(r: Double, g: Double, b: Double): Anon_BH = js.native
  def rgb2hsl(r: Double, g: Double, b: Double): Anon_H = js.native
  def setWindow(newwin: Window): Unit = js.native
  def snapTo(values: js.Array[Double], value: Double): Double = js.native
  def snapTo(values: js.Array[Double], value: Double, tolerance: Double): Double = js.native
  def snapTo(values: Double, value: Double): Double = js.native
  def snapTo(values: Double, value: Double, tolerance: Double): Double = js.native
  def toMatrix(path: String, transform: String): RaphaelMatrix = js.native
  def toMatrix(path: String, transform: js.Array[String]): RaphaelMatrix = js.native
  def transformPath(path: String, transform: String): String = js.native
  def transformPath(path: String, transform: js.Array[String]): String = js.native
}

