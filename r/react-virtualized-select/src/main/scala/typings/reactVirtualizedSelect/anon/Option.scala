package typings.reactVirtualizedSelect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Option[TValue] extends js.Object {
  var option: TValue = js.native
}

object Option {
  @scala.inline
  def apply[TValue](option: TValue): Option[TValue] = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option[TValue]]
  }
  @scala.inline
  implicit class OptionOps[Self <: Option[_], TValue] (val x: Self with Option[TValue]) extends AnyVal {
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
    def setOption(value: TValue): Self = this.set("option", value.asInstanceOf[js.Any])
  }
  
}

