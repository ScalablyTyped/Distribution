package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClientBlockListRequest extends StObject {
  
  /** ClientBlockListRequest blockIds */
  var blockIds: js.UndefOr[js.Array[String] | Null] = js.native
  
  /** ClientBlockListRequest headId */
  var headId: js.UndefOr[String | Null] = js.native
  
  /** ClientBlockListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.native
  
  /** ClientBlockListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.native
}
object IClientBlockListRequest {
  
  @scala.inline
  def apply(): IClientBlockListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockListRequest]
  }
  
  @scala.inline
  implicit class IClientBlockListRequestMutableBuilder[Self <: IClientBlockListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockIds(value: js.Array[String]): Self = StObject.set(x, "blockIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockIdsNull: Self = StObject.set(x, "blockIds", null)
    
    @scala.inline
    def setBlockIdsUndefined: Self = StObject.set(x, "blockIds", js.undefined)
    
    @scala.inline
    def setBlockIdsVarargs(value: String*): Self = StObject.set(x, "blockIds", js.Array(value :_*))
    
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
