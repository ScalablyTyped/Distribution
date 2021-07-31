package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.ClientStateListResponse.IEntry
import typings.sawtoothSdk.protobufMod.ClientStateListResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientStateListResponse extends StObject {
  
  /** ClientStateListResponse entries */
  var entries: js.UndefOr[js.Array[IEntry] | Null] = js.undefined
  
  /** ClientStateListResponse paging */
  var paging: js.UndefOr[IClientPagingResponse | Null] = js.undefined
  
  /** ClientStateListResponse stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.undefined
  
  /** ClientStateListResponse status */
  var status: js.UndefOr[Status | Null] = js.undefined
}
object IClientStateListResponse {
  
  @scala.inline
  def apply(): IClientStateListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStateListResponse]
  }
  
  @scala.inline
  implicit class IClientStateListResponseMutableBuilder[Self <: IClientStateListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[IEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesNull: Self = StObject.set(x, "entries", null)
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: IEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setPaging(value: IClientPagingResponse): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagingNull: Self = StObject.set(x, "paging", null)
    
    @scala.inline
    def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    @scala.inline
    def setStateRoot(value: String): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateRootNull: Self = StObject.set(x, "stateRoot", null)
    
    @scala.inline
    def setStateRootUndefined: Self = StObject.set(x, "stateRoot", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
