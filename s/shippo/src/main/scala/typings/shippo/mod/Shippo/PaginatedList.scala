package typings.shippo.mod.Shippo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginatedList[T] extends StObject {
  
  var count: /* template literal string: ${number} */ String
  
  var next: String | Null
  
  var previous: String | Null
  
  var results: js.Array[T]
}
object PaginatedList {
  
  inline def apply[T](count: /* template literal string: ${number} */ String, results: js.Array[T]): PaginatedList[T] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], next = null, previous = null)
    __obj.asInstanceOf[PaginatedList[T]]
  }
  
  extension [Self <: PaginatedList[?], T](x: Self & PaginatedList[T]) {
    
    inline def setCount(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextNull: Self = StObject.set(x, "next", null)
    
    inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousNull: Self = StObject.set(x, "previous", null)
    
    inline def setResults(value: js.Array[T]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: T*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
