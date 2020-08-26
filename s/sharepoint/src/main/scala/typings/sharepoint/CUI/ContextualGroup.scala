package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextualGroup extends js.Object {
  def dispose(): scala.Unit = js.native
  def get_color(): Double = js.native
  def get_command(): String = js.native
  def get_count(): Double = js.native
  def get_id(): String = js.native
  def get_title(): String = js.native
}

object ContextualGroup {
  @scala.inline
  def apply(
    dispose: () => scala.Unit,
    get_color: () => Double,
    get_command: () => String,
    get_count: () => Double,
    get_id: () => String,
    get_title: () => String
  ): ContextualGroup = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), get_color = js.Any.fromFunction0(get_color), get_command = js.Any.fromFunction0(get_command), get_count = js.Any.fromFunction0(get_count), get_id = js.Any.fromFunction0(get_id), get_title = js.Any.fromFunction0(get_title))
    __obj.asInstanceOf[ContextualGroup]
  }
  @scala.inline
  implicit class ContextualGroupOps[Self <: ContextualGroup] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => scala.Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_color(value: () => Double): Self = this.set("get_color", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_command(value: () => String): Self = this.set("get_command", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_count(value: () => Double): Self = this.set("get_count", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_id(value: () => String): Self = this.set("get_id", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_title(value: () => String): Self = this.set("get_title", js.Any.fromFunction0(value))
  }
  
}

