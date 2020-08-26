package typings.rollupPluginProgress.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginProgressOptions extends js.Object {
  var clearLine: js.UndefOr[Boolean] = js.native
}

object PluginProgressOptions {
  @scala.inline
  def apply(): PluginProgressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginProgressOptions]
  }
  @scala.inline
  implicit class PluginProgressOptionsOps[Self <: PluginProgressOptions] (val x: Self) extends AnyVal {
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
    def setClearLine(value: Boolean): Self = this.set("clearLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearLine: Self = this.set("clearLine", js.undefined)
  }
  
}

