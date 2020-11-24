package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNode[T] extends js.Object {
  
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
  implicit class ListNodeOps[Self <: ListNode[_], T] (val x: Self with ListNode[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: ListNode[T]): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: ListNode[T]): Self = this.set("previous", value.asInstanceOf[js.Any])
  }
}
