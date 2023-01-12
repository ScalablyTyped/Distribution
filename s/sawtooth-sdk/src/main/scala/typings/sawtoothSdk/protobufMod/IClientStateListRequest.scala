package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClientStateListRequest extends StObject {
  
  /** ClientStateListRequest address */
  var address: js.UndefOr[String | Null] = js.undefined
  
  /** ClientStateListRequest paging */
  var paging: js.UndefOr[IClientPagingControls | Null] = js.undefined
  
  /** ClientStateListRequest sorting */
  var sorting: js.UndefOr[js.Array[IClientSortControls] | Null] = js.undefined
  
  /** ClientStateListRequest stateRoot */
  var stateRoot: js.UndefOr[String | Null] = js.undefined
}
object IClientStateListRequest {
  
  inline def apply(): IClientStateListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStateListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClientStateListRequest] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setPaging(value: IClientPagingControls): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingNull: Self = StObject.set(x, "paging", null)
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setSorting(value: js.Array[IClientSortControls]): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingNull: Self = StObject.set(x, "sorting", null)
    
    inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
    
    inline def setSortingVarargs(value: IClientSortControls*): Self = StObject.set(x, "sorting", js.Array(value*))
    
    inline def setStateRoot(value: String): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
    
    inline def setStateRootNull: Self = StObject.set(x, "stateRoot", null)
    
    inline def setStateRootUndefined: Self = StObject.set(x, "stateRoot", js.undefined)
  }
}
