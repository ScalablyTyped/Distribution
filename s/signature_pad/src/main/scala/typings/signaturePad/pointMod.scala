package typings.signaturePad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointMod {
  
  @JSImport("signature_pad/dist/types/point", "Point")
  @js.native
  class Point protected ()
    extends StObject
       with BasicPoint {
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, time: Double) = this()
    
    def distanceTo(start: BasicPoint): Double = js.native
    
    def equals(other: BasicPoint): Boolean = js.native
    
    /* CompleteClass */
    var time: Double = js.native
    
    def velocityFrom(start: BasicPoint): Double = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
  
  trait BasicPoint extends StObject {
    
    var time: Double
    
    var x: Double
    
    var y: Double
  }
  object BasicPoint {
    
    inline def apply(time: Double, x: Double, y: Double): BasicPoint = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicPoint]
    }
    
    extension [Self <: BasicPoint](x: Self) {
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
