package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollingTimeout extends StObject {
  
  var polling: js.UndefOr[String | Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object PollingTimeout {
  
  inline def apply(): PollingTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollingTimeout]
  }
  
  extension [Self <: PollingTimeout](x: Self) {
    
    inline def setPolling(value: String | Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
    
    inline def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
