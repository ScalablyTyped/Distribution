package typings.scriptableIos

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Structure representing a point._
  * @see https://docs.scriptable.app/point/#-new-point
  */
trait Point extends StObject {
  
  /**
    * _X value._
    * @see https://docs.scriptable.app/point/#x
    */
  var x: Double
  
  /**
    * _Y value._
    * @see https://docs.scriptable.app/point/#y
    */
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
