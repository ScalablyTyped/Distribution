package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.ListEnumerator")
@js.native
class ListEnumerator[T] protected () extends js.Object {
  def this(index: js.Any) = this()
  def get_current(): T = js.native
  def moveNext(): Boolean = js.native
  def movePrevious(): Boolean = js.native
  def reset(): scala.Unit = js.native
}

