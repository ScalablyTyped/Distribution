package typings.rrule.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Div extends js.Object {
  var div: Double = js.native
  var mod: Double = js.native
}

object Div {
  @scala.inline
  def apply(div: Double, mod: Double): Div = {
    val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any])
    __obj.asInstanceOf[Div]
  }
  @scala.inline
  implicit class DivOps[Self <: Div] (val x: Self) extends AnyVal {
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
    def setDiv(value: Double): Self = this.set("div", value.asInstanceOf[js.Any])
    @scala.inline
    def setMod(value: Double): Self = this.set("mod", value.asInstanceOf[js.Any])
  }
  
}

