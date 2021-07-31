package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusSendToResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusSendToResponse extends StObject {
  
  /** ConsensusSendToResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusSendToResponse {
  
  @scala.inline
  def apply(): IConsensusSendToResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusSendToResponse]
  }
  
  @scala.inline
  implicit class IConsensusSendToResponseMutableBuilder[Self <: IConsensusSendToResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
