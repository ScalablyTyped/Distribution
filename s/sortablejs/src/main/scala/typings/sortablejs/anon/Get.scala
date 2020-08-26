package typings.sortablejs.anon

import typings.sortablejs.mod.Sortable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get extends js.Object {
  def get(sortable: Sortable): js.Array[String] = js.native
  def set(sortable: Sortable): Unit = js.native
}

object Get {
  @scala.inline
  def apply(get: Sortable => js.Array[String], set: Sortable => Unit): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Get]
  }
  @scala.inline
  implicit class GetOps[Self <: Get] (val x: Self) extends AnyVal {
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
    def setGet(value: Sortable => js.Array[String]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: Sortable => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
  
}

