package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBatchGetRequest extends StObject {
  
  /** ClientBatchGetRequest batchId */
  var batchId: js.UndefOr[String | Null] = js.undefined
}
object IClientBatchGetRequest {
  
  @scala.inline
  def apply(): IClientBatchGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchGetRequest]
  }
  
  @scala.inline
  implicit class IClientBatchGetRequestMutableBuilder[Self <: IClientBatchGetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: String): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdNull: Self = StObject.set(x, "batchId", null)
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
  }
}
