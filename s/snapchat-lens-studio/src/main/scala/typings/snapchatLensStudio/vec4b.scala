package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A vector containing 4 boolean values.
  * Lens Studio v1.5.0+
  */
trait vec4b extends StObject {
  
  /** Alternate name for the w component. */
  var a: Boolean
  
  /** Alternate name for the z component. */
  var b: Boolean
  
  /** Alternate name for the y component. */
  var g: Boolean
  
  /** Alternate name for the x component. */
  var r: Boolean
  
  /** w component of the vec4b. */
  var w: Boolean
  
  /** x component of the vec4b. */
  var x: Boolean
  
  /** y component of the vec4b. */
  var y: Boolean
  
  /** z component of the vec4b. */
  var z: Boolean
}
object vec4b {
  
  inline def apply(a: Boolean, b: Boolean, g: Boolean, r: Boolean, w: Boolean, x: Boolean, y: Boolean, z: Boolean): vec4b = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[vec4b]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: vec4b] (val x: Self) extends AnyVal {
    
    inline def setA(value: Boolean): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setB(value: Boolean): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setG(value: Boolean): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    inline def setR(value: Boolean): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setW(value: Boolean): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Boolean): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
