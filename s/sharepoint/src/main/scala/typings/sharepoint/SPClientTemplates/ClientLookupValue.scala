package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientLookupValue extends StObject {
  
  var LookupId: Double = js.native
  
  var LookupValue: String = js.native
}
object ClientLookupValue {
  
  @scala.inline
  def apply(LookupId: Double, LookupValue: String): ClientLookupValue = {
    val __obj = js.Dynamic.literal(LookupId = LookupId.asInstanceOf[js.Any], LookupValue = LookupValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientLookupValue]
  }
  
  @scala.inline
  implicit class ClientLookupValueMutableBuilder[Self <: ClientLookupValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLookupId(value: Double): Self = StObject.set(x, "LookupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookupValue(value: String): Self = StObject.set(x, "LookupValue", value.asInstanceOf[js.Any])
  }
}
