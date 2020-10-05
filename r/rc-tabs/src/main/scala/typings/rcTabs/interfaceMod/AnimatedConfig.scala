package typings.rcTabs.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimatedConfig extends js.Object {
  var inkBar: js.UndefOr[Boolean] = js.native
  var tabPane: js.UndefOr[Boolean] = js.native
}

object AnimatedConfig {
  @scala.inline
  def apply(): AnimatedConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimatedConfig]
  }
  @scala.inline
  implicit class AnimatedConfigOps[Self <: AnimatedConfig] (val x: Self) extends AnyVal {
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
    def setInkBar(value: Boolean): Self = this.set("inkBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInkBar: Self = this.set("inkBar", js.undefined)
    @scala.inline
    def setTabPane(value: Boolean): Self = this.set("tabPane", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabPane: Self = this.set("tabPane", js.undefined)
  }
  
}

