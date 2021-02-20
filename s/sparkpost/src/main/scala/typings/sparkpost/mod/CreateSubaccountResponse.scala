package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSubaccountResponse extends StObject {
  
  var key: String = js.native
  
  var label: String = js.native
  
  var short_key: String = js.native
  
  var subaccount_id: Double = js.native
}
object CreateSubaccountResponse {
  
  @scala.inline
  def apply(key: String, label: String, short_key: String, subaccount_id: Double): CreateSubaccountResponse = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], short_key = short_key.asInstanceOf[js.Any], subaccount_id = subaccount_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubaccountResponse]
  }
  
  @scala.inline
  implicit class CreateSubaccountResponseMutableBuilder[Self <: CreateSubaccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_key(value: String): Self = StObject.set(x, "short_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccount_id(value: Double): Self = StObject.set(x, "subaccount_id", value.asInstanceOf[js.Any])
  }
}
