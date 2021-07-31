package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusBroadcastResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConsensusBroadcastResponse extends StObject {
  
  /** ConsensusBroadcastResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IConsensusBroadcastResponse {
  
  @scala.inline
  def apply(): IConsensusBroadcastResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusBroadcastResponse]
  }
  
  @scala.inline
  implicit class IConsensusBroadcastResponseMutableBuilder[Self <: IConsensusBroadcastResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
