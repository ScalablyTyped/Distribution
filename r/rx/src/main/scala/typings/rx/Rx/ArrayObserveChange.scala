package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayObserveChange[T] extends js.Object {
  var added: js.UndefOr[Double] = js.native
  var index: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var `object`: js.Array[T] = js.native
  var oldValue: js.UndefOr[T] = js.native
  var removed: js.UndefOr[js.Array[T]] = js.native
  var `type`: String = js.native
}

object ArrayObserveChange {
  @scala.inline
  def apply[T](`object`: js.Array[T], `type`: String): ArrayObserveChange[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayObserveChange[T]]
  }
  @scala.inline
  implicit class ArrayObserveChangeOps[Self <: ArrayObserveChange[_], T] (val x: Self with ArrayObserveChange[T]) extends AnyVal {
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
    def setObjectVarargs(value: T*): Self = this.set("object", js.Array(value :_*))
    @scala.inline
    def setObject(value: js.Array[T]): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdded(value: Double): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdded: Self = this.set("added", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOldValue(value: T): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
    @scala.inline
    def setRemovedVarargs(value: T*): Self = this.set("removed", js.Array(value :_*))
    @scala.inline
    def setRemoved(value: js.Array[T]): Self = this.set("removed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoved: Self = this.set("removed", js.undefined)
  }
  
}

