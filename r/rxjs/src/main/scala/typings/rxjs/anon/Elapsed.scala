package typings.rxjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elapsed extends StObject {
  
  var elapsed: Double
  
  var timestamp: Double
}
object Elapsed {
  
  inline def apply(elapsed: Double, timestamp: Double): Elapsed = {
    val __obj = js.Dynamic.literal(elapsed = elapsed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elapsed]
  }
  
  extension [Self <: Elapsed](x: Self) {
    
    inline def setElapsed(value: Double): Self = StObject.set(x, "elapsed", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
