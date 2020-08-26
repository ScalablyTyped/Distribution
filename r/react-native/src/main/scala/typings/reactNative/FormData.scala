package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormData extends js.Object {
  def append(name: String, value: js.Any): Unit = js.native
}

object FormData {
  @scala.inline
  def apply(append: (String, js.Any) => Unit): FormData = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append))
    __obj.asInstanceOf[FormData]
  }
  @scala.inline
  implicit class FormDataOps[Self <: FormData] (val x: Self) extends AnyVal {
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
    def setAppend(value: (String, js.Any) => Unit): Self = this.set("append", js.Any.fromFunction2(value))
  }
  
}

