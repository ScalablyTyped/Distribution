package typings.sharepoint.global.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.ListNode")
@js.native
class ListNode[T] protected ()
  extends typings.sharepoint.CUI.ListNode[T] {
  def this(data: T, prev: typings.sharepoint.CUI.ListNode[T], next: typings.sharepoint.CUI.ListNode[T]) = this()
  /* CompleteClass */
  override var data: T = js.native
  /* CompleteClass */
  override var next: typings.sharepoint.CUI.ListNode[T] = js.native
  /* CompleteClass */
  override var previous: typings.sharepoint.CUI.ListNode[T] = js.native
}

