package typings.reactNativeCanvas

import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCanvas.anon.A
import typings.std.HTMLElement
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-canvas", JSImport.Default)
  @js.native
  class default () extends Canvas
  
  @JSImport("react-native-canvas", "Image")
  @js.native
  class Image protected () extends StObject {
    def this(canvas: Canvas) = this()
    def this(canvas: Canvas, height: Double) = this()
    def this(canvas: Canvas, height: js.UndefOr[scala.Nothing], width: Double) = this()
    def this(canvas: Canvas, height: Double, width: Double) = this()
    
    def addEventListener(event: String, func: js.Function1[/* args */ js.Any, _]): Unit = js.native
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var height: Double = js.native
    
    var src: String = js.native
    
    var width: Double = js.native
  }
  
  @JSImport("react-native-canvas", "ImageData")
  @js.native
  class ImageData protected () extends StObject {
    def this(canvas: Canvas, data: js.Array[Double], height: Double, width: Double) = this()
    
    val data: Uint8ClampedArray = js.native
    
    val height: Double = js.native
    
    val width: Double = js.native
  }
  
  @JSImport("react-native-canvas", "Path2D")
  @js.native
  class Path2D protected () extends StObject {
    def this(
      canvas: Canvas,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any
    ) = this()
    
    def addPath(path: Path2D): Unit = js.native
    def addPath(path: Path2D, transform: A): Unit = js.native
    
    var arc: js.Function6[
        /* x */ Double, 
        /* y */ Double, 
        /* r */ Double, 
        /* sAngle */ Double, 
        /* eAngle */ Double, 
        /* counterClockwise */ js.UndefOr[Boolean], 
        Unit
      ] = js.native
    
    var arcTo: js.Function5[/* x1 */ Double, /* y1 */ Double, /* x2 */ Double, /* y2 */ Double, /* r */ Double, Unit] = js.native
    
    var bezierCurveTo: js.Function6[
        /* cp1x */ Double, 
        /* cp1y */ Double, 
        /* cp2x */ Double, 
        /* cp2y */ Double, 
        /* x */ Double, 
        /* y */ Double, 
        Unit
      ] = js.native
    
    var closePath: js.Function0[Unit] = js.native
    
    var ellipse: js.Function8[
        /* x */ Double, 
        /* y */ Double, 
        /* radiusX */ Double, 
        /* radiusY */ Double, 
        /* rotation */ Double, 
        /* startAngle */ Double, 
        /* endAngle */ Double, 
        /* anticlockwise */ js.UndefOr[Boolean], 
        Unit
      ] = js.native
    
    var lineTo: js.Function2[/* x */ Double, /* y */ Double, Unit] = js.native
    
    var moveTo: js.Function2[/* x */ Double, /* y */ Double, Unit] = js.native
    
    var quadraticCurveTo: js.Function4[/* cpx */ Double, /* cpy */ Double, /* x */ Double, /* y */ Double, Unit] = js.native
    
    var rect: js.Function4[/* x */ Double, /* y */ Double, /* width */ Double, /* height */ Double, Unit] = js.native
  }
  
  @js.native
  trait Canvas
    extends Component[CanvasProps, js.Object, js.Any] {
    
    def getContext(context: String): CanvasRenderingContext2D = js.native
    
    var height: Double = js.native
    
    def toDataURL(): js.Promise[String] = js.native
    
    var width: Double = js.native
  }
  
  @js.native
  trait CanvasGradient extends StObject {
    
    def addColorStop(offset: Double, color: String): Unit = js.native
  }
  object CanvasGradient {
    
    @scala.inline
    def apply(addColorStop: (Double, String) => Unit): CanvasGradient = {
      val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
      __obj.asInstanceOf[CanvasGradient]
    }
    
    @scala.inline
    implicit class CanvasGradientMutableBuilder[Self <: CanvasGradient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddColorStop(value: (Double, String) => Unit): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait CanvasPattern extends StObject {
    
    def setTransform(): Unit = js.native
    def setTransform(transform: DOMMatrix2DInit): Unit = js.native
  }
  
  @js.native
  trait CanvasProps extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.native
    
    var originWhitelist: js.UndefOr[js.Array[String]] = js.native
    
    var ref: (js.Function1[/* canvas */ Canvas, _]) | RefObject[Canvas] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  }
  object CanvasProps {
    
    @scala.inline
    def apply(ref: (js.Function1[/* canvas */ Canvas, _]) | RefObject[Canvas]): CanvasProps = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasProps]
    }
    
    @scala.inline
    implicit class CanvasPropsMutableBuilder[Self <: CanvasProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      @scala.inline
      def setOriginWhitelist(value: js.Array[String]): Self = StObject.set(x, "originWhitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginWhitelistUndefined: Self = StObject.set(x, "originWhitelist", js.undefined)
      
      @scala.inline
      def setOriginWhitelistVarargs(value: String*): Self = StObject.set(x, "originWhitelist", js.Array(value :_*))
      
      @scala.inline
      def setRef(value: (js.Function1[/* canvas */ Canvas, _]) | RefObject[Canvas]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* canvas */ Canvas => _): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait CanvasRenderingContext2D extends StObject {
    
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
    def fill(Path2D: js.UndefOr[scala.Nothing], fillRule: js.Any): Unit = js.native
    def fill(Path2D: Path2D): Unit = js.native
    def fill(Path2D: Path2D, fillRule: js.Any): Unit = js.native
    
    def fillRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    var fillStyle: String | CanvasGradient | CanvasPattern = js.native
    
    def fillText(text: String, x: Double, y: Double): Unit = js.native
    def fillText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    var font: String = js.native
    
    def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageData] = js.native
    
    def getLineDash(): js.Array[Double] = js.native
    
    var globalAlpha: Double = js.native
    
    var globalCompositionOperation: String = js.native
    
    def isPointInPath(x: Double, y: Double, fillRule: js.Any, path: Path2D): Boolean = js.native
    
    def isPointInStroke(x: Double, y: Double, path: Path2D): Boolean = js.native
    
    var lineCap: String = js.native
    
    var lineDashOffset: Double = js.native
    
    var lineJoin: String = js.native
    
    def lineTo(x: Double, y: Double): Unit = js.native
    
    var lineWidth: Double = js.native
    
    def measureText(text: String): js.Any = js.native
    
    var miterLimit: Double = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    def putImageData(imageData: ImageData, dx: Double, dy: Double): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: js.UndefOr[scala.Nothing],
      dirtyY: js.UndefOr[scala.Nothing],
      dirtyWidth: js.UndefOr[scala.Nothing],
      dirtyHeight: Double
    ): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: js.UndefOr[scala.Nothing],
      dirtyY: js.UndefOr[scala.Nothing],
      dirtyWidth: Double
    ): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: js.UndefOr[scala.Nothing],
      dirtyY: js.UndefOr[scala.Nothing],
      dirtyWidth: Double,
      dirtyHeight: Double
    ): Unit = js.native
    def putImageData(imageData: ImageData, dx: Double, dy: Double, dirtyX: js.UndefOr[scala.Nothing], dirtyY: Double): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: js.UndefOr[scala.Nothing],
      dirtyY: Double,
      dirtyWidth: js.UndefOr[scala.Nothing],
      dirtyHeight: Double
    ): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: js.UndefOr[scala.Nothing],
      dirtyY: Double,
      dirtyWidth: Double
    ): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: js.UndefOr[scala.Nothing],
      dirtyY: Double,
      dirtyWidth: Double,
      dirtyHeight: Double
    ): Unit = js.native
    def putImageData(imageData: ImageData, dx: Double, dy: Double, dirtyX: Double): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: Double,
      dirtyY: js.UndefOr[scala.Nothing],
      dirtyWidth: js.UndefOr[scala.Nothing],
      dirtyHeight: Double
    ): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: Double,
      dirtyY: js.UndefOr[scala.Nothing],
      dirtyWidth: Double
    ): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: Double,
      dirtyY: js.UndefOr[scala.Nothing],
      dirtyWidth: Double,
      dirtyHeight: Double
    ): Unit = js.native
    def putImageData(imageData: ImageData, dx: Double, dy: Double, dirtyX: Double, dirtyY: Double): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: Double,
      dirtyY: Double,
      dirtyWidth: js.UndefOr[scala.Nothing],
      dirtyHeight: Double
    ): Unit = js.native
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
    
    var shadowBlur: Double = js.native
    
    var shadowColor: String = js.native
    
    var shadowOffsetX: Double = js.native
    
    var shadowOffsetY: Double = js.native
    
    def stroke(): Unit = js.native
    def stroke(path: Path2D): Unit = js.native
    
    def strokeRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    var strokeStyle: String = js.native
    
    def strokeText(text: String, x: Double, y: Double): Unit = js.native
    def strokeText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    var textAlign: String = js.native
    
    def transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
    
    def translate(x: Double, y: Double): Unit = js.native
  }
  
  @js.native
  trait DOMMatrix2DInit extends StObject {
    
    var a: js.UndefOr[Double] = js.native
    
    var b: js.UndefOr[Double] = js.native
    
    var c: js.UndefOr[Double] = js.native
    
    var d: js.UndefOr[Double] = js.native
    
    var e: js.UndefOr[Double] = js.native
    
    var f: js.UndefOr[Double] = js.native
    
    var m11: js.UndefOr[Double] = js.native
    
    var m12: js.UndefOr[Double] = js.native
    
    var m21: js.UndefOr[Double] = js.native
    
    var m22: js.UndefOr[Double] = js.native
    
    var m41: js.UndefOr[Double] = js.native
    
    var m42: js.UndefOr[Double] = js.native
  }
  object DOMMatrix2DInit {
    
    @scala.inline
    def apply(): DOMMatrix2DInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DOMMatrix2DInit]
    }
    
    @scala.inline
    implicit class DOMMatrix2DInitMutableBuilder[Self <: DOMMatrix2DInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      @scala.inline
      def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      @scala.inline
      def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      @scala.inline
      def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      @scala.inline
      def setM11(value: Double): Self = StObject.set(x, "m11", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM11Undefined: Self = StObject.set(x, "m11", js.undefined)
      
      @scala.inline
      def setM12(value: Double): Self = StObject.set(x, "m12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM12Undefined: Self = StObject.set(x, "m12", js.undefined)
      
      @scala.inline
      def setM21(value: Double): Self = StObject.set(x, "m21", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM21Undefined: Self = StObject.set(x, "m21", js.undefined)
      
      @scala.inline
      def setM22(value: Double): Self = StObject.set(x, "m22", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM22Undefined: Self = StObject.set(x, "m22", js.undefined)
      
      @scala.inline
      def setM41(value: Double): Self = StObject.set(x, "m41", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM41Undefined: Self = StObject.set(x, "m41", js.undefined)
      
      @scala.inline
      def setM42(value: Double): Self = StObject.set(x, "m42", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM42Undefined: Self = StObject.set(x, "m42", js.undefined)
    }
  }
}
