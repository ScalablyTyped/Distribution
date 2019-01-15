package typings
package snapsvgLib.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snapsvg", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var filter: snapsvgLib.snapsvgMod.SnapNs.Filter = js.native
  var path: snapsvgLib.snapsvgMod.SnapNs.Path = js.native
  def apply(DOM: stdLib.SVGElement): snapsvgLib.snapsvgMod.SnapNs.Paper = js.native
  def apply(query: java.lang.String): snapsvgLib.snapsvgMod.SnapNs.Paper = js.native
  def apply(width: scala.Double | java.lang.String, height: scala.Double | java.lang.String): snapsvgLib.snapsvgMod.SnapNs.Paper = js.native
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
  def animation(attr: js.Object, duration: scala.Double): snapsvgLib.snapsvgMod.SnapNs.Animation = js.native
  def animation(
    attr: js.Object,
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double]
  ): snapsvgLib.snapsvgMod.SnapNs.Animation = js.native
  def animation(
    attr: js.Object,
    duration: scala.Double,
    easing: js.Function1[/* num */ scala.Double, scala.Double],
    callback: js.Function0[scala.Unit]
  ): snapsvgLib.snapsvgMod.SnapNs.Animation = js.native
  def asin(angle: scala.Double): scala.Double = js.native
  def atan(angle: scala.Double): scala.Double = js.native
  def atan2(angle: scala.Double): scala.Double = js.native
  def closest(x: scala.Double, y: scala.Double, X: scala.Double, Y: scala.Double): scala.Boolean = js.native
  def color(clr: java.lang.String): snapsvgLib.snapsvgMod.SnapNs.RGBHSB = js.native
  def cos(angle: scala.Double): scala.Double = js.native
  def deg(rad: scala.Double): scala.Double = js.native
  def format(token: java.lang.String, json: js.Object): java.lang.String = js.native
  def fragment(varargs: js.Any): snapsvgLib.snapsvgMod.SnapNs.Fragment = js.native
  def getElementByPoint(x: scala.Double, y: scala.Double): snapsvgLib.snapsvgMod.SnapNs.Element = js.native
  def getRGB(color: java.lang.String): snapsvgLib.snapsvgMod.SnapNs.RGB = js.native
  def hsb(h: scala.Double, s: scala.Double, b: scala.Double): snapsvgLib.snapsvgMod.SnapNs.HSB = js.native
  def hsb2rgb(h: scala.Double, s: scala.Double, v: scala.Double): snapsvgLib.snapsvgMod.SnapNs.RGB = js.native
  def hsl(h: scala.Double, s: scala.Double, l: scala.Double): snapsvgLib.snapsvgMod.SnapNs.HSL = js.native
  def hsl2rgb(h: scala.Double, s: scala.Double, l: scala.Double): snapsvgLib.snapsvgMod.SnapNs.RGB = js.native
  def is(o: js.Any, `type`: java.lang.String): scala.Boolean = js.native
  def len(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double = js.native
  def len2(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double = js.native
  def load(
    url: java.lang.String,
    callback: js.Function1[/* f */ snapsvgLib.snapsvgMod.SnapNs.Fragment, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    callback: js.Function1[/* f */ snapsvgLib.snapsvgMod.SnapNs.Fragment, scala.Unit],
    scope: js.Object
  ): scala.Unit = js.native
  def matrix(): snapsvgLib.snapsvgMod.SnapNs.Matrix = js.native
  def matrix(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double
  ): snapsvgLib.snapsvgMod.SnapNs.Matrix = js.native
  def matrix(svgMatrix: stdLib.SVGMatrix): snapsvgLib.snapsvgMod.SnapNs.Matrix = js.native
  def parse(svg: java.lang.String): snapsvgLib.snapsvgMod.SnapNs.Fragment = js.native
  def parsePathString(pathString: java.lang.String): js.Array[_] = js.native
  def parsePathString(pathString: js.Array[java.lang.String]): js.Array[_] = js.native
  def parseTransformString(TString: java.lang.String): js.Array[_] = js.native
  def parseTransformString(TString: js.Array[java.lang.String]): js.Array[_] = js.native
  def plugin(f: js.Function): scala.Unit = js.native
  def rad(deg: scala.Double): scala.Double = js.native
  def rgb(r: scala.Double, g: scala.Double, b: scala.Double): snapsvgLib.snapsvgMod.SnapNs.RGB = js.native
  def rgb2hsb(r: scala.Double, g: scala.Double, b: scala.Double): snapsvgLib.snapsvgMod.SnapNs.HSB = js.native
  def rgb2hsl(r: scala.Double, g: scala.Double, b: scala.Double): snapsvgLib.snapsvgMod.SnapNs.HSL = js.native
  def select(query: java.lang.String): snapsvgLib.snapsvgMod.SnapNs.Element = js.native
  def selectAll(query: java.lang.String): js.Any = js.native
  def set(els: snapsvgLib.snapsvgMod.SnapNs.Element*): snapsvgLib.snapsvgMod.SnapNs.Set = js.native
  def sin(angle: scala.Double): scala.Double = js.native
  def snapTo(values: js.Array[scala.Double], value: scala.Double): scala.Double = js.native
  def snapTo(values: js.Array[scala.Double], value: scala.Double, tolerance: scala.Double): scala.Double = js.native
  def snapTo(values: scala.Double, value: scala.Double): scala.Double = js.native
  def snapTo(values: scala.Double, value: scala.Double, tolerance: scala.Double): scala.Double = js.native
  def tan(angle: scala.Double): scala.Double = js.native
}

