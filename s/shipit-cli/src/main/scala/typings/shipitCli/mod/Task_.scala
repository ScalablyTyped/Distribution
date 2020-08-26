package typings.shipitCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task_ extends js.Object {
  var blocking: Boolean = js.native
  var dep: js.Array[String] = js.native
  var name: String = js.native
  def fn(): Unit = js.native
}

object Task_ {
  @scala.inline
  def apply(blocking: Boolean, dep: js.Array[String], fn: () => Unit, name: String): Task_ = {
    val __obj = js.Dynamic.literal(blocking = blocking.asInstanceOf[js.Any], dep = dep.asInstanceOf[js.Any], fn = js.Any.fromFunction0(fn), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task_]
  }
  @scala.inline
  implicit class Task_Ops[Self <: Task_] (val x: Self) extends AnyVal {
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
    def setBlocking(value: Boolean): Self = this.set("blocking", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepVarargs(value: String*): Self = this.set("dep", js.Array(value :_*))
    @scala.inline
    def setDep(value: js.Array[String]): Self = this.set("dep", value.asInstanceOf[js.Any])
    @scala.inline
    def setFn(value: () => Unit): Self = this.set("fn", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

