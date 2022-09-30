package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a vertex of a `Shape`.
  */
trait Vertex extends StObject {
  
  var color: js.UndefOr[Color] = js.undefined
  
  var u: js.UndefOr[Double] = js.undefined
  
  var v: js.UndefOr[Double] = js.undefined
  
  var x: Double
  
  var y: Double
  
  var z: js.UndefOr[Double] = js.undefined
}
object Vertex {
  
  inline def apply(x: Double, y: Double): Vertex = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vertex]
  }
  
  extension [Self <: Vertex](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setU(value: Double): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    
    inline def setUUndefined: Self = StObject.set(x, "u", js.undefined)
    
    inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
