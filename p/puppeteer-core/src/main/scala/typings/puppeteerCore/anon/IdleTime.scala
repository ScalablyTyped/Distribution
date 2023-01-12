package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleTime extends StObject {
  
  var idleTime: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object IdleTime {
  
  inline def apply(): IdleTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdleTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdleTime] (val x: Self) extends AnyVal {
    
    inline def setIdleTime(value: Double): Self = StObject.set(x, "idleTime", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeUndefined: Self = StObject.set(x, "idleTime", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
