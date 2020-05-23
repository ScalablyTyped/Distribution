package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNode[T] extends js.Object {
  var data: T
  var next: ListNode[T]
  var previous: ListNode[T]
}

object ListNode {
  @scala.inline
  def apply[T](data: T, next: ListNode[T], previous: ListNode[T]): ListNode[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNode[T]]
  }
}

