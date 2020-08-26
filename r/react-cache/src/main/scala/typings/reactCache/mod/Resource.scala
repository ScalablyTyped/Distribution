package typings.reactCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource[Input, Value] extends js.Object {
  def preload(key: Input): Unit = js.native
  def read(key: Input): Value = js.native
}

object Resource {
  @scala.inline
  def apply[Input, Value](preload: Input => Unit, read: Input => Value): Resource[Input, Value] = {
    val __obj = js.Dynamic.literal(preload = js.Any.fromFunction1(preload), read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[Resource[Input, Value]]
  }
  @scala.inline
  implicit class ResourceOps[Self <: Resource[_, _], Input, Value] (val x: Self with (Resource[Input, Value])) extends AnyVal {
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
    def setPreload(value: Input => Unit): Self = this.set("preload", js.Any.fromFunction1(value))
    @scala.inline
    def setRead(value: Input => Value): Self = this.set("read", js.Any.fromFunction1(value))
  }
  
}

