package typings.rdfjsTypes.queryCommonMod

import org.scalablytyped.runtime.StringDictionary
import typings.rdfjsTypes.dataModelMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryExecuteOptions[OrderItemsType /* <: QuadTermName | Variable */]
  extends StObject
     with /**
  * Custom properties
  */
/* key */ StringDictionary[Any] {
  
  /**
    * The required order for the result stream.
    */
  var order: js.UndefOr[QueryOperationOrder[OrderItemsType]] = js.undefined
}
object QueryExecuteOptions {
  
  inline def apply[OrderItemsType /* <: QuadTermName | Variable */](): QueryExecuteOptions[OrderItemsType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryExecuteOptions[OrderItemsType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryExecuteOptions[?], OrderItemsType /* <: QuadTermName | Variable */] (val x: Self & QueryExecuteOptions[OrderItemsType]) extends AnyVal {
    
    inline def setOrder(value: QueryOperationOrder[OrderItemsType]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
