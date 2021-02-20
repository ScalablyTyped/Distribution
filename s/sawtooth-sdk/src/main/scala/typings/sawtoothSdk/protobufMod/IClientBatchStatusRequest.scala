package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientBatchStatusRequest extends StObject {
  
  /** ClientBatchStatusRequest batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ClientBatchStatusRequest timeout */
  var timeout: js.UndefOr[Double | Null] = js.native
  
  /** ClientBatchStatusRequest wait */
  @JSName("wait")
  var wait_FIClientBatchStatusRequest: js.UndefOr[Boolean | Null] = js.native
}
object IClientBatchStatusRequest {
  
  @scala.inline
  def apply(): IClientBatchStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchStatusRequest]
  }
  
  @scala.inline
  implicit class IClientBatchStatusRequestMutableBuilder[Self <: IClientBatchStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchIds(value: js.Array[String]): Self = StObject.set(x, "batchIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdsNull: Self = StObject.set(x, "batchIds", null)
    
    @scala.inline
    def setBatchIdsUndefined: Self = StObject.set(x, "batchIds", js.undefined)
    
    @scala.inline
    def setBatchIdsVarargs(value: String*): Self = StObject.set(x, "batchIds", js.Array(value :_*))
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_Null: Self = StObject.set(x, "wait", null)
    
    @scala.inline
    def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
