package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Braintree extends StObject {
  
  var braintree: js.UndefOr[DeviceData] = js.undefined
  
  var kount: js.UndefOr[DataCollector] = js.undefined
  
  var litle: js.UndefOr[SessionId] = js.undefined
}
object Braintree {
  
  inline def apply(): Braintree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Braintree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Braintree] (val x: Self) extends AnyVal {
    
    inline def setBraintree(value: DeviceData): Self = StObject.set(x, "braintree", value.asInstanceOf[js.Any])
    
    inline def setBraintreeUndefined: Self = StObject.set(x, "braintree", js.undefined)
    
    inline def setKount(value: DataCollector): Self = StObject.set(x, "kount", value.asInstanceOf[js.Any])
    
    inline def setKountUndefined: Self = StObject.set(x, "kount", js.undefined)
    
    inline def setLitle(value: SessionId): Self = StObject.set(x, "litle", value.asInstanceOf[js.Any])
    
    inline def setLitleUndefined: Self = StObject.set(x, "litle", js.undefined)
  }
}
