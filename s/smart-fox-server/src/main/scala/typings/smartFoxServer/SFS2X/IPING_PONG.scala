package typings.smartFoxServer.SFS2X

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPING_PONG extends StObject {
  
  var lagValue: Double
}
object IPING_PONG {
  
  inline def apply(lagValue: Double): IPING_PONG = {
    val __obj = js.Dynamic.literal(lagValue = lagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPING_PONG]
  }
  
  extension [Self <: IPING_PONG](x: Self) {
    
    inline def setLagValue(value: Double): Self = StObject.set(x, "lagValue", value.asInstanceOf[js.Any])
  }
}
