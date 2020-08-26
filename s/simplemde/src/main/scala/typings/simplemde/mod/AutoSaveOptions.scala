package typings.simplemde.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoSaveOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var uniqueId: String = js.native
}

object AutoSaveOptions {
  @scala.inline
  def apply(uniqueId: String): AutoSaveOptions = {
    val __obj = js.Dynamic.literal(uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSaveOptions]
  }
  @scala.inline
  implicit class AutoSaveOptionsOps[Self <: AutoSaveOptions] (val x: Self) extends AnyVal {
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
    def setUniqueId(value: String): Self = this.set("uniqueId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

