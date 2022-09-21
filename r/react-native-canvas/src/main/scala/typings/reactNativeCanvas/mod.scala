package typings.reactNativeCanvas

import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCanvas.anon.A
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-canvas", JSImport.Default)
  @js.native
  open class default () extends Canvas
  
  @JSImport("react-native-canvas", "Image")
  @js.native
  open class Image protected () extends StObject {
    def this(canvas: Canvas) = this()
    def this(canvas: Canvas, height: Double) = this()
    def this(canvas: Canvas, height: Double, width: Double) = this()
    def this(canvas: Canvas, height: Unit, width: Double) = this()
    
    def addEventListener(event: String, func: js.Function1[/* args */ Any, Any]): Unit = js.native
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var height: Double = js.native
    
    var src: String = js.native
    
    var width: Double = js.native
  }
  
  @JSImport("react-native-canvas", "ImageData")
  @js.native
  open class ImageData protected () extends StObject {
    def this(canvas: Canvas, data: js.Array[Double], height: Double, width: Double) = this()
    
    val data: js.typedarray.Uint8ClampedArray = js.native
    
    val height: Double = js.native
    
    val width: Double = js.native
  }
  
  @JSImport("react-native-canvas", "Path2D")
  @js.native
  open class Path2D protected () extends StObject {
    def this(
      canvas: Canvas,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
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
    extends Component[CanvasProps, js.Object, Any] {
    
    def getContext(context: String): CanvasRenderingContext2D = js.native
    
    var height: Double = js.native
    
    def toDataURL(): js.Promise[String] = js.native
    def toDataURL(`type`: String): js.Promise[String] = js.native
    def toDataURL(`type`: String, encoderOptions: Double): js.Promise[String] = js.native
    def toDataURL(`type`: Unit, encoderOptions: Double): js.Promise[String] = js.native
    
    var width: Double = js.native
  }
  
  trait CanvasGradient extends StObject {
    
    def addColorStop(offset: Double, color: String): Unit
  }
  object CanvasGradient {
    
    inline def apply(addColorStop: (Double, String) => Unit): CanvasGradient = {
      val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
      __obj.asInstanceOf[CanvasGradient]
    }
    
    extension [Self <: CanvasGradient](x: Self) {
      
      inline def setAddColorStop(value: (Double, String) => Unit): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait CanvasPattern extends StObject {
    
    def setTransform(): Unit = js.native
    def setTransform(transform: DOMMatrix2DInit): Unit = js.native
  }
  
  trait CanvasProps extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var originWhitelist: js.UndefOr[js.Array[String]] = js.undefined
    
    var ref: (js.Function1[/* canvas */ Canvas, Any]) | RefObject[Canvas]
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object CanvasProps {
    
    inline def apply(ref: (js.Function1[/* canvas */ Canvas, Any]) | RefObject[Canvas]): CanvasProps = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanvasProps]
    }
    
    extension [Self <: CanvasProps](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setOriginWhitelist(value: js.Array[String]): Self = StObject.set(x, "originWhitelist", value.asInstanceOf[js.Any])
      
      inline def setOriginWhitelistUndefined: Self = StObject.set(x, "originWhitelist", js.undefined)
      
      inline def setOriginWhitelistVarargs(value: String*): Self = StObject.set(x, "originWhitelist", js.Array(value*))
      
      inline def setRef(value: (js.Function1[/* canvas */ Canvas, Any]) | RefObject[Canvas]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* canvas */ Canvas => Any): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
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
    
    def drawWidgetAsOnScreen(window: Any): Unit = js.native
    
    def drawWindow(window: Any, x: Double, y: Double, w: Double, h: Double, bgColor: String): Unit = js.native
    def drawWindow(window: Any, x: Double, y: Double, w: Double, h: Double, bgColor: String, flags: Any): Unit = js.native
    
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
    def fill(Path2D: Unit, fillRule: Any): Unit = js.native
    def fill(Path2D: Path2D): Unit = js.native
    def fill(Path2D: Path2D, fillRule: Any): Unit = js.native
    
    def fillRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    var fillStyle: String | CanvasGradient | CanvasPattern = js.native
    
    def fillText(text: String, x: Double, y: Double): Unit = js.native
    def fillText(text: String, x: Double, y: Double, maxWidth: Double): Unit = js.native
    
    var font: String = js.native
    
    def getImageData(sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageData] = js.native
    
    def getLineDash(): js.Array[Double] = js.native
    
    var globalAlpha: Double = js.native
    
    var globalCompositionOperation: String = js.native
    
    def isPointInPath(x: Double, y: Double, fillRule: Any, path: Path2D): Boolean = js.native
    
    def isPointInStroke(x: Double, y: Double, path: Path2D): Boolean = js.native
    
    var lineCap: String = js.native
    
    var lineDashOffset: Double = js.native
    
    var lineJoin: String = js.native
    
    def lineTo(x: Double, y: Double): Unit = js.native
    
    var lineWidth: Double = js.native
    
    def measureText(text: String): Any = js.native
    
    var miterLimit: Double = js.native
    
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
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: Double,
      dirtyY: Double,
      dirtyWidth: Unit,
      dirtyHeight: Double
    ): Unit = js.native
    def putImageData(imageData: ImageData, dx: Double, dy: Double, dirtyX: Double, dirtyY: Unit, dirtyWidth: Double): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: Double,
      dirtyY: Unit,
      dirtyWidth: Double,
      dirtyHeight: Double
    ): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: Double,
      dirtyY: Unit,
      dirtyWidth: Unit,
      dirtyHeight: Double
    ): Unit = js.native
    def putImageData(imageData: ImageData, dx: Double, dy: Double, dirtyX: Unit, dirtyY: Double): Unit = js.native
    def putImageData(imageData: ImageData, dx: Double, dy: Double, dirtyX: Unit, dirtyY: Double, dirtyWidth: Double): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: Unit,
      dirtyY: Double,
      dirtyWidth: Double,
      dirtyHeight: Double
    ): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: Unit,
      dirtyY: Double,
      dirtyWidth: Unit,
      dirtyHeight: Double
    ): Unit = js.native
    def putImageData(imageData: ImageData, dx: Double, dy: Double, dirtyX: Unit, dirtyY: Unit, dirtyWidth: Double): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: Unit,
      dirtyY: Unit,
      dirtyWidth: Double,
      dirtyHeight: Double
    ): Unit = js.native
    def putImageData(
      imageData: ImageData,
      dx: Double,
      dy: Double,
      dirtyX: Unit,
      dirtyY: Unit,
      dirtyWidth: Unit,
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
    
    var textBaseline: String = js.native
    
    def transform(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Unit = js.native
    
    def translate(x: Double, y: Double): Unit = js.native
  }
  
  trait DOMMatrix2DInit extends StObject {
    
    var a: js.UndefOr[Double] = js.undefined
    
    var b: js.UndefOr[Double] = js.undefined
    
    var c: js.UndefOr[Double] = js.undefined
    
    var d: js.UndefOr[Double] = js.undefined
    
    var e: js.UndefOr[Double] = js.undefined
    
    var f: js.UndefOr[Double] = js.undefined
    
    var m11: js.UndefOr[Double] = js.undefined
    
    var m12: js.UndefOr[Double] = js.undefined
    
    var m21: js.UndefOr[Double] = js.undefined
    
    var m22: js.UndefOr[Double] = js.undefined
    
    var m41: js.UndefOr[Double] = js.undefined
    
    var m42: js.UndefOr[Double] = js.undefined
  }
  object DOMMatrix2DInit {
    
    inline def apply(): DOMMatrix2DInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DOMMatrix2DInit]
    }
    
    extension [Self <: DOMMatrix2DInit](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFUndefined: Self = StObject.set(x, "f", js.undefined)
      
      inline def setM11(value: Double): Self = StObject.set(x, "m11", value.asInstanceOf[js.Any])
      
      inline def setM11Undefined: Self = StObject.set(x, "m11", js.undefined)
      
      inline def setM12(value: Double): Self = StObject.set(x, "m12", value.asInstanceOf[js.Any])
      
      inline def setM12Undefined: Self = StObject.set(x, "m12", js.undefined)
      
      inline def setM21(value: Double): Self = StObject.set(x, "m21", value.asInstanceOf[js.Any])
      
      inline def setM21Undefined: Self = StObject.set(x, "m21", js.undefined)
      
      inline def setM22(value: Double): Self = StObject.set(x, "m22", value.asInstanceOf[js.Any])
      
      inline def setM22Undefined: Self = StObject.set(x, "m22", js.undefined)
      
      inline def setM41(value: Double): Self = StObject.set(x, "m41", value.asInstanceOf[js.Any])
      
      inline def setM41Undefined: Self = StObject.set(x, "m41", js.undefined)
      
      inline def setM42(value: Double): Self = StObject.set(x, "m42", value.asInstanceOf[js.Any])
      
      inline def setM42Undefined: Self = StObject.set(x, "m42", js.undefined)
    }
  }
}
