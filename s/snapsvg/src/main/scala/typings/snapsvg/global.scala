package typings.snapsvg

import typings.mina.mina.MinaAnimation
import typings.snapsvg.mod.Animation_
import typings.snapsvg.mod.Element
import typings.snapsvg.mod.Filter_
import typings.snapsvg.mod.Fragment_
import typings.snapsvg.mod.HSB_
import typings.snapsvg.mod.HSL_
import typings.snapsvg.mod.Matrix_
import typings.snapsvg.mod.Paper
import typings.snapsvg.mod.Path_
import typings.snapsvg.mod.RGBHSB
import typings.snapsvg.mod.RGB_
import typings.snapsvg.mod.Set_
import typings.std.SVGElement
import typings.std.SVGMatrix
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Snap {
    
    inline def apply(DOM: SVGElement): Paper = ^.asInstanceOf[js.Dynamic].apply(DOM.asInstanceOf[js.Any]).asInstanceOf[Paper]
    inline def apply(query: String): Paper = ^.asInstanceOf[js.Dynamic].apply(query.asInstanceOf[js.Any]).asInstanceOf[Paper]
    inline def apply(width: String, height: String): Paper = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Paper]
    inline def apply(width: String, height: Double): Paper = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Paper]
    inline def apply(width: Double, height: String): Paper = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Paper]
    inline def apply(width: Double, height: Double): Paper = (^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Paper]
    
    @JSGlobal("Snap")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Matrix_(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Matrix")().asInstanceOf[Unit]
    
    inline def acos(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("acos")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def ajax(url: String, callback: js.Function): XMLHttpRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest]
    inline def ajax(url: String, callback: js.Function, scope: js.Object): XMLHttpRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest]
    inline def ajax(url: String, postData: String, callback: js.Function): XMLHttpRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(url.asInstanceOf[js.Any], postData.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest]
    inline def ajax(url: String, postData: String, callback: js.Function, scope: js.Object): XMLHttpRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(url.asInstanceOf[js.Any], postData.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest]
    inline def ajax(url: String, postData: js.Object, callback: js.Function): XMLHttpRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(url.asInstanceOf[js.Any], postData.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest]
    inline def ajax(url: String, postData: js.Object, callback: js.Function, scope: js.Object): XMLHttpRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("ajax")(url.asInstanceOf[js.Any], postData.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest]
    
    inline def angle(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Unit, y3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angle")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def animate(
      from: js.Array[Double],
      to: js.Array[Double],
      updater: js.Function1[/* n */ Double, Unit],
      duration: Double
    ): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(
      from: js.Array[Double],
      to: js.Array[Double],
      updater: js.Function1[/* n */ Double, Unit],
      duration: Double,
      easing: js.Function1[/* num */ Double, Double]
    ): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(
      from: js.Array[Double],
      to: js.Array[Double],
      updater: js.Function1[/* n */ Double, Unit],
      duration: Double,
      easing: js.Function1[/* num */ Double, Double],
      callback: js.Function0[Unit]
    ): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(
      from: js.Array[Double],
      to: js.Array[Double],
      updater: js.Function1[/* n */ Double, Unit],
      duration: Double,
      easing: Unit,
      callback: js.Function0[Unit]
    ): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(from: js.Array[Double], to: Double, updater: js.Function1[/* n */ Double, Unit], duration: Double): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(
      from: js.Array[Double],
      to: Double,
      updater: js.Function1[/* n */ Double, Unit],
      duration: Double,
      easing: js.Function1[/* num */ Double, Double]
    ): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(
      from: js.Array[Double],
      to: Double,
      updater: js.Function1[/* n */ Double, Unit],
      duration: Double,
      easing: js.Function1[/* num */ Double, Double],
      callback: js.Function0[Unit]
    ): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(
      from: js.Array[Double],
      to: Double,
      updater: js.Function1[/* n */ Double, Unit],
      duration: Double,
      easing: Unit,
      callback: js.Function0[Unit]
    ): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(from: Double, to: js.Array[Double], updater: js.Function1[/* n */ Double, Unit], duration: Double): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(
      from: Double,
      to: js.Array[Double],
      updater: js.Function1[/* n */ Double, Unit],
      duration: Double,
      easing: js.Function1[/* num */ Double, Double]
    ): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(
      from: Double,
      to: js.Array[Double],
      updater: js.Function1[/* n */ Double, Unit],
      duration: Double,
      easing: js.Function1[/* num */ Double, Double],
      callback: js.Function0[Unit]
    ): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(
      from: Double,
      to: js.Array[Double],
      updater: js.Function1[/* n */ Double, Unit],
      duration: Double,
      easing: Unit,
      callback: js.Function0[Unit]
    ): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(from: Double, to: Double, updater: js.Function1[/* n */ Double, Unit], duration: Double): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(
      from: Double,
      to: Double,
      updater: js.Function1[/* n */ Double, Unit],
      duration: Double,
      easing: js.Function1[/* num */ Double, Double]
    ): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(
      from: Double,
      to: Double,
      updater: js.Function1[/* n */ Double, Unit],
      duration: Double,
      easing: js.Function1[/* num */ Double, Double],
      callback: js.Function0[Unit]
    ): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    inline def animate(
      from: Double,
      to: Double,
      updater: js.Function1[/* n */ Double, Unit],
      duration: Double,
      easing: Unit,
      callback: js.Function0[Unit]
    ): MinaAnimation = (^.asInstanceOf[js.Dynamic].applyDynamic("animate")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MinaAnimation]
    
    inline def animation(attr: js.Object, duration: Double): Animation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("animation")(attr.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Animation_]
    inline def animation(attr: js.Object, duration: Double, easing: js.Function1[/* num */ Double, Double]): Animation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("animation")(attr.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any])).asInstanceOf[Animation_]
    inline def animation(
      attr: js.Object,
      duration: Double,
      easing: js.Function1[/* num */ Double, Double],
      callback: js.Function0[Unit]
    ): Animation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("animation")(attr.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation_]
    inline def animation(attr: js.Object, duration: Double, easing: Unit, callback: js.Function0[Unit]): Animation_ = (^.asInstanceOf[js.Dynamic].applyDynamic("animation")(attr.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], easing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Animation_]
    
    inline def asin(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asin")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def atan(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("atan")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def atan2(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("atan2")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def closest(x: Double, y: Double, X: Double, Y: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], X.asInstanceOf[js.Any], Y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def color(clr: String): RGBHSB = ^.asInstanceOf[js.Dynamic].applyDynamic("color")(clr.asInstanceOf[js.Any]).asInstanceOf[RGBHSB]
    
    inline def cos(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cos")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def deg(rad: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deg")(rad.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSGlobal("Snap.filter")
    @js.native
    def filter: Filter_ = js.native
    inline def filter_=(x: Filter_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filter")(x.asInstanceOf[js.Any])
    
    inline def format(token: String, json: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(token.asInstanceOf[js.Any], json.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def fragment(varargs: Any): Fragment_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fragment")(varargs.asInstanceOf[js.Any]).asInstanceOf[Fragment_]
    
    inline def getElementByPoint(x: Double, y: Double): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementByPoint")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Element]
    
    inline def getRGB(color: String): RGB_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getRGB")(color.asInstanceOf[js.Any]).asInstanceOf[RGB_]
    
    inline def hsb(h: Double, s: Double, b: Double): HSB_ = (^.asInstanceOf[js.Dynamic].applyDynamic("hsb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[HSB_]
    
    inline def hsb2rgb(h: Double, s: Double, v: Double): RGB_ = (^.asInstanceOf[js.Dynamic].applyDynamic("hsb2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[RGB_]
    
    inline def hsl(h: Double, s: Double, l: Double): HSL_ = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[HSL_]
    
    inline def hsl2rgb(h: Double, s: Double, l: Double): RGB_ = (^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(h.asInstanceOf[js.Any], s.asInstanceOf[js.Any], l.asInstanceOf[js.Any])).asInstanceOf[RGB_]
    
    inline def is(o: Any, `type`: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("is")(o.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def len(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("len")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def len2(x1: Double, y1: Double, x2: Double, y2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("len2")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def load(url: String, callback: js.Function1[/* f */ Fragment_, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def load(url: String, callback: js.Function1[/* f */ Fragment_, Unit], scope: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def matrix(): Matrix_ = ^.asInstanceOf[js.Dynamic].applyDynamic("matrix")().asInstanceOf[Matrix_]
    inline def matrix(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix_ = (^.asInstanceOf[js.Dynamic].applyDynamic("matrix")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Matrix_]
    inline def matrix(svgMatrix: SVGMatrix): Matrix_ = ^.asInstanceOf[js.Dynamic].applyDynamic("matrix")(svgMatrix.asInstanceOf[js.Any]).asInstanceOf[Matrix_]
    
    inline def parse(svg: String): Fragment_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(svg.asInstanceOf[js.Any]).asInstanceOf[Fragment_]
    
    inline def parsePathString(pathString: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathString")(pathString.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def parsePathString(pathString: js.Array[String]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePathString")(pathString.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    inline def parseTransformString(TString: String): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTransformString")(TString.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    inline def parseTransformString(TString: js.Array[String]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTransformString")(TString.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
    
    @JSGlobal("Snap.path")
    @js.native
    def path: Path_ = js.native
    inline def path_=(x: Path_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
    
    inline def plugin(f: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(f.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def rad(deg: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rad")(deg.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def rgb(r: Double, g: Double, b: Double): RGB_ = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[RGB_]
    
    inline def rgb2hsb(r: Double, g: Double, b: Double): HSB_ = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hsb")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[HSB_]
    
    inline def rgb2hsl(r: Double, g: Double, b: Double): HSL_ = (^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hsl")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[HSL_]
    
    inline def select(query: String): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(query.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    inline def selectAll(query: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(query.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def set(els: Element*): Set_ = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(els.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Set_]
    
    inline def sin(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sin")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def snapTo(values: js.Array[Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapTo")(values.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def snapTo(values: js.Array[Double], value: Double, tolerance: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapTo")(values.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def snapTo(values: Double, value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapTo")(values.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def snapTo(values: Double, value: Double, tolerance: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapTo")(values.asInstanceOf[js.Any], value.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tan(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tan")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
