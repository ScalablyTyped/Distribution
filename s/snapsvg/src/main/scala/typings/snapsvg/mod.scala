package typings.snapsvg

import org.scalablytyped.runtime.StringDictionary
import typings.mina.mina.MinaAnimation
import typings.snapsvg.anon.Alpha
import typings.snapsvg.anon.Anim
import typings.snapsvg.snapsvgStrings.viewBox
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.SVGElement
import typings.std.SVGMatrix
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snapsvg", JSImport.Namespace)
  @js.native
  def apply(DOM: SVGElement): Paper = js.native
  @JSImport("snapsvg", JSImport.Namespace)
  @js.native
  def apply(query: String): Paper = js.native
  @JSImport("snapsvg", JSImport.Namespace)
  @js.native
  def apply(width: String, height: String): Paper = js.native
  @JSImport("snapsvg", JSImport.Namespace)
  @js.native
  def apply(width: String, height: Double): Paper = js.native
  @JSImport("snapsvg", JSImport.Namespace)
  @js.native
  def apply(width: Double, height: String): Paper = js.native
  @JSImport("snapsvg", JSImport.Namespace)
  @js.native
  def apply(width: Double, height: Double): Paper = js.native
  
  @JSImport("snapsvg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Matrix_ extends StObject {
    
    def add(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix_ = js.native
    def add(matrix: Matrix_): Matrix_ = js.native
    
    def determinant(): Double = js.native
    
    def invert(): Matrix_ = js.native
    
    def rotate(a: Double): Matrix_ = js.native
    def rotate(a: Double, x: js.UndefOr[scala.Nothing], y: Double): Matrix_ = js.native
    def rotate(a: Double, x: Double): Matrix_ = js.native
    def rotate(a: Double, x: Double, y: Double): Matrix_ = js.native
    
    def scale(x: Double): Matrix_ = js.native
    def scale(x: Double, y: js.UndefOr[scala.Nothing], cx: js.UndefOr[scala.Nothing], cy: Double): Matrix_ = js.native
    def scale(x: Double, y: js.UndefOr[scala.Nothing], cx: Double): Matrix_ = js.native
    def scale(x: Double, y: js.UndefOr[scala.Nothing], cx: Double, cy: Double): Matrix_ = js.native
    def scale(x: Double, y: Double): Matrix_ = js.native
    def scale(x: Double, y: Double, cx: js.UndefOr[scala.Nothing], cy: Double): Matrix_ = js.native
    def scale(x: Double, y: Double, cx: Double): Matrix_ = js.native
    def scale(x: Double, y: Double, cx: Double, cy: Double): Matrix_ = js.native
    
    def split(): ExplicitTransform = js.native
    
    def toTransformString(): String = js.native
    
    def translate(x: Double, y: Double): Matrix_ = js.native
    
    def x(x: Double, y: Double): Double = js.native
    
    def y(x: Double, y: Double): Double = js.native
  }
  
  @JSImport("snapsvg", "Matrix")
  @js.native
  def Matrix_(): Unit = js.native
  
  @JSImport("snapsvg", "acos")
  @js.native
  def acos(angle: Double): Double = js.native
  
  @JSImport("snapsvg", "ajax")
  @js.native
  def ajax(url: String, callback: js.Function): XMLHttpRequest = js.native
  @JSImport("snapsvg", "ajax")
  @js.native
  def ajax(url: String, callback: js.Function, scope: js.Object): XMLHttpRequest = js.native
  @JSImport("snapsvg", "ajax")
  @js.native
  def ajax(url: String, postData: String, callback: js.Function): XMLHttpRequest = js.native
  @JSImport("snapsvg", "ajax")
  @js.native
  def ajax(url: String, postData: String, callback: js.Function, scope: js.Object): XMLHttpRequest = js.native
  @JSImport("snapsvg", "ajax")
  @js.native
  def ajax(url: String, postData: js.Object, callback: js.Function): XMLHttpRequest = js.native
  @JSImport("snapsvg", "ajax")
  @js.native
  def ajax(url: String, postData: js.Object, callback: js.Function, scope: js.Object): XMLHttpRequest = js.native
  
  @JSImport("snapsvg", "angle")
  @js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  @JSImport("snapsvg", "angle")
  @js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: js.UndefOr[scala.Nothing], y3: Double): Double = js.native
  @JSImport("snapsvg", "angle")
  @js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double): Double = js.native
  @JSImport("snapsvg", "angle")
  @js.native
  def angle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double = js.native
  
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(
    from: js.Array[Double],
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double
  ): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(
    from: js.Array[Double],
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(
    from: js.Array[Double],
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(
    from: js.Array[Double],
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(from: js.Array[Double], to: Double, updater: js.Function1[/* n */ Double, Unit], duration: Double): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(
    from: js.Array[Double],
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(
    from: js.Array[Double],
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(
    from: js.Array[Double],
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(from: Double, to: js.Array[Double], updater: js.Function1[/* n */ Double, Unit], duration: Double): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(
    from: Double,
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(
    from: Double,
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(
    from: Double,
    to: js.Array[Double],
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(from: Double, to: Double, updater: js.Function1[/* n */ Double, Unit], duration: Double): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(
    from: Double,
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.UndefOr[scala.Nothing],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(
    from: Double,
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double]
  ): MinaAnimation = js.native
  @JSImport("snapsvg", "animate")
  @js.native
  def animate(
    from: Double,
    to: Double,
    updater: js.Function1[/* n */ Double, Unit],
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): MinaAnimation = js.native
  
  @JSImport("snapsvg", "animation")
  @js.native
  def animation(attr: js.Object, duration: Double): Animation_ = js.native
  @JSImport("snapsvg", "animation")
  @js.native
  def animation(attr: js.Object, duration: Double, easing: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Animation_ = js.native
  @JSImport("snapsvg", "animation")
  @js.native
  def animation(attr: js.Object, duration: Double, easing: js.Function1[/* num */ Double, Double]): Animation_ = js.native
  @JSImport("snapsvg", "animation")
  @js.native
  def animation(
    attr: js.Object,
    duration: Double,
    easing: js.Function1[/* num */ Double, Double],
    callback: js.Function0[Unit]
  ): Animation_ = js.native
  
  @JSImport("snapsvg", "asin")
  @js.native
  def asin(angle: Double): Double = js.native
  
  @JSImport("snapsvg", "atan")
  @js.native
  def atan(angle: Double): Double = js.native
  
  @JSImport("snapsvg", "atan2")
  @js.native
  def atan2(angle: Double): Double = js.native
  
  @JSImport("snapsvg", "closest")
  @js.native
  def closest(x: Double, y: Double, X: Double, Y: Double): Boolean = js.native
  
  @JSImport("snapsvg", "color")
  @js.native
  def color(clr: String): RGBHSB = js.native
  
  @JSImport("snapsvg", "cos")
  @js.native
  def cos(angle: Double): Double = js.native
  
  @JSImport("snapsvg", "deg")
  @js.native
  def deg(rad: Double): Double = js.native
  
  @JSImport("snapsvg", "filter")
  @js.native
  def filter: Filter_ = js.native
  @scala.inline
  def filter_=(x: Filter_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filter")(x.asInstanceOf[js.Any])
  
  @JSImport("snapsvg", "format")
  @js.native
  def format(token: String, json: js.Object): String = js.native
  
  @JSImport("snapsvg", "fragment")
  @js.native
  def fragment(varargs: js.Any): Fragment_ = js.native
  
  @JSImport("snapsvg", "getElementByPoint")
  @js.native
  def getElementByPoint(x: Double, y: Double): Element = js.native
  
  @JSImport("snapsvg", "getRGB")
  @js.native
  def getRGB(color: String): RGB_ = js.native
  
  @JSImport("snapsvg", "hsb")
  @js.native
  def hsb(h: Double, s: Double, b: Double): HSB_ = js.native
  
  @JSImport("snapsvg", "hsb2rgb")
  @js.native
  def hsb2rgb(h: Double, s: Double, v: Double): RGB_ = js.native
  
  @JSImport("snapsvg", "hsl")
  @js.native
  def hsl(h: Double, s: Double, l: Double): HSL_ = js.native
  
  @JSImport("snapsvg", "hsl2rgb")
  @js.native
  def hsl2rgb(h: Double, s: Double, l: Double): RGB_ = js.native
  
  @JSImport("snapsvg", "is")
  @js.native
  def is(o: js.Any, `type`: String): Boolean = js.native
  
  @JSImport("snapsvg", "len")
  @js.native
  def len(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  
  @JSImport("snapsvg", "len2")
  @js.native
  def len2(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  
  @JSImport("snapsvg", "load")
  @js.native
  def load(url: String, callback: js.Function1[/* f */ Fragment_, Unit]): Unit = js.native
  @JSImport("snapsvg", "load")
  @js.native
  def load(url: String, callback: js.Function1[/* f */ Fragment_, Unit], scope: js.Object): Unit = js.native
  
  @JSImport("snapsvg", "matrix")
  @js.native
  def matrix(): Matrix_ = js.native
  @JSImport("snapsvg", "matrix")
  @js.native
  def matrix(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix_ = js.native
  @JSImport("snapsvg", "matrix")
  @js.native
  def matrix(svgMatrix: SVGMatrix): Matrix_ = js.native
  
  @JSImport("snapsvg", "parse")
  @js.native
  def parse(svg: String): Fragment_ = js.native
  
  @JSImport("snapsvg", "parsePathString")
  @js.native
  def parsePathString(pathString: String): js.Array[_] = js.native
  @JSImport("snapsvg", "parsePathString")
  @js.native
  def parsePathString(pathString: js.Array[String]): js.Array[_] = js.native
  
  @JSImport("snapsvg", "parseTransformString")
  @js.native
  def parseTransformString(TString: String): js.Array[_] = js.native
  @JSImport("snapsvg", "parseTransformString")
  @js.native
  def parseTransformString(TString: js.Array[String]): js.Array[_] = js.native
  
  @JSImport("snapsvg", "path")
  @js.native
  def path: Path_ = js.native
  @scala.inline
  def path_=(x: Path_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("path")(x.asInstanceOf[js.Any])
  
  @JSImport("snapsvg", "plugin")
  @js.native
  def plugin(f: js.Function): Unit = js.native
  
  @JSImport("snapsvg", "rad")
  @js.native
  def rad(deg: Double): Double = js.native
  
  @JSImport("snapsvg", "rgb")
  @js.native
  def rgb(r: Double, g: Double, b: Double): RGB_ = js.native
  
  @JSImport("snapsvg", "rgb2hsb")
  @js.native
  def rgb2hsb(r: Double, g: Double, b: Double): HSB_ = js.native
  
  @JSImport("snapsvg", "rgb2hsl")
  @js.native
  def rgb2hsl(r: Double, g: Double, b: Double): HSL_ = js.native
  
  @JSImport("snapsvg", "select")
  @js.native
  def select(query: String): Element = js.native
  
  @JSImport("snapsvg", "selectAll")
  @js.native
  def selectAll(query: String): js.Any = js.native
  
  @JSImport("snapsvg", "set")
  @js.native
  def set(els: Element*): Set_ = js.native
  
  @JSImport("snapsvg", "sin")
  @js.native
  def sin(angle: Double): Double = js.native
  
  @JSImport("snapsvg", "snapTo")
  @js.native
  def snapTo(values: js.Array[Double], value: Double): Double = js.native
  @JSImport("snapsvg", "snapTo")
  @js.native
  def snapTo(values: js.Array[Double], value: Double, tolerance: Double): Double = js.native
  @JSImport("snapsvg", "snapTo")
  @js.native
  def snapTo(values: Double, value: Double): Double = js.native
  @JSImport("snapsvg", "snapTo")
  @js.native
  def snapTo(values: Double, value: Double, tolerance: Double): Double = js.native
  
  @JSImport("snapsvg", "tan")
  @js.native
  def tan(angle: Double): Double = js.native
  
  @js.native
  trait Animation_ extends StObject {
    
    var attr: StringDictionary[String | Double | Boolean | js.Any] = js.native
    
    var callback: js.UndefOr[js.Function0[Unit]] = js.native
    
    var duration: Double = js.native
    
    var easing: js.UndefOr[js.Function1[/* num */ Double, Double]] = js.native
  }
  object Animation_ {
    
    @scala.inline
    def apply(attr: StringDictionary[String | Double | Boolean | js.Any], duration: Double): Animation_ = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animation_]
    }
    
    @scala.inline
    implicit class Animation_MutableBuilder[Self <: Animation_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttr(value: StringDictionary[String | Double | Boolean | js.Any]): Self = StObject.set(x, "attr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasing(value: /* num */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  @js.native
  trait BBox extends StObject {
    
    var cx: Double = js.native
    
    var cy: Double = js.native
    
    var h: Double = js.native
    
    var height: Double = js.native
    
    var path: Double = js.native
    
    var r0: Double = js.native
    
    var r1: Double = js.native
    
    var r2: Double = js.native
    
    var vb: String = js.native
    
    var w: Double = js.native
    
    var width: Double = js.native
    
    var x: Double = js.native
    
    var x2: Double = js.native
    
    var y: Double = js.native
    
    var y2: Double = js.native
  }
  object BBox {
    
    @scala.inline
    def apply(
      cx: Double,
      cy: Double,
      h: Double,
      height: Double,
      path: Double,
      r0: Double,
      r1: Double,
      r2: Double,
      vb: String,
      w: Double,
      width: Double,
      x: Double,
      x2: Double,
      y: Double,
      y2: Double
    ): BBox = {
      val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], r0 = r0.asInstanceOf[js.Any], r1 = r1.asInstanceOf[js.Any], r2 = r2.asInstanceOf[js.Any], vb = vb.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
      __obj.asInstanceOf[BBox]
    }
    
    @scala.inline
    implicit class BBoxMutableBuilder[Self <: BBox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: Double): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR0(value: Double): Self = StObject.set(x, "r0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR1(value: Double): Self = StObject.set(x, "r1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR2(value: Double): Self = StObject.set(x, "r2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVb(value: String): Self = StObject.set(x, "vb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Element extends StObject {
    
    def add(el: Element): Element = js.native
    def add(el: Set_): Element = js.native
    
    def addClass(value: String): Element = js.native
    
    def after(el: Element): Element = js.native
    
    def align(el: Element, way: String): Element = js.native
    
    def animate(animation: js.Any): Element = js.native
    def animate(attrs: StringDictionary[String | Double | Boolean | js.Any], duration: Double): Element = js.native
    def animate(
      attrs: StringDictionary[String | Double | Boolean | js.Any],
      duration: Double,
      easing: js.UndefOr[scala.Nothing],
      callback: js.Function0[Unit]
    ): Element = js.native
    def animate(
      attrs: StringDictionary[String | Double | Boolean | js.Any],
      duration: Double,
      easing: js.Function1[/* num */ Double, Double]
    ): Element = js.native
    def animate(
      attrs: StringDictionary[String | Double | Boolean | js.Any],
      duration: Double,
      easing: js.Function1[/* num */ Double, Double],
      callback: js.Function0[Unit]
    ): Element = js.native
    
    def append(el: Element): Element = js.native
    def append(el: Set_): Element = js.native
    
    def appendTo(el: Element): Element = js.native
    
    def asPX(attr: String): Double = js.native
    def asPX(attr: String, value: String): Double = js.native
    
    def attr(param: String): String = js.native
    def attr(params: StringDictionary[String | Double | Boolean | BBox | js.Any]): Element = js.native
    //TODO: check what is really returned
    @JSName("attr")
    def attr_viewBox(param: viewBox): BBox = js.native
    
    def before(el: Element): Element = js.native
    
    def children(): js.Array[Element] = js.native
    
    def click(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    def click(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
    
    def data(key: String): js.Any = js.native
    def data(key: String, value: js.Any): js.Any = js.native
    
    def dblclick(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    def dblclick(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
    
    def drag(): Element = js.native
    def drag(
      onMove: js.Function5[
          /* dx */ Double, 
          /* dy */ Double, 
          /* x */ Double, 
          /* y */ Double, 
          /* event */ MouseEvent, 
          Unit
        ],
      onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
      onEnd: js.Function1[/* event */ MouseEvent, Unit]
    ): Element = js.native
    def drag(
      onMove: js.Function5[
          /* dx */ Double, 
          /* dy */ Double, 
          /* x */ Double, 
          /* y */ Double, 
          /* event */ MouseEvent, 
          Unit
        ],
      onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
      onEnd: js.Function1[/* event */ MouseEvent, Unit],
      moveThisArg: js.UndefOr[scala.Nothing],
      startThisArg: js.UndefOr[scala.Nothing],
      endThisArg: js.Any
    ): Element = js.native
    def drag(
      onMove: js.Function5[
          /* dx */ Double, 
          /* dy */ Double, 
          /* x */ Double, 
          /* y */ Double, 
          /* event */ MouseEvent, 
          Unit
        ],
      onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
      onEnd: js.Function1[/* event */ MouseEvent, Unit],
      moveThisArg: js.UndefOr[scala.Nothing],
      startThisArg: js.Any
    ): Element = js.native
    def drag(
      onMove: js.Function5[
          /* dx */ Double, 
          /* dy */ Double, 
          /* x */ Double, 
          /* y */ Double, 
          /* event */ MouseEvent, 
          Unit
        ],
      onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
      onEnd: js.Function1[/* event */ MouseEvent, Unit],
      moveThisArg: js.UndefOr[scala.Nothing],
      startThisArg: js.Any,
      endThisArg: js.Any
    ): Element = js.native
    def drag(
      onMove: js.Function5[
          /* dx */ Double, 
          /* dy */ Double, 
          /* x */ Double, 
          /* y */ Double, 
          /* event */ MouseEvent, 
          Unit
        ],
      onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
      onEnd: js.Function1[/* event */ MouseEvent, Unit],
      moveThisArg: js.Any
    ): Element = js.native
    def drag(
      onMove: js.Function5[
          /* dx */ Double, 
          /* dy */ Double, 
          /* x */ Double, 
          /* y */ Double, 
          /* event */ MouseEvent, 
          Unit
        ],
      onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
      onEnd: js.Function1[/* event */ MouseEvent, Unit],
      moveThisArg: js.Any,
      startThisArg: js.UndefOr[scala.Nothing],
      endThisArg: js.Any
    ): Element = js.native
    def drag(
      onMove: js.Function5[
          /* dx */ Double, 
          /* dy */ Double, 
          /* x */ Double, 
          /* y */ Double, 
          /* event */ MouseEvent, 
          Unit
        ],
      onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
      onEnd: js.Function1[/* event */ MouseEvent, Unit],
      moveThisArg: js.Any,
      startThisArg: js.Any
    ): Element = js.native
    def drag(
      onMove: js.Function5[
          /* dx */ Double, 
          /* dy */ Double, 
          /* x */ Double, 
          /* y */ Double, 
          /* event */ MouseEvent, 
          Unit
        ],
      onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
      onEnd: js.Function1[/* event */ MouseEvent, Unit],
      moveThisArg: js.Any,
      startThisArg: js.Any,
      endThisArg: js.Any
    ): Element = js.native
    
    def getAlign(el: Element, way: String): String = js.native
    
    def getBBox(): BBox = js.native
    
    def getPointAtLength(length: Double): Alpha = js.native
    
    def getSubpath(from: Double, to: Double): String = js.native
    
    def getTotalLength(): Double = js.native
    
    def hasClass(value: String): Boolean = js.native
    
    def hover(
      hoverInHandler: js.Function1[/* event */ MouseEvent, Unit],
      hoverOutHandler: js.Function1[/* event */ MouseEvent, Unit]
    ): Element = js.native
    def hover(
      hoverInHandler: js.Function1[/* event */ MouseEvent, Unit],
      hoverOutHandler: js.Function1[/* event */ MouseEvent, Unit],
      inThisArg: js.UndefOr[scala.Nothing],
      outThisArg: js.Any
    ): Element = js.native
    def hover(
      hoverInHandler: js.Function1[/* event */ MouseEvent, Unit],
      hoverOutHandler: js.Function1[/* event */ MouseEvent, Unit],
      inThisArg: js.Any,
      outThisArg: js.Any
    ): Element = js.native
    def hover(
      hoverInHandler: js.Function1[/* event */ MouseEvent, Unit],
      hoverOutHandler: js.Function1[/* event */ MouseEvent, Unit],
      thisArg: js.Any
    ): Element = js.native
    
    def inAnim(): js.Array[Anim] = js.native
    
    def innerSVG(): String = js.native
    
    def insertAfter(el: Element): Element = js.native
    
    def insertBefore(el: Element): Element = js.native
    
    def marker(x: Double, y: Double, width: Double, height: Double, refX: Double, refY: Double): Element = js.native
    
    def mousedown(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    def mousedown(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
    
    def mousemove(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    def mousemove(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
    
    def mouseout(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    def mouseout(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
    
    def mouseover(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    def mouseover(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
    
    def mouseup(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    def mouseup(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
    
    var node: HTMLElement = js.native
    
    def outerSVG(): String = js.native
    
    /** The top level element will included an reference to its Paper after it is rendered. */
    var paper: js.UndefOr[Paper] = js.native
    
    def parent(): Element = js.native
    
    def pattern(x: js.Any, y: js.Any, width: js.Any, height: js.Any): Element = js.native
    
    def prepend(el: Element): Element = js.native
    
    def prependTo(el: Element): Element = js.native
    
    def remove(): Element = js.native
    
    def removeClass(value: String): Element = js.native
    
    def removeData(): Element = js.native
    def removeData(key: String): Element = js.native
    
    def select(query: String): Element = js.native
    
    def selectAll(): Set_ = js.native
    def selectAll(query: String): Set_ = js.native
    
    def stop(): Element = js.native
    
    def toDefs(): Element = js.native
    
    def toJSON(): js.Any = js.native
    
    def toPattern(x: String, y: String, width: String, height: String): js.Object = js.native
    def toPattern(x: Double, y: Double, width: Double, height: Double): js.Object = js.native
    
    def toggleClass(value: String, flag: Boolean): Element = js.native
    
    def touchcancel(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    def touchcancel(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
    
    def touchend(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    def touchend(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
    
    def touchmove(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    def touchmove(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
    
    def touchstart(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    def touchstart(handler: js.Function1[/* event */ MouseEvent, Unit], thisArg: js.Any): Element = js.native
    
    def transform(): TransformationDescriptor = js.native
    def transform(tstr: String): Element = js.native
    
    var `type`: String = js.native
    
    def unclick(): Element = js.native
    def unclick(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    
    def undblclick(): Element = js.native
    def undblclick(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    
    def undrag(): Element = js.native
    def undrag(
      onMove: js.Function3[/* dx */ Double, /* dy */ Double, /* event */ MouseEvent, Unit],
      onStart: js.Function3[/* x */ Double, /* y */ Double, /* event */ MouseEvent, Unit],
      onEnd: js.Function1[/* event */ MouseEvent, Unit]
    ): Element = js.native
    
    def unhover(
      hoverInHandler: js.Function1[/* event */ MouseEvent, Unit],
      hoverOutHandler: js.Function1[/* event */ MouseEvent, Unit]
    ): Element = js.native
    
    def unmousedown(): Element = js.native
    def unmousedown(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    
    def unmousemove(): Element = js.native
    def unmousemove(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    
    def unmouseout(): Element = js.native
    def unmouseout(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    
    def unmouseover(): Element = js.native
    def unmouseover(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    
    def unmouseup(): Element = js.native
    def unmouseup(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    
    def untouchcancel(): Element = js.native
    def untouchcancel(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    
    def untouchend(): Element = js.native
    def untouchend(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    
    def untouchmove(): Element = js.native
    def untouchmove(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    
    def untouchstart(): Element = js.native
    def untouchstart(handler: js.Function1[/* event */ MouseEvent, Unit]): Element = js.native
    
    def use(): js.Object = js.native
  }
  
  @js.native
  trait ExplicitTransform extends StObject {
    
    var dx: Double = js.native
    
    var dy: Double = js.native
    
    var isSimple: Boolean = js.native
    
    var rotate: Double = js.native
    
    var scalex: Double = js.native
    
    var scaley: Double = js.native
    
    var shear: Double = js.native
  }
  object ExplicitTransform {
    
    @scala.inline
    def apply(
      dx: Double,
      dy: Double,
      isSimple: Boolean,
      rotate: Double,
      scalex: Double,
      scaley: Double,
      shear: Double
    ): ExplicitTransform = {
      val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], isSimple = isSimple.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scalex = scalex.asInstanceOf[js.Any], scaley = scaley.asInstanceOf[js.Any], shear = shear.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTransform]
    }
    
    @scala.inline
    implicit class ExplicitTransformMutableBuilder[Self <: ExplicitTransform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSimple(value: Boolean): Self = StObject.set(x, "isSimple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalex(value: Double): Self = StObject.set(x, "scalex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaley(value: Double): Self = StObject.set(x, "scaley", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShear(value: Double): Self = StObject.set(x, "shear", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Filter_ extends StObject {
    
    def blur(x: Double): String = js.native
    def blur(x: Double, y: Double): String = js.native
    
    def brightness(amount: Double): String = js.native
    
    def contrast(amount: Double): String = js.native
    
    def grayscale(amount: Double): String = js.native
    
    def hueRotate(angle: Double): String = js.native
    
    def invert(amount: Double): String = js.native
    
    def saturate(amount: Double): String = js.native
    
    def sepia(amount: Double): String = js.native
    
    def shadow(dx: Double, dy: Double, blur: Double, color: String, opacity: Double): String = js.native
    def shadow(dx: Double, dy: Double, color: String, opacity: Double): String = js.native
    def shadow(dx: Double, dy: Double, opacity: Double): String = js.native
  }
  
  @js.native
  trait Fragment_ extends StObject {
    
    //TODO: The documentation says that selectAll returns a set, but the getting started guide
    // uses .attr on the returned object. That's not supported by a set
    def select(query: String): Element = js.native
    
    def selectAll(): Set_ = js.native
    def selectAll(query: String): Set_ = js.native
  }
  
  @js.native
  trait Gradient extends Element {
    
    def addStop(color: String, offset: Double): Gradient = js.native
    
    def setStops(str: String): Gradient = js.native
    
    def stops(): js.Array[Element] = js.native
  }
  
  @js.native
  trait HSB_ extends StObject {
    
    var b: Double = js.native
    
    var h: Double = js.native
    
    var s: Double = js.native
  }
  object HSB_ {
    
    @scala.inline
    def apply(b: Double, h: Double, s: Double): HSB_ = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSB_]
    }
    
    @scala.inline
    implicit class HSB_MutableBuilder[Self <: HSB_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HSL_ extends StObject {
    
    var h: Double = js.native
    
    var l: Double = js.native
    
    var s: Double = js.native
  }
  object HSL_ {
    
    @scala.inline
    def apply(h: Double, l: Double, s: Double): HSL_ = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[HSL_]
    }
    
    @scala.inline
    implicit class HSL_MutableBuilder[Self <: HSL_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IntersectionDot extends StObject {
    
    var bez1: js.Array[Double] = js.native
    
    var bez2: js.Array[Double] = js.native
    
    var segment1: Double = js.native
    
    var segment2: Double = js.native
    
    var t1: Double = js.native
    
    var t2: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object IntersectionDot {
    
    @scala.inline
    def apply(
      bez1: js.Array[Double],
      bez2: js.Array[Double],
      segment1: Double,
      segment2: Double,
      t1: Double,
      t2: Double,
      x: Double,
      y: Double
    ): IntersectionDot = {
      val __obj = js.Dynamic.literal(bez1 = bez1.asInstanceOf[js.Any], bez2 = bez2.asInstanceOf[js.Any], segment1 = segment1.asInstanceOf[js.Any], segment2 = segment2.asInstanceOf[js.Any], t1 = t1.asInstanceOf[js.Any], t2 = t2.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntersectionDot]
    }
    
    @scala.inline
    implicit class IntersectionDotMutableBuilder[Self <: IntersectionDot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBez1(value: js.Array[Double]): Self = StObject.set(x, "bez1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBez1Varargs(value: Double*): Self = StObject.set(x, "bez1", js.Array(value :_*))
      
      @scala.inline
      def setBez2(value: js.Array[Double]): Self = StObject.set(x, "bez2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBez2Varargs(value: Double*): Self = StObject.set(x, "bez2", js.Array(value :_*))
      
      @scala.inline
      def setSegment1(value: Double): Self = StObject.set(x, "segment1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegment2(value: Double): Self = StObject.set(x, "segment2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT1(value: Double): Self = StObject.set(x, "t1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT2(value: Double): Self = StObject.set(x, "t2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Paper extends Element {
    
    def circle(x: Double, y: Double, r: Double): Element = js.native
    
    def clear(): Unit = js.native
    
    def el(name: String, attr: js.Object): Element = js.native
    
    def ellipse(x: Double, y: Double, rx: Double, ry: Double): Element = js.native
    
    def filter(filstr: String): Element = js.native
    
    def g(): Paper = js.native
    def g(varargs: js.Any): Paper = js.native
    
    def gradient(gradient: String): Gradient = js.native
    
    def group(els: js.Any*): Paper = js.native
    
    def image(src: String, x: Double, y: Double, width: Double, height: Double): Element = js.native
    
    def line(x1: Double, y1: Double, x2: Double, y2: Double): Element = js.native
    
    def mask(varargs: js.Any): js.Object = js.native
    
    def path(pathSpec: String): Element = js.native
    def path(pathSpec: js.Array[js.Array[String | Double]]): Element = js.native
    
    def polygon(varargs: js.Array[_]): Element = js.native
    
    def polyline(varargs: js.Array[_]): Element = js.native
    
    def ptrn(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      vbx: Double,
      vby: Double,
      vbw: Double,
      vbh: Double
    ): js.Object = js.native
    
    def rect(x: Double, y: Double, width: Double, height: Double): Element = js.native
    def rect(x: Double, y: Double, width: Double, height: Double, rx: js.UndefOr[scala.Nothing], ry: Double): Element = js.native
    def rect(x: Double, y: Double, width: Double, height: Double, rx: Double): Element = js.native
    def rect(x: Double, y: Double, width: Double, height: Double, rx: Double, ry: Double): Element = js.native
    
    def svg(
      x: Double,
      y: Double,
      width: Double,
      height: Double,
      vbx: Double,
      vby: Double,
      vbw: Double,
      vbh: Double
    ): js.Object = js.native
    
    def symbol(vbx: Double, vby: Double, vbw: Double, vbh: Double): Element = js.native
    
    def text(x: Double, y: Double, text: String): Element = js.native
    def text(x: Double, y: Double, text: js.Array[String | Double]): Element = js.native
    def text(x: Double, y: Double, text: Double): Element = js.native
    
    def toDataURL(): String = js.native
    
    def use(id: String): js.Object = js.native
    def use(id: Element): js.Object = js.native
  }
  
  @js.native
  trait Path_ extends StObject {
    
    def bezierBBox(args: Double*): BBox = js.native
    def bezierBBox(bez: js.Array[Double]): BBox = js.native
    
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
    ): js.Object = js.native
    
    def getBBox(path: String): BBox = js.native
    
    def getPointAtLength(path: String, length: Double): js.Object = js.native
    
    def getSubpath(path: String, from: Double, to: Double): String = js.native
    
    def getTotalLength(path: String): Double = js.native
    
    def intersection(path1: String, path2: String): js.Array[IntersectionDot] = js.native
    
    def isBBoxIntersect(bbox1: BBox, bbox2: BBox): Boolean = js.native
    
    def isPointInside(path: String, x: Double, y: Double): Boolean = js.native
    
    def isPointInsideBBox(bbox: BBox, x: Double, y: Double): Boolean = js.native
    
    def map(path: String, matrix: js.Object): String = js.native
    def map(path: String, matrix: Matrix_): String = js.native
    
    def toAbsolute(path: String): js.Array[_] = js.native
    
    def toCubic(pathString: String): js.Array[_] = js.native
    def toCubic(pathString: js.Array[String]): js.Array[_] = js.native
    
    def toRelative(path: String): js.Array[_] = js.native
  }
  
  @js.native
  trait RGBHSB extends StObject {
    
    var b: Double = js.native
    
    var error: Boolean = js.native
    
    var g: Double = js.native
    
    var h: Double = js.native
    
    var hex: String = js.native
    
    var l: Double = js.native
    
    var r: Double = js.native
    
    var s: Double = js.native
    
    var v: Double = js.native
  }
  object RGBHSB {
    
    @scala.inline
    def apply(
      b: Double,
      error: Boolean,
      g: Double,
      h: Double,
      hex: String,
      l: Double,
      r: Double,
      s: Double,
      v: Double
    ): RGBHSB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBHSB]
    }
    
    @scala.inline
    implicit class RGBHSBMutableBuilder[Self <: RGBHSB] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RGB_ extends StObject {
    
    var b: Double = js.native
    
    var g: Double = js.native
    
    var hex: String = js.native
    
    var r: Double = js.native
  }
  object RGB_ {
    
    @scala.inline
    def apply(b: Double, g: Double, hex: String, r: Double): RGB_ = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB_]
    }
    
    @scala.inline
    implicit class RGB_MutableBuilder[Self <: RGB_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Set_ extends StObject {
    
    def animate(
      attrs: (js.Tuple4[
          StringDictionary[String | Double | Boolean | _], 
          js.UndefOr[Double], 
          js.UndefOr[js.Function1[/* num */ Double, Double]], 
          js.UndefOr[js.Function0[Unit]]
        ])*
    ): Element = js.native
    def animate(attrs: StringDictionary[String | Double | Boolean | js.Any], duration: Double): Set_ = js.native
    def animate(
      attrs: StringDictionary[String | Double | Boolean | js.Any],
      duration: Double,
      easing: js.UndefOr[scala.Nothing],
      callback: js.Function0[Unit]
    ): Set_ = js.native
    def animate(
      attrs: StringDictionary[String | Double | Boolean | js.Any],
      duration: Double,
      easing: js.Function1[/* num */ Double, Double]
    ): Set_ = js.native
    def animate(
      attrs: StringDictionary[String | Double | Boolean | js.Any],
      duration: Double,
      easing: js.Function1[/* num */ Double, Double],
      callback: js.Function0[Unit]
    ): Set_ = js.native
    
    def attr(param: String): Set_ = js.native
    def attr(params: StringDictionary[String | Double | Boolean | BBox | js.Any]): Set_ = js.native
    @JSName("attr")
    def attr_viewBox(param: viewBox): Set_ = js.native
    
    def bind(attr: String, callback: js.Function): Set_ = js.native
    def bind(attr: String, element: Element): Set_ = js.native
    def bind(attr: String, element: Element, eattr: String): Set_ = js.native
    
    def clear(): Unit = js.native
    
    def exclude(el: Element): Boolean = js.native
    
    def forEach(callback: js.Function2[/* el */ Element, /* index */ js.UndefOr[Double], Unit | Boolean]): Set_ = js.native
    def forEach(
      callback: js.Function2[/* el */ Element, /* index */ js.UndefOr[Double], Unit | Boolean],
      thisArg: js.Object
    ): Set_ = js.native
    
    def getBBox(): BBox = js.native
    
    def insertAfter(): Set_ = js.native
    
    def pop(): Element = js.native
    
    def push(els: Element*): Set_ = js.native
    def push(el: Element): Set_ = js.native
    
    def remove(): Set_ = js.native
    
    def splice(index: Double, count: Double, insertion: Element*): Set_ = js.native
  }
  
  @js.native
  trait TransformationDescriptor extends StObject {
    
    var diffMatrix: Matrix_ = js.native
    
    var global: String = js.native
    
    var globalMatrix: Matrix_ = js.native
    
    var local: String = js.native
    
    var localMatrix: Matrix_ = js.native
    
    var string: String = js.native
  }
  object TransformationDescriptor {
    
    @scala.inline
    def apply(
      diffMatrix: Matrix_,
      global: String,
      globalMatrix: Matrix_,
      local: String,
      localMatrix: Matrix_,
      string: String
    ): TransformationDescriptor = {
      val __obj = js.Dynamic.literal(diffMatrix = diffMatrix.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], globalMatrix = globalMatrix.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], localMatrix = localMatrix.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformationDescriptor]
    }
    
    @scala.inline
    implicit class TransformationDescriptorMutableBuilder[Self <: TransformationDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiffMatrix(value: Matrix_): Self = StObject.set(x, "diffMatrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobal(value: String): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalMatrix(value: Matrix_): Self = StObject.set(x, "globalMatrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalMatrix(value: Matrix_): Self = StObject.set(x, "localMatrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
}
