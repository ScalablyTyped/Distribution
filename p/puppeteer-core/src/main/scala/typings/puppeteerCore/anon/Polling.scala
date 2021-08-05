package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polling extends StObject {
  
  var polling: js.UndefOr[String | Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object Polling {
  
  inline def apply(): Polling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Polling]
  }
  
  extension [Self <: Polling](x: Self) {
    
    inline def setPolling(value: String | Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
    
    inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
