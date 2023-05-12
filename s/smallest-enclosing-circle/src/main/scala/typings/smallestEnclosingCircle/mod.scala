package typings.smallestEnclosingCircle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(points: js.Array[Point]): Circle = ^.asInstanceOf[js.Dynamic].apply(points.asInstanceOf[js.Any]).asInstanceOf[Circle]
  
  @JSImport("smallest-enclosing-circle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Circle
    extends StObject
       with Point {
    
    var r: Double
  }
  object Circle {
    
    inline def apply(r: Double, x: Double, y: Double): Circle = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Circle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Circle] (val x: Self) extends AnyVal {
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
