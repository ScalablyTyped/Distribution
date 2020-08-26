package typings.reactNativeSqliteStorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultSetRowList extends js.Object {
  var length: Double = js.native
  def item(index: Double): js.Any = js.native
  def raw(): js.Array[_] = js.native
}

object ResultSetRowList {
  @scala.inline
  def apply(item: Double => js.Any, length: Double, raw: () => js.Array[_]): ResultSetRowList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], raw = js.Any.fromFunction0(raw))
    __obj.asInstanceOf[ResultSetRowList]
  }
  @scala.inline
  implicit class ResultSetRowListOps[Self <: ResultSetRowList] (val x: Self) extends AnyVal {
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
    def setItem(value: Double => js.Any): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setRaw(value: () => js.Array[_]): Self = this.set("raw", js.Any.fromFunction0(value))
  }
  
}

