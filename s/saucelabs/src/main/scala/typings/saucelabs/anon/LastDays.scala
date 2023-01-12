package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastDays extends StObject {
  
  var lastDays: js.UndefOr[Double] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var userId: js.UndefOr[String] = js.undefined
}
object LastDays {
  
  inline def apply(): LastDays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastDays]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastDays] (val x: Self) extends AnyVal {
    
    inline def setLastDays(value: Double): Self = StObject.set(x, "lastDays", value.asInstanceOf[js.Any])
    
    inline def setLastDaysUndefined: Self = StObject.set(x, "lastDays", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
