package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BarProp extends js.Object {
  val visible: scala.Boolean = js.native
}

object BarProp {
  @scala.inline
  def apply(visible: scala.Boolean): BarProp = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarProp]
  }
  @scala.inline
  implicit class BarPropOps[Self <: BarProp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVisible(value: scala.Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

