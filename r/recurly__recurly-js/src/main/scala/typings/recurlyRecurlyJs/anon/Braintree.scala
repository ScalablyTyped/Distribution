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
  
  @scala.inline
  def apply(): Braintree = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Braintree]
  }
  
  @scala.inline
  implicit class BraintreeMutableBuilder[Self <: Braintree] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBraintree(value: DeviceData): Self = StObject.set(x, "braintree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBraintreeUndefined: Self = StObject.set(x, "braintree", js.undefined)
    
    @scala.inline
    def setKount(value: DataCollector): Self = StObject.set(x, "kount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKountUndefined: Self = StObject.set(x, "kount", js.undefined)
    
    @scala.inline
    def setLitle(value: SessionId): Self = StObject.set(x, "litle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLitleUndefined: Self = StObject.set(x, "litle", js.undefined)
  }
}
