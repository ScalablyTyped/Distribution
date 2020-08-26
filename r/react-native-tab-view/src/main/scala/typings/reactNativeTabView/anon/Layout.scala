package typings.reactNativeTabView.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layout extends js.Object {
  var layout: Width = js.native
}

object Layout {
  @scala.inline
  def apply(layout: Width): Layout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layout]
  }
  @scala.inline
  implicit class LayoutOps[Self <: Layout] (val x: Self) extends AnyVal {
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
    def setLayout(value: Width): Self = this.set("layout", value.asInstanceOf[js.Any])
  }
  
}

