package typings.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Substitutiontag extends js.Object {
  var enable: Boolean = js.native
  var substitution_tag: String = js.native
}

object Substitutiontag {
  @scala.inline
  def apply(enable: Boolean, substitution_tag: String): Substitutiontag = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], substitution_tag = substitution_tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Substitutiontag]
  }
  @scala.inline
  implicit class SubstitutiontagOps[Self <: Substitutiontag] (val x: Self) extends AnyVal {
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubstitution_tag(value: String): Self = this.set("substitution_tag", value.asInstanceOf[js.Any])
  }
  
}

