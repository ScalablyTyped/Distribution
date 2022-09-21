package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeoutOptions extends StObject {
  
  /** Number of seconds after which processing will be stopped (default 0, eg disabled) */
  var seconds: Double
}
object TimeoutOptions {
  
  inline def apply(seconds: Double): TimeoutOptions = {
    val __obj = js.Dynamic.literal(seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutOptions]
  }
  
  extension [Self <: TimeoutOptions](x: Self) {
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
  }
}
