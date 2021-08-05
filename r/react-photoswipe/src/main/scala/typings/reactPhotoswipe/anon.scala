package typings.reactPhotoswipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Prevent extends StObject {
    
    var prevent: Boolean
  }
  object Prevent {
    
    inline def apply(prevent: Boolean): Prevent = {
      val __obj = js.Dynamic.literal(prevent = prevent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prevent]
    }
    
    extension [Self <: Prevent](x: Self) {
      
      inline def setPrevent(value: Boolean): Self = StObject.set(x, "prevent", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
