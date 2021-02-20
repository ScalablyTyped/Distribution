package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ConsensusCancelBlockResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConsensusCancelBlockResponse extends StObject {
  
  /** ConsensusCancelBlockResponse status */
  var status: js.UndefOr[Status | Null] = js.native
}
object IConsensusCancelBlockResponse {
  
  @scala.inline
  def apply(): IConsensusCancelBlockResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConsensusCancelBlockResponse]
  }
  
  @scala.inline
  implicit class IConsensusCancelBlockResponseMutableBuilder[Self <: IConsensusCancelBlockResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
