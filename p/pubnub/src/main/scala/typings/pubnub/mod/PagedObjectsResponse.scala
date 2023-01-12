package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagedObjectsResponse[DataType]
  extends StObject
     with ObjectsResponse[js.Array[DataType]] {
  
  var next: js.UndefOr[String] = js.undefined
  
  var prev: js.UndefOr[String] = js.undefined
  
  var totalCount: js.UndefOr[Double] = js.undefined
}
object PagedObjectsResponse {
  
  inline def apply[DataType](data: js.Array[DataType], status: Double): PagedObjectsResponse[DataType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagedObjectsResponse[DataType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PagedObjectsResponse[?], DataType] (val x: Self & PagedObjectsResponse[DataType]) extends AnyVal {
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    
    inline def setPrevUndefined: Self = StObject.set(x, "prev", js.undefined)
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountUndefined: Self = StObject.set(x, "totalCount", js.undefined)
  }
}
