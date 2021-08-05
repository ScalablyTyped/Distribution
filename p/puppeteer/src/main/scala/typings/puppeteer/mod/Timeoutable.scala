package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timeoutable extends StObject {
  
  /**
    * Maximum navigation time in milliseconds, pass 0 to disable timeout.
    * @default 30000
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object Timeoutable {
  
  inline def apply(): Timeoutable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timeoutable]
  }
  
  extension [Self <: Timeoutable](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
