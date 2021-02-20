package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNode[T] extends StObject {
  
  var data: T = js.native
  
  var next: ListNode[T] = js.native
  
  var previous: ListNode[T] = js.native
}
object ListNode {
  
  @scala.inline
  def apply[T](data: T, next: ListNode[T], previous: ListNode[T]): ListNode[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNode[T]]
  }
  
  @scala.inline
  implicit class ListNodeMutableBuilder[Self <: ListNode[_], T] (val x: Self with ListNode[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ListNode[T]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: ListNode[T]): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
  }
}
