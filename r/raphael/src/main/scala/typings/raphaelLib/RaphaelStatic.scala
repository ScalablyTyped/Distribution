package typings
package raphaelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelStatic extends js.Object {
  var easing_formulas: js.Any = js.native
  var el: js.Any = js.native
  var fn: js.Any = js.native
  @JSName("getColor")
  var getColor_Original: Anon_Value = js.native
  var st: js.Any = js.native
  var svg: scala.Boolean = js.native
  var `type`: java.lang.String = js.native
  var vml: scala.Boolean = js.native
  def apply(): RaphaelPaper = js.native
  def apply(all: js.Array[_]): RaphaelPaper = js.native
  def apply(all: js.Array[_], callback: js.Function): RaphaelPaper = js.native
  def apply(container: java.lang.String, width: scala.Double, height: scala.Double): RaphaelPaper = js.native
  def apply(container: java.lang.String, width: scala.Double, height: scala.Double, callback: js.Function): RaphaelPaper = js.native
  def apply(container: stdLib.HTMLElement, width: scala.Double, height: scala.Double): RaphaelPaper = js.native
  def apply(container: stdLib.HTMLElement, width: scala.Double, height: scala.Double, callback: js.Function): RaphaelPaper = js.native
  def apply(onReadyCallback: js.Function): RaphaelPaper = js.native
  def apply(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): RaphaelPaper = js.native
  def apply(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double, callback: js.Function): RaphaelPaper = js.native
  def angle(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double = js.native
  def angle(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, x3: scala.Double): scala.Double = js.native
  def angle(
    x1: scala.Double,
    y1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    x3: scala.Double,
    y3: scala.Double
  ): scala.Double = js.native
  def animation(params: js.Any, ms: scala.Double): RaphaelAnimation = js.native
  def animation(params: js.Any, ms: scala.Double, easing: java.lang.String): RaphaelAnimation = js.native
  def animation(params: js.Any, ms: scala.Double, easing: java.lang.String, callback: js.Function): RaphaelAnimation = js.native
  def bezierBBox(bez: js.Array[_]): Anon_Max = js.native
  def bezierBBox(
    p1x: scala.Double,
    p1y: scala.Double,
    c1x: scala.Double,
    c1y: scala.Double,
    c2x: scala.Double,
    c2y: scala.Double,
    p2x: scala.Double,
    p2y: scala.Double
  ): Anon_Max = js.native
  def color(clr: java.lang.String): Anon_S = js.native
  def createUUID(): java.lang.String = js.native
  def deg(deg: scala.Double): scala.Double = js.native
  def findDotsAtSegment(
    p1x: scala.Double,
    p1y: scala.Double,
    c1x: scala.Double,
    c1y: scala.Double,
    c2x: scala.Double,
    c2y: scala.Double,
    p2x: scala.Double,
    p2y: scala.Double,
    t: scala.Double
  ): Anon_AlphaX = js.native
  def format(token: java.lang.String, parameters: js.Any*): java.lang.String = js.native
  def fullfill(token: java.lang.String, json: stdLib.JSON): java.lang.String = js.native
  def getColor(): java.lang.String = js.native
  def getColor(value: scala.Double): java.lang.String = js.native
  def getPointAtLength(path: java.lang.String, length: scala.Double): Anon_Alpha = js.native
  def getRGB(colour: java.lang.String): Anon_Hex = js.native
  def getSubpath(path: java.lang.String, from: scala.Double, to: scala.Double): java.lang.String = js.native
  def getTotalLength(path: java.lang.String): scala.Double = js.native
  def hsb(h: scala.Double, s: scala.Double, b: scala.Double): java.lang.String = js.native
  def hsb2rgb(h: scala.Double, s: scala.Double, v: scala.Double): Anon_B = js.native
  def hsl(h: scala.Double, s: scala.Double, l: scala.Double): java.lang.String = js.native
  def hsl2rgb(h: scala.Double, s: scala.Double, l: scala.Double): Anon_B = js.native
  def is(o: js.Any, `type`: java.lang.String): scala.Boolean = js.native
  def isBBoxIntersect(bbox1: java.lang.String, bbox2: java.lang.String): scala.Boolean = js.native
  def isPointInsideBBox(bbox: java.lang.String, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def isPointInsidePath(path: java.lang.String, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def matrix(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double
  ): RaphaelMatrix = js.native
  def ninja(): scala.Unit = js.native
  def parsePathString(pathString: java.lang.String): js.Array[java.lang.String] = js.native
  def parsePathString(pathString: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def parseTransformString(TString: java.lang.String): js.Array[java.lang.String] = js.native
  def parseTransformString(TString: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def path2curve(pathString: java.lang.String): js.Array[java.lang.String] = js.native
  def path2curve(pathString: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def pathBBox(path: java.lang.String): BoundingBox = js.native
  def pathIntersection(path1: java.lang.String, path2: java.lang.String): js.Array[Anon_Segment1] = js.native
  def pathToRelative(pathString: java.lang.String): js.Array[java.lang.String] = js.native
  def pathToRelative(pathString: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def rad(deg: scala.Double): scala.Double = js.native
  def registerFont(font: RaphaelFont): RaphaelFont = js.native
  def rgb(r: scala.Double, g: scala.Double, b: scala.Double): java.lang.String = js.native
  def rgb2hsb(r: scala.Double, g: scala.Double, b: scala.Double): Anon_HB = js.native
  def rgb2hsl(r: scala.Double, g: scala.Double, b: scala.Double): Anon_H = js.native
  def setWindow(newwin: stdLib.Window): scala.Unit = js.native
  def snapTo(values: js.Array[scala.Double], value: scala.Double): scala.Double = js.native
  def snapTo(values: js.Array[scala.Double], value: scala.Double, tolerance: scala.Double): scala.Double = js.native
  def snapTo(values: scala.Double, value: scala.Double): scala.Double = js.native
  def snapTo(values: scala.Double, value: scala.Double, tolerance: scala.Double): scala.Double = js.native
  def toMatrix(path: java.lang.String, transform: java.lang.String): RaphaelMatrix = js.native
  def toMatrix(path: java.lang.String, transform: js.Array[java.lang.String]): RaphaelMatrix = js.native
  def transformPath(path: java.lang.String, transform: java.lang.String): java.lang.String = js.native
  def transformPath(path: java.lang.String, transform: js.Array[java.lang.String]): java.lang.String = js.native
}

