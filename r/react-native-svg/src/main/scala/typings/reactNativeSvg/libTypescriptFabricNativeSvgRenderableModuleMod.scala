package typings.reactNativeSvg

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.librariesTypesCodegenTypesMod.Float
import typings.reactNative.librariesTypesCodegenTypesMod.Int32
import typings.reactNative.mod.TurboModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptFabricNativeSvgRenderableModuleMod extends Shortcut {
  
  @JSImport("react-native-svg/lib/typescript/fabric/NativeSvgRenderableModule", JSImport.Default)
  @js.native
  val default: Spec = js.native
  
  trait Matrix extends StObject {
    
    var a: Float
    
    var b: Float
    
    var c: Float
    
    var d: Float
    
    var e: Float
    
    var f: Float
  }
  object Matrix {
    
    inline def apply(a: Float, b: Float, c: Float, d: Float, e: Float, f: Float): Matrix = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any])
      __obj.asInstanceOf[Matrix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Matrix] (val x: Self) extends AnyVal {
      
      inline def setA(value: Float): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Float): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setC(value: Float): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setD(value: Float): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setE(value: Float): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setF(value: Float): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var x: Float
    
    var y: Float
  }
  object Point {
    
    inline def apply(x: Float, y: Float): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setX(value: Float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Rect extends StObject {
    
    var height: Float
    
    var width: Float
    
    var x: Float
    
    var y: Float
  }
  object Rect {
    
    inline def apply(height: Float, width: Float, x: Float, y: Float): Rect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Float): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Float): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Float): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Float): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Spec
    extends StObject
       with TurboModule {
    
    def getBBox(): Rect = js.native
    def getBBox(tag: Null, options: js.Object): Rect = js.native
    def getBBox(tag: Int32): Rect = js.native
    def getBBox(tag: Int32, options: js.Object): Rect = js.native
    
    def getCTM(): Matrix = js.native
    def getCTM(tag: Int32): Matrix = js.native
    
    def getPointAtLength(): Point = js.native
    def getPointAtLength(tag: Null, options: js.Object): Point = js.native
    def getPointAtLength(tag: Int32): Point = js.native
    def getPointAtLength(tag: Int32, options: js.Object): Point = js.native
    
    def getRawResource(name: String): js.Promise[String] = js.native
    
    def getScreenCTM(): Matrix = js.native
    def getScreenCTM(tag: Int32): Matrix = js.native
    
    def getTotalLength(): Float = js.native
    def getTotalLength(tag: Int32): Float = js.native
    
    def isPointInFill(): Boolean = js.native
    def isPointInFill(tag: Null, options: js.Object): Boolean = js.native
    def isPointInFill(tag: Int32): Boolean = js.native
    def isPointInFill(tag: Int32, options: js.Object): Boolean = js.native
    
    def isPointInStroke(): Boolean = js.native
    def isPointInStroke(tag: Null, options: js.Object): Boolean = js.native
    def isPointInStroke(tag: Int32): Boolean = js.native
    def isPointInStroke(tag: Int32, options: js.Object): Boolean = js.native
  }
  
  type _To = Spec
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptFabricNativeSvgRenderableModuleMod.foo` */
  override def _to: Spec = default
}
