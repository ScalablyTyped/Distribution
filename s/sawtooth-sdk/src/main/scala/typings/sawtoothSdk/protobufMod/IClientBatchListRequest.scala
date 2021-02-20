package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientBatchListRequest extends StObject {
  
  /** ClientBatchListRequest batchIds */
  var batchIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ClientBatchListRequest headId */
  var headId: js.UndefOr[String | Null] = js.native
  
  /** ClientBatchListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.native
  
  /** ClientBatchListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.native
}
object IClientBatchListRequest {
  
  @scala.inline
  def apply(): IClientBatchListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBatchListRequest]
  }
  
  @scala.inline
  implicit class IClientBatchListRequestMutableBuilder[Self <: IClientBatchListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchIds(value: js.Array[String]): Self = StObject.set(x, "batchIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdsNull: Self = StObject.set(x, "batchIds", null)
    
    @scala.inline
    def setBatchIdsUndefined: Self = StObject.set(x, "batchIds", js.undefined)
    
    @scala.inline
    def setBatchIdsVarargs(value: String*): Self = StObject.set(x, "batchIds", js.Array(value :_*))
    
    @scala.inline
    def setHeadId(value: String): Self = StObject.set(x, "headId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadIdNull: Self = StObject.set(x, "headId", null)
    
    @scala.inline
    def setHeadIdUndefined: Self = StObject.set(x, "headId", js.undefined)
    
    @scala.inline
    def setPaging(value: IClientPagingControls): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingNull: Self = StObject.set(x, "paging", null)
    
    @scala.inline
    def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    @scala.inline
    def setSorting(value: js.Array[IClientSortControls]): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortingNull: Self = StObject.set(x, "sorting", null)
    
    @scala.inline
    def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    @scala.inline
    def setSortingVarargs(value: IClientSortControls*): Self = StObject.set(x, "sorting", js.Array(value :_*))
  }
}
