package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientBlockListRequest extends StObject {
  
  /** ClientBlockListRequest blockIds */
  var blockIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /** ClientBlockListRequest headId */
  var headId: js.UndefOr[String | Null] = js.undefined
  
  /** ClientBlockListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.undefined
  
  /** ClientBlockListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.undefined
}
object IClientBlockListRequest {
  
  inline def apply(): IClientBlockListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientBlockListRequest]
  }
  
  extension [Self <: IClientBlockListRequest](x: Self) {
    
    inline def setBlockIds(value: js.Array[String]): Self = StObject.set(x, "blockIds", value.asInstanceOf[js.Any])
    
    inline def setBlockIdsNull: Self = StObject.set(x, "blockIds", null)
    
    inline def setBlockIdsUndefined: Self = StObject.set(x, "blockIds", js.undefined)
    
    inline def setBlockIdsVarargs(value: String*): Self = StObject.set(x, "blockIds", js.Array(value*))
    
    inline def setHeadId(value: String): Self = StObject.set(x, "headId", value.asInstanceOf[js.Any])
    
    inline def setHeadIdNull: Self = StObject.set(x, "headId", null)
    
    inline def setHeadIdUndefined: Self = StObject.set(x, "headId", js.undefined)
    
    inline def setPaging(value: IClientPagingControls): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingNull: Self = StObject.set(x, "paging", null)
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setSorting(value: js.Array[IClientSortControls]): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingNull: Self = StObject.set(x, "sorting", null)
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    inline def setSortingVarargs(value: IClientSortControls*): Self = StObject.set(x, "sorting", js.Array(value*))
  }
}
