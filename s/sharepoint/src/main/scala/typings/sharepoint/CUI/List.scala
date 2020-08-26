package typings.sharepoint.CUI

import typings.sharepoint.IEnumerable
import typings.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T] extends IEnumerable[T] {
  def add(data: T): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def getEnumeratorAtPos(): ListEnumerator[T] = js.native
  def get_count(): Double = js.native
  def get_item(index: Double): T = js.native
  def indexOf(data: T): Double = js.native
  def insert(index: Double, data: T): scala.Unit = js.native
  def remove(data: T): scala.Unit = js.native
}

object List {
  @scala.inline
  def apply[T](
    add: T => scala.Unit,
    clear: () => scala.Unit,
    getEnumerator: () => IEnumerator[T],
    getEnumeratorAtPos: () => ListEnumerator[T],
    get_count: () => Double,
    get_item: Double => T,
    indexOf: T => Double,
    insert: (Double, T) => scala.Unit,
    remove: T => scala.Unit
  ): List[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), getEnumerator = js.Any.fromFunction0(getEnumerator), getEnumeratorAtPos = js.Any.fromFunction0(getEnumeratorAtPos), get_count = js.Any.fromFunction0(get_count), get_item = js.Any.fromFunction1(get_item), indexOf = js.Any.fromFunction1(indexOf), insert = js.Any.fromFunction2(insert), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[List[T]]
  }
  @scala.inline
  implicit class ListOps[Self <: List[_], T] (val x: Self with List[T]) extends AnyVal {
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
    def setAdd(value: T => scala.Unit): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setClear(value: () => scala.Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetEnumeratorAtPos(value: () => ListEnumerator[T]): Self = this.set("getEnumeratorAtPos", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_count(value: () => Double): Self = this.set("get_count", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_item(value: Double => T): Self = this.set("get_item", js.Any.fromFunction1(value))
    @scala.inline
    def setIndexOf(value: T => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: (Double, T) => scala.Unit): Self = this.set("insert", js.Any.fromFunction2(value))
    @scala.inline
    def setRemove(value: T => scala.Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

