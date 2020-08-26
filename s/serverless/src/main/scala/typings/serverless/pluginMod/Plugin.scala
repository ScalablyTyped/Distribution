package typings.serverless.pluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugin extends js.Object {
  var commands: js.UndefOr[Commands] = js.native
  var hooks: Hooks = js.native
  var variableResolvers: js.UndefOr[VariableResolvers] = js.native
}

object Plugin {
  @scala.inline
  def apply(hooks: Hooks): Plugin = {
    val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  @scala.inline
  implicit class PluginOps[Self <: Plugin] (val x: Self) extends AnyVal {
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
    def setHooks(value: Hooks): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommands(value: Commands): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    @scala.inline
    def setVariableResolvers(value: VariableResolvers): Self = this.set("variableResolvers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableResolvers: Self = this.set("variableResolvers", js.undefined)
  }
  
}

