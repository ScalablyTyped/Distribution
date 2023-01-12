package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRateLimiterQueueOpts extends StObject {
  
  var maxQueueSize: js.UndefOr[Double] = js.undefined
}
object IRateLimiterQueueOpts {
  
  inline def apply(): IRateLimiterQueueOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRateLimiterQueueOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRateLimiterQueueOpts] (val x: Self) extends AnyVal {
    
    inline def setMaxQueueSize(value: Double): Self = StObject.set(x, "maxQueueSize", value.asInstanceOf[js.Any])
    
    inline def setMaxQueueSizeUndefined: Self = StObject.set(x, "maxQueueSize", js.undefined)
  }
}
