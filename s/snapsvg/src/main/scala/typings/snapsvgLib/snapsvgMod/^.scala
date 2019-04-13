package typings
package snapsvgLib.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snapsvg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var filter: Filter = js.native
  var path: Path = js.native
  def apply(DOM: stdLib.SVGElement): Paper = js.native
  def apply(query: java.lang.String): Paper = js.native
  def apply(width: scala.Double | java.lang.String, height: scala.Double | java.lang.String): Paper = js.native
  def Matrix(): scala.Unit = js.native
  def acos(angle: scala.Double): scala.Double = js.native
  def ajax(url: java.lang.String, callback: js.Function): stdLib.XMLHttpRequest = js.native
  def ajax(url: java.lang.String, callback: js.Function, scope: js.Object): stdLib.XMLHttpRequest = js.native
  def ajax(url: java.lang.String, postData: java.lang.String, callback: js.Function): stdLib.XMLHttpRequest = js.native
  def ajax(url: java.lang.String, postData: java.lang.String, callback: js.Function, scope: js.Object): stdLib.XMLHttpRequest = js.native
  def ajax(url: java.lang.String, postData: js.Object, callback: js.Function): stdLib.XMLHttpRequest = js.native
  def ajax(url: java.lang.String, postData: js.Object, callback: js.Function, scope: js.Object): stdLib.XMLHttpRequest = js.native
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
  def animate(
    from: js.Array[scala.Double],
    to: js.Array[scala.Double],
    updater: js.Function1[/* n */ scala.Double, scala.Unit],
    duration: scala.Double
  ): minaLib.minaNs.MinaAnimation = js.native
  def animate(
    from: js.Array[scala.Double],
    to: js.Array[scala.Double],
    updater: js.Function1[/* n */ scala.Double, scala.Unit],
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double]
  ): minaLib.minaNs.MinaAnimation = js.native
  def animate(
    from: js.Array[scala.Double],
    to: js.Array[scala.Double],
    updater: js.Function1[/* n */ scala.Double, scala.Unit],
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double],
    callback: js.Function0[scala.Unit]
  ): minaLib.minaNs.MinaAnimation = js.native
  def animate(
    from: js.Array[scala.Double],
    to: scala.Double,
    updater: js.Function1[/* n */ scala.Double, scala.Unit],
    duration: scala.Double
  ): minaLib.minaNs.MinaAnimation = js.native
  def animate(
    from: js.Array[scala.Double],
    to: scala.Double,
    updater: js.Function1[/* n */ scala.Double, scala.Unit],
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double]
  ): minaLib.minaNs.MinaAnimation = js.native
  def animate(
    from: js.Array[scala.Double],
    to: scala.Double,
    updater: js.Function1[/* n */ scala.Double, scala.Unit],
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double],
    callback: js.Function0[scala.Unit]
  ): minaLib.minaNs.MinaAnimation = js.native
  def animate(
    from: scala.Double,
    to: js.Array[scala.Double],
    updater: js.Function1[/* n */ scala.Double, scala.Unit],
    duration: scala.Double
  ): minaLib.minaNs.MinaAnimation = js.native
  def animate(
    from: scala.Double,
    to: js.Array[scala.Double],
    updater: js.Function1[/* n */ scala.Double, scala.Unit],
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double]
  ): minaLib.minaNs.MinaAnimation = js.native
  def animate(
    from: scala.Double,
    to: js.Array[scala.Double],
    updater: js.Function1[/* n */ scala.Double, scala.Unit],
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double],
    callback: js.Function0[scala.Unit]
  ): minaLib.minaNs.MinaAnimation = js.native
  def animate(
    from: scala.Double,
    to: scala.Double,
    updater: js.Function1[/* n */ scala.Double, scala.Unit],
    duration: scala.Double
  ): minaLib.minaNs.MinaAnimation = js.native
  def animate(
    from: scala.Double,
    to: scala.Double,
    updater: js.Function1[/* n */ scala.Double, scala.Unit],
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double]
  ): minaLib.minaNs.MinaAnimation = js.native
  def animate(
    from: scala.Double,
    to: scala.Double,
    updater: js.Function1[/* n */ scala.Double, scala.Unit],
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double],
    callback: js.Function0[scala.Unit]
  ): minaLib.minaNs.MinaAnimation = js.native
  def animation(attr: js.Object, duration: scala.Double): Animation = js.native
  def animation(
    attr: js.Object,
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double]
  ): Animation = js.native
  def animation(
    attr: js.Object,
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double],
    callback: js.Function0[scala.Unit]
  ): Animation = js.native
  def asin(angle: scala.Double): scala.Double = js.native
  def atan(angle: scala.Double): scala.Double = js.native
  def atan2(angle: scala.Double): scala.Double = js.native
  def closest(x: scala.Double, y: scala.Double, X: scala.Double, Y: scala.Double): scala.Boolean = js.native
  def color(clr: java.lang.String): RGBHSB = js.native
  def cos(angle: scala.Double): scala.Double = js.native
  def deg(rad: scala.Double): scala.Double = js.native
  def format(token: java.lang.String, json: js.Object): java.lang.String = js.native
  def fragment(varargs: js.Any): Fragment = js.native
  def getElementByPoint(x: scala.Double, y: scala.Double): Element = js.native
  def getRGB(color: java.lang.String): RGB = js.native
  def hsb(h: scala.Double, s: scala.Double, b: scala.Double): HSB = js.native
  def hsb2rgb(h: scala.Double, s: scala.Double, v: scala.Double): RGB = js.native
  def hsl(h: scala.Double, s: scala.Double, l: scala.Double): HSL = js.native
  def hsl2rgb(h: scala.Double, s: scala.Double, l: scala.Double): RGB = js.native
  def is(o: js.Any, `type`: java.lang.String): scala.Boolean = js.native
  def len(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double = js.native
  def len2(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double = js.native
  def load(url: java.lang.String, callback: js.Function1[/* f */ Fragment, scala.Unit]): scala.Unit = js.native
  def load(url: java.lang.String, callback: js.Function1[/* f */ Fragment, scala.Unit], scope: js.Object): scala.Unit = js.native
  def matrix(): Matrix = js.native
  def matrix(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double
  ): Matrix = js.native
  def matrix(svgMatrix: stdLib.SVGMatrix): Matrix = js.native
  def parse(svg: java.lang.String): Fragment = js.native
  def parsePathString(pathString: java.lang.String): js.Array[_] = js.native
  def parsePathString(pathString: js.Array[java.lang.String]): js.Array[_] = js.native
  def parseTransformString(TString: java.lang.String): js.Array[_] = js.native
  def parseTransformString(TString: js.Array[java.lang.String]): js.Array[_] = js.native
  def plugin(f: js.Function): scala.Unit = js.native
  def rad(deg: scala.Double): scala.Double = js.native
  def rgb(r: scala.Double, g: scala.Double, b: scala.Double): RGB = js.native
  def rgb2hsb(r: scala.Double, g: scala.Double, b: scala.Double): HSB = js.native
  def rgb2hsl(r: scala.Double, g: scala.Double, b: scala.Double): HSL = js.native
  def select(query: java.lang.String): Element = js.native
  def selectAll(query: java.lang.String): js.Any = js.native
  def set(els: Element*): Set = js.native
  def sin(angle: scala.Double): scala.Double = js.native
  def snapTo(values: js.Array[scala.Double], value: scala.Double): scala.Double = js.native
  def snapTo(values: js.Array[scala.Double], value: scala.Double, tolerance: scala.Double): scala.Double = js.native
  def snapTo(values: scala.Double, value: scala.Double): scala.Double = js.native
  def snapTo(values: scala.Double, value: scala.Double, tolerance: scala.Double): scala.Double = js.native
  def tan(angle: scala.Double): scala.Double = js.native
}

