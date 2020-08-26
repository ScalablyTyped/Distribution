package typings.rcSelect.generateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefSelectProps extends js.Object {
  def blur(): Unit = js.native
  def focus(): Unit = js.native
}

object RefSelectProps {
  @scala.inline
  def apply(blur: () => Unit, focus: () => Unit): RefSelectProps = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus))
    __obj.asInstanceOf[RefSelectProps]
  }
  @scala.inline
  implicit class RefSelectPropsOps[Self <: RefSelectProps] (val x: Self) extends AnyVal {
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
    def setBlur(value: () => Unit): Self = this.set("blur", js.Any.fromFunction0(value))
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
  }
  
}

