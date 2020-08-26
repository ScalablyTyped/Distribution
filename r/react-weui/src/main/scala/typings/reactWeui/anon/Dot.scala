package typings.reactWeui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dot extends js.Object {
  var dot: Boolean = js.native
  var preset: String = js.native
}

object Dot {
  @scala.inline
  def apply(dot: Boolean, preset: String): Dot = {
    val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dot]
  }
  @scala.inline
  implicit class DotOps[Self <: Dot] (val x: Self) extends AnyVal {
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
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreset(value: String): Self = this.set("preset", value.asInstanceOf[js.Any])
  }
  
}

