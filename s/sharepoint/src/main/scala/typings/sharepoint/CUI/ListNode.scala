package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNode[T] extends StObject {
  
  var data: T
  
  var next: ListNode[T]
  
  var previous: ListNode[T]
}
object ListNode {
  
  inline def apply[T](data: T, next: ListNode[T], previous: ListNode[T]): ListNode[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNode[T]]
  }
  
  extension [Self <: ListNode[?], T](x: Self & ListNode[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setNext(value: ListNode[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: ListNode[T]): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}
