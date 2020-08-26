package typings.ractive.mod

import typings.ractive.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginArgsBase extends js.Object {
  var Ractive: Instantiable = js.native
}

object PluginArgsBase {
  @scala.inline
  def apply(Ractive: Instantiable): PluginArgsBase = {
    val __obj = js.Dynamic.literal(Ractive = Ractive.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginArgsBase]
  }
  @scala.inline
  implicit class PluginArgsBaseOps[Self <: PluginArgsBase] (val x: Self) extends AnyVal {
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
    def setRactive(value: Instantiable): Self = this.set("Ractive", value.asInstanceOf[js.Any])
  }
  
}

