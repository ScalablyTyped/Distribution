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
  
  @scala.inline
  def apply(): IClientStateListRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClientStateListRequest]
  }
  
  @scala.inline
  implicit class IClientStateListRequestMutableBuilder[Self <: IClientStateListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
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
    
    @scala.inline
    def setStateRoot(value: String): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateRootNull: Self = StObject.set(x, "stateRoot", null)
    
    @scala.inline
    def setStateRootUndefined: Self = StObject.set(x, "stateRoot", js.undefined)
  }
}
