package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.ListNode")
@js.native
class ListNode[T] protected () extends js.Object {
  def this(data: T, prev: ListNode[T], next: ListNode[T]) = this()
  var data: T = js.native
  var next: ListNode[T] = js.native
  var previous: ListNode[T] = js.native
}

