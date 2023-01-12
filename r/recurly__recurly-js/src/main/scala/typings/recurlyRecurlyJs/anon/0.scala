package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var threeDSecure: js.UndefOr[PreflightDeviceDataCollector] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setThreeDSecure(value: PreflightDeviceDataCollector): Self = StObject.set(x, "threeDSecure", value.asInstanceOf[js.Any])
    
    inline def setThreeDSecureUndefined: Self = StObject.set(x, "threeDSecure", js.undefined)
  }
}
