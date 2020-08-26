package typings.reactHooksHelper.mod

import typings.reactHooksHelper.anon.Checked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormTarget extends js.Object {
  var target: Checked = js.native
}

object FormTarget {
  @scala.inline
  def apply(target: Checked): FormTarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormTarget]
  }
  @scala.inline
  implicit class FormTargetOps[Self <: FormTarget] (val x: Self) extends AnyVal {
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
    def setTarget(value: Checked): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

