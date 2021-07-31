package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientBlockListResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBlockListResponse extends StObject {
  
  /** ClientBlockListResponse blocks */
  var blocks: js.UndefOr[js.Array[IBlock] | Null] = js.undefined
  
  /** ClientBlockListResponse headId */
  var headId: js.UndefOr[String | Null] = js.undefined
  
  /** ClientBlockListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.undefined
  
  /** ClientBlockListResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientBlockListResponse {
  
  @scala.inline
  def apply(): IClientBlockListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockListResponse]
  }
  
  @scala.inline
  implicit class IClientBlockListResponseMutableBuilder[Self <: IClientBlockListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocks(value: js.Array[IBlock]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksNull: Self = StObject.set(x, "blocks", null)
    
    @scala.inline
    def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
    
    @scala.inline
    def setBlocksVarargs(value: IBlock*): Self = StObject.set(x, "blocks", js.Array(value :_*))
    
    @scala.inline
    def setHeadId(value: String): Self = StObject.set(x, "headId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadIdNull: Self = StObject.set(x, "headId", null)
    
    @scala.inline
    def setHeadIdUndefined: Self = StObject.set(x, "headId", js.undefined)
    
    @scala.inline
    def setPaging(value: IClientPagingResponse): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingNull: Self = StObject.set(x, "paging", null)
    
    @scala.inline
    def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
