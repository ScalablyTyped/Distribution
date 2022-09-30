package typings.reactQuery.queryMod

import typings.reactQuery.reactQueryStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessAction[TData]
  extends StObject
     with Action[TData, Any] {
  
  var data: js.UndefOr[TData] = js.undefined
  
  var dataUpdatedAt: js.UndefOr[Double] = js.undefined
  
  var `type`: success
}
object SuccessAction {
  
  inline def apply[TData](): SuccessAction[TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("success")
    __obj.asInstanceOf[SuccessAction[TData]]
  }
  
  extension [Self <: SuccessAction[?], TData](x: Self & SuccessAction[TData]) {
    
    inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataUpdatedAt(value: Double): Self = StObject.set(x, "dataUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setDataUpdatedAtUndefined: Self = StObject.set(x, "dataUpdatedAt", js.undefined)
    
    inline def setType(value: success): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
