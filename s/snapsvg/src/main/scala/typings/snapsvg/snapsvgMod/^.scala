package typings.snapsvg.snapsvgMod

import typings.mina.minaNs.MinaAnimation
import typings.std.SVGElement
import typings.std.SVGMatrix
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snapsvg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var filter: Filter = js.native
  var path: Path = js.native
  def apply(DOM: SVGElement): Paper = js.native
  def apply(query: String): Paper = js.native
  def apply(width: Double | String, height: Double | String): Paper = js.native
  def Matrix(): Unit = js.native
  def acos(angle: Double): Double = js.native
  def ajax(url: String, callback: js.Function): XMLHttpRequest = js.native
  def ajax(url: String, callback: js.Function, scope: js.Object): XMLHttpRequest = js.native
  def ajax(url: String, postData: String, callback: js.Function): XMLHttpRequest = js.native
  def ajax(url: String, postData: String, callback: js.Function, scope: js.Object): XMLHttpRequest = js.native
  def ajax(url: String, postData: js.Object, callback: js.Function): XMLHttpRequest = js.native
  def ajax(url: String, postData: js.Object, callback: js.Function, scope: js.Object): XMLHttpRequest = js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double): Double = js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double = js.native
  def animate(
    from: js.Array[Double],
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double
  ): MinaAnimation = js.native
  def animate(
    from: js.Array[Double],
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): MinaAnimation = js.native
  def animate(
    from: js.Array[Double],
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  def animate(from: js.Array[Double], to: Double, updater: js.Function1[/* n */ Double, Unit], duration: Double): MinaAnimation = js.native
  def animate(
    from: js.Array[Double],
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): MinaAnimation = js.native
  def animate(
    from: js.Array[Double],
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  def animate(from: Double, to: js.Array[Double], updater: js.Function1[/* n */ Double, Unit], duration: Double): MinaAnimation = js.native
  def animate(
    from: Double,
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): MinaAnimation = js.native
  def animate(
    from: Double,
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  def animate(from: Double, to: Double, updater: js.Function1[/* n */ Double, Unit], duration: Double): MinaAnimation = js.native
  def animate(
    from: Double,
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): MinaAnimation = js.native
  def animate(
    from: Double,
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  def animation(attr: js.Object, duration: Double): Animation = js.native
  def animation(attr: js.Object, duration: Double, easing: js.Function1[/* num */ Double, Double]): Animation = js.native
  def animation(
    attr: js.Object,
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): Animation = js.native
  def asin(angle: Double): Double = js.native
  def atan(angle: Double): Double = js.native
  def atan2(angle: Double): Double = js.native
  def closest(x: Double, y: Double, X: Double, Y: Double): Boolean = js.native
  def color(clr: String): RGBHSB = js.native
  def cos(angle: Double): Double = js.native
  def deg(rad: Double): Double = js.native
  def format(token: String, json: js.Object): String = js.native
  def fragment(varargs: js.Any): Fragment = js.native
  def getElementByPoint(x: Double, y: Double): Element = js.native
  def getRGB(color: String): RGB = js.native
  def hsb(h: Double, s: Double, b: Double): HSB = js.native
  def hsb2rgb(h: Double, s: Double, v: Double): RGB = js.native
  def hsl(h: Double, s: Double, l: Double): HSL = js.native
  def hsl2rgb(h: Double, s: Double, l: Double): RGB = js.native
  def is(o: js.Any, `type`: String): Boolean = js.native
  def len(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def len2(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def load(url: String, callback: js.Function1[/* f */ Fragment, Unit]): Unit = js.native
  def load(url: String, callback: js.Function1[/* f */ Fragment, Unit], scope: js.Object): Unit = js.native
  def matrix(): Matrix = js.native
  def matrix(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix = js.native
  def matrix(svgMatrix: SVGMatrix): Matrix = js.native
  def parse(svg: String): Fragment = js.native
  def parsePathString(pathString: String): js.Array[_] = js.native
  def parsePathString(pathString: js.Array[String]): js.Array[_] = js.native
  def parseTransformString(TString: String): js.Array[_] = js.native
  def parseTransformString(TString: js.Array[String]): js.Array[_] = js.native
  def plugin(f: js.Function): Unit = js.native
  def rad(deg: Double): Double = js.native
  def rgb(r: Double, g: Double, b: Double): RGB = js.native
  def rgb2hsb(r: Double, g: Double, b: Double): HSB = js.native
  def rgb2hsl(r: Double, g: Double, b: Double): HSL = js.native
  def select(query: String): Element = js.native
  def selectAll(query: String): js.Any = js.native
  def set(els: Element*): Set = js.native
  def sin(angle: Double): Double = js.native
  def snapTo(values: js.Array[Double], value: Double): Double = js.native
  def snapTo(values: js.Array[Double], value: Double, tolerance: Double): Double = js.native
  def snapTo(values: Double, value: Double): Double = js.native
  def snapTo(values: Double, value: Double, tolerance: Double): Double = js.native
  def tan(angle: Double): Double = js.native
}

