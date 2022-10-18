package typings.reactNativeSvg

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactNative.mod.NativeMethods
import typings.reactNativeSvg.anon.Objectmatrixnumbernumbern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsShapeMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Shape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-svg/lib/typescript/elements/Shape", JSImport.Default)
  @js.native
  open class default[P] protected () extends Shape[P] {
    def this(props: P) = this()
  }
  
  @JSImport("react-native-svg/lib/typescript/elements/Shape", "SVGMatrix")
  @js.native
  open class SVGMatrix ()
    extends StObject
       with Matrix {
    def this(matrix: Matrix) = this()
    
    /* CompleteClass */
    var a: Double = js.native
    
    /* CompleteClass */
    var b: Double = js.native
    
    /* CompleteClass */
    var c: Double = js.native
    
    /* CompleteClass */
    var d: Double = js.native
    
    /* CompleteClass */
    var e: Double = js.native
    
    /* CompleteClass */
    var f: Double = js.native
    
    def flipX(): SVGMatrix = js.native
    
    def flipY(): SVGMatrix = js.native
    
    def inverse(): SVGMatrix = js.native
    
    def multiply(secondMatrix: Matrix): SVGMatrix = js.native
    
    def rotate(angle: Double): SVGMatrix = js.native
    
    def rotateFromVector(x: Double, y: Double): SVGMatrix = js.native
    
    def scale(scaleFactor: Double): SVGMatrix = js.native
    
    def scaleNonUniform(scaleFactorX: Double, scaleFactorY: Double): SVGMatrix = js.native
    
    def skewX(angle: Double): SVGMatrix = js.native
    
    def skewY(angle: Double): SVGMatrix = js.native
    
    def translate(x: Double, y: Double): SVGMatrix = js.native
  }
  
  @JSImport("react-native-svg/lib/typescript/elements/Shape", "SVGPoint")
  @js.native
  open class SVGPoint ()
    extends StObject
       with Point {
    def this(point: Point) = this()
    
    def matrixTransform(matrix: Matrix): SVGPoint = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  inline def invert(hasABCDEF: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(hasABCDEF.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  
  inline def matrixTransform(matrix: Matrix, point: Point): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("matrixTransform")(matrix.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def multiplyMatrices(l: Matrix, r: Matrix): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply_matrices")(l.asInstanceOf[js.Any], r.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  object ownerSVGElement {
    
    @JSImport("react-native-svg/lib/typescript/elements/Shape", "ownerSVGElement")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createSVGMatrix(): SVGMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("createSVGMatrix")().asInstanceOf[SVGMatrix]
    
    inline def createSVGPoint(): SVGPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("createSVGPoint")().asInstanceOf[SVGPoint]
  }
  
  trait DOMPointInit extends StObject {
    
    var w: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var z: js.UndefOr[Double] = js.undefined
  }
  object DOMPointInit {
    
    inline def apply(): DOMPointInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DOMPointInit]
    }
    
    extension [Self <: DOMPointInit](x: Self) {
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  trait Matrix extends StObject {
    
    var a: Double
    
    var b: Double
    
    var c: Double
    
    var d: Double
    
    var e: Double
    
    var f: Double
  }
  object Matrix {
    
    inline def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matrix]
    }
    
    extension [Self <: Matrix](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setF(value: Double): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect extends StObject {
    
    var height: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object Rect {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): Rect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    extension [Self <: Rect](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait SVGBoundingBoxOptions extends StObject {
    
    var clipped: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var markers: js.UndefOr[Boolean] = js.undefined
    
    var stroke: js.UndefOr[Boolean] = js.undefined
  }
  object SVGBoundingBoxOptions {
    
    inline def apply(): SVGBoundingBoxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SVGBoundingBoxOptions]
    }
    
    extension [Self <: SVGBoundingBoxOptions](x: Self) {
      
      inline def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      inline def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setMarkers(value: Boolean): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
      
      inline def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  type SVGRect = Rect
  
  @js.native
  trait Shape[P]
    extends Component[P, js.Object, Any]
       with /* x */ StringDictionary[Any] {
    
    def getBBox(): SVGRect = js.native
    def getBBox(options: SVGBoundingBoxOptions): SVGRect = js.native
    
    def getCTM(): SVGMatrix = js.native
    
    def getPointAtLength(length: Double): SVGPoint = js.native
    
    def getScreenCTM(): SVGMatrix = js.native
    
    def getTotalLength(): Double = js.native
    
    def isPointInFill(options: DOMPointInit): Boolean = js.native
    
    def isPointInStroke(options: DOMPointInit): Boolean = js.native
    
    def refMethod(): Unit = js.native
    def refMethod(instance: Shape[P] & NativeMethods): Unit = js.native
    
    var root: (Shape[P] & NativeMethods) | Null = js.native
    
    def setNativeProps(props: Objectmatrixnumbernumbern): Unit = js.native
  }
}
