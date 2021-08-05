package typings.simperium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketObject[T] extends StObject {
  
  var data: T
  
  var id: EntityId
  
  var isIndexing: js.UndefOr[Boolean] = js.undefined
}
object BucketObject {
  
  inline def apply[T](data: T, id: EntityId): BucketObject[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketObject[T]]
  }
  
  extension [Self <: BucketObject[?], T](x: Self & BucketObject[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setId(value: EntityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsIndexing(value: Boolean): Self = StObject.set(x, "isIndexing", value.asInstanceOf[js.Any])
    
    inline def setIsIndexingUndefined: Self = StObject.set(x, "isIndexing", js.undefined)
  }
}
