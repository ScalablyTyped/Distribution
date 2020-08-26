package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginContextMeta extends js.Object {
  var rollupVersion: String = js.native
  var watchMode: Boolean = js.native
}

object PluginContextMeta {
  @scala.inline
  def apply(rollupVersion: String, watchMode: Boolean): PluginContextMeta = {
    val __obj = js.Dynamic.literal(rollupVersion = rollupVersion.asInstanceOf[js.Any], watchMode = watchMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginContextMeta]
  }
  @scala.inline
  implicit class PluginContextMetaOps[Self <: PluginContextMeta] (val x: Self) extends AnyVal {
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
    def setRollupVersion(value: String): Self = this.set("rollupVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setWatchMode(value: Boolean): Self = this.set("watchMode", value.asInstanceOf[js.Any])
  }
  
}

