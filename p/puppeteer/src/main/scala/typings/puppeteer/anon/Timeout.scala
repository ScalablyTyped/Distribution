package typings.puppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timeout extends StObject {
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Timeout {
  
  inline def apply(): Timeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timeout]
  }
  
  extension [Self <: Timeout](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
