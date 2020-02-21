package typings.sharepoint.CUI

import typings.sharepoint.IEnumerable
import typings.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.List")
@js.native
class List[T] () extends IEnumerable[T] {
  def add(data: T): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[T] = js.native
  def getEnumeratorAtPos(): ListEnumerator[T] = js.native
  def get_count(): Double = js.native
  def get_item(index: Double): T = js.native
  def indexOf(data: T): Double = js.native
  def insert(index: Double, data: T): scala.Unit = js.native
  def remove(data: T): scala.Unit = js.native
}

