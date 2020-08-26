package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleTask extends js.Object {
  var name: String = js.native
  def gen(): Unit = js.native
}

object SimpleTask {
  @scala.inline
  def apply(gen: () => Unit, name: String): SimpleTask = {
    val __obj = js.Dynamic.literal(gen = js.Any.fromFunction0(gen), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleTask]
  }
  @scala.inline
  implicit class SimpleTaskOps[Self <: SimpleTask] (val x: Self) extends AnyVal {
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
    def setGen(value: () => Unit): Self = this.set("gen", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

